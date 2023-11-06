package com.lj.crewpnr.common;

import com.lj.core.commoncode.handler.CityAirportHandler;
import com.lj.core.commoncode.handler.CountryHandler;
import com.lj.core.commoncode.vo.CityAirportInfoVO;
import com.lj.core.commoncode.vo.CountryInfoVO;
import com.lj.core.integration.soap.ibs.IbsChannel;
import com.lj.core.integration.soap.ibs.IbsChannel.DomIntType;
import com.lj.core.integration.soap.ibs.domain.booking.*;
import com.lj.crewpnr.common.Constants.ERROR_CODE;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

/**
 * IBS 도메인 모델 유틸
 * <pre>
 * <B>agent</B>
 *     |_ IBSDomainUtils.java
 * </pre>
 *
 *  @author  : Ko Youngjun
 *  @date    : 2018. 7. 19. 오후 3:52:04
 *  @version : 1.0
 *  @desc    :
 */
@Component
public class IBSDomainUtils {

	private static CityAirportHandler cityAirportHandler;

	private static CountryHandler countryHandler;

	private static final String GROUP_FARE_CLASSES = ";G;G1;G2;G3;V;";

	public static boolean isDomestic(RetrieveBookingRS rs) {
		if(rs == null || CollectionUtils.size(rs.getItinerary()) != 1) {
			return false;
		}

		return isDomestic(rs.getItinerary());
	}

	public static boolean isDomestic(ItineraryDetailsType itin) {
		if(itin == null) {
			return false;
		}

		return isDomestic(itin.getFlightSegmentDetails());
	}

	public static boolean isDomestic(FlightSegmentDetailsType flightSegment) {
		if(flightSegment == null) {
			return false;
		}

		return isDomestic(flightSegment.getBoardPoint(), flightSegment.getOffPoint());
	}

	public static boolean isDomestic(PnrSummary pnrSummary) {
		return isDomestic(pnrSummary.getFlightSegmentSummaryDetails());
	}

	public static boolean isDomestic(FlightSegmentSummaryDetails flightSegmentSummary) {
		return isDomestic(flightSegmentSummary.getBoardPoint(), flightSegmentSummary.getOffPoint());
	}

