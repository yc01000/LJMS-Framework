package com.lj.crewpnr.vo.availability;

import java.util.List;

public class AvailabilityCriteriaVO {

	private List<AvailabilitySearchVO> availabilitySearches;

	private String fareClass;

	private List<PaxCountVO> paxCounts;

	private String tripType;

	private String fareLevel;

	private String agencyCode;

	private String countryCode;

	private String currency;

	private String pointOfPurchase;

	private boolean requireFareInfos;

	private boolean domestic;

	private String pnrNumber;

	private boolean requireDisplayAllFares;

	public List<AvailabilitySearchVO> getAvailabilitySearches() {
		return availabilitySearches;
	}

	public void setAvailabilitySearches(List<AvailabilitySearchVO> availabilitySearches) {
		this.availabilitySearches = availabilitySearches;
	}

	public String getFareClass() {
		return fareClass;
	}

	public void setFareClass(String fareClass) {
		this.fareClass = fareClass;
	}

	public List<PaxCountVO> getPaxCounts() {
		return paxCounts;
	}

	public void setPaxCounts(List<PaxCountVO> paxCounts) {
		this.paxCounts = paxCounts;
	}

	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	public String getFareLevel() {
		return fareLevel;
	}

	public void setFareLevel(String fareLevel) {
		this.fareLevel = fareLevel;
	}

	public String getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPointOfPurchase() {
		return pointOfPurchase;
	}

	public void setPointOfPurchase(String pointOfPurchase) {
		this.pointOfPurchase = pointOfPurchase;
	}

	public boolean getRequireFareInfos() {
		return requireFareInfos;
	}

	public void setRequireFareInfos(boolean requireFareInfos) {
		this.requireFareInfos = requireFareInfos;
	}

	public boolean isDomestic() {
		return domestic;
	}

	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}

	public String getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public boolean isRequireDisplayAllFares() {
		return requireDisplayAllFares;
	}

	public void setRequireDisplayAllFares(boolean requireDisplayAllFares) {
		this.requireDisplayAllFares = requireDisplayAllFares;
	}
}