	public static boolean isDomestic(List<?> list) {
		if(CollectionUtils.isEmpty(list)) {
			return false;
		}

		for(Object object: list) {
			if(object instanceof ItineraryDetailsType) {
				if(!isDomestic((ItineraryDetailsType) object)) {
					return false;
				}
			} else if(object instanceof FlightSegmentDetailsType) {
				if(!isDomestic((FlightSegmentDetailsType) object)) {
					return false;
				}
			} else if(object instanceof FlightSegmentSummaryDetails) {
				if(!isDomestic((FlightSegmentSummaryDetails) object)) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isDomestic(String origin, String destination) {
		if(isSightseeingFlight(origin, destination)) {
			return false;
		}

		// ICN-ICN일 경우, 국제선으로 분류
//		if(StringUtils.equals(origin, "ICN") && StringUtils.equals(destination, "ICN")) {
//			return false;
//		}

		if(!isDomestic(origin)) {
			return false;
		}

		return isDomestic(destination);
	}

	public static boolean isDomestic(String airportCode) {
		CityAirportInfoVO airport = cityAirportHandler.getCityAirportInfo(airportCode);
		if(airport == null || !StringUtils.equals(airport.getCtrCd(), "KOR")) {
			return false;
		}

		return true;
	}

	public static List<GuestRequestDetailsType> toGuestRequests(List<GuestReponseDetailsType> guestResponses) {
		List<GuestRequestDetailsType> guestRequests = new ArrayList<>();
		for(GuestReponseDetailsType guestResponse: guestResponses) {
			guestRequests.add(toGuestRequest(guestResponse));
		}
		return guestRequests;
	}

	private static GuestRequestDetailsType toGuestRequest(GuestReponseDetailsType guestResponse) {
		GuestRequestDetailsType guestRequest = new GuestRequestDetailsType();
		BeanUtils.copyProperties(guestResponse, guestRequest);
		return guestRequest;
	}

	public static BookingChannelType getBookingChannel(boolean domestic) {
		BookingChannelType channel = new BookingChannelType();
		channel.setChannelType(Constants.IBS_BOOKING_CHANNEL_CHANNEL_TYPE);
		channel.setChannel(IbsChannel.find(AccessChannelCode.B2T, domestic ? DomIntType.DOM : DomIntType.INT));
		channel.setChannel("PW" + (domestic ? "D" : "I"));
		channel.setLocale(Constants.IBS_BOOKING_CHANNEL_LOCALE);
		return channel;
	}

	public static BookingChannelKeyType getBookingChannelKey(boolean domestic) {
		BookingChannelKeyType channel = new BookingChannelKeyType();
		channel.setChannelType(Constants.IBS_BOOKING_CHANNEL_CHANNEL_TYPE);
		channel.setChannel(IbsChannel.find(AccessChannelCode.B2T, domestic ? DomIntType.DOM : DomIntType.INT));
		channel.setChannel("PW" + (domestic ? "D" : "I"));
		channel.setLocale(Constants.IBS_BOOKING_CHANNEL_LOCALE);
		return channel;
	}

	public static BookingChannelType bookingChannel(String loginChannel, boolean domestic) {
		BookingChannelType channel = new BookingChannelType();
		channel.setChannelType(Constants.IBS_BOOKING_CHANNEL_CHANNEL_TYPE);
		channel.setChannel(IbsChannel.find(loginChannel, domestic ? DomIntType.DOM : DomIntType.INT));
		channel.setLocale(Constants.IBS_BOOKING_CHANNEL_LOCALE);
		return channel;
	}

	public static BookingChannelKeyType bookingChannelKey(String channel) {
		BookingChannelKeyType channelKey = new BookingChannelKeyType();
		channelKey.setChannelType(Constants.IBS_BOOKING_CHANNEL_CHANNEL_TYPE);
		channelKey.setChannel(channel);
		channelKey.setLocale(Constants.IBS_BOOKING_CHANNEL_LOCALE);
		return channelKey;
	}

	public static BookingChannelType bookingChannel(String channel) {
		BookingChannelType channelType = new BookingChannelType();
		channelType.setChannelType(Constants.IBS_BOOKING_CHANNEL_CHANNEL_TYPE);
		channelType.setChannel(channel);
		channelType.setLocale(Constants.IBS_BOOKING_CHANNEL_LOCALE);
		return channelType;
	}

	public static String getMappedCountryCode(String currency) {
		if(StringUtils.isBlank(currency)) {
			return null;
		}

		switch(currency) {
			case "KRW":
				return "KR";
			case "CNY":
				return "CN";
			case "JPY":
				return "JP";
			case "USD":
				return "US";
			case "AUD":
				return "AU";
			case "HKD":
				return "HK";
			case "MOP":
				return "MO";
			case "TWD":
				return "TW";
			case "MYR":
				return "MY";
			case "THB":
				return "TH";
			default:
				return null;
		}
	}

	public static String getMappedCurrency(String code) {
		if(StringUtils.isBlank(code)) {
			return null;
		}

		String targetCountryCode = code;
		if(StringUtils.length(code) == 3) {
			targetCountryCode = getIataCountryCode(code);
		}

		switch(targetCountryCode) {
			case "KR":
				return "KRW";
			case "CN":
				return "CNY";
			case "JP":
				return "JPY";
			case "US":
				return "USD";
			case "AU":
				return "AUD";
			case "HK":
				return "HKD";
			case "MO":
				return "MOP";
			case "TW":
				return "TWD";
			case "MY":
				return "MYR";
			case "TH":
				return "THB";
			case "VN":
				return "USD";
			default:
				return null;
		}
	}

	public static String getIataCountryCode(String code) {
		if(StringUtils.isBlank(code)) {
			return null;
		}

		String targetCountryCode = code;

		com.lj.core.commoncode.vo.CityAirportInfoVO cityAirport = cityAirportHandler.getCityAirportInfo(code);
		if(cityAirport != null) {
			targetCountryCode = cityAirport.getCtrCd();
		}

		CountryInfoVO country = countryHandler.getCountryInfo(targetCountryCode);
		if(country == null) {
			return null;
		}

		return country.getCtrCd2Ltr();
	}

	public static String errorMessage(Object object) {
		return errorMessage(object, "; ");
	}

	public static String errorMessage(Object object, String separator) {
		String errorCode = errorCode(object);
		if(StringUtils.isBlank(errorCode)) {
			return null;
		}

		String errorValue = errorCode(object);
		if(StringUtils.isBlank(errorValue)) {
			return errorCode;
		}

		return errorCode(object) + separator + errorValue(object);
	}

	public static String errorCode(Object object) {
		ErrorType error = error(object);
		if(error == null) {
			return null;
		}

		return error.getErrorCode();
	}

	public static String errorValue(Object object) {
		ErrorType error = error(object);
		if(error == null) {
			return null;
		}

		return StringUtils.replace(error.getErrorValue(), "\n", " ");
	}

	public static boolean hasError(Object object) {
		return error(object) != null;
	}

	private static ErrorType error(Object object) {
		if(object == null) {
			ErrorType error = new ErrorType();
			error.setErrorCode(ERROR_CODE.SERVER_ERROR_OCCURRED);
			return error;
		}

		ErrorType error = null;
		if(object instanceof RetrieveBookingRS) {
			error = ((RetrieveBookingRS) object).getErrorType();
		} else if(object instanceof ModifyBookingRS) {
			error = ((ModifyBookingRS) object).getErrorType();
		} else if(object instanceof SaveModifyBookingRS) {
			error = ((SaveModifyBookingRS) object).getErrorType();
		} else if(object instanceof AdjustFlightInventoryRS) {
			error = ((AdjustFlightInventoryRS) object).getErrorType();
		} else if(object instanceof ConfirmPriceRS) {
			error = ((ConfirmPriceRS) object).getErrorType();
		} else if(object instanceof SplitPnrRS) {
			error = ((SplitPnrRS) object).getErrorType();
		} else if(object instanceof CancelBookingRS) {
			error = ((CancelBookingRS) object).getErrorType();
		} else if(object instanceof ConfirmBookingSegmentRS) {
			error = ((ConfirmBookingSegmentRS) object).getErrorType();
		} else if(object instanceof CreateBookingRS) {
			error = ((CreateBookingRS) object).getErrorType();
		} else if(object instanceof EnhancedAirAvailabilityRS) {
			error = ((EnhancedAirAvailabilityRS) object).getErrorType();
		} else if(object instanceof AirAvailabilityRS) {
			error = ((AirAvailabilityRS) object).getErrorType();
		} else if(object instanceof RetrieveReservationSummaryRS) {
			error = ((RetrieveReservationSummaryRS) object).getErrorType();
		} else {
			error = new ErrorType();
			error.setErrorCode("UNEXPECTED_RESPONSE_TYPE");
			return error;
		}

		return error;
	}

	@Autowired
	public void setCityAirportHandler(CityAirportHandler cityAirportHandler) {
		IBSDomainUtils.cityAirportHandler = cityAirportHandler;
	}

	@Autowired
	public void setCountryHandler(CountryHandler countryHandler) {
		IBSDomainUtils.countryHandler = countryHandler;
	}

	public static List<PaxCountDetailsType> toPaxCountDetails(List<PaxCountType> paxCounts) {
		List<PaxCountDetailsType> paxCountDetails = new ArrayList<>();
		for(PaxCountType paxCount: paxCounts) {
			paxCountDetails.add(toPaxCountDetail(paxCount));
		}

		return paxCountDetails;
	}

	public static PaxCountDetailsType toPaxCountDetail(PaxCountType paxCount) {
		PaxCountDetailsType paxCountDetail = new PaxCountDetailsType();
		BeanUtils.copyProperties(paxCount, paxCountDetail);
		return paxCountDetail;
	}

	/**
	 * RetrieveBooking - ItineraryDetailsType - FlightSegmentSegmentDetailsType 취득
	 * @param retrieveBookingRS
	 * @return
	 */
	public static List<FlightSegmentDetailsType> getFlightSegments(RetrieveBookingRS retrieveBookingRS) {
		return flightSegments(retrieveBookingRS);
	}

	public static FlightSegmentDetailsType flightSegment(RetrieveBookingRS retrieveBookingRS, String segmentId) {
		if(StringUtils.isBlank(segmentId)) {
			return null;
		}

		List<FlightSegmentDetailsType> flightSegments = flightSegments(retrieveBookingRS);
		if(CollectionUtils.isEmpty(flightSegments)) {
			return null;
		}

		for(FlightSegmentDetailsType flightSegment: flightSegments) {
			if(flightSegment == null) {
				continue;
			}

			if(StringUtils.equals(segmentId, flightSegment.getSegmentId())) {
				return flightSegment;
			}
		}

		return null;
	}

	public static List<FlightSegmentDetailsType> confirmedFlightSegments(RetrieveBookingRS retrieveBookingRS) {
		return confirmedFlightSegments(retrieveBookingRS.getItinerary());
	}

	public static List<FlightSegmentDetailsType> confirmedFlightSegments(List<ItineraryDetailsType> itineraries) {
		List<FlightSegmentDetailsType> allFlightSegments = flightSegments(itineraries);
		if(CollectionUtils.isEmpty(allFlightSegments)) {
			return null;
		}

		List<FlightSegmentDetailsType> confirmedFlightSegments = new ArrayList<>();
		for(FlightSegmentDetailsType flightSegment: allFlightSegments) {
			if(ReservationStatusDetailsType.CONFIRMED.equals(flightSegment.getSegmentStatus())) {
				confirmedFlightSegments.add(flightSegment);
			}
		}
		if(CollectionUtils.isEmpty(confirmedFlightSegments)) {
			return null;
		}

		return confirmedFlightSegments;
	}

	public static List<FlightSegmentDetailsType> flightSegments(RetrieveBookingRS retrieveBookingRS) {
		if(retrieveBookingRS == null) {
			return null;
		}

		return flightSegments(retrieveBookingRS.getItinerary());
	}

	public static List<FlightSegmentDetailsType> flightSegments(List<ItineraryDetailsType> itineraries) {
		if(CollectionUtils.isEmpty(itineraries)) {
			return null;
		}

		List<FlightSegmentDetailsType> flightSegments = new ArrayList<>();
		for(ItineraryDetailsType itinerary: itineraries) {
			if(itinerary == null) {
				continue;
			}

			if(CollectionUtils.isEmpty(itinerary.getFlightSegmentDetails())) {
				continue;
			}

			flightSegments.addAll(itinerary.getFlightSegmentDetails());
		}

		return flightSegments;
	}

	public static FlightSegmentDetailsType toFlightSegment(long flightSegmentGroupId, long segmentId, SegmentInfoType segment, SegmentAvailabilityType segmentAvailability, PricingInfoType pricing) {
//		long flightSegmentGroupId = pricing.getTripRefIndex().longValue();
//		long segmentId = segment.getSegmentIndex().longValue();
		String carrierCode = segment.getFlightIdentifierInfo().getCarrierCode();
		String fltNumber = "" + segment.getFlightIdentifierInfo().getFlightNumber().intValue();
		String fltSuffix = segment.getFlightIdentifierInfo().getFlightSuffix();
		DateOnlyDetailsType flightDate = new DateOnlyDetailsType();
		flightDate.setDate(segment.getFlightIdentifierInfo().getFlightDate());
		String boardingPoint = segment.getDepartureInfo().getAirportCode();
		String offPoint = segment.getArrivalInfo().getAirportCode();
		XMLGregorianCalendar scheduledDepartureDateTime = segment.getDepartureInfo().getDateTime();
		XMLGregorianCalendar scheduledDepartureDateTimeLTC = segment.getDepartureInfo().getDateTime();
		String departureTimeZone = segment.getDepartureInfo().getTimeZoneOffset();
		XMLGregorianCalendar scheduledArrivalDateTime = segment.getArrivalInfo().getDateTime();
		XMLGregorianCalendar scheduledArrivalDateTimeLTC = segment.getArrivalInfo().getDateTime();
		String arrivalTimeZone = segment.getArrivalInfo().getTimeZoneOffset();
		String journeyTime = segment.getJourneyTime();
		String cabinClass = segmentAvailability.getCabinClass();
		String aircraftType = segment.getAircraftInfo().getType();
		String fareClass = segmentAvailability.getBookingClass();

		FlightSegmentDetailsType flightSegment = new FlightSegmentDetailsType();
		flightSegment.setFlightSegmentGroupID("" + flightSegmentGroupId);
		flightSegment.setSegmentId("" + segmentId);
		flightSegment.setCarrierCode(carrierCode);
		flightSegment.setFltNumber(fltNumber);
		flightSegment.setFltSuffix(fltSuffix);
		flightSegment.setFlightDate(flightDate);
		flightSegment.setBoardPoint(boardingPoint);
		flightSegment.setOffPoint(offPoint);
		flightSegment.setScheduledDepartureDateTime(scheduledDepartureDateTime);
		flightSegment.setScheduledDepartureTimeLTC(scheduledDepartureDateTimeLTC);
		flightSegment.setDepartureTimeZone(departureTimeZone);
		flightSegment.setScheduledArrivalTime(scheduledArrivalDateTime);
		flightSegment.setScheduledArrivalTimeLTC(scheduledArrivalDateTimeLTC);
		flightSegment.setArrivalTimeZone(arrivalTimeZone);
		flightSegment.setSegmentStatus(ReservationStatusDetailsType.CONFIRMED);
		flightSegment.setJourneyTime(journeyTime);
		flightSegment.setCabinClass(cabinClass);
		flightSegment.setAircraftType(aircraftType);
		flightSegment.setFareClass(fareClass);
		return flightSegment;
	}
	//
	public static FareDetailsForGuestType toFareForGuest(long segmentId, long fareComponentId, int pricingUnitID, PricingComponentInfoType pricingComponent, PaxPricingInfoType paxPricing) {
		String fareLevel = pricingComponent.getFareLevel();
		String fareType = pricingComponent.getFareType();
		String fareBasisCode = pricingComponent.getFareBasis();
		long fareTranctionID = Long.valueOf(pricingComponent.getFareId());
//		String fareComponentID = "" + pricingComponent.getPricingComponentIndex();
		PaxDetailsType guestType = PaxDetailsType.ADULT;
		switch(paxPricing.getPaxType()) {
			case "CHILD":
				guestType = PaxDetailsType.CHILD;
				break;
			case "INFANT":
				guestType = PaxDetailsType.INFANT;
				break;
		}
		double baseFare = paxPricing.getAppliedFare().getAmount();
		String currency = paxPricing.getAppliedFare().getCurrencyCode();
		boolean isFareRuleOverridden = false;

		FareDetailsForGuestType fareForGuest = new FareDetailsForGuestType();
		fareForGuest.setFareLevel(fareLevel);
		fareForGuest.setFareType(fareType);
		fareForGuest.setFareBasisCode(fareBasisCode);
		fareForGuest.setFareTransactionID(fareTranctionID);
		fareForGuest.getSegmentId().add(segmentId);
		fareForGuest.setPricingUnitID(pricingUnitID);
		fareForGuest.setFareComponentId("" + fareComponentId);
		fareForGuest.setGuestType(guestType);
		fareForGuest.setBaseFare(baseFare);
		fareForGuest.setCurrency(currency);
		fareForGuest.setIsFareRuleOverridden(isFareRuleOverridden);

		return fareForGuest;
	}

	public static List<FareDetailsForGuestType> toFaresForGuest(SegmentInfoType targetSegment, PricingInfoType targetPricing, int pricingUnitID) {
		if(targetPricing == null || CollectionUtils.isEmpty(targetPricing.getPaxPricingInfo())) {
			return null;
		}

		List<FareDetailsForGuestType> fares = new ArrayList<>();

		PricingComponentInfoType pricingComponent = targetPricing.getPricingComponentInfo().get(0);
		String fareLevel = pricingComponent.getFareLevel();
		String fareType = pricingComponent.getFareType();
		String fareBasisCode = pricingComponent.getFareBasis();
		long fareTranctionID = Long.parseLong(pricingComponent.getFareId());
		String fareComponentID = "" + pricingComponent.getPricingComponentIndex();

		for(PaxPricingInfoType paxPricing: targetPricing.getPaxPricingInfo()) {
			FareDetailsForGuestType fareForGuest = new FareDetailsForGuestType();
			fareForGuest.setFareLevel(fareLevel);
			fareForGuest.setFareType(fareType);
			fareForGuest.setFareBasisCode(fareBasisCode);
			fareForGuest.setFareTransactionID(fareTranctionID);
			fareForGuest.setPricingUnitID(pricingUnitID);
			fareForGuest.setFareComponentId(fareComponentID);

			PaxDetailsType guestType = null;
			switch(paxPricing.getPaxType()) {
				case "ADULT":
					guestType = PaxDetailsType.ADULT;
					break;
				case "CHILD":
					guestType = PaxDetailsType.CHILD;
					break;
				case "INFANT":
					guestType = PaxDetailsType.INFANT;
					break;
			}
			fareForGuest.setGuestType(guestType);

			AmountInfoType appliedFare = paxPricing.getAppliedFare();
			fareForGuest.setBaseFare(appliedFare.getAmount());
			fareForGuest.setCurrency(appliedFare.getCurrencyCode());

			fares.add(fareForGuest);
		}

		return fares;
	}

	public static String channelType(RetrieveBookingRS retrieveBookingRS) {
		if(retrieveBookingRS == null) {
			return null;
		}
		if(retrieveBookingRS.getBookingChannel() == null) {
			return null;
		}

		return retrieveBookingRS.getBookingChannel().getChannelType();
	}

	public static String channel(RetrieveBookingRS retrieveBookingRS) {
		if(retrieveBookingRS == null) {
			return null;
		}
		if(retrieveBookingRS.getBookingChannel() == null) {
			return null;
		}

		return retrieveBookingRS.getBookingChannel().getChannel();
	}

	public static String fareLevel(boolean domestic, String fareClass) {
		if(domestic) {
			return "DG";
		}

		return StringUtils.contains(GROUP_FARE_CLASSES, ";" + fareClass + ";") ? "IG" : "IS";
	}

	public static XMLGregorianCalendar firstTicketIssueDate(RetrieveBookingRS retrieveBookingRS) {
		if(retrieveBookingRS == null) {
			return null;
		}

		return firstTicketIssueDate(retrieveBookingRS.getGuestDetails());
	}

	public static XMLGregorianCalendar firstTicketIssueDate(List<GuestReponseDetailsType> guestResponses) {
		if(CollectionUtils.isEmpty(guestResponses)) {
			return null;
		}

		if(CollectionUtils.size(guestResponses) == 0) {
			return null;
		}

		GuestReponseDetailsType firstGuest = guestResponses.get(0);
		if(firstGuest == null) {
			return null;
		}

		List<GuestTicketDetailsType> guestTickets = firstGuest.getPaxTicketDetails();
		if(CollectionUtils.isEmpty(guestTickets)) {
			return null;
		}

		if(CollectionUtils.size(guestTickets) == 0) {
			return null;
		}

		GuestTicketDetailsType firstGuestTicket = guestTickets.get(0);
		if(firstGuestTicket == null) {
			return null;
		}

		return firstGuestTicket.getOriginalTicketIssueDate();
	}

	public static List<GuestPriceBreakDownType> guestPriceBreakDowns(RetrieveBookingRS retrieveBookingRS) {
		List<GuestPriceBreakDownType> guestPriceBreakDowns = new ArrayList<>();
		for(ItinPriceType itinPrice: retrieveBookingRS.getItinPrice()) {
			guestPriceBreakDowns.addAll(itinPrice.getGuestPriceBreakDown());
		}
		return guestPriceBreakDowns;
	}

	public static String flightNumber(FlightSegmentDetailsType flightSegment) {
		if(flightSegment == null) {
			return null;
		}

		return flightSegment.getCarrierCode() + StringUtils.leftPad(flightSegment.getFltNumber(), 3, '0') + StringUtils.replace(flightSegment.getFltSuffix(), "*", "");
	}

	public static String flightNumber(SegmentInfoType segment) {
		if(segment == null) {
			return null;
		}

		return flightNumber(segment.getFlightIdentifierInfo());
	}

	public static String flightNumber(FlightIdentifierInfoType flightIdentifier) {
		if(flightIdentifier == null) {
			return null;
		}

		return flightIdentifier.getCarrierCode() + StringUtils.leftPad("" + flightIdentifier.getFlightNumber(), 3, '0') + StringUtils.replace(flightIdentifier.getFlightSuffix(), "*", "");
	}

	public static PnrContactType firstHomeContact(RetrieveBookingRS retrieveBookingRS) {
		if(retrieveBookingRS == null) {
			return null;
		}
		if(CollectionUtils.isEmpty(retrieveBookingRS.getPnrContact())) {
			return null;
		}
		for(PnrContactType contact: retrieveBookingRS.getPnrContact()) {
			if(contact == null) {
				continue;
			}
			if(!ContactDetailsType.H.equals(contact.getContactType())) {
				continue;
			}

			return contact;
		}

		return null;
	}

	public static boolean isCodeshare(RetrieveBookingRS retrieveBookingRS) {
		if(retrieveBookingRS == null) {
			return false;
		}

		return isCodeshare(retrieveBookingRS.getBookingChannel());
	}

	public static boolean isCodeshare(BookingChannelType bookingChannel) {
		return StringUtils.equals(bookingChannel.getChannelType(), "KE") && StringUtils.equals(bookingChannel.getChannel(), "KE");
	}

	public static boolean isSightseeingFlight(String origin, String destination) {
		final String DEALT_WITH_INTL_ROUTES = ";ICNICN;GMPGMP;";
		if(StringUtils.contains(DEALT_WITH_INTL_ROUTES, origin + destination)) {
			return true;
		}

		return false;
	}
	public static boolean isGDS(RetrieveBookingRS retrieveBookingRS) {
		if(retrieveBookingRS == null) {
			return false;
		}

		BookingChannelType bookingChannelType = retrieveBookingRS.getBookingChannel();
		if(bookingChannelType == null) {
			return false;
		}

		//return StringUtils.equals(bookingChannelType.getChannelType(), "GDS") || StringUtils.equals(bookingChannelType.getChannelType(), "DL")|| StringUtils.equals(bookingChannelType.getChannelType(), "KE");
		return StringUtils.equals(bookingChannelType.getChannelType(), "GDS");
	}
	public static boolean isGDS(ModifyBookingRS modifyBookingRS) {
		if(modifyBookingRS == null) {
			return false;
		}

		BookingChannelType bookingChannelType = modifyBookingRS.getBookingChannel();
		if(bookingChannelType == null) {
			return false;
		}
		return StringUtils.equals(bookingChannelType.getChannelType(), "GDS");
		//return StringUtils.equals(bookingChannelType.getChannelType(), "GDS") || StringUtils.equals(bookingChannelType.getChannelType(), "DL");
	}
}
