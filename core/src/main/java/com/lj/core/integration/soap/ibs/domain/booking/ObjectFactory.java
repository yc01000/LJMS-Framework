//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2021.04.29 시간 12:54:19 PM KST 
//


package com.lj.core.integration.soap.ibs.domain.booking;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lj.support.integration.soap.ibs.domain.booking package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateBookingRQ_QNAME = new QName("http://www.ibsplc.com/iRes/simpleTypes/", "CreateBookingRQ");
    private final static QName _CreateBookingRS_QNAME = new QName("http://www.ibsplc.com/iRes/simpleTypes/", "CreateBookingRS");
    private final static QName _FlightInfoRQ_QNAME = new QName("http://www.ibsplc.com/iRes/simpleTypes/", "FlightInfoRQ");
    private final static QName _FlightInfoRS_QNAME = new QName("http://www.ibsplc.com/iRes/simpleTypes/", "FlightInfoRS");
    private final static QName _ModifyBookingRQ_QNAME = new QName("http://www.ibsplc.com/iRes/simpleTypes/", "ModifyBookingRQ");
    private final static QName _ModifyBookingRS_QNAME = new QName("http://www.ibsplc.com/iRes/simpleTypes/", "ModifyBookingRS");
    private final static QName _PreProcessPaymentRQ_QNAME = new QName("http://www.ibsplc.com/iRes/simpleTypes/", "PreProcessPaymentRQ");
    private final static QName _PreProcessPaymentRS_QNAME = new QName("http://www.ibsplc.com/iRes/simpleTypes/", "PreProcessPaymentRS");
    private final static QName _PostProcessPaymentRQ_QNAME = new QName("http://www.ibsplc.com/iRes/simpleTypes/", "PostProcessPaymentRQ");
    private final static QName _PostProcessPaymentRS_QNAME = new QName("http://www.ibsplc.com/iRes/simpleTypes/", "PostProcessPaymentRS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lj.support.integration.soap.ibs.domain.booking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Tax }
     * 
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link Fee }
     * 
     */
    public Fee createFee() {
        return new Fee();
    }

    /**
     * Create an instance of {@link ActivateTravelAgentRQ }
     * 
     */
    public ActivateTravelAgentRQ createActivateTravelAgentRQ() {
        return new ActivateTravelAgentRQ();
    }

    /**
     * Create an instance of {@link BookingChannelKeyType }
     * 
     */
    public BookingChannelKeyType createBookingChannelKeyType() {
        return new BookingChannelKeyType();
    }

    /**
     * Create an instance of {@link ActivateTravelAgentRS }
     * 
     */
    public ActivateTravelAgentRS createActivateTravelAgentRS() {
        return new ActivateTravelAgentRS();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link AgencySalesReportRQ }
     * 
     */
    public AgencySalesReportRQ createAgencySalesReportRQ() {
        return new AgencySalesReportRQ();
    }

    /**
     * Create an instance of {@link AgencySalesReportRS }
     * 
     */
    public AgencySalesReportRS createAgencySalesReportRS() {
        return new AgencySalesReportRS();
    }

    /**
     * Create an instance of {@link TransactionDetails }
     * 
     */
    public TransactionDetails createTransactionDetails() {
        return new TransactionDetails();
    }

    /**
     * Create an instance of {@link AgencyStatementOfAccountRQ }
     * 
     */
    public AgencyStatementOfAccountRQ createAgencyStatementOfAccountRQ() {
        return new AgencyStatementOfAccountRQ();
    }

    /**
     * Create an instance of {@link AgencyStatementOfAccountRS }
     * 
     */
    public AgencyStatementOfAccountRS createAgencyStatementOfAccountRS() {
        return new AgencyStatementOfAccountRS();
    }

    /**
     * Create an instance of {@link AgencyStatementOfAccountDetail }
     * 
     */
    public AgencyStatementOfAccountDetail createAgencyStatementOfAccountDetail() {
        return new AgencyStatementOfAccountDetail();
    }

    /**
     * Create an instance of {@link AirAvailabilityRQ }
     * 
     */
    public AirAvailabilityRQ createAirAvailabilityRQ() {
        return new AirAvailabilityRQ();
    }

    /**
     * Create an instance of {@link BaseBookingRQ }
     * 
     */
    public BaseBookingRQ createBaseBookingRQ() {
        return new BaseBookingRQ();
    }

    /**
     * Create an instance of {@link NearBySearchType }
     * 
     */
    public NearBySearchType createNearBySearchType() {
        return new NearBySearchType();
    }

    /**
     * Create an instance of {@link AdvancedSearchType }
     * 
     */
    public AdvancedSearchType createAdvancedSearchType() {
        return new AdvancedSearchType();
    }

    /**
     * Create an instance of {@link PaxCountType }
     * 
     */
    public PaxCountType createPaxCountType() {
        return new PaxCountType();
    }

    /**
     * Create an instance of {@link PromoCodeDetails }
     * 
     */
    public PromoCodeDetails createPromoCodeDetails() {
        return new PromoCodeDetails();
    }

    /**
     * Create an instance of {@link AirAvailabilityRS }
     * 
     */
    public AirAvailabilityRS createAirAvailabilityRS() {
        return new AirAvailabilityRS();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link OriginDestinationInfo }
     * 
     */
    public OriginDestinationInfo createOriginDestinationInfo() {
        return new OriginDestinationInfo();
    }

    /**
     * Create an instance of {@link BaggageAllowanceType }
     * 
     */
    public BaggageAllowanceType createBaggageAllowanceType() {
        return new BaggageAllowanceType();
    }

    /**
     * Create an instance of {@link RichContentInfoType }
     * 
     */
    public RichContentInfoType createRichContentInfoType() {
        return new RichContentInfoType();
    }

    /**
     * Create an instance of {@link CustomFieldListType }
     * 
     */
    public CustomFieldListType createCustomFieldListType() {
        return new CustomFieldListType();
    }

    /**
     * Create an instance of {@link OfferTimeLimitType }
     * 
     */
    public OfferTimeLimitType createOfferTimeLimitType() {
        return new OfferTimeLimitType();
    }

    /**
     * Create an instance of {@link AttachDiscountCouponsRQ }
     * 
     */
    public AttachDiscountCouponsRQ createAttachDiscountCouponsRQ() {
        return new AttachDiscountCouponsRQ();
    }

    /**
     * Create an instance of {@link PaxSegmentDiscCpnDetailsType }
     * 
     */
    public PaxSegmentDiscCpnDetailsType createPaxSegmentDiscCpnDetailsType() {
        return new PaxSegmentDiscCpnDetailsType();
    }

    /**
     * Create an instance of {@link ProfileType }
     * 
     */
    public ProfileType createProfileType() {
        return new ProfileType();
    }

    /**
     * Create an instance of {@link AttachDiscountCouponsRS }
     * 
     */
    public AttachDiscountCouponsRS createAttachDiscountCouponsRS() {
        return new AttachDiscountCouponsRS();
    }

    /**
     * Create an instance of {@link DiscountCouponDetails }
     * 
     */
    public DiscountCouponDetails createDiscountCouponDetails() {
        return new DiscountCouponDetails();
    }

    /**
     * Create an instance of {@link AuthenticateLoginRQ }
     * 
     */
    public AuthenticateLoginRQ createAuthenticateLoginRQ() {
        return new AuthenticateLoginRQ();
    }

    /**
     * Create an instance of {@link AuthenticateLoginRS }
     * 
     */
    public AuthenticateLoginRS createAuthenticateLoginRS() {
        return new AuthenticateLoginRS();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link AuthenticateTravelAgentLoginRQ }
     * 
     */
    public AuthenticateTravelAgentLoginRQ createAuthenticateTravelAgentLoginRQ() {
        return new AuthenticateTravelAgentLoginRQ();
    }

    /**
     * Create an instance of {@link AuthenticateTravelAgentLoginRS }
     * 
     */
    public AuthenticateTravelAgentLoginRS createAuthenticateTravelAgentLoginRS() {
        return new AuthenticateTravelAgentLoginRS();
    }

    /**
     * Create an instance of {@link AgentAddress }
     * 
     */
    public AgentAddress createAgentAddress() {
        return new AgentAddress();
    }

    /**
     * Create an instance of {@link AgencyServiceFeeDetails }
     * 
     */
    public AgencyServiceFeeDetails createAgencyServiceFeeDetails() {
        return new AgencyServiceFeeDetails();
    }

    /**
     * Create an instance of {@link QueueNodeDetailsType }
     * 
     */
    public QueueNodeDetailsType createQueueNodeDetailsType() {
        return new QueueNodeDetailsType();
    }

    /**
     * Create an instance of {@link CorporateDetailsType }
     * 
     */
    public CorporateDetailsType createCorporateDetailsType() {
        return new CorporateDetailsType();
    }

    /**
     * Create an instance of {@link AuthenticateUserLoginRQ }
     * 
     */
    public AuthenticateUserLoginRQ createAuthenticateUserLoginRQ() {
        return new AuthenticateUserLoginRQ();
    }

    /**
     * Create an instance of {@link AuthenticateUserLoginRS }
     * 
     */
    public AuthenticateUserLoginRS createAuthenticateUserLoginRS() {
        return new AuthenticateUserLoginRS();
    }

    /**
     * Create an instance of {@link BimonthlySalesDetailedReportRQ }
     * 
     */
    public BimonthlySalesDetailedReportRQ createBimonthlySalesDetailedReportRQ() {
        return new BimonthlySalesDetailedReportRQ();
    }

    /**
     * Create an instance of {@link BimonthlySalesDetailedReportRS }
     * 
     */
    public BimonthlySalesDetailedReportRS createBimonthlySalesDetailedReportRS() {
        return new BimonthlySalesDetailedReportRS();
    }

    /**
     * Create an instance of {@link AgencySalesDetailsType }
     * 
     */
    public AgencySalesDetailsType createAgencySalesDetailsType() {
        return new AgencySalesDetailsType();
    }

    /**
     * Create an instance of {@link BimonthlySalesReportEmailRQ }
     * 
     */
    public BimonthlySalesReportEmailRQ createBimonthlySalesReportEmailRQ() {
        return new BimonthlySalesReportEmailRQ();
    }

    /**
     * Create an instance of {@link BimonthlySalesReportEmailRS }
     * 
     */
    public BimonthlySalesReportEmailRS createBimonthlySalesReportEmailRS() {
        return new BimonthlySalesReportEmailRS();
    }

    /**
     * Create an instance of {@link BimonthlySalesSummaryReportRQ }
     * 
     */
    public BimonthlySalesSummaryReportRQ createBimonthlySalesSummaryReportRQ() {
        return new BimonthlySalesSummaryReportRQ();
    }

    /**
     * Create an instance of {@link BimonthlySalesSummaryReportRS }
     * 
     */
    public BimonthlySalesSummaryReportRS createBimonthlySalesSummaryReportRS() {
        return new BimonthlySalesSummaryReportRS();
    }

    /**
     * Create an instance of {@link AgencySalesSummaryType }
     * 
     */
    public AgencySalesSummaryType createAgencySalesSummaryType() {
        return new AgencySalesSummaryType();
    }

    /**
     * Create an instance of {@link CalendarRetrieveFaresRQ }
     * 
     */
    public CalendarRetrieveFaresRQ createCalendarRetrieveFaresRQ() {
        return new CalendarRetrieveFaresRQ();
    }

    /**
     * Create an instance of {@link CalendarRetrieveFaresRS }
     * 
     */
    public CalendarRetrieveFaresRS createCalendarRetrieveFaresRS() {
        return new CalendarRetrieveFaresRS();
    }

    /**
     * Create an instance of {@link BestFareDetailsType }
     * 
     */
    public BestFareDetailsType createBestFareDetailsType() {
        return new BestFareDetailsType();
    }

    /**
     * Create an instance of {@link ChangeTravelAgentPasswordRQ }
     * 
     */
    public ChangeTravelAgentPasswordRQ createChangeTravelAgentPasswordRQ() {
        return new ChangeTravelAgentPasswordRQ();
    }

    /**
     * Create an instance of {@link PasswordChangeType }
     * 
     */
    public PasswordChangeType createPasswordChangeType() {
        return new PasswordChangeType();
    }

    /**
     * Create an instance of {@link ChangeTravelAgentPasswordRS }
     * 
     */
    public ChangeTravelAgentPasswordRS createChangeTravelAgentPasswordRS() {
        return new ChangeTravelAgentPasswordRS();
    }

    /**
     * Create an instance of {@link CreateAgencyRegistrationRQ }
     * 
     */
    public CreateAgencyRegistrationRQ createCreateAgencyRegistrationRQ() {
        return new CreateAgencyRegistrationRQ();
    }

    /**
     * Create an instance of {@link AgencyContactDetails }
     * 
     */
    public AgencyContactDetails createAgencyContactDetails() {
        return new AgencyContactDetails();
    }

    /**
     * Create an instance of {@link AgencyBankingDetail }
     * 
     */
    public AgencyBankingDetail createAgencyBankingDetail() {
        return new AgencyBankingDetail();
    }

    /**
     * Create an instance of {@link TaxInvoiceDetailType }
     * 
     */
    public TaxInvoiceDetailType createTaxInvoiceDetailType() {
        return new TaxInvoiceDetailType();
    }

    /**
     * Create an instance of {@link CreateAgencyRegistrationRS }
     * 
     */
    public CreateAgencyRegistrationRS createCreateAgencyRegistrationRS() {
        return new CreateAgencyRegistrationRS();
    }

    /**
     * Create an instance of {@link CreateBookingRQ }
     * 
     */
    public CreateBookingRQ createCreateBookingRQ() {
        return new CreateBookingRQ();
    }

    /**
     * Create an instance of {@link CreateBookingRS }
     * 
     */
    public CreateBookingRS createCreateBookingRS() {
        return new CreateBookingRS();
    }

    /**
     * Create an instance of {@link CreateCustomerProfileRQ }
     * 
     */
    public CreateCustomerProfileRQ createCreateCustomerProfileRQ() {
        return new CreateCustomerProfileRQ();
    }

    /**
     * Create an instance of {@link LoginDetails }
     * 
     */
    public LoginDetails createLoginDetails() {
        return new LoginDetails();
    }

    /**
     * Create an instance of {@link ProviderDetails }
     * 
     */
    public ProviderDetails createProviderDetails() {
        return new ProviderDetails();
    }

    /**
     * Create an instance of {@link GuestDetails }
     * 
     */
    public GuestDetails createGuestDetails() {
        return new GuestDetails();
    }

    /**
     * Create an instance of {@link CustomerProfileContactDetails }
     * 
     */
    public CustomerProfileContactDetails createCustomerProfileContactDetails() {
        return new CustomerProfileContactDetails();
    }

    /**
     * Create an instance of {@link FeeWaiveOrOverrideDetails }
     * 
     */
    public FeeWaiveOrOverrideDetails createFeeWaiveOrOverrideDetails() {
        return new FeeWaiveOrOverrideDetails();
    }

    /**
     * Create an instance of {@link CreateCustomerProfileRS }
     * 
     */
    public CreateCustomerProfileRS createCreateCustomerProfileRS() {
        return new CreateCustomerProfileRS();
    }

    /**
     * Create an instance of {@link CreateGiftVoucherRQ }
     * 
     */
    public CreateGiftVoucherRQ createCreateGiftVoucherRQ() {
        return new CreateGiftVoucherRQ();
    }

    /**
     * Create an instance of {@link GiftVoucherDenominationDetails }
     * 
     */
    public GiftVoucherDenominationDetails createGiftVoucherDenominationDetails() {
        return new GiftVoucherDenominationDetails();
    }

    /**
     * Create an instance of {@link GuestPaymentInfoType }
     * 
     */
    public GuestPaymentInfoType createGuestPaymentInfoType() {
        return new GuestPaymentInfoType();
    }

    /**
     * Create an instance of {@link GVPurchaserInformation }
     * 
     */
    public GVPurchaserInformation createGVPurchaserInformation() {
        return new GVPurchaserInformation();
    }

    /**
     * Create an instance of {@link GVRecipientInformation }
     * 
     */
    public GVRecipientInformation createGVRecipientInformation() {
        return new GVRecipientInformation();
    }

    /**
     * Create an instance of {@link CreateGiftVoucherRS }
     * 
     */
    public CreateGiftVoucherRS createCreateGiftVoucherRS() {
        return new CreateGiftVoucherRS();
    }

    /**
     * Create an instance of {@link CreatedGiftVoucherDetails }
     * 
     */
    public CreatedGiftVoucherDetails createCreatedGiftVoucherDetails() {
        return new CreatedGiftVoucherDetails();
    }

    /**
     * Create an instance of {@link PaymentDetailsType }
     * 
     */
    public PaymentDetailsType createPaymentDetailsType() {
        return new PaymentDetailsType();
    }

    /**
     * Create an instance of {@link CreateTravelAgentRQ }
     * 
     */
    public CreateTravelAgentRQ createCreateTravelAgentRQ() {
        return new CreateTravelAgentRQ();
    }

    /**
     * Create an instance of {@link CreateTravelAgentRS }
     * 
     */
    public CreateTravelAgentRS createCreateTravelAgentRS() {
        return new CreateTravelAgentRS();
    }

    /**
     * Create an instance of {@link CurrencyConvertorRQ }
     * 
     */
    public CurrencyConvertorRQ createCurrencyConvertorRQ() {
        return new CurrencyConvertorRQ();
    }

    /**
     * Create an instance of {@link CurrencyConvertorRS }
     * 
     */
    public CurrencyConvertorRS createCurrencyConvertorRS() {
        return new CurrencyConvertorRS();
    }

    /**
     * Create an instance of {@link CustomerBookedListRQ }
     * 
     */
    public CustomerBookedListRQ createCustomerBookedListRQ() {
        return new CustomerBookedListRQ();
    }

    /**
     * Create an instance of {@link CustomerBookedListRS }
     * 
     */
    public CustomerBookedListRS createCustomerBookedListRS() {
        return new CustomerBookedListRS();
    }

    /**
     * Create an instance of {@link PNRList }
     * 
     */
    public PNRList createPNRList() {
        return new PNRList();
    }

    /**
     * Create an instance of {@link DeactivateCustomerProfileRQ }
     * 
     */
    public DeactivateCustomerProfileRQ createDeactivateCustomerProfileRQ() {
        return new DeactivateCustomerProfileRQ();
    }

    /**
     * Create an instance of {@link DeactivateCustomerProfileRS }
     * 
     */
    public DeactivateCustomerProfileRS createDeactivateCustomerProfileRS() {
        return new DeactivateCustomerProfileRS();
    }

    /**
     * Create an instance of {@link DeactivateTravelAgentRQ }
     * 
     */
    public DeactivateTravelAgentRQ createDeactivateTravelAgentRQ() {
        return new DeactivateTravelAgentRQ();
    }

    /**
     * Create an instance of {@link DeactivateTravelAgentRS }
     * 
     */
    public DeactivateTravelAgentRS createDeactivateTravelAgentRS() {
        return new DeactivateTravelAgentRS();
    }

    /**
     * Create an instance of {@link FlightInfoRQ }
     * 
     */
    public FlightInfoRQ createFlightInfoRQ() {
        return new FlightInfoRQ();
    }

    /**
     * Create an instance of {@link FlightInfoRS }
     * 
     */
    public FlightInfoRS createFlightInfoRS() {
        return new FlightInfoRS();
    }

    /**
     * Create an instance of {@link GetFlightDataElementsRQ }
     * 
     */
    public GetFlightDataElementsRQ createGetFlightDataElementsRQ() {
        return new GetFlightDataElementsRQ();
    }

    /**
     * Create an instance of {@link FlightSegmentIdentifierType }
     * 
     */
    public FlightSegmentIdentifierType createFlightSegmentIdentifierType() {
        return new FlightSegmentIdentifierType();
    }

    /**
     * Create an instance of {@link GetFlightDataElementsRS }
     * 
     */
    public GetFlightDataElementsRS createGetFlightDataElementsRS() {
        return new GetFlightDataElementsRS();
    }

    /**
     * Create an instance of {@link FlightSegmentDataElementType }
     * 
     */
    public FlightSegmentDataElementType createFlightSegmentDataElementType() {
        return new FlightSegmentDataElementType();
    }

    /**
     * Create an instance of {@link GetTimeTableInfoRQ }
     * 
     */
    public GetTimeTableInfoRQ createGetTimeTableInfoRQ() {
        return new GetTimeTableInfoRQ();
    }

    /**
     * Create an instance of {@link DateOnlyType }
     * 
     */
    public DateOnlyType createDateOnlyType() {
        return new DateOnlyType();
    }

    /**
     * Create an instance of {@link GetTimeTableInfoRS }
     * 
     */
    public GetTimeTableInfoRS createGetTimeTableInfoRS() {
        return new GetTimeTableInfoRS();
    }

    /**
     * Create an instance of {@link ScheduleInfoDetails }
     * 
     */
    public ScheduleInfoDetails createScheduleInfoDetails() {
        return new ScheduleInfoDetails();
    }

    /**
     * Create an instance of {@link GroupSeatInventoryCountRQ }
     * 
     */
    public GroupSeatInventoryCountRQ createGroupSeatInventoryCountRQ() {
        return new GroupSeatInventoryCountRQ();
    }

    /**
     * Create an instance of {@link FlightIdentifierType }
     * 
     */
    public FlightIdentifierType createFlightIdentifierType() {
        return new FlightIdentifierType();
    }

    /**
     * Create an instance of {@link GroupSeatInventoryCountRS }
     * 
     */
    public GroupSeatInventoryCountRS createGroupSeatInventoryCountRS() {
        return new GroupSeatInventoryCountRS();
    }

    /**
     * Create an instance of {@link GroupSeatCountType }
     * 
     */
    public GroupSeatCountType createGroupSeatCountType() {
        return new GroupSeatCountType();
    }

    /**
     * Create an instance of {@link IssueGiftVoucherRQ }
     * 
     */
    public IssueGiftVoucherRQ createIssueGiftVoucherRQ() {
        return new IssueGiftVoucherRQ();
    }

    /**
     * Create an instance of {@link IssueGiftVoucherRS }
     * 
     */
    public IssueGiftVoucherRS createIssueGiftVoucherRS() {
        return new IssueGiftVoucherRS();
    }

    /**
     * Create an instance of {@link ListAgentInvoicesRQ }
     * 
     */
    public ListAgentInvoicesRQ createListAgentInvoicesRQ() {
        return new ListAgentInvoicesRQ();
    }

    /**
     * Create an instance of {@link ListAgentInvoicesRS }
     * 
     */
    public ListAgentInvoicesRS createListAgentInvoicesRS() {
        return new ListAgentInvoicesRS();
    }

    /**
     * Create an instance of {@link AgentInvoiceSummaryType }
     * 
     */
    public AgentInvoiceSummaryType createAgentInvoiceSummaryType() {
        return new AgentInvoiceSummaryType();
    }

    /**
     * Create an instance of {@link ListCustomerProfileRQ }
     * 
     */
    public ListCustomerProfileRQ createListCustomerProfileRQ() {
        return new ListCustomerProfileRQ();
    }

    /**
     * Create an instance of {@link ListCustomerProfileRS }
     * 
     */
    public ListCustomerProfileRS createListCustomerProfileRS() {
        return new ListCustomerProfileRS();
    }

    /**
     * Create an instance of {@link ListCustomerProfileDetails }
     * 
     */
    public ListCustomerProfileDetails createListCustomerProfileDetails() {
        return new ListCustomerProfileDetails();
    }

    /**
     * Create an instance of {@link ListGiftVouchersRQ }
     * 
     */
    public ListGiftVouchersRQ createListGiftVouchersRQ() {
        return new ListGiftVouchersRQ();
    }

    /**
     * Create an instance of {@link ListGiftVouchersRS }
     * 
     */
    public ListGiftVouchersRS createListGiftVouchersRS() {
        return new ListGiftVouchersRS();
    }

    /**
     * Create an instance of {@link ListGiftVoucherDetails }
     * 
     */
    public ListGiftVoucherDetails createListGiftVoucherDetails() {
        return new ListGiftVoucherDetails();
    }

    /**
     * Create an instance of {@link ListTravelAgentsRQ }
     * 
     */
    public ListTravelAgentsRQ createListTravelAgentsRQ() {
        return new ListTravelAgentsRQ();
    }

    /**
     * Create an instance of {@link ListTravelAgentsRS }
     * 
     */
    public ListTravelAgentsRS createListTravelAgentsRS() {
        return new ListTravelAgentsRS();
    }

    /**
     * Create an instance of {@link TravelAgentDetails }
     * 
     */
    public TravelAgentDetails createTravelAgentDetails() {
        return new TravelAgentDetails();
    }

    /**
     * Create an instance of {@link LoginVPPRQ }
     * 
     */
    public LoginVPPRQ createLoginVPPRQ() {
        return new LoginVPPRQ();
    }

    /**
     * Create an instance of {@link LoginVPPRS }
     * 
     */
    public LoginVPPRS createLoginVPPRS() {
        return new LoginVPPRS();
    }

    /**
     * Create an instance of {@link LogOffRQ }
     * 
     */
    public LogOffRQ createLogOffRQ() {
        return new LogOffRQ();
    }

    /**
     * Create an instance of {@link LogOffRS }
     * 
     */
    public LogOffRS createLogOffRS() {
        return new LogOffRS();
    }

    /**
     * Create an instance of {@link LoginRQ }
     * 
     */
    public LoginRQ createLoginRQ() {
        return new LoginRQ();
    }

    /**
     * Create an instance of {@link LoginRS }
     * 
     */
    public LoginRS createLoginRS() {
        return new LoginRS();
    }

    /**
     * Create an instance of {@link ModifyAgencyProfileRQ }
     * 
     */
    public ModifyAgencyProfileRQ createModifyAgencyProfileRQ() {
        return new ModifyAgencyProfileRQ();
    }

    /**
     * Create an instance of {@link ModifyAgencyProfileRS }
     * 
     */
    public ModifyAgencyProfileRS createModifyAgencyProfileRS() {
        return new ModifyAgencyProfileRS();
    }

    /**
     * Create an instance of {@link ModifyBookingRQ }
     * 
     */
    public ModifyBookingRQ createModifyBookingRQ() {
        return new ModifyBookingRQ();
    }

    /**
     * Create an instance of {@link ModifyBookingRS }
     * 
     */
    public ModifyBookingRS createModifyBookingRS() {
        return new ModifyBookingRS();
    }

    /**
     * Create an instance of {@link ModifyCustomerProfileRQ }
     * 
     */
    public ModifyCustomerProfileRQ createModifyCustomerProfileRQ() {
        return new ModifyCustomerProfileRQ();
    }

    /**
     * Create an instance of {@link ModifyCustomerProfileRS }
     * 
     */
    public ModifyCustomerProfileRS createModifyCustomerProfileRS() {
        return new ModifyCustomerProfileRS();
    }

    /**
     * Create an instance of {@link ModifyTravelAgentRQ }
     * 
     */
    public ModifyTravelAgentRQ createModifyTravelAgentRQ() {
        return new ModifyTravelAgentRQ();
    }

    /**
     * Create an instance of {@link ModifyTravelAgentRS }
     * 
     */
    public ModifyTravelAgentRS createModifyTravelAgentRS() {
        return new ModifyTravelAgentRS();
    }

    /**
     * Create an instance of {@link ModuleAccessRightsRQ }
     * 
     */
    public ModuleAccessRightsRQ createModuleAccessRightsRQ() {
        return new ModuleAccessRightsRQ();
    }

    /**
     * Create an instance of {@link ModuleAccessRightsRS }
     * 
     */
    public ModuleAccessRightsRS createModuleAccessRightsRS() {
        return new ModuleAccessRightsRS();
    }

    /**
     * Create an instance of {@link SubModuleAccessDetailsType }
     * 
     */
    public SubModuleAccessDetailsType createSubModuleAccessDetailsType() {
        return new SubModuleAccessDetailsType();
    }

    /**
     * Create an instance of {@link PlacePnrsInQueueRQ }
     * 
     */
    public PlacePnrsInQueueRQ createPlacePnrsInQueueRQ() {
        return new PlacePnrsInQueueRQ();
    }

    /**
     * Create an instance of {@link PNRQueueDetailsType }
     * 
     */
    public PNRQueueDetailsType createPNRQueueDetailsType() {
        return new PNRQueueDetailsType();
    }

    /**
     * Create an instance of {@link PlacePnrsInQueueRS }
     * 
     */
    public PlacePnrsInQueueRS createPlacePnrsInQueueRS() {
        return new PlacePnrsInQueueRS();
    }

    /**
     * Create an instance of {@link PNRExtractRQ }
     * 
     */
    public PNRExtractRQ createPNRExtractRQ() {
        return new PNRExtractRQ();
    }

    /**
     * Create an instance of {@link PNRExtractRS }
     * 
     */
    public PNRExtractRS createPNRExtractRS() {
        return new PNRExtractRS();
    }

    /**
     * Create an instance of {@link PNROriginator }
     * 
     */
    public PNROriginator createPNROriginator() {
        return new PNROriginator();
    }

    /**
     * Create an instance of {@link PNRDestination }
     * 
     */
    public PNRDestination createPNRDestination() {
        return new PNRDestination();
    }

    /**
     * Create an instance of {@link PnrDetails }
     * 
     */
    public PnrDetails createPnrDetails() {
        return new PnrDetails();
    }

    /**
     * Create an instance of {@link TotalFareDetails }
     * 
     */
    public TotalFareDetails createTotalFareDetails() {
        return new TotalFareDetails();
    }

    /**
     * Create an instance of {@link TotalFeeDetails }
     * 
     */
    public TotalFeeDetails createTotalFeeDetails() {
        return new TotalFeeDetails();
    }

    /**
     * Create an instance of {@link TotalTaxDetails }
     * 
     */
    public TotalTaxDetails createTotalTaxDetails() {
        return new TotalTaxDetails();
    }

    /**
     * Create an instance of {@link TotalSurchargeDetails }
     * 
     */
    public TotalSurchargeDetails createTotalSurchargeDetails() {
        return new TotalSurchargeDetails();
    }

    /**
     * Create an instance of {@link TotalPaymentDetails }
     * 
     */
    public TotalPaymentDetails createTotalPaymentDetails() {
        return new TotalPaymentDetails();
    }

    /**
     * Create an instance of {@link FareRulesDescription }
     * 
     */
    public FareRulesDescription createFareRulesDescription() {
        return new FareRulesDescription();
    }

    /**
     * Create an instance of {@link IncrementalItineraryDetails }
     * 
     */
    public IncrementalItineraryDetails createIncrementalItineraryDetails() {
        return new IncrementalItineraryDetails();
    }

    /**
     * Create an instance of {@link GroupDetails }
     * 
     */
    public GroupDetails createGroupDetails() {
        return new GroupDetails();
    }

    /**
     * Create an instance of {@link AgencyDetails }
     * 
     */
    public AgencyDetails createAgencyDetails() {
        return new AgencyDetails();
    }

    /**
     * Create an instance of {@link PnrPaymentEncoded }
     * 
     */
    public PnrPaymentEncoded createPnrPaymentEncoded() {
        return new PnrPaymentEncoded();
    }

    /**
     * Create an instance of {@link TransactionalPnrDetails }
     * 
     */
    public TransactionalPnrDetails createTransactionalPnrDetails() {
        return new TransactionalPnrDetails();
    }

    /**
     * Create an instance of {@link ExternalRecordLocatorDetailsType }
     * 
     */
    public ExternalRecordLocatorDetailsType createExternalRecordLocatorDetailsType() {
        return new ExternalRecordLocatorDetailsType();
    }

    /**
     * Create an instance of {@link PreProcessPaymentRQ }
     * 
     */
    public PreProcessPaymentRQ createPreProcessPaymentRQ() {
        return new PreProcessPaymentRQ();
    }

    /**
     * Create an instance of {@link PreProcessPaymentRS }
     * 
     */
    public PreProcessPaymentRS createPreProcessPaymentRS() {
        return new PreProcessPaymentRS();
    }

    /**
     * Create an instance of {@link ProcessFeeRQ }
     * 
     */
    public ProcessFeeRQ createProcessFeeRQ() {
        return new ProcessFeeRQ();
    }

    /**
     * Create an instance of {@link SegmentInfoDetails }
     * 
     */
    public SegmentInfoDetails createSegmentInfoDetails() {
        return new SegmentInfoDetails();
    }

    /**
     * Create an instance of {@link FeeRequestDetails }
     * 
     */
    public FeeRequestDetails createFeeRequestDetails() {
        return new FeeRequestDetails();
    }

    /**
     * Create an instance of {@link AuxiliaryFeeInputDetails }
     * 
     */
    public AuxiliaryFeeInputDetails createAuxiliaryFeeInputDetails() {
        return new AuxiliaryFeeInputDetails();
    }

    /**
     * Create an instance of {@link CCFeeRequestDetails }
     * 
     */
    public CCFeeRequestDetails createCCFeeRequestDetails() {
        return new CCFeeRequestDetails();
    }

    /**
     * Create an instance of {@link ProcessFeeRS }
     * 
     */
    public ProcessFeeRS createProcessFeeRS() {
        return new ProcessFeeRS();
    }

    /**
     * Create an instance of {@link PaxFeeMapping }
     * 
     */
    public PaxFeeMapping createPaxFeeMapping() {
        return new PaxFeeMapping();
    }

    /**
     * Create an instance of {@link RemovePnrFromQueueRQ }
     * 
     */
    public RemovePnrFromQueueRQ createRemovePnrFromQueueRQ() {
        return new RemovePnrFromQueueRQ();
    }

    /**
     * Create an instance of {@link PnrQueueDetailsInputType }
     * 
     */
    public PnrQueueDetailsInputType createPnrQueueDetailsInputType() {
        return new PnrQueueDetailsInputType();
    }

    /**
     * Create an instance of {@link RemovePnrFromQueueRS }
     * 
     */
    public RemovePnrFromQueueRS createRemovePnrFromQueueRS() {
        return new RemovePnrFromQueueRS();
    }

    /**
     * Create an instance of {@link ResetLoyaltyPasswordRQ }
     * 
     */
    public ResetLoyaltyPasswordRQ createResetLoyaltyPasswordRQ() {
        return new ResetLoyaltyPasswordRQ();
    }

    /**
     * Create an instance of {@link ResetLoyaltyPasswordRS }
     * 
     */
    public ResetLoyaltyPasswordRS createResetLoyaltyPasswordRS() {
        return new ResetLoyaltyPasswordRS();
    }

    /**
     * Create an instance of {@link RetrieveAccessibleFareLevelsRQ }
     * 
     */
    public RetrieveAccessibleFareLevelsRQ createRetrieveAccessibleFareLevelsRQ() {
        return new RetrieveAccessibleFareLevelsRQ();
    }

    /**
     * Create an instance of {@link RetrieveAccessibleFareLevelsRS }
     * 
     */
    public RetrieveAccessibleFareLevelsRS createRetrieveAccessibleFareLevelsRS() {
        return new RetrieveAccessibleFareLevelsRS();
    }

    /**
     * Create an instance of {@link FareLevelDetails }
     * 
     */
    public FareLevelDetails createFareLevelDetails() {
        return new FareLevelDetails();
    }

    /**
     * Create an instance of {@link RetrieveAgencyCreditFileDtlsRQ }
     * 
     */
    public RetrieveAgencyCreditFileDtlsRQ createRetrieveAgencyCreditFileDtlsRQ() {
        return new RetrieveAgencyCreditFileDtlsRQ();
    }

    /**
     * Create an instance of {@link RetrieveAgencyCreditFileDtlsRS }
     * 
     */
    public RetrieveAgencyCreditFileDtlsRS createRetrieveAgencyCreditFileDtlsRS() {
        return new RetrieveAgencyCreditFileDtlsRS();
    }

    /**
     * Create an instance of {@link AgencyCreditFileDetails }
     * 
     */
    public AgencyCreditFileDetails createAgencyCreditFileDetails() {
        return new AgencyCreditFileDetails();
    }

    /**
     * Create an instance of {@link RetrieveAgencyCreditRQ }
     * 
     */
    public RetrieveAgencyCreditRQ createRetrieveAgencyCreditRQ() {
        return new RetrieveAgencyCreditRQ();
    }

    /**
     * Create an instance of {@link RetrieveAgencyCreditRS }
     * 
     */
    public RetrieveAgencyCreditRS createRetrieveAgencyCreditRS() {
        return new RetrieveAgencyCreditRS();
    }

    /**
     * Create an instance of {@link RetrieveAgentInvoiceDetailsRQ }
     * 
     */
    public RetrieveAgentInvoiceDetailsRQ createRetrieveAgentInvoiceDetailsRQ() {
        return new RetrieveAgentInvoiceDetailsRQ();
    }

    /**
     * Create an instance of {@link RetrieveAgentInvoiceDetailsRS }
     * 
     */
    public RetrieveAgentInvoiceDetailsRS createRetrieveAgentInvoiceDetailsRS() {
        return new RetrieveAgentInvoiceDetailsRS();
    }

    /**
     * Create an instance of {@link AgentInvoiceDetailsType }
     * 
     */
    public AgentInvoiceDetailsType createAgentInvoiceDetailsType() {
        return new AgentInvoiceDetailsType();
    }

    /**
     * Create an instance of {@link RetrieveAllSSRsRQ }
     * 
     */
    public RetrieveAllSSRsRQ createRetrieveAllSSRsRQ() {
        return new RetrieveAllSSRsRQ();
    }

    /**
     * Create an instance of {@link RetrieveAllSSRsRS }
     * 
     */
    public RetrieveAllSSRsRS createRetrieveAllSSRsRS() {
        return new RetrieveAllSSRsRS();
    }

    /**
     * Create an instance of {@link SSRDetails }
     * 
     */
    public SSRDetails createSSRDetails() {
        return new SSRDetails();
    }

    /**
     * Create an instance of {@link RetrieveAUXRulesRQ }
     * 
     */
    public RetrieveAUXRulesRQ createRetrieveAUXRulesRQ() {
        return new RetrieveAUXRulesRQ();
    }

    /**
     * Create an instance of {@link CarRentalServiceType }
     * 
     */
    public CarRentalServiceType createCarRentalServiceType() {
        return new CarRentalServiceType();
    }

    /**
     * Create an instance of {@link TravelInsuranceServiceType }
     * 
     */
    public TravelInsuranceServiceType createTravelInsuranceServiceType() {
        return new TravelInsuranceServiceType();
    }

    /**
     * Create an instance of {@link RetrieveAUXRulesRS }
     * 
     */
    public RetrieveAUXRulesRS createRetrieveAUXRulesRS() {
        return new RetrieveAUXRulesRS();
    }

    /**
     * Create an instance of {@link AuxType }
     * 
     */
    public AuxType createAuxType() {
        return new AuxType();
    }

    /**
     * Create an instance of {@link RetrieveBookingRQ }
     * 
     */
    public RetrieveBookingRQ createRetrieveBookingRQ() {
        return new RetrieveBookingRQ();
    }

    /**
     * Create an instance of {@link BookingChannelType }
     * 
     */
    public BookingChannelType createBookingChannelType() {
        return new BookingChannelType();
    }

    /**
     * Create an instance of {@link RetrieveBookingRS }
     * 
     */
    public RetrieveBookingRS createRetrieveBookingRS() {
        return new RetrieveBookingRS();
    }

    /**
     * Create an instance of {@link BasePnrRSType }
     * 
     */
    public BasePnrRSType createBasePnrRSType() {
        return new BasePnrRSType();
    }

    /**
     * Create an instance of {@link BookerDetailsType }
     * 
     */
    public BookerDetailsType createBookerDetailsType() {
        return new BookerDetailsType();
    }

    /**
     * Create an instance of {@link PaxCountDetailsType }
     * 
     */
    public PaxCountDetailsType createPaxCountDetailsType() {
        return new PaxCountDetailsType();
    }

    /**
     * Create an instance of {@link ItineraryDetailsType }
     * 
     */
    public ItineraryDetailsType createItineraryDetailsType() {
        return new ItineraryDetailsType();
    }

    /**
     * Create an instance of {@link ItinPriceType }
     * 
     */
    public ItinPriceType createItinPriceType() {
        return new ItinPriceType();
    }

    /**
     * Create an instance of {@link GuestReponseDetailsType }
     * 
     */
    public GuestReponseDetailsType createGuestReponseDetailsType() {
        return new GuestReponseDetailsType();
    }

    /**
     * Create an instance of {@link ConsentDetailsResponseType }
     * 
     */
    public ConsentDetailsResponseType createConsentDetailsResponseType() {
        return new ConsentDetailsResponseType();
    }

    /**
     * Create an instance of {@link PaxBaggageAllowanceType }
     * 
     */
    public PaxBaggageAllowanceType createPaxBaggageAllowanceType() {
        return new PaxBaggageAllowanceType();
    }

    /**
     * Create an instance of {@link SSRInformationType }
     * 
     */
    public SSRInformationType createSSRInformationType() {
        return new SSRInformationType();
    }

    /**
     * Create an instance of {@link AuxInformationType }
     * 
     */
    public AuxInformationType createAuxInformationType() {
        return new AuxInformationType();
    }

    /**
     * Create an instance of {@link SeatAssignmentDetailsType }
     * 
     */
    public SeatAssignmentDetailsType createSeatAssignmentDetailsType() {
        return new SeatAssignmentDetailsType();
    }

    /**
     * Create an instance of {@link TravelDocumentsType }
     * 
     */
    public TravelDocumentsType createTravelDocumentsType() {
        return new TravelDocumentsType();
    }

    /**
     * Create an instance of {@link GroupPaxDetailsType }
     * 
     */
    public GroupPaxDetailsType createGroupPaxDetailsType() {
        return new GroupPaxDetailsType();
    }

    /**
     * Create an instance of {@link PnrContactType }
     * 
     */
    public PnrContactType createPnrContactType() {
        return new PnrContactType();
    }

    /**
     * Create an instance of {@link CommentDetailsType }
     * 
     */
    public CommentDetailsType createCommentDetailsType() {
        return new CommentDetailsType();
    }

    /**
     * Create an instance of {@link GuestLoyaltyInfoType }
     * 
     */
    public GuestLoyaltyInfoType createGuestLoyaltyInfoType() {
        return new GuestLoyaltyInfoType();
    }

    /**
     * Create an instance of {@link FeeInformationType }
     * 
     */
    public FeeInformationType createFeeInformationType() {
        return new FeeInformationType();
    }

    /**
     * Create an instance of {@link EmdInformationDetailsType }
     * 
     */
    public EmdInformationDetailsType createEmdInformationDetailsType() {
        return new EmdInformationDetailsType();
    }

    /**
     * Create an instance of {@link PromoCodeDetailsType }
     * 
     */
    public PromoCodeDetailsType createPromoCodeDetailsType() {
        return new PromoCodeDetailsType();
    }

    /**
     * Create an instance of {@link PaxDiscountCouponDetailsType }
     * 
     */
    public PaxDiscountCouponDetailsType createPaxDiscountCouponDetailsType() {
        return new PaxDiscountCouponDetailsType();
    }

    /**
     * Create an instance of {@link PnrPaymentEncodedType }
     * 
     */
    public PnrPaymentEncodedType createPnrPaymentEncodedType() {
        return new PnrPaymentEncodedType();
    }

    /**
     * Create an instance of {@link TotalAmountDetailsType }
     * 
     */
    public TotalAmountDetailsType createTotalAmountDetailsType() {
        return new TotalAmountDetailsType();
    }

    /**
     * Create an instance of {@link PNRTimeLimitDetailsType }
     * 
     */
    public PNRTimeLimitDetailsType createPNRTimeLimitDetailsType() {
        return new PNRTimeLimitDetailsType();
    }

    /**
     * Create an instance of {@link TotalAmountToBePaidDetailsType }
     * 
     */
    public TotalAmountToBePaidDetailsType createTotalAmountToBePaidDetailsType() {
        return new TotalAmountToBePaidDetailsType();
    }

    /**
     * Create an instance of {@link TotalAmountPaid }
     * 
     */
    public TotalAmountPaid createTotalAmountPaid() {
        return new TotalAmountPaid();
    }

    /**
     * Create an instance of {@link CrossreferenceDetailsType }
     * 
     */
    public CrossreferenceDetailsType createCrossreferenceDetailsType() {
        return new CrossreferenceDetailsType();
    }

    /**
     * Create an instance of {@link RetrieveBookingArcRQ }
     * 
     */
    public RetrieveBookingArcRQ createRetrieveBookingArcRQ() {
        return new RetrieveBookingArcRQ();
    }

    /**
     * Create an instance of {@link RetrieveBookingArcRS }
     * 
     */
    public RetrieveBookingArcRS createRetrieveBookingArcRS() {
        return new RetrieveBookingArcRS();
    }

    /**
     * Create an instance of {@link RetrieveCreditFileBalanceRQ }
     * 
     */
    public RetrieveCreditFileBalanceRQ createRetrieveCreditFileBalanceRQ() {
        return new RetrieveCreditFileBalanceRQ();
    }

    /**
     * Create an instance of {@link RetrieveCreditFileBalanceRS }
     * 
     */
    public RetrieveCreditFileBalanceRS createRetrieveCreditFileBalanceRS() {
        return new RetrieveCreditFileBalanceRS();
    }

    /**
     * Create an instance of {@link RetrieveCreditFileRQ }
     * 
     */
    public RetrieveCreditFileRQ createRetrieveCreditFileRQ() {
        return new RetrieveCreditFileRQ();
    }

    /**
     * Create an instance of {@link RetrieveCreditFileRS }
     * 
     */
    public RetrieveCreditFileRS createRetrieveCreditFileRS() {
        return new RetrieveCreditFileRS();
    }

    /**
     * Create an instance of {@link CreditFileType }
     * 
     */
    public CreditFileType createCreditFileType() {
        return new CreditFileType();
    }

    /**
     * Create an instance of {@link RetrieveDutyCodesForAgencyRQ }
     * 
     */
    public RetrieveDutyCodesForAgencyRQ createRetrieveDutyCodesForAgencyRQ() {
        return new RetrieveDutyCodesForAgencyRQ();
    }

    /**
     * Create an instance of {@link RetrieveDutyCodesForAgencyRS }
     * 
     */
    public RetrieveDutyCodesForAgencyRS createRetrieveDutyCodesForAgencyRS() {
        return new RetrieveDutyCodesForAgencyRS();
    }

    /**
     * Create an instance of {@link DutyCodeDetails }
     * 
     */
    public DutyCodeDetails createDutyCodeDetails() {
        return new DutyCodeDetails();
    }

    /**
     * Create an instance of {@link RetrieveFareBasisSettingsRQ }
     * 
     */
    public RetrieveFareBasisSettingsRQ createRetrieveFareBasisSettingsRQ() {
        return new RetrieveFareBasisSettingsRQ();
    }

    /**
     * Create an instance of {@link RetrieveFareBasisSettingsRS }
     * 
     */
    public RetrieveFareBasisSettingsRS createRetrieveFareBasisSettingsRS() {
        return new RetrieveFareBasisSettingsRS();
    }

    /**
     * Create an instance of {@link FareBasisSettingDetailsType }
     * 
     */
    public FareBasisSettingDetailsType createFareBasisSettingDetailsType() {
        return new FareBasisSettingDetailsType();
    }

    /**
     * Create an instance of {@link RetrieveFareQuoteForOAndDRQ }
     * 
     */
    public RetrieveFareQuoteForOAndDRQ createRetrieveFareQuoteForOAndDRQ() {
        return new RetrieveFareQuoteForOAndDRQ();
    }

    /**
     * Create an instance of {@link AirportPairType }
     * 
     */
    public AirportPairType createAirportPairType() {
        return new AirportPairType();
    }

    /**
     * Create an instance of {@link RetrieveFareQuoteForOAndDRS }
     * 
     */
    public RetrieveFareQuoteForOAndDRS createRetrieveFareQuoteForOAndDRS() {
        return new RetrieveFareQuoteForOAndDRS();
    }

    /**
     * Create an instance of {@link FareDetails }
     * 
     */
    public FareDetails createFareDetails() {
        return new FareDetails();
    }

    /**
     * Create an instance of {@link RetrieveFareRuleDescriptionRQ }
     * 
     */
    public RetrieveFareRuleDescriptionRQ createRetrieveFareRuleDescriptionRQ() {
        return new RetrieveFareRuleDescriptionRQ();
    }

    /**
     * Create an instance of {@link RetrieveFareRuleDescriptionRS }
     * 
     */
    public RetrieveFareRuleDescriptionRS createRetrieveFareRuleDescriptionRS() {
        return new RetrieveFareRuleDescriptionRS();
    }

    /**
     * Create an instance of {@link RetrieveFeeCodesRQ }
     * 
     */
    public RetrieveFeeCodesRQ createRetrieveFeeCodesRQ() {
        return new RetrieveFeeCodesRQ();
    }

    /**
     * Create an instance of {@link RetrieveFeeCodesRS }
     * 
     */
    public RetrieveFeeCodesRS createRetrieveFeeCodesRS() {
        return new RetrieveFeeCodesRS();
    }

    /**
     * Create an instance of {@link FeeCodeType }
     * 
     */
    public FeeCodeType createFeeCodeType() {
        return new FeeCodeType();
    }

    /**
     * Create an instance of {@link RetrieveFlightManifestRQ }
     * 
     */
    public RetrieveFlightManifestRQ createRetrieveFlightManifestRQ() {
        return new RetrieveFlightManifestRQ();
    }

    /**
     * Create an instance of {@link RetrieveFlightManifestRS }
     * 
     */
    public RetrieveFlightManifestRS createRetrieveFlightManifestRS() {
        return new RetrieveFlightManifestRS();
    }

    /**
     * Create an instance of {@link ManifestDetails }
     * 
     */
    public ManifestDetails createManifestDetails() {
        return new ManifestDetails();
    }

    /**
     * Create an instance of {@link RetrieveFlightScheduleRQ }
     * 
     */
    public RetrieveFlightScheduleRQ createRetrieveFlightScheduleRQ() {
        return new RetrieveFlightScheduleRQ();
    }

    /**
     * Create an instance of {@link ScheduleSearchType }
     * 
     */
    public ScheduleSearchType createScheduleSearchType() {
        return new ScheduleSearchType();
    }

    /**
     * Create an instance of {@link RetrieveFlightScheduleRS }
     * 
     */
    public RetrieveFlightScheduleRS createRetrieveFlightScheduleRS() {
        return new RetrieveFlightScheduleRS();
    }

    /**
     * Create an instance of {@link ScheduleDetailsType }
     * 
     */
    public ScheduleDetailsType createScheduleDetailsType() {
        return new ScheduleDetailsType();
    }

    /**
     * Create an instance of {@link RetrieveFOPDetailsForAgencyRQ }
     * 
     */
    public RetrieveFOPDetailsForAgencyRQ createRetrieveFOPDetailsForAgencyRQ() {
        return new RetrieveFOPDetailsForAgencyRQ();
    }

    /**
     * Create an instance of {@link RetrieveFOPDetailsForAgencyRS }
     * 
     */
    public RetrieveFOPDetailsForAgencyRS createRetrieveFOPDetailsForAgencyRS() {
        return new RetrieveFOPDetailsForAgencyRS();
    }

    /**
     * Create an instance of {@link FOPDetails }
     * 
     */
    public FOPDetails createFOPDetails() {
        return new FOPDetails();
    }

    /**
     * Create an instance of {@link RetrieveGCWithProfileAliasRQ }
     * 
     */
    public RetrieveGCWithProfileAliasRQ createRetrieveGCWithProfileAliasRQ() {
        return new RetrieveGCWithProfileAliasRQ();
    }

    /**
     * Create an instance of {@link RetrieveGCWithProfileAliasRS }
     * 
     */
    public RetrieveGCWithProfileAliasRS createRetrieveGCWithProfileAliasRS() {
        return new RetrieveGCWithProfileAliasRS();
    }

    /**
     * Create an instance of {@link RetrieveGCWithProfileAlias }
     * 
     */
    public RetrieveGCWithProfileAlias createRetrieveGCWithProfileAlias() {
        return new RetrieveGCWithProfileAlias();
    }

    /**
     * Create an instance of {@link RetrieveGiftCertificateDetailsRQ }
     * 
     */
    public RetrieveGiftCertificateDetailsRQ createRetrieveGiftCertificateDetailsRQ() {
        return new RetrieveGiftCertificateDetailsRQ();
    }

    /**
     * Create an instance of {@link RetrieveGiftCertificateDetailsRS }
     * 
     */
    public RetrieveGiftCertificateDetailsRS createRetrieveGiftCertificateDetailsRS() {
        return new RetrieveGiftCertificateDetailsRS();
    }

    /**
     * Create an instance of {@link PurchaserDetails }
     * 
     */
    public PurchaserDetails createPurchaserDetails() {
        return new PurchaserDetails();
    }

    /**
     * Create an instance of {@link RecipientDetails }
     * 
     */
    public RecipientDetails createRecipientDetails() {
        return new RecipientDetails();
    }

    /**
     * Create an instance of {@link RetrieveLimitedReservationsRQ }
     * 
     */
    public RetrieveLimitedReservationsRQ createRetrieveLimitedReservationsRQ() {
        return new RetrieveLimitedReservationsRQ();
    }

    /**
     * Create an instance of {@link RetrieveLimitedReservationsRS }
     * 
     */
    public RetrieveLimitedReservationsRS createRetrieveLimitedReservationsRS() {
        return new RetrieveLimitedReservationsRS();
    }

    /**
     * Create an instance of {@link PnrSummary }
     * 
     */
    public PnrSummary createPnrSummary() {
        return new PnrSummary();
    }

    /**
     * Create an instance of {@link RetrieveNumericReferenceIDRQ }
     * 
     */
    public RetrieveNumericReferenceIDRQ createRetrieveNumericReferenceIDRQ() {
        return new RetrieveNumericReferenceIDRQ();
    }

    /**
     * Create an instance of {@link RetrieveNumericReferenceIDRS }
     * 
     */
    public RetrieveNumericReferenceIDRS createRetrieveNumericReferenceIDRS() {
        return new RetrieveNumericReferenceIDRS();
    }

    /**
     * Create an instance of {@link NumericPNR }
     * 
     */
    public NumericPNR createNumericPNR() {
        return new NumericPNR();
    }

    /**
     * Create an instance of {@link RetrieveOandDPairsRQ }
     * 
     */
    public RetrieveOandDPairsRQ createRetrieveOandDPairsRQ() {
        return new RetrieveOandDPairsRQ();
    }

    /**
     * Create an instance of {@link RetrieveOandDPairsRS }
     * 
     */
    public RetrieveOandDPairsRS createRetrieveOandDPairsRS() {
        return new RetrieveOandDPairsRS();
    }

    /**
     * Create an instance of {@link OandDPairs }
     * 
     */
    public OandDPairs createOandDPairs() {
        return new OandDPairs();
    }

    /**
     * Create an instance of {@link RetrievePassengerManifestRQ }
     * 
     */
    public RetrievePassengerManifestRQ createRetrievePassengerManifestRQ() {
        return new RetrievePassengerManifestRQ();
    }

    /**
     * Create an instance of {@link RetrievePassengerManifestRS }
     * 
     */
    public RetrievePassengerManifestRS createRetrievePassengerManifestRS() {
        return new RetrievePassengerManifestRS();
    }

    /**
     * Create an instance of {@link PaxPNRManifestDetails }
     * 
     */
    public PaxPNRManifestDetails createPaxPNRManifestDetails() {
        return new PaxPNRManifestDetails();
    }

    /**
     * Create an instance of {@link RetrievePaymentReceiptRQ }
     * 
     */
    public RetrievePaymentReceiptRQ createRetrievePaymentReceiptRQ() {
        return new RetrievePaymentReceiptRQ();
    }

    /**
     * Create an instance of {@link RetrievePaymentReceiptRS }
     * 
     */
    public RetrievePaymentReceiptRS createRetrievePaymentReceiptRS() {
        return new RetrievePaymentReceiptRS();
    }

    /**
     * Create an instance of {@link PaymentReceiptDetailsType }
     * 
     */
    public PaymentReceiptDetailsType createPaymentReceiptDetailsType() {
        return new PaymentReceiptDetailsType();
    }

    /**
     * Create an instance of {@link PymntReceiptOandDDetailsType }
     * 
     */
    public PymntReceiptOandDDetailsType createPymntReceiptOandDDetailsType() {
        return new PymntReceiptOandDDetailsType();
    }

    /**
     * Create an instance of {@link RetrieveReservationSummaryRQ }
     * 
     */
    public RetrieveReservationSummaryRQ createRetrieveReservationSummaryRQ() {
        return new RetrieveReservationSummaryRQ();
    }

    /**
     * Create an instance of {@link RetrieveReservationSummaryRS }
     * 
     */
    public RetrieveReservationSummaryRS createRetrieveReservationSummaryRS() {
        return new RetrieveReservationSummaryRS();
    }

    /**
     * Create an instance of {@link RetrieveSsrFeeDetailsRQ }
     * 
     */
    public RetrieveSsrFeeDetailsRQ createRetrieveSsrFeeDetailsRQ() {
        return new RetrieveSsrFeeDetailsRQ();
    }

    /**
     * Create an instance of {@link OandDDetails }
     * 
     */
    public OandDDetails createOandDDetails() {
        return new OandDDetails();
    }

    /**
     * Create an instance of {@link RetrieveSsrFeeDetailsRS }
     * 
     */
    public RetrieveSsrFeeDetailsRS createRetrieveSsrFeeDetailsRS() {
        return new RetrieveSsrFeeDetailsRS();
    }

    /**
     * Create an instance of {@link SsrFeeDetailsType }
     * 
     */
    public SsrFeeDetailsType createSsrFeeDetailsType() {
        return new SsrFeeDetailsType();
    }

    /**
     * Create an instance of {@link RetrieveSsrRuleRQ }
     * 
     */
    public RetrieveSsrRuleRQ createRetrieveSsrRuleRQ() {
        return new RetrieveSsrRuleRQ();
    }

    /**
     * Create an instance of {@link RetrieveSsrRuleRS }
     * 
     */
    public RetrieveSsrRuleRS createRetrieveSsrRuleRS() {
        return new RetrieveSsrRuleRS();
    }

    /**
     * Create an instance of {@link SsrRules }
     * 
     */
    public SsrRules createSsrRules() {
        return new SsrRules();
    }

    /**
     * Create an instance of {@link RetrieveSSRsForFlightsRQ }
     * 
     */
    public RetrieveSSRsForFlightsRQ createRetrieveSSRsForFlightsRQ() {
        return new RetrieveSSRsForFlightsRQ();
    }

    /**
     * Create an instance of {@link FlightSSRDetailsType }
     * 
     */
    public FlightSSRDetailsType createFlightSSRDetailsType() {
        return new FlightSSRDetailsType();
    }

    /**
     * Create an instance of {@link RetrieveSSRsForFlightsRS }
     * 
     */
    public RetrieveSSRsForFlightsRS createRetrieveSSRsForFlightsRS() {
        return new RetrieveSSRsForFlightsRS();
    }

    /**
     * Create an instance of {@link RetrieveStandbyInventoryCountRQ }
     * 
     */
    public RetrieveStandbyInventoryCountRQ createRetrieveStandbyInventoryCountRQ() {
        return new RetrieveStandbyInventoryCountRQ();
    }

    /**
     * Create an instance of {@link RetrieveStandbyInventoryCountRS }
     * 
     */
    public RetrieveStandbyInventoryCountRS createRetrieveStandbyInventoryCountRS() {
        return new RetrieveStandbyInventoryCountRS();
    }

    /**
     * Create an instance of {@link StandbyInventoryCountType }
     * 
     */
    public StandbyInventoryCountType createStandbyInventoryCountType() {
        return new StandbyInventoryCountType();
    }

    /**
     * Create an instance of {@link RetrieveTravelAgentDetailsRQ }
     * 
     */
    public RetrieveTravelAgentDetailsRQ createRetrieveTravelAgentDetailsRQ() {
        return new RetrieveTravelAgentDetailsRQ();
    }

    /**
     * Create an instance of {@link RetrieveTravelAgentDetailsRS }
     * 
     */
    public RetrieveTravelAgentDetailsRS createRetrieveTravelAgentDetailsRS() {
        return new RetrieveTravelAgentDetailsRS();
    }

    /**
     * Create an instance of {@link ReverseCreditFilesRQ }
     * 
     */
    public ReverseCreditFilesRQ createReverseCreditFilesRQ() {
        return new ReverseCreditFilesRQ();
    }

    /**
     * Create an instance of {@link ReverseCFFop }
     * 
     */
    public ReverseCFFop createReverseCFFop() {
        return new ReverseCFFop();
    }

    /**
     * Create an instance of {@link ReverseCreditFilesRS }
     * 
     */
    public ReverseCreditFilesRS createReverseCreditFilesRS() {
        return new ReverseCreditFilesRS();
    }

    /**
     * Create an instance of {@link ReverseCFResult }
     * 
     */
    public ReverseCFResult createReverseCFResult() {
        return new ReverseCFResult();
    }

    /**
     * Create an instance of {@link SendItineraryRQ }
     * 
     */
    public SendItineraryRQ createSendItineraryRQ() {
        return new SendItineraryRQ();
    }

    /**
     * Create an instance of {@link SendItineraryRS }
     * 
     */
    public SendItineraryRS createSendItineraryRS() {
        return new SendItineraryRS();
    }

    /**
     * Create an instance of {@link SetLoyaltyPasswordRQ }
     * 
     */
    public SetLoyaltyPasswordRQ createSetLoyaltyPasswordRQ() {
        return new SetLoyaltyPasswordRQ();
    }

    /**
     * Create an instance of {@link SetLoyaltyPasswordRS }
     * 
     */
    public SetLoyaltyPasswordRS createSetLoyaltyPasswordRS() {
        return new SetLoyaltyPasswordRS();
    }

    /**
     * Create an instance of {@link ShowSeatMapRQ }
     * 
     */
    public ShowSeatMapRQ createShowSeatMapRQ() {
        return new ShowSeatMapRQ();
    }

    /**
     * Create an instance of {@link SegmentInfo }
     * 
     */
    public SegmentInfo createSegmentInfo() {
        return new SegmentInfo();
    }

    /**
     * Create an instance of {@link BundleAncillaries }
     * 
     */
    public BundleAncillaries createBundleAncillaries() {
        return new BundleAncillaries();
    }

    /**
     * Create an instance of {@link CustomNameValueListType }
     * 
     */
    public CustomNameValueListType createCustomNameValueListType() {
        return new CustomNameValueListType();
    }

    /**
     * Create an instance of {@link ShowSeatMapRS }
     * 
     */
    public ShowSeatMapRS createShowSeatMapRS() {
        return new ShowSeatMapRS();
    }

    /**
     * Create an instance of {@link SeatMapInformation }
     * 
     */
    public SeatMapInformation createSeatMapInformation() {
        return new SeatMapInformation();
    }

    /**
     * Create an instance of {@link SplitPnrRQ }
     * 
     */
    public SplitPnrRQ createSplitPnrRQ() {
        return new SplitPnrRQ();
    }

    /**
     * Create an instance of {@link SplitPnrRS }
     * 
     */
    public SplitPnrRS createSplitPnrRS() {
        return new SplitPnrRS();
    }

    /**
     * Create an instance of {@link ThroughFlightDetailsRQ }
     * 
     */
    public ThroughFlightDetailsRQ createThroughFlightDetailsRQ() {
        return new ThroughFlightDetailsRQ();
    }

    /**
     * Create an instance of {@link ThroughFlightDetailsRS }
     * 
     */
    public ThroughFlightDetailsRS createThroughFlightDetailsRS() {
        return new ThroughFlightDetailsRS();
    }

    /**
     * Create an instance of {@link ThroughFlightDetails }
     * 
     */
    public ThroughFlightDetails createThroughFlightDetails() {
        return new ThroughFlightDetails();
    }

    /**
     * Create an instance of {@link TransferCreditsRQ }
     * 
     */
    public TransferCreditsRQ createTransferCreditsRQ() {
        return new TransferCreditsRQ();
    }

    /**
     * Create an instance of {@link TransferCreditsRS }
     * 
     */
    public TransferCreditsRS createTransferCreditsRS() {
        return new TransferCreditsRS();
    }

    /**
     * Create an instance of {@link UpdateSsrInventoryRQ }
     * 
     */
    public UpdateSsrInventoryRQ createUpdateSsrInventoryRQ() {
        return new UpdateSsrInventoryRQ();
    }

    /**
     * Create an instance of {@link SsrBookingSegmentDetails }
     * 
     */
    public SsrBookingSegmentDetails createSsrBookingSegmentDetails() {
        return new SsrBookingSegmentDetails();
    }

    /**
     * Create an instance of {@link UpdateSsrInventoryRS }
     * 
     */
    public UpdateSsrInventoryRS createUpdateSsrInventoryRS() {
        return new UpdateSsrInventoryRS();
    }

    /**
     * Create an instance of {@link ValidateDuplicateCustomerProfileRQ }
     * 
     */
    public ValidateDuplicateCustomerProfileRQ createValidateDuplicateCustomerProfileRQ() {
        return new ValidateDuplicateCustomerProfileRQ();
    }

    /**
     * Create an instance of {@link ValidateDuplicateCustomerProfileRS }
     * 
     */
    public ValidateDuplicateCustomerProfileRS createValidateDuplicateCustomerProfileRS() {
        return new ValidateDuplicateCustomerProfileRS();
    }

    /**
     * Create an instance of {@link DupeProfileDetails }
     * 
     */
    public DupeProfileDetails createDupeProfileDetails() {
        return new DupeProfileDetails();
    }

    /**
     * Create an instance of {@link ValidateLoyaltyRQ }
     * 
     */
    public ValidateLoyaltyRQ createValidateLoyaltyRQ() {
        return new ValidateLoyaltyRQ();
    }

    /**
     * Create an instance of {@link ValidateLoyaltyRS }
     * 
     */
    public ValidateLoyaltyRS createValidateLoyaltyRS() {
        return new ValidateLoyaltyRS();
    }

    /**
     * Create an instance of {@link ViewAgencyProfileRQ }
     * 
     */
    public ViewAgencyProfileRQ createViewAgencyProfileRQ() {
        return new ViewAgencyProfileRQ();
    }

    /**
     * Create an instance of {@link ViewAgencyProfileRS }
     * 
     */
    public ViewAgencyProfileRS createViewAgencyProfileRS() {
        return new ViewAgencyProfileRS();
    }

    /**
     * Create an instance of {@link AgencyCreditDetails }
     * 
     */
    public AgencyCreditDetails createAgencyCreditDetails() {
        return new AgencyCreditDetails();
    }

    /**
     * Create an instance of {@link AgencyCommissionDetails }
     * 
     */
    public AgencyCommissionDetails createAgencyCommissionDetails() {
        return new AgencyCommissionDetails();
    }

    /**
     * Create an instance of {@link CorporateCardDetails }
     * 
     */
    public CorporateCardDetails createCorporateCardDetails() {
        return new CorporateCardDetails();
    }

    /**
     * Create an instance of {@link ViewCustomerProfileRQ }
     * 
     */
    public ViewCustomerProfileRQ createViewCustomerProfileRQ() {
        return new ViewCustomerProfileRQ();
    }

    /**
     * Create an instance of {@link ViewCustomerProfileRS }
     * 
     */
    public ViewCustomerProfileRS createViewCustomerProfileRS() {
        return new ViewCustomerProfileRS();
    }

    /**
     * Create an instance of {@link ViewCustomerProfileDetails }
     * 
     */
    public ViewCustomerProfileDetails createViewCustomerProfileDetails() {
        return new ViewCustomerProfileDetails();
    }

    /**
     * Create an instance of {@link ViewCustomerProfileViaWebRQ }
     * 
     */
    public ViewCustomerProfileViaWebRQ createViewCustomerProfileViaWebRQ() {
        return new ViewCustomerProfileViaWebRQ();
    }

    /**
     * Create an instance of {@link ViewCustomerProfileViaWebRS }
     * 
     */
    public ViewCustomerProfileViaWebRS createViewCustomerProfileViaWebRS() {
        return new ViewCustomerProfileViaWebRS();
    }

    /**
     * Create an instance of {@link ViewPNRsInQueueRQ }
     * 
     */
    public ViewPNRsInQueueRQ createViewPNRsInQueueRQ() {
        return new ViewPNRsInQueueRQ();
    }

    /**
     * Create an instance of {@link ViewPNRsInQueueRS }
     * 
     */
    public ViewPNRsInQueueRS createViewPNRsInQueueRS() {
        return new ViewPNRsInQueueRS();
    }

    /**
     * Create an instance of {@link QueuedPNRType }
     * 
     */
    public QueuedPNRType createQueuedPNRType() {
        return new QueuedPNRType();
    }

    /**
     * Create an instance of {@link ViewVPPDetailsRQ }
     * 
     */
    public ViewVPPDetailsRQ createViewVPPDetailsRQ() {
        return new ViewVPPDetailsRQ();
    }

    /**
     * Create an instance of {@link ViewVPPDetailsRS }
     * 
     */
    public ViewVPPDetailsRS createViewVPPDetailsRS() {
        return new ViewVPPDetailsRS();
    }

    /**
     * Create an instance of {@link VPPDetails }
     * 
     */
    public VPPDetails createVPPDetails() {
        return new VPPDetails();
    }

    /**
     * Create an instance of {@link VoidVoucherRQ }
     * 
     */
    public VoidVoucherRQ createVoidVoucherRQ() {
        return new VoidVoucherRQ();
    }

    /**
     * Create an instance of {@link VoidVoucherRS }
     * 
     */
    public VoidVoucherRS createVoidVoucherRS() {
        return new VoidVoucherRS();
    }

    /**
     * Create an instance of {@link AdjustFlightInventoryRQ }
     * 
     */
    public AdjustFlightInventoryRQ createAdjustFlightInventoryRQ() {
        return new AdjustFlightInventoryRQ();
    }

    /**
     * Create an instance of {@link BasePnrRQType }
     * 
     */
    public BasePnrRQType createBasePnrRQType() {
        return new BasePnrRQType();
    }

    /**
     * Create an instance of {@link MarkInventoryDetailsType }
     * 
     */
    public MarkInventoryDetailsType createMarkInventoryDetailsType() {
        return new MarkInventoryDetailsType();
    }

    /**
     * Create an instance of {@link AdjustFlightInventoryRS }
     * 
     */
    public AdjustFlightInventoryRS createAdjustFlightInventoryRS() {
        return new AdjustFlightInventoryRS();
    }

    /**
     * Create an instance of {@link ComputeAvailabilityDisplayPriceRQ }
     * 
     */
    public ComputeAvailabilityDisplayPriceRQ createComputeAvailabilityDisplayPriceRQ() {
        return new ComputeAvailabilityDisplayPriceRQ();
    }

    /**
     * Create an instance of {@link FareDetailsType }
     * 
     */
    public FareDetailsType createFareDetailsType() {
        return new FareDetailsType();
    }

    /**
     * Create an instance of {@link FareComponentMappingType }
     * 
     */
    public FareComponentMappingType createFareComponentMappingType() {
        return new FareComponentMappingType();
    }

    /**
     * Create an instance of {@link ComputeAvailabilityDisplayPriceRS }
     * 
     */
    public ComputeAvailabilityDisplayPriceRS createComputeAvailabilityDisplayPriceRS() {
        return new ComputeAvailabilityDisplayPriceRS();
    }

    /**
     * Create an instance of {@link FareDetailsDisplayType }
     * 
     */
    public FareDetailsDisplayType createFareDetailsDisplayType() {
        return new FareDetailsDisplayType();
    }

    /**
     * Create an instance of {@link SubscribeAirlineNewsletterRQ }
     * 
     */
    public SubscribeAirlineNewsletterRQ createSubscribeAirlineNewsletterRQ() {
        return new SubscribeAirlineNewsletterRQ();
    }

    /**
     * Create an instance of {@link AirlineNewsletter }
     * 
     */
    public AirlineNewsletter createAirlineNewsletter() {
        return new AirlineNewsletter();
    }

    /**
     * Create an instance of {@link SubscribeAirlineNewsletterRS }
     * 
     */
    public SubscribeAirlineNewsletterRS createSubscribeAirlineNewsletterRS() {
        return new SubscribeAirlineNewsletterRS();
    }

    /**
     * Create an instance of {@link GetNewsLetterSubscriptionInfoRQ }
     * 
     */
    public GetNewsLetterSubscriptionInfoRQ createGetNewsLetterSubscriptionInfoRQ() {
        return new GetNewsLetterSubscriptionInfoRQ();
    }

    /**
     * Create an instance of {@link GetNewsLetterSubscriptionInfoRS }
     * 
     */
    public GetNewsLetterSubscriptionInfoRS createGetNewsLetterSubscriptionInfoRS() {
        return new GetNewsLetterSubscriptionInfoRS();
    }

    /**
     * Create an instance of {@link RemoveMultiplePnrsFromQueueRQ }
     * 
     */
    public RemoveMultiplePnrsFromQueueRQ createRemoveMultiplePnrsFromQueueRQ() {
        return new RemoveMultiplePnrsFromQueueRQ();
    }

    /**
     * Create an instance of {@link RemoveMultiplePnrsFromQueueRS }
     * 
     */
    public RemoveMultiplePnrsFromQueueRS createRemoveMultiplePnrsFromQueueRS() {
        return new RemoveMultiplePnrsFromQueueRS();
    }

    /**
     * Create an instance of {@link PNRQueueRemovalDetails }
     * 
     */
    public PNRQueueRemovalDetails createPNRQueueRemovalDetails() {
        return new PNRQueueRemovalDetails();
    }

    /**
     * Create an instance of {@link EnhancedAirAvailabilityRQ }
     * 
     */
    public EnhancedAirAvailabilityRQ createEnhancedAirAvailabilityRQ() {
        return new EnhancedAirAvailabilityRQ();
    }

    /**
     * Create an instance of {@link CancelAndRebookInfo }
     * 
     */
    public CancelAndRebookInfo createCancelAndRebookInfo() {
        return new CancelAndRebookInfo();
    }

    /**
     * Create an instance of {@link ChangeFlightInfo }
     * 
     */
    public ChangeFlightInfo createChangeFlightInfo() {
        return new ChangeFlightInfo();
    }

    /**
     * Create an instance of {@link EnhancedAirAvailabilityRS }
     * 
     */
    public EnhancedAirAvailabilityRS createEnhancedAirAvailabilityRS() {
        return new EnhancedAirAvailabilityRS();
    }

    /**
     * Create an instance of {@link PriceItineraryRQ }
     * 
     */
    public PriceItineraryRQ createPriceItineraryRQ() {
        return new PriceItineraryRQ();
    }

    /**
     * Create an instance of {@link FareInfoType }
     * 
     */
    public FareInfoType createFareInfoType() {
        return new FareInfoType();
    }

    /**
     * Create an instance of {@link GuestRequestDetailsType }
     * 
     */
    public GuestRequestDetailsType createGuestRequestDetailsType() {
        return new GuestRequestDetailsType();
    }

    /**
     * Create an instance of {@link PriceItineraryRS }
     * 
     */
    public PriceItineraryRS createPriceItineraryRS() {
        return new PriceItineraryRS();
    }

    /**
     * Create an instance of {@link PriceFeeRQ }
     * 
     */
    public PriceFeeRQ createPriceFeeRQ() {
        return new PriceFeeRQ();
    }

    /**
     * Create an instance of {@link FeeRequestType }
     * 
     */
    public FeeRequestType createFeeRequestType() {
        return new FeeRequestType();
    }

    /**
     * Create an instance of {@link PriceFeeRS }
     * 
     */
    public PriceFeeRS createPriceFeeRS() {
        return new PriceFeeRS();
    }

    /**
     * Create an instance of {@link ConfirmPriceRQ }
     * 
     */
    public ConfirmPriceRQ createConfirmPriceRQ() {
        return new ConfirmPriceRQ();
    }

    /**
     * Create an instance of {@link ConsentDetailsRequestType }
     * 
     */
    public ConsentDetailsRequestType createConsentDetailsRequestType() {
        return new ConsentDetailsRequestType();
    }

    /**
     * Create an instance of {@link ConfirmPriceRS }
     * 
     */
    public ConfirmPriceRS createConfirmPriceRS() {
        return new ConfirmPriceRS();
    }

    /**
     * Create an instance of {@link AmountPaidType }
     * 
     */
    public AmountPaidType createAmountPaidType() {
        return new AmountPaidType();
    }

    /**
     * Create an instance of {@link PaymentAuthorisationResponseType }
     * 
     */
    public PaymentAuthorisationResponseType createPaymentAuthorisationResponseType() {
        return new PaymentAuthorisationResponseType();
    }

    /**
     * Create an instance of {@link CancelBookingRQ }
     * 
     */
    public CancelBookingRQ createCancelBookingRQ() {
        return new CancelBookingRQ();
    }

    /**
     * Create an instance of {@link CHGCXLWaiverType }
     * 
     */
    public CHGCXLWaiverType createCHGCXLWaiverType() {
        return new CHGCXLWaiverType();
    }

    /**
     * Create an instance of {@link CHGCXLOverrideType }
     * 
     */
    public CHGCXLOverrideType createCHGCXLOverrideType() {
        return new CHGCXLOverrideType();
    }

    /**
     * Create an instance of {@link CancelBookingRS }
     * 
     */
    public CancelBookingRS createCancelBookingRS() {
        return new CancelBookingRS();
    }

    /**
     * Create an instance of {@link TotalNonRefAmount }
     * 
     */
    public TotalNonRefAmount createTotalNonRefAmount() {
        return new TotalNonRefAmount();
    }

    /**
     * Create an instance of {@link SaveModifyBookingRQ }
     * 
     */
    public SaveModifyBookingRQ createSaveModifyBookingRQ() {
        return new SaveModifyBookingRQ();
    }

    /**
     * Create an instance of {@link ItineraryChangeType }
     * 
     */
    public ItineraryChangeType createItineraryChangeType() {
        return new ItineraryChangeType();
    }

    /**
     * Create an instance of {@link BookingContactChangeType }
     * 
     */
    public BookingContactChangeType createBookingContactChangeType() {
        return new BookingContactChangeType();
    }

    /**
     * Create an instance of {@link PnrCommentChangeType }
     * 
     */
    public PnrCommentChangeType createPnrCommentChangeType() {
        return new PnrCommentChangeType();
    }

    /**
     * Create an instance of {@link PnrTimeLimitChangeType }
     * 
     */
    public PnrTimeLimitChangeType createPnrTimeLimitChangeType() {
        return new PnrTimeLimitChangeType();
    }

    /**
     * Create an instance of {@link PaxChangeType }
     * 
     */
    public PaxChangeType createPaxChangeType() {
        return new PaxChangeType();
    }

    /**
     * Create an instance of {@link TravelDocumentChangeType }
     * 
     */
    public TravelDocumentChangeType createTravelDocumentChangeType() {
        return new TravelDocumentChangeType();
    }

    /**
     * Create an instance of {@link SsrModifyType }
     * 
     */
    public SsrModifyType createSsrModifyType() {
        return new SsrModifyType();
    }

    /**
     * Create an instance of {@link FeeModifyType }
     * 
     */
    public FeeModifyType createFeeModifyType() {
        return new FeeModifyType();
    }

    /**
     * Create an instance of {@link CabinChangeType }
     * 
     */
    public CabinChangeType createCabinChangeType() {
        return new CabinChangeType();
    }

    /**
     * Create an instance of {@link PaxDiscountCouponChangeType }
     * 
     */
    public PaxDiscountCouponChangeType createPaxDiscountCouponChangeType() {
        return new PaxDiscountCouponChangeType();
    }

    /**
     * Create an instance of {@link SeatAssignmentChangeType }
     * 
     */
    public SeatAssignmentChangeType createSeatAssignmentChangeType() {
        return new SeatAssignmentChangeType();
    }

    /**
     * Create an instance of {@link GuestLoyaltyChangeType }
     * 
     */
    public GuestLoyaltyChangeType createGuestLoyaltyChangeType() {
        return new GuestLoyaltyChangeType();
    }

    /**
     * Create an instance of {@link AuxInformationChangeType }
     * 
     */
    public AuxInformationChangeType createAuxInformationChangeType() {
        return new AuxInformationChangeType();
    }

    /**
     * Create an instance of {@link SaveModifyBookingRS }
     * 
     */
    public SaveModifyBookingRS createSaveModifyBookingRS() {
        return new SaveModifyBookingRS();
    }

    /**
     * Create an instance of {@link PriceAncillaryRQ }
     * 
     */
    public PriceAncillaryRQ createPriceAncillaryRQ() {
        return new PriceAncillaryRQ();
    }

    /**
     * Create an instance of {@link PriceAncillaryRS }
     * 
     */
    public PriceAncillaryRS createPriceAncillaryRS() {
        return new PriceAncillaryRS();
    }

    /**
     * Create an instance of {@link GetTaxForGiftVoucherRQ }
     * 
     */
    public GetTaxForGiftVoucherRQ createGetTaxForGiftVoucherRQ() {
        return new GetTaxForGiftVoucherRQ();
    }

    /**
     * Create an instance of {@link GetTaxForGiftVoucherRS }
     * 
     */
    public GetTaxForGiftVoucherRS createGetTaxForGiftVoucherRS() {
        return new GetTaxForGiftVoucherRS();
    }

    /**
     * Create an instance of {@link AcceptScRQ }
     * 
     */
    public AcceptScRQ createAcceptScRQ() {
        return new AcceptScRQ();
    }

    /**
     * Create an instance of {@link SegmentStatusTransitionType }
     * 
     */
    public SegmentStatusTransitionType createSegmentStatusTransitionType() {
        return new SegmentStatusTransitionType();
    }

    /**
     * Create an instance of {@link AcceptScRS }
     * 
     */
    public AcceptScRS createAcceptScRS() {
        return new AcceptScRS();
    }

    /**
     * Create an instance of {@link RejectScRQ }
     * 
     */
    public RejectScRQ createRejectScRQ() {
        return new RejectScRQ();
    }

    /**
     * Create an instance of {@link RejectScRS }
     * 
     */
    public RejectScRS createRejectScRS() {
        return new RejectScRS();
    }

    /**
     * Create an instance of {@link AcceptWlRQ }
     * 
     */
    public AcceptWlRQ createAcceptWlRQ() {
        return new AcceptWlRQ();
    }

    /**
     * Create an instance of {@link AcceptWlRS }
     * 
     */
    public AcceptWlRS createAcceptWlRS() {
        return new AcceptWlRS();
    }

    /**
     * Create an instance of {@link RejectWlRQ }
     * 
     */
    public RejectWlRQ createRejectWlRQ() {
        return new RejectWlRQ();
    }

    /**
     * Create an instance of {@link RejectWlRS }
     * 
     */
    public RejectWlRS createRejectWlRS() {
        return new RejectWlRS();
    }

    /**
     * Create an instance of {@link RetrieveTimelimitForCreateRQ }
     * 
     */
    public RetrieveTimelimitForCreateRQ createRetrieveTimelimitForCreateRQ() {
        return new RetrieveTimelimitForCreateRQ();
    }

    /**
     * Create an instance of {@link RetrieveTimelimitForCreateRS }
     * 
     */
    public RetrieveTimelimitForCreateRS createRetrieveTimelimitForCreateRS() {
        return new RetrieveTimelimitForCreateRS();
    }

    /**
     * Create an instance of {@link RetrieveTimelimitForModifyRQ }
     * 
     */
    public RetrieveTimelimitForModifyRQ createRetrieveTimelimitForModifyRQ() {
        return new RetrieveTimelimitForModifyRQ();
    }

    /**
     * Create an instance of {@link RetrieveTimelimitForModifyRS }
     * 
     */
    public RetrieveTimelimitForModifyRS createRetrieveTimelimitForModifyRS() {
        return new RetrieveTimelimitForModifyRS();
    }

    /**
     * Create an instance of {@link ValidateMctRQ }
     * 
     */
    public ValidateMctRQ createValidateMctRQ() {
        return new ValidateMctRQ();
    }

    /**
     * Create an instance of {@link SegmentPairType }
     * 
     */
    public SegmentPairType createSegmentPairType() {
        return new SegmentPairType();
    }

    /**
     * Create an instance of {@link ValidateMctRS }
     * 
     */
    public ValidateMctRS createValidateMctRS() {
        return new ValidateMctRS();
    }

    /**
     * Create an instance of {@link SendGCEmailRQ }
     * 
     */
    public SendGCEmailRQ createSendGCEmailRQ() {
        return new SendGCEmailRQ();
    }

    /**
     * Create an instance of {@link SendGCEmailRS }
     * 
     */
    public SendGCEmailRS createSendGCEmailRS() {
        return new SendGCEmailRS();
    }

    /**
     * Create an instance of {@link ListSaleableAncillaryServicesRQ }
     * 
     */
    public ListSaleableAncillaryServicesRQ createListSaleableAncillaryServicesRQ() {
        return new ListSaleableAncillaryServicesRQ();
    }

    /**
     * Create an instance of {@link PassengerList }
     * 
     */
    public PassengerList createPassengerList() {
        return new PassengerList();
    }

    /**
     * Create an instance of {@link ListSaleableAncillaryServicesRS }
     * 
     */
    public ListSaleableAncillaryServicesRS createListSaleableAncillaryServicesRS() {
        return new ListSaleableAncillaryServicesRS();
    }

    /**
     * Create an instance of {@link SaleableAncillaries }
     * 
     */
    public SaleableAncillaries createSaleableAncillaries() {
        return new SaleableAncillaries();
    }

    /**
     * Create an instance of {@link ListBaggageServicesRQ }
     * 
     */
    public ListBaggageServicesRQ createListBaggageServicesRQ() {
        return new ListBaggageServicesRQ();
    }

    /**
     * Create an instance of {@link ListBaggageServicesRS }
     * 
     */
    public ListBaggageServicesRS createListBaggageServicesRS() {
        return new ListBaggageServicesRS();
    }

    /**
     * Create an instance of {@link RetrieveAirlineRegionRQ }
     * 
     */
    public RetrieveAirlineRegionRQ createRetrieveAirlineRegionRQ() {
        return new RetrieveAirlineRegionRQ();
    }

    /**
     * Create an instance of {@link RetrieveAirlineRegionRS }
     * 
     */
    public RetrieveAirlineRegionRS createRetrieveAirlineRegionRS() {
        return new RetrieveAirlineRegionRS();
    }

    /**
     * Create an instance of {@link RegionDetailsType }
     * 
     */
    public RegionDetailsType createRegionDetailsType() {
        return new RegionDetailsType();
    }

    /**
     * Create an instance of {@link CreateGroupQuoteRQ }
     * 
     */
    public CreateGroupQuoteRQ createCreateGroupQuoteRQ() {
        return new CreateGroupQuoteRQ();
    }

    /**
     * Create an instance of {@link TaxExemptionType }
     * 
     */
    public TaxExemptionType createTaxExemptionType() {
        return new TaxExemptionType();
    }

    /**
     * Create an instance of {@link GroupQuoteCommentsType }
     * 
     */
    public GroupQuoteCommentsType createGroupQuoteCommentsType() {
        return new GroupQuoteCommentsType();
    }

    /**
     * Create an instance of {@link CreateGroupQuoteRS }
     * 
     */
    public CreateGroupQuoteRS createCreateGroupQuoteRS() {
        return new CreateGroupQuoteRS();
    }

    /**
     * Create an instance of {@link GroupQuoteType }
     * 
     */
    public GroupQuoteType createGroupQuoteType() {
        return new GroupQuoteType();
    }

    /**
     * Create an instance of {@link GroupQuoteAmount }
     * 
     */
    public GroupQuoteAmount createGroupQuoteAmount() {
        return new GroupQuoteAmount();
    }

    /**
     * Create an instance of {@link ViewGroupQuoteRQ }
     * 
     */
    public ViewGroupQuoteRQ createViewGroupQuoteRQ() {
        return new ViewGroupQuoteRQ();
    }

    /**
     * Create an instance of {@link ViewGroupQuoteRS }
     * 
     */
    public ViewGroupQuoteRS createViewGroupQuoteRS() {
        return new ViewGroupQuoteRS();
    }

    /**
     * Create an instance of {@link ListInsuranceProductsRQ }
     * 
     */
    public ListInsuranceProductsRQ createListInsuranceProductsRQ() {
        return new ListInsuranceProductsRQ();
    }

    /**
     * Create an instance of {@link ListInsuranceProductsRS }
     * 
     */
    public ListInsuranceProductsRS createListInsuranceProductsRS() {
        return new ListInsuranceProductsRS();
    }

    /**
     * Create an instance of {@link InsuranceProductDetailsType }
     * 
     */
    public InsuranceProductDetailsType createInsuranceProductDetailsType() {
        return new InsuranceProductDetailsType();
    }

    /**
     * Create an instance of {@link ModifyGroupQuoteRQ }
     * 
     */
    public ModifyGroupQuoteRQ createModifyGroupQuoteRQ() {
        return new ModifyGroupQuoteRQ();
    }

    /**
     * Create an instance of {@link PnrPaxCountType }
     * 
     */
    public PnrPaxCountType createPnrPaxCountType() {
        return new PnrPaxCountType();
    }

    /**
     * Create an instance of {@link GQCommentChangeType }
     * 
     */
    public GQCommentChangeType createGQCommentChangeType() {
        return new GQCommentChangeType();
    }

    /**
     * Create an instance of {@link ModifyGroupQuoteRS }
     * 
     */
    public ModifyGroupQuoteRS createModifyGroupQuoteRS() {
        return new ModifyGroupQuoteRS();
    }

    /**
     * Create an instance of {@link ListGroupQuoteRQ }
     * 
     */
    public ListGroupQuoteRQ createListGroupQuoteRQ() {
        return new ListGroupQuoteRQ();
    }

    /**
     * Create an instance of {@link ListGroupQuoteRS }
     * 
     */
    public ListGroupQuoteRS createListGroupQuoteRS() {
        return new ListGroupQuoteRS();
    }

    /**
     * Create an instance of {@link ListGroupQuoteType }
     * 
     */
    public ListGroupQuoteType createListGroupQuoteType() {
        return new ListGroupQuoteType();
    }

    /**
     * Create an instance of {@link RetrieveChannelFOPConfigsRQ }
     * 
     */
    public RetrieveChannelFOPConfigsRQ createRetrieveChannelFOPConfigsRQ() {
        return new RetrieveChannelFOPConfigsRQ();
    }

    /**
     * Create an instance of {@link RetrieveChannelFOPConfigsRS }
     * 
     */
    public RetrieveChannelFOPConfigsRS createRetrieveChannelFOPConfigsRS() {
        return new RetrieveChannelFOPConfigsRS();
    }

    /**
     * Create an instance of {@link Channel }
     * 
     */
    public Channel createChannel() {
        return new Channel();
    }

    /**
     * Create an instance of {@link PostProcessPaymentRQ }
     * 
     */
    public PostProcessPaymentRQ createPostProcessPaymentRQ() {
        return new PostProcessPaymentRQ();
    }

    /**
     * Create an instance of {@link PostProcessPaymentRS }
     * 
     */
    public PostProcessPaymentRS createPostProcessPaymentRS() {
        return new PostProcessPaymentRS();
    }

    /**
     * Create an instance of {@link RetrieveAgenciesRQ }
     * 
     */
    public RetrieveAgenciesRQ createRetrieveAgenciesRQ() {
        return new RetrieveAgenciesRQ();
    }

    /**
     * Create an instance of {@link RetrieveAgenciesRS }
     * 
     */
    public RetrieveAgenciesRS createRetrieveAgenciesRS() {
        return new RetrieveAgenciesRS();
    }

    /**
     * Create an instance of {@link AgencyDetailsType }
     * 
     */
    public AgencyDetailsType createAgencyDetailsType() {
        return new AgencyDetailsType();
    }

    /**
     * Create an instance of {@link BookingHistoryRQ }
     * 
     */
    public BookingHistoryRQ createBookingHistoryRQ() {
        return new BookingHistoryRQ();
    }

    /**
     * Create an instance of {@link BookingHistoryRS }
     * 
     */
    public BookingHistoryRS createBookingHistoryRS() {
        return new BookingHistoryRS();
    }

    /**
     * Create an instance of {@link PNRTransactionInfo }
     * 
     */
    public PNRTransactionInfo createPNRTransactionInfo() {
        return new PNRTransactionInfo();
    }

    /**
     * Create an instance of {@link AgencyPaymentRQ }
     * 
     */
    public AgencyPaymentRQ createAgencyPaymentRQ() {
        return new AgencyPaymentRQ();
    }

    /**
     * Create an instance of {@link CurrencyAmountType }
     * 
     */
    public CurrencyAmountType createCurrencyAmountType() {
        return new CurrencyAmountType();
    }

    /**
     * Create an instance of {@link AgencyPaymentDetailsType }
     * 
     */
    public AgencyPaymentDetailsType createAgencyPaymentDetailsType() {
        return new AgencyPaymentDetailsType();
    }

    /**
     * Create an instance of {@link AgencyPaymentRS }
     * 
     */
    public AgencyPaymentRS createAgencyPaymentRS() {
        return new AgencyPaymentRS();
    }

    /**
     * Create an instance of {@link RetrieveAgencyCreditHistoryRQ }
     * 
     */
    public RetrieveAgencyCreditHistoryRQ createRetrieveAgencyCreditHistoryRQ() {
        return new RetrieveAgencyCreditHistoryRQ();
    }

    /**
     * Create an instance of {@link RetrieveAgencyCreditHistoryRS }
     * 
     */
    public RetrieveAgencyCreditHistoryRS createRetrieveAgencyCreditHistoryRS() {
        return new RetrieveAgencyCreditHistoryRS();
    }

    /**
     * Create an instance of {@link AgencyCreditHistType }
     * 
     */
    public AgencyCreditHistType createAgencyCreditHistType() {
        return new AgencyCreditHistType();
    }

    /**
     * Create an instance of {@link GuaranteeAncillaryRQ }
     * 
     */
    public GuaranteeAncillaryRQ createGuaranteeAncillaryRQ() {
        return new GuaranteeAncillaryRQ();
    }

    /**
     * Create an instance of {@link AdjustAncillaryBaseType }
     * 
     */
    public AdjustAncillaryBaseType createAdjustAncillaryBaseType() {
        return new AdjustAncillaryBaseType();
    }

    /**
     * Create an instance of {@link GuaranteeAncillaryRS }
     * 
     */
    public GuaranteeAncillaryRS createGuaranteeAncillaryRS() {
        return new GuaranteeAncillaryRS();
    }

    /**
     * Create an instance of {@link ReleaseAncillaryRQ }
     * 
     */
    public ReleaseAncillaryRQ createReleaseAncillaryRQ() {
        return new ReleaseAncillaryRQ();
    }

    /**
     * Create an instance of {@link RetrieveGatewayConfigRQ }
     * 
     */
    public RetrieveGatewayConfigRQ createRetrieveGatewayConfigRQ() {
        return new RetrieveGatewayConfigRQ();
    }

    /**
     * Create an instance of {@link RetrieveGatewayConfigRS }
     * 
     */
    public RetrieveGatewayConfigRS createRetrieveGatewayConfigRS() {
        return new RetrieveGatewayConfigRS();
    }

    /**
     * Create an instance of {@link ReleaseAncillaryRS }
     * 
     */
    public ReleaseAncillaryRS createReleaseAncillaryRS() {
        return new ReleaseAncillaryRS();
    }

    /**
     * Create an instance of {@link ConfirmBookingSegmentRQ }
     * 
     */
    public ConfirmBookingSegmentRQ createConfirmBookingSegmentRQ() {
        return new ConfirmBookingSegmentRQ();
    }

    /**
     * Create an instance of {@link ConfirmBookingSegmentRS }
     * 
     */
    public ConfirmBookingSegmentRS createConfirmBookingSegmentRS() {
        return new ConfirmBookingSegmentRS();
    }

    /**
     * Create an instance of {@link SendIVRPaymentInfoRQ }
     * 
     */
    public SendIVRPaymentInfoRQ createSendIVRPaymentInfoRQ() {
        return new SendIVRPaymentInfoRQ();
    }

    /**
     * Create an instance of {@link CardInfoType }
     * 
     */
    public CardInfoType createCardInfoType() {
        return new CardInfoType();
    }

    /**
     * Create an instance of {@link IvrSystemInfoType }
     * 
     */
    public IvrSystemInfoType createIvrSystemInfoType() {
        return new IvrSystemInfoType();
    }

    /**
     * Create an instance of {@link SendIVRPaymentInfoRS }
     * 
     */
    public SendIVRPaymentInfoRS createSendIVRPaymentInfoRS() {
        return new SendIVRPaymentInfoRS();
    }

    /**
     * Create an instance of {@link RetrieveSSRFieldMetaDataRQ }
     * 
     */
    public RetrieveSSRFieldMetaDataRQ createRetrieveSSRFieldMetaDataRQ() {
        return new RetrieveSSRFieldMetaDataRQ();
    }

    /**
     * Create an instance of {@link RetrieveSSRFieldMetaDataRS }
     * 
     */
    public RetrieveSSRFieldMetaDataRS createRetrieveSSRFieldMetaDataRS() {
        return new RetrieveSSRFieldMetaDataRS();
    }

    /**
     * Create an instance of {@link ValidateCustomerProfileListRQ }
     * 
     */
    public ValidateCustomerProfileListRQ createValidateCustomerProfileListRQ() {
        return new ValidateCustomerProfileListRQ();
    }

    /**
     * Create an instance of {@link CustomerProfileDetailsType }
     * 
     */
    public CustomerProfileDetailsType createCustomerProfileDetailsType() {
        return new CustomerProfileDetailsType();
    }

    /**
     * Create an instance of {@link ValidateCustomerProfileListRS }
     * 
     */
    public ValidateCustomerProfileListRS createValidateCustomerProfileListRS() {
        return new ValidateCustomerProfileListRS();
    }

    /**
     * Create an instance of {@link CustomerProfileValidateResp }
     * 
     */
    public CustomerProfileValidateResp createCustomerProfileValidateResp() {
        return new CustomerProfileValidateResp();
    }

    /**
     * Create an instance of {@link CreateUserRQ }
     * 
     */
    public CreateUserRQ createCreateUserRQ() {
        return new CreateUserRQ();
    }

    /**
     * Create an instance of {@link OfficeDutyCodeAccessType }
     * 
     */
    public OfficeDutyCodeAccessType createOfficeDutyCodeAccessType() {
        return new OfficeDutyCodeAccessType();
    }

    /**
     * Create an instance of {@link CreateUserRS }
     * 
     */
    public CreateUserRS createCreateUserRS() {
        return new CreateUserRS();
    }

    /**
     * Create an instance of {@link ActivateUserRQ }
     * 
     */
    public ActivateUserRQ createActivateUserRQ() {
        return new ActivateUserRQ();
    }

    /**
     * Create an instance of {@link ActivateUserRS }
     * 
     */
    public ActivateUserRS createActivateUserRS() {
        return new ActivateUserRS();
    }

    /**
     * Create an instance of {@link DeactivateUserRQ }
     * 
     */
    public DeactivateUserRQ createDeactivateUserRQ() {
        return new DeactivateUserRQ();
    }

    /**
     * Create an instance of {@link DeactivateUserRS }
     * 
     */
    public DeactivateUserRS createDeactivateUserRS() {
        return new DeactivateUserRS();
    }

    /**
     * Create an instance of {@link UpdateUserRQ }
     * 
     */
    public UpdateUserRQ createUpdateUserRQ() {
        return new UpdateUserRQ();
    }

    /**
     * Create an instance of {@link UpdateUserRS }
     * 
     */
    public UpdateUserRS createUpdateUserRS() {
        return new UpdateUserRS();
    }

    /**
     * Create an instance of {@link AuthenticateCustomerProfileLoginRQ }
     * 
     */
    public AuthenticateCustomerProfileLoginRQ createAuthenticateCustomerProfileLoginRQ() {
        return new AuthenticateCustomerProfileLoginRQ();
    }

    /**
     * Create an instance of {@link AuthenticateCustomerProfileLoginRS }
     * 
     */
    public AuthenticateCustomerProfileLoginRS createAuthenticateCustomerProfileLoginRS() {
        return new AuthenticateCustomerProfileLoginRS();
    }

    /**
     * Create an instance of {@link ChangeCustomerProfilePasswordRQ }
     * 
     */
    public ChangeCustomerProfilePasswordRQ createChangeCustomerProfilePasswordRQ() {
        return new ChangeCustomerProfilePasswordRQ();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link SecurityInfoType }
     * 
     */
    public SecurityInfoType createSecurityInfoType() {
        return new SecurityInfoType();
    }

    /**
     * Create an instance of {@link ChangeCustomerProfilePasswordRS }
     * 
     */
    public ChangeCustomerProfilePasswordRS createChangeCustomerProfilePasswordRS() {
        return new ChangeCustomerProfilePasswordRS();
    }

    /**
     * Create an instance of {@link ActivateCustomerProfileLoginRQ }
     * 
     */
    public ActivateCustomerProfileLoginRQ createActivateCustomerProfileLoginRQ() {
        return new ActivateCustomerProfileLoginRQ();
    }

    /**
     * Create an instance of {@link ActivateCustomerProfileLoginRS }
     * 
     */
    public ActivateCustomerProfileLoginRS createActivateCustomerProfileLoginRS() {
        return new ActivateCustomerProfileLoginRS();
    }

    /**
     * Create an instance of {@link GetAncillaryCatalogueRQ }
     * 
     */
    public GetAncillaryCatalogueRQ createGetAncillaryCatalogueRQ() {
        return new GetAncillaryCatalogueRQ();
    }

    /**
     * Create an instance of {@link PaxListType }
     * 
     */
    public PaxListType createPaxListType() {
        return new PaxListType();
    }

    /**
     * Create an instance of {@link GetAncillaryCatalogueRS }
     * 
     */
    public GetAncillaryCatalogueRS createGetAncillaryCatalogueRS() {
        return new GetAncillaryCatalogueRS();
    }

    /**
     * Create an instance of {@link AncillariesType }
     * 
     */
    public AncillariesType createAncillariesType() {
        return new AncillariesType();
    }

    /**
     * Create an instance of {@link RichContentInfoListType }
     * 
     */
    public RichContentInfoListType createRichContentInfoListType() {
        return new RichContentInfoListType();
    }

    /**
     * Create an instance of {@link SsrFieldMetaDataListType }
     * 
     */
    public SsrFieldMetaDataListType createSsrFieldMetaDataListType() {
        return new SsrFieldMetaDataListType();
    }

    /**
     * Create an instance of {@link RetrieveRevDocDetailsRQ }
     * 
     */
    public RetrieveRevDocDetailsRQ createRetrieveRevDocDetailsRQ() {
        return new RetrieveRevDocDetailsRQ();
    }

    /**
     * Create an instance of {@link RetrieveRevDocDetailsRS }
     * 
     */
    public RetrieveRevDocDetailsRS createRetrieveRevDocDetailsRS() {
        return new RetrieveRevDocDetailsRS();
    }

    /**
     * Create an instance of {@link RevDocDetailsType }
     * 
     */
    public RevDocDetailsType createRevDocDetailsType() {
        return new RevDocDetailsType();
    }

    /**
     * Create an instance of {@link AirAvailabilityWithAncillaryRQ }
     * 
     */
    public AirAvailabilityWithAncillaryRQ createAirAvailabilityWithAncillaryRQ() {
        return new AirAvailabilityWithAncillaryRQ();
    }

    /**
     * Create an instance of {@link AirAvailabilityWithAncillaryRS }
     * 
     */
    public AirAvailabilityWithAncillaryRS createAirAvailabilityWithAncillaryRS() {
        return new AirAvailabilityWithAncillaryRS();
    }

    /**
     * Create an instance of {@link AncillaryServicesInfo }
     * 
     */
    public AncillaryServicesInfo createAncillaryServicesInfo() {
        return new AncillaryServicesInfo();
    }

    /**
     * Create an instance of {@link AuthorizeCustomerProfileRQ }
     * 
     */
    public AuthorizeCustomerProfileRQ createAuthorizeCustomerProfileRQ() {
        return new AuthorizeCustomerProfileRQ();
    }

    /**
     * Create an instance of {@link AuthorizeCustomerProfileRS }
     * 
     */
    public AuthorizeCustomerProfileRS createAuthorizeCustomerProfileRS() {
        return new AuthorizeCustomerProfileRS();
    }

    /**
     * Create an instance of {@link RetrieveRevDocSummaryRQ }
     * 
     */
    public RetrieveRevDocSummaryRQ createRetrieveRevDocSummaryRQ() {
        return new RetrieveRevDocSummaryRQ();
    }

    /**
     * Create an instance of {@link RetrieveRevDocSummaryRS }
     * 
     */
    public RetrieveRevDocSummaryRS createRetrieveRevDocSummaryRS() {
        return new RetrieveRevDocSummaryRS();
    }

    /**
     * Create an instance of {@link RevDocSalesType }
     * 
     */
    public RevDocSalesType createRevDocSalesType() {
        return new RevDocSalesType();
    }

    /**
     * Create an instance of {@link PNRAmount }
     * 
     */
    public PNRAmount createPNRAmount() {
        return new PNRAmount();
    }

    /**
     * Create an instance of {@link FareQuoteDetailsType }
     * 
     */
    public FareQuoteDetailsType createFareQuoteDetailsType() {
        return new FareQuoteDetailsType();
    }

    /**
     * Create an instance of {@link RepriceDetails }
     * 
     */
    public RepriceDetails createRepriceDetails() {
        return new RepriceDetails();
    }

    /**
     * Create an instance of {@link SeatMapDetailsType }
     * 
     */
    public SeatMapDetailsType createSeatMapDetailsType() {
        return new SeatMapDetailsType();
    }

    /**
     * Create an instance of {@link DeckDetailsType }
     * 
     */
    public DeckDetailsType createDeckDetailsType() {
        return new DeckDetailsType();
    }

    /**
     * Create an instance of {@link CabinDetailsType }
     * 
     */
    public CabinDetailsType createCabinDetailsType() {
        return new CabinDetailsType();
    }

    /**
     * Create an instance of {@link CompartmentDetailsType }
     * 
     */
    public CompartmentDetailsType createCompartmentDetailsType() {
        return new CompartmentDetailsType();
    }

    /**
     * Create an instance of {@link SeatDetailsType }
     * 
     */
    public SeatDetailsType createSeatDetailsType() {
        return new SeatDetailsType();
    }

    /**
     * Create an instance of {@link SeatAttributesPositionType }
     * 
     */
    public SeatAttributesPositionType createSeatAttributesPositionType() {
        return new SeatAttributesPositionType();
    }

    /**
     * Create an instance of {@link SeatNumberType }
     * 
     */
    public SeatNumberType createSeatNumberType() {
        return new SeatNumberType();
    }

    /**
     * Create an instance of {@link AirportType }
     * 
     */
    public AirportType createAirportType() {
        return new AirportType();
    }

    /**
     * Create an instance of {@link GuestSeatDetails }
     * 
     */
    public GuestSeatDetails createGuestSeatDetails() {
        return new GuestSeatDetails();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link NameAndAddressType }
     * 
     */
    public NameAndAddressType createNameAndAddressType() {
        return new NameAndAddressType();
    }

    /**
     * Create an instance of {@link PNRAddressType }
     * 
     */
    public PNRAddressType createPNRAddressType() {
        return new PNRAddressType();
    }

    /**
     * Create an instance of {@link PnrCommonType }
     * 
     */
    public PnrCommonType createPnrCommonType() {
        return new PnrCommonType();
    }

    /**
     * Create an instance of {@link PNRSegmentDetailsType }
     * 
     */
    public PNRSegmentDetailsType createPNRSegmentDetailsType() {
        return new PNRSegmentDetailsType();
    }

    /**
     * Create an instance of {@link PNRGuestNameTypes }
     * 
     */
    public PNRGuestNameTypes createPNRGuestNameTypes() {
        return new PNRGuestNameTypes();
    }

    /**
     * Create an instance of {@link PNRFareDetailsType }
     * 
     */
    public PNRFareDetailsType createPNRFareDetailsType() {
        return new PNRFareDetailsType();
    }

    /**
     * Create an instance of {@link PNRBaseFareType }
     * 
     */
    public PNRBaseFareType createPNRBaseFareType() {
        return new PNRBaseFareType();
    }

    /**
     * Create an instance of {@link LowFaresType }
     * 
     */
    public LowFaresType createLowFaresType() {
        return new LowFaresType();
    }

    /**
     * Create an instance of {@link FlightGroupType }
     * 
     */
    public FlightGroupType createFlightGroupType() {
        return new FlightGroupType();
    }

    /**
     * Create an instance of {@link FlightInformationsType }
     * 
     */
    public FlightInformationsType createFlightInformationsType() {
        return new FlightInformationsType();
    }

    /**
     * Create an instance of {@link FlightDetailsType }
     * 
     */
    public FlightDetailsType createFlightDetailsType() {
        return new FlightDetailsType();
    }

    /**
     * Create an instance of {@link AirlineLevelTaxRegNumber }
     * 
     */
    public AirlineLevelTaxRegNumber createAirlineLevelTaxRegNumber() {
        return new AirlineLevelTaxRegNumber();
    }

    /**
     * Create an instance of {@link PnrRules }
     * 
     */
    public PnrRules createPnrRules() {
        return new PnrRules();
    }

    /**
     * Create an instance of {@link DateAndTimeType }
     * 
     */
    public DateAndTimeType createDateAndTimeType() {
        return new DateAndTimeType();
    }

    /**
     * Create an instance of {@link PaxObjType }
     * 
     */
    public PaxObjType createPaxObjType() {
        return new PaxObjType();
    }

    /**
     * Create an instance of {@link Passenger }
     * 
     */
    public Passenger createPassenger() {
        return new Passenger();
    }

    /**
     * Create an instance of {@link FareOverrideDetails }
     * 
     */
    public FareOverrideDetails createFareOverrideDetails() {
        return new FareOverrideDetails();
    }

    /**
     * Create an instance of {@link SurChargeDetailsPerGuest }
     * 
     */
    public SurChargeDetailsPerGuest createSurChargeDetailsPerGuest() {
        return new SurChargeDetailsPerGuest();
    }

    /**
     * Create an instance of {@link FareDetailsForAGuest }
     * 
     */
    public FareDetailsForAGuest createFareDetailsForAGuest() {
        return new FareDetailsForAGuest();
    }

    /**
     * Create an instance of {@link FlightLegDetailsType }
     * 
     */
    public FlightLegDetailsType createFlightLegDetailsType() {
        return new FlightLegDetailsType();
    }

    /**
     * Create an instance of {@link AvailabilitySearchType }
     * 
     */
    public AvailabilitySearchType createAvailabilitySearchType() {
        return new AvailabilitySearchType();
    }

    /**
     * Create an instance of {@link ServiceTypes }
     * 
     */
    public ServiceTypes createServiceTypes() {
        return new ServiceTypes();
    }

    /**
     * Create an instance of {@link ScheduleList }
     * 
     */
    public ScheduleList createScheduleList() {
        return new ScheduleList();
    }

    /**
     * Create an instance of {@link FlightDesignator }
     * 
     */
    public FlightDesignator createFlightDesignator() {
        return new FlightDesignator();
    }

    /**
     * Create an instance of {@link TaxDetailsPerGuest }
     * 
     */
    public TaxDetailsPerGuest createTaxDetailsPerGuest() {
        return new TaxDetailsPerGuest();
    }

    /**
     * Create an instance of {@link PnrGuestDetailsType }
     * 
     */
    public PnrGuestDetailsType createPnrGuestDetailsType() {
        return new PnrGuestDetailsType();
    }

    /**
     * Create an instance of {@link PnrContact }
     * 
     */
    public PnrContact createPnrContact() {
        return new PnrContact();
    }

    /**
     * Create an instance of {@link PNRDetailsType }
     * 
     */
    public PNRDetailsType createPNRDetailsType() {
        return new PNRDetailsType();
    }

    /**
     * Create an instance of {@link OAndDFareType }
     * 
     */
    public OAndDFareType createOAndDFareType() {
        return new OAndDFareType();
    }

    /**
     * Create an instance of {@link FlightSegmentDetails }
     * 
     */
    public FlightSegmentDetails createFlightSegmentDetails() {
        return new FlightSegmentDetails();
    }

    /**
     * Create an instance of {@link PNR }
     * 
     */
    public PNR createPNR() {
        return new PNR();
    }

    /**
     * Create an instance of {@link SSRDetailsType }
     * 
     */
    public SSRDetailsType createSSRDetailsType() {
        return new SSRDetailsType();
    }

    /**
     * Create an instance of {@link FeeInformation }
     * 
     */
    public FeeInformation createFeeInformation() {
        return new FeeInformation();
    }

    /**
     * Create an instance of {@link CommentType }
     * 
     */
    public CommentType createCommentType() {
        return new CommentType();
    }

    /**
     * Create an instance of {@link TimeLimitDetailsType }
     * 
     */
    public TimeLimitDetailsType createTimeLimitDetailsType() {
        return new TimeLimitDetailsType();
    }

    /**
     * Create an instance of {@link PnrInfantDetailsType }
     * 
     */
    public PnrInfantDetailsType createPnrInfantDetailsType() {
        return new PnrInfantDetailsType();
    }

    /**
     * Create an instance of {@link AllocateFlightSeatType }
     * 
     */
    public AllocateFlightSeatType createAllocateFlightSeatType() {
        return new AllocateFlightSeatType();
    }

    /**
     * Create an instance of {@link SeatAllocationDetails }
     * 
     */
    public SeatAllocationDetails createSeatAllocationDetails() {
        return new SeatAllocationDetails();
    }

    /**
     * Create an instance of {@link OldSeatAllocationDetails }
     * 
     */
    public OldSeatAllocationDetails createOldSeatAllocationDetails() {
        return new OldSeatAllocationDetails();
    }

    /**
     * Create an instance of {@link SeatSegmentDetails }
     * 
     */
    public SeatSegmentDetails createSeatSegmentDetails() {
        return new SeatSegmentDetails();
    }

    /**
     * Create an instance of {@link BookerDetails }
     * 
     */
    public BookerDetails createBookerDetails() {
        return new BookerDetails();
    }

    /**
     * Create an instance of {@link PNRRefundDetails }
     * 
     */
    public PNRRefundDetails createPNRRefundDetails() {
        return new PNRRefundDetails();
    }

    /**
     * Create an instance of {@link PaymentProcessingType }
     * 
     */
    public PaymentProcessingType createPaymentProcessingType() {
        return new PaymentProcessingType();
    }

    /**
     * Create an instance of {@link RefundType }
     * 
     */
    public RefundType createRefundType() {
        return new RefundType();
    }

    /**
     * Create an instance of {@link FeeType }
     * 
     */
    public FeeType createFeeType() {
        return new FeeType();
    }

    /**
     * Create an instance of {@link DateRangeType }
     * 
     */
    public DateRangeType createDateRangeType() {
        return new DateRangeType();
    }

    /**
     * Create an instance of {@link PnrRepriceDetails }
     * 
     */
    public PnrRepriceDetails createPnrRepriceDetails() {
        return new PnrRepriceDetails();
    }

    /**
     * Create an instance of {@link GuestRepriceDetails }
     * 
     */
    public GuestRepriceDetails createGuestRepriceDetails() {
        return new GuestRepriceDetails();
    }

    /**
     * Create an instance of {@link OandDChangeType }
     * 
     */
    public OandDChangeType createOandDChangeType() {
        return new OandDChangeType();
    }

    /**
     * Create an instance of {@link PnrContactChangeType }
     * 
     */
    public PnrContactChangeType createPnrContactChangeType() {
        return new PnrContactChangeType();
    }

    /**
     * Create an instance of {@link CommentChangeType }
     * 
     */
    public CommentChangeType createCommentChangeType() {
        return new CommentChangeType();
    }

    /**
     * Create an instance of {@link TimeLimitChangeType }
     * 
     */
    public TimeLimitChangeType createTimeLimitChangeType() {
        return new TimeLimitChangeType();
    }

    /**
     * Create an instance of {@link PnrPayment }
     * 
     */
    public PnrPayment createPnrPayment() {
        return new PnrPayment();
    }

    /**
     * Create an instance of {@link AirportInfo }
     * 
     */
    public AirportInfo createAirportInfo() {
        return new AirportInfo();
    }

    /**
     * Create an instance of {@link GuestCheckInInfo }
     * 
     */
    public GuestCheckInInfo createGuestCheckInInfo() {
        return new GuestCheckInInfo();
    }

    /**
     * Create an instance of {@link ChangeInPartyType }
     * 
     */
    public ChangeInPartyType createChangeInPartyType() {
        return new ChangeInPartyType();
    }

    /**
     * Create an instance of {@link LoyaltyDetails }
     * 
     */
    public LoyaltyDetails createLoyaltyDetails() {
        return new LoyaltyDetails();
    }

    /**
     * Create an instance of {@link AgencyAddress }
     * 
     */
    public AgencyAddress createAgencyAddress() {
        return new AgencyAddress();
    }

    /**
     * Create an instance of {@link AgencyCommissionRateDetails }
     * 
     */
    public AgencyCommissionRateDetails createAgencyCommissionRateDetails() {
        return new AgencyCommissionRateDetails();
    }

    /**
     * Create an instance of {@link TravelDocuments }
     * 
     */
    public TravelDocuments createTravelDocuments() {
        return new TravelDocuments();
    }

    /**
     * Create an instance of {@link CreditCardDetails }
     * 
     */
    public CreditCardDetails createCreditCardDetails() {
        return new CreditCardDetails();
    }

    /**
     * Create an instance of {@link OandDFeeDetailsInputType }
     * 
     */
    public OandDFeeDetailsInputType createOandDFeeDetailsInputType() {
        return new OandDFeeDetailsInputType();
    }

    /**
     * Create an instance of {@link SegmentFeeDetailsInputType }
     * 
     */
    public SegmentFeeDetailsInputType createSegmentFeeDetailsInputType() {
        return new SegmentFeeDetailsInputType();
    }

    /**
     * Create an instance of {@link FeeAmountDetailsType }
     * 
     */
    public FeeAmountDetailsType createFeeAmountDetailsType() {
        return new FeeAmountDetailsType();
    }

    /**
     * Create an instance of {@link ModifyPaxType }
     * 
     */
    public ModifyPaxType createModifyPaxType() {
        return new ModifyPaxType();
    }

    /**
     * Create an instance of {@link GroupPaxDetails }
     * 
     */
    public GroupPaxDetails createGroupPaxDetails() {
        return new GroupPaxDetails();
    }

    /**
     * Create an instance of {@link SsrChangeType }
     * 
     */
    public SsrChangeType createSsrChangeType() {
        return new SsrChangeType();
    }

    /**
     * Create an instance of {@link FeeChangeType }
     * 
     */
    public FeeChangeType createFeeChangeType() {
        return new FeeChangeType();
    }

    /**
     * Create an instance of {@link LoyaltyInfo }
     * 
     */
    public LoyaltyInfo createLoyaltyInfo() {
        return new LoyaltyInfo();
    }

    /**
     * Create an instance of {@link PNRManifestDetails }
     * 
     */
    public PNRManifestDetails createPNRManifestDetails() {
        return new PNRManifestDetails();
    }

    /**
     * Create an instance of {@link PaxDetails }
     * 
     */
    public PaxDetails createPaxDetails() {
        return new PaxDetails();
    }

    /**
     * Create an instance of {@link ReaccomodationDetailsType }
     * 
     */
    public ReaccomodationDetailsType createReaccomodationDetailsType() {
        return new ReaccomodationDetailsType();
    }

    /**
     * Create an instance of {@link DccDetailsType }
     * 
     */
    public DccDetailsType createDccDetailsType() {
        return new DccDetailsType();
    }

    /**
     * Create an instance of {@link PaymentInformation }
     * 
     */
    public PaymentInformation createPaymentInformation() {
        return new PaymentInformation();
    }

    /**
     * Create an instance of {@link ChequeDetails }
     * 
     */
    public ChequeDetails createChequeDetails() {
        return new ChequeDetails();
    }

    /**
     * Create an instance of {@link DebitCardDetails }
     * 
     */
    public DebitCardDetails createDebitCardDetails() {
        return new DebitCardDetails();
    }

    /**
     * Create an instance of {@link ElectronicFundDetails }
     * 
     */
    public ElectronicFundDetails createElectronicFundDetails() {
        return new ElectronicFundDetails();
    }

    /**
     * Create an instance of {@link WriteOffDetails }
     * 
     */
    public WriteOffDetails createWriteOffDetails() {
        return new WriteOffDetails();
    }

    /**
     * Create an instance of {@link PymCreditCardDetails }
     * 
     */
    public PymCreditCardDetails createPymCreditCardDetails() {
        return new PymCreditCardDetails();
    }

    /**
     * Create an instance of {@link CreditFileDetails }
     * 
     */
    public CreditFileDetails createCreditFileDetails() {
        return new CreditFileDetails();
    }

    /**
     * Create an instance of {@link AGPaymentDetails }
     * 
     */
    public AGPaymentDetails createAGPaymentDetails() {
        return new AGPaymentDetails();
    }

    /**
     * Create an instance of {@link PAPaymentDetails }
     * 
     */
    public PAPaymentDetails createPAPaymentDetails() {
        return new PAPaymentDetails();
    }

    /**
     * Create an instance of {@link FeeTax }
     * 
     */
    public FeeTax createFeeTax() {
        return new FeeTax();
    }

    /**
     * Create an instance of {@link PurchaserInformation }
     * 
     */
    public PurchaserInformation createPurchaserInformation() {
        return new PurchaserInformation();
    }

    /**
     * Create an instance of {@link RecipientInformation }
     * 
     */
    public RecipientInformation createRecipientInformation() {
        return new RecipientInformation();
    }

    /**
     * Create an instance of {@link GVNameAndAddress }
     * 
     */
    public GVNameAndAddress createGVNameAndAddress() {
        return new GVNameAndAddress();
    }

    /**
     * Create an instance of {@link PymDccDetails }
     * 
     */
    public PymDccDetails createPymDccDetails() {
        return new PymDccDetails();
    }

    /**
     * Create an instance of {@link LoyaltyNumberDetails }
     * 
     */
    public LoyaltyNumberDetails createLoyaltyNumberDetails() {
        return new LoyaltyNumberDetails();
    }

    /**
     * Create an instance of {@link PartnerLoyaltyNumberDetails }
     * 
     */
    public PartnerLoyaltyNumberDetails createPartnerLoyaltyNumberDetails() {
        return new PartnerLoyaltyNumberDetails();
    }

    /**
     * Create an instance of {@link CustomerLoyaltyDetails }
     * 
     */
    public CustomerLoyaltyDetails createCustomerLoyaltyDetails() {
        return new CustomerLoyaltyDetails();
    }

    /**
     * Create an instance of {@link InterestDetails }
     * 
     */
    public InterestDetails createInterestDetails() {
        return new InterestDetails();
    }

    /**
     * Create an instance of {@link InfFields }
     * 
     */
    public InfFields createInfFields() {
        return new InfFields();
    }

    /**
     * Create an instance of {@link CbbgFields }
     * 
     */
    public CbbgFields createCbbgFields() {
        return new CbbgFields();
    }

    /**
     * Create an instance of {@link PBAAFields }
     * 
     */
    public PBAAFields createPBAAFields() {
        return new PBAAFields();
    }

    /**
     * Create an instance of {@link PBAXFields }
     * 
     */
    public PBAXFields createPBAXFields() {
        return new PBAXFields();
    }

    /**
     * Create an instance of {@link CabinBaggageFields }
     * 
     */
    public CabinBaggageFields createCabinBaggageFields() {
        return new CabinBaggageFields();
    }

    /**
     * Create an instance of {@link TkneFields }
     * 
     */
    public TkneFields createTkneFields() {
        return new TkneFields();
    }

    /**
     * Create an instance of {@link UmnrFields }
     * 
     */
    public UmnrFields createUmnrFields() {
        return new UmnrFields();
    }

    /**
     * Create an instance of {@link InvoiceFields }
     * 
     */
    public InvoiceFields createInvoiceFields() {
        return new InvoiceFields();
    }

    /**
     * Create an instance of {@link AvailabilitySsr }
     * 
     */
    public AvailabilitySsr createAvailabilitySsr() {
        return new AvailabilitySsr();
    }

    /**
     * Create an instance of {@link AmountDetailsForAGuest }
     * 
     */
    public AmountDetailsForAGuest createAmountDetailsForAGuest() {
        return new AmountDetailsForAGuest();
    }

    /**
     * Create an instance of {@link FlightInformationDetails }
     * 
     */
    public FlightInformationDetails createFlightInformationDetails() {
        return new FlightInformationDetails();
    }

    /**
     * Create an instance of {@link FlightDetails }
     * 
     */
    public FlightDetails createFlightDetails() {
        return new FlightDetails();
    }

    /**
     * Create an instance of {@link DataElementType }
     * 
     */
    public DataElementType createDataElementType() {
        return new DataElementType();
    }

    /**
     * Create an instance of {@link BestFareInfo }
     * 
     */
    public BestFareInfo createBestFareInfo() {
        return new BestFareInfo();
    }

    /**
     * Create an instance of {@link FlightResults }
     * 
     */
    public FlightResults createFlightResults() {
        return new FlightResults();
    }

    /**
     * Create an instance of {@link SearchAvailabilityResults }
     * 
     */
    public SearchAvailabilityResults createSearchAvailabilityResults() {
        return new SearchAvailabilityResults();
    }

    /**
     * Create an instance of {@link FlightSegmentSummaryDetails }
     * 
     */
    public FlightSegmentSummaryDetails createFlightSegmentSummaryDetails() {
        return new FlightSegmentSummaryDetails();
    }

    /**
     * Create an instance of {@link PnrGuestSummaryDetails }
     * 
     */
    public PnrGuestSummaryDetails createPnrGuestSummaryDetails() {
        return new PnrGuestSummaryDetails();
    }

    /**
     * Create an instance of {@link ContactInformation }
     * 
     */
    public ContactInformation createContactInformation() {
        return new ContactInformation();
    }

    /**
     * Create an instance of {@link DenominationType }
     * 
     */
    public DenominationType createDenominationType() {
        return new DenominationType();
    }

    /**
     * Create an instance of {@link StopOverDetails }
     * 
     */
    public StopOverDetails createStopOverDetails() {
        return new StopOverDetails();
    }

    /**
     * Create an instance of {@link FqtvFields }
     * 
     */
    public FqtvFields createFqtvFields() {
        return new FqtvFields();
    }

    /**
     * Create an instance of {@link FeeDetailsInput }
     * 
     */
    public FeeDetailsInput createFeeDetailsInput() {
        return new FeeDetailsInput();
    }

    /**
     * Create an instance of {@link CCFeeDetailsInput }
     * 
     */
    public CCFeeDetailsInput createCCFeeDetailsInput() {
        return new CCFeeDetailsInput();
    }

    /**
     * Create an instance of {@link FeeDetailsOutput }
     * 
     */
    public FeeDetailsOutput createFeeDetailsOutput() {
        return new FeeDetailsOutput();
    }

    /**
     * Create an instance of {@link FeeDetailsResponse }
     * 
     */
    public FeeDetailsResponse createFeeDetailsResponse() {
        return new FeeDetailsResponse();
    }

    /**
     * Create an instance of {@link FeeAmountDetails }
     * 
     */
    public FeeAmountDetails createFeeAmountDetails() {
        return new FeeAmountDetails();
    }

    /**
     * Create an instance of {@link OandDFeeDetailsResponse }
     * 
     */
    public OandDFeeDetailsResponse createOandDFeeDetailsResponse() {
        return new OandDFeeDetailsResponse();
    }

    /**
     * Create an instance of {@link OandDFeeDetailsType }
     * 
     */
    public OandDFeeDetailsType createOandDFeeDetailsType() {
        return new OandDFeeDetailsType();
    }

    /**
     * Create an instance of {@link SegmentFeeDetailsResponse }
     * 
     */
    public SegmentFeeDetailsResponse createSegmentFeeDetailsResponse() {
        return new SegmentFeeDetailsResponse();
    }

    /**
     * Create an instance of {@link SegmentFeeDetailType }
     * 
     */
    public SegmentFeeDetailType createSegmentFeeDetailType() {
        return new SegmentFeeDetailType();
    }

    /**
     * Create an instance of {@link UnassignedSeatDetails }
     * 
     */
    public UnassignedSeatDetails createUnassignedSeatDetails() {
        return new UnassignedSeatDetails();
    }

    /**
     * Create an instance of {@link CCFeeAmountDetails }
     * 
     */
    public CCFeeAmountDetails createCCFeeAmountDetails() {
        return new CCFeeAmountDetails();
    }

    /**
     * Create an instance of {@link UpgradeChangeType }
     * 
     */
    public UpgradeChangeType createUpgradeChangeType() {
        return new UpgradeChangeType();
    }

    /**
     * Create an instance of {@link UpgradeDetails }
     * 
     */
    public UpgradeDetails createUpgradeDetails() {
        return new UpgradeDetails();
    }

    /**
     * Create an instance of {@link BookingSegmentFinderVODetails }
     * 
     */
    public BookingSegmentFinderVODetails createBookingSegmentFinderVODetails() {
        return new BookingSegmentFinderVODetails();
    }

    /**
     * Create an instance of {@link PaxFinderVODetails }
     * 
     */
    public PaxFinderVODetails createPaxFinderVODetails() {
        return new PaxFinderVODetails();
    }

    /**
     * Create an instance of {@link SsrClientVODetails }
     * 
     */
    public SsrClientVODetails createSsrClientVODetails() {
        return new SsrClientVODetails();
    }

    /**
     * Create an instance of {@link FeeValidationDetails }
     * 
     */
    public FeeValidationDetails createFeeValidationDetails() {
        return new FeeValidationDetails();
    }

    /**
     * Create an instance of {@link SsrValidationDetails }
     * 
     */
    public SsrValidationDetails createSsrValidationDetails() {
        return new SsrValidationDetails();
    }

    /**
     * Create an instance of {@link SSRFeeAmountDetailsType }
     * 
     */
    public SSRFeeAmountDetailsType createSSRFeeAmountDetailsType() {
        return new SSRFeeAmountDetailsType();
    }

    /**
     * Create an instance of {@link DateOfHireDetails }
     * 
     */
    public DateOfHireDetails createDateOfHireDetails() {
        return new DateOfHireDetails();
    }

    /**
     * Create an instance of {@link BillingAddress }
     * 
     */
    public BillingAddress createBillingAddress() {
        return new BillingAddress();
    }

    /**
     * Create an instance of {@link BookingSegments }
     * 
     */
    public BookingSegments createBookingSegments() {
        return new BookingSegments();
    }

    /**
     * Create an instance of {@link QueueDetailsInputType }
     * 
     */
    public QueueDetailsInputType createQueueDetailsInputType() {
        return new QueueDetailsInputType();
    }

    /**
     * Create an instance of {@link PaymentElementType }
     * 
     */
    public PaymentElementType createPaymentElementType() {
        return new PaymentElementType();
    }

    /**
     * Create an instance of {@link ResidenceDetailsType }
     * 
     */
    public ResidenceDetailsType createResidenceDetailsType() {
        return new ResidenceDetailsType();
    }

    /**
     * Create an instance of {@link TravelDocumentsChangeType }
     * 
     */
    public TravelDocumentsChangeType createTravelDocumentsChangeType() {
        return new TravelDocumentsChangeType();
    }

    /**
     * Create an instance of {@link CustomerValueDetails }
     * 
     */
    public CustomerValueDetails createCustomerValueDetails() {
        return new CustomerValueDetails();
    }

    /**
     * Create an instance of {@link CabinGroupSeatCount }
     * 
     */
    public CabinGroupSeatCount createCabinGroupSeatCount() {
        return new CabinGroupSeatCount();
    }

    /**
     * Create an instance of {@link AuxDetailsType }
     * 
     */
    public AuxDetailsType createAuxDetailsType() {
        return new AuxDetailsType();
    }

    /**
     * Create an instance of {@link CarRentalDetailsType }
     * 
     */
    public CarRentalDetailsType createCarRentalDetailsType() {
        return new CarRentalDetailsType();
    }

    /**
     * Create an instance of {@link CarGroupType }
     * 
     */
    public CarGroupType createCarGroupType() {
        return new CarGroupType();
    }

    /**
     * Create an instance of {@link InsuranceDetailsType }
     * 
     */
    public InsuranceDetailsType createInsuranceDetailsType() {
        return new InsuranceDetailsType();
    }

    /**
     * Create an instance of {@link VendorDetailsType }
     * 
     */
    public VendorDetailsType createVendorDetailsType() {
        return new VendorDetailsType();
    }

    /**
     * Create an instance of {@link CarGroupDetailsType }
     * 
     */
    public CarGroupDetailsType createCarGroupDetailsType() {
        return new CarGroupDetailsType();
    }

    /**
     * Create an instance of {@link ThreeDSecurityDtls }
     * 
     */
    public ThreeDSecurityDtls createThreeDSecurityDtls() {
        return new ThreeDSecurityDtls();
    }

    /**
     * Create an instance of {@link TravelInsuranceDetailsType }
     * 
     */
    public TravelInsuranceDetailsType createTravelInsuranceDetailsType() {
        return new TravelInsuranceDetailsType();
    }

    /**
     * Create an instance of {@link PetcFields }
     * 
     */
    public PetcFields createPetcFields() {
        return new PetcFields();
    }

    /**
     * Create an instance of {@link CCFeeDetails }
     * 
     */
    public CCFeeDetails createCCFeeDetails() {
        return new CCFeeDetails();
    }

    /**
     * Create an instance of {@link ExternalRecordLocatorDetails }
     * 
     */
    public ExternalRecordLocatorDetails createExternalRecordLocatorDetails() {
        return new ExternalRecordLocatorDetails();
    }

    /**
     * Create an instance of {@link SsrCountType }
     * 
     */
    public SsrCountType createSsrCountType() {
        return new SsrCountType();
    }

    /**
     * Create an instance of {@link TotalAmountForPymReceiptType }
     * 
     */
    public TotalAmountForPymReceiptType createTotalAmountForPymReceiptType() {
        return new TotalAmountForPymReceiptType();
    }

    /**
     * Create an instance of {@link FarePymntDetailsType }
     * 
     */
    public FarePymntDetailsType createFarePymntDetailsType() {
        return new FarePymntDetailsType();
    }

    /**
     * Create an instance of {@link FeePymntDetailsType }
     * 
     */
    public FeePymntDetailsType createFeePymntDetailsType() {
        return new FeePymntDetailsType();
    }

    /**
     * Create an instance of {@link DiscountCouponChangeDetails }
     * 
     */
    public DiscountCouponChangeDetails createDiscountCouponChangeDetails() {
        return new DiscountCouponChangeDetails();
    }

    /**
     * Create an instance of {@link AdditionalCCDetails }
     * 
     */
    public AdditionalCCDetails createAdditionalCCDetails() {
        return new AdditionalCCDetails();
    }

    /**
     * Create an instance of {@link PurchaserDetailsType }
     * 
     */
    public PurchaserDetailsType createPurchaserDetailsType() {
        return new PurchaserDetailsType();
    }

    /**
     * Create an instance of {@link RecipientDetailsType }
     * 
     */
    public RecipientDetailsType createRecipientDetailsType() {
        return new RecipientDetailsType();
    }

    /**
     * Create an instance of {@link CustomerDetails }
     * 
     */
    public CustomerDetails createCustomerDetails() {
        return new CustomerDetails();
    }

    /**
     * Create an instance of {@link AdditionalCreditCardInfo }
     * 
     */
    public AdditionalCreditCardInfo createAdditionalCreditCardInfo() {
        return new AdditionalCreditCardInfo();
    }

    /**
     * Create an instance of {@link SSRDtlsType }
     * 
     */
    public SSRDtlsType createSSRDtlsType() {
        return new SSRDtlsType();
    }

    /**
     * Create an instance of {@link AncillaryRuleParameters }
     * 
     */
    public AncillaryRuleParameters createAncillaryRuleParameters() {
        return new AncillaryRuleParameters();
    }

    /**
     * Create an instance of {@link SaleableSsrs }
     * 
     */
    public SaleableSsrs createSaleableSsrs() {
        return new SaleableSsrs();
    }

    /**
     * Create an instance of {@link SaleableSsrsType }
     * 
     */
    public SaleableSsrsType createSaleableSsrsType() {
        return new SaleableSsrsType();
    }

    /**
     * Create an instance of {@link SaleableAuxs }
     * 
     */
    public SaleableAuxs createSaleableAuxs() {
        return new SaleableAuxs();
    }

    /**
     * Create an instance of {@link SaleableAuxsType }
     * 
     */
    public SaleableAuxsType createSaleableAuxsType() {
        return new SaleableAuxsType();
    }

    /**
     * Create an instance of {@link NotifiableSsrs }
     * 
     */
    public NotifiableSsrs createNotifiableSsrs() {
        return new NotifiableSsrs();
    }

    /**
     * Create an instance of {@link NotifiableSsrsType }
     * 
     */
    public NotifiableSsrsType createNotifiableSsrsType() {
        return new NotifiableSsrsType();
    }

    /**
     * Create an instance of {@link NotofiableAuxs }
     * 
     */
    public NotofiableAuxs createNotofiableAuxs() {
        return new NotofiableAuxs();
    }

    /**
     * Create an instance of {@link NotofiableAuxsType }
     * 
     */
    public NotofiableAuxsType createNotofiableAuxsType() {
        return new NotofiableAuxsType();
    }

    /**
     * Create an instance of {@link OandDIds }
     * 
     */
    public OandDIds createOandDIds() {
        return new OandDIds();
    }

    /**
     * Create an instance of {@link SegmentIds }
     * 
     */
    public SegmentIds createSegmentIds() {
        return new SegmentIds();
    }

    /**
     * Create an instance of {@link AncillarySegmentDetailType }
     * 
     */
    public AncillarySegmentDetailType createAncillarySegmentDetailType() {
        return new AncillarySegmentDetailType();
    }

    /**
     * Create an instance of {@link IncludedAncillaries }
     * 
     */
    public IncludedAncillaries createIncludedAncillaries() {
        return new IncludedAncillaries();
    }

    /**
     * Create an instance of {@link IncludedAncillariesType }
     * 
     */
    public IncludedAncillariesType createIncludedAncillariesType() {
        return new IncludedAncillariesType();
    }

    /**
     * Create an instance of {@link SubSSRs }
     * 
     */
    public SubSSRs createSubSSRs() {
        return new SubSSRs();
    }

    /**
     * Create an instance of {@link SubSSRListType }
     * 
     */
    public SubSSRListType createSubSSRListType() {
        return new SubSSRListType();
    }

    /**
     * Create an instance of {@link SubSSRType }
     * 
     */
    public SubSSRType createSubSSRType() {
        return new SubSSRType();
    }

    /**
     * Create an instance of {@link CheckedBaggageDetails }
     * 
     */
    public CheckedBaggageDetails createCheckedBaggageDetails() {
        return new CheckedBaggageDetails();
    }

    /**
     * Create an instance of {@link Ancillary }
     * 
     */
    public Ancillary createAncillary() {
        return new Ancillary();
    }

    /**
     * Create an instance of {@link AncillaryService }
     * 
     */
    public AncillaryService createAncillaryService() {
        return new AncillaryService();
    }

    /**
     * Create an instance of {@link AirportAncillaries }
     * 
     */
    public AirportAncillaries createAirportAncillaries() {
        return new AirportAncillaries();
    }

    /**
     * Create an instance of {@link AirportAncillary }
     * 
     */
    public AirportAncillary createAirportAncillary() {
        return new AirportAncillary();
    }

    /**
     * Create an instance of {@link TicketDetailsType }
     * 
     */
    public TicketDetailsType createTicketDetailsType() {
        return new TicketDetailsType();
    }

    /**
     * Create an instance of {@link CouponDetailsType }
     * 
     */
    public CouponDetailsType createCouponDetailsType() {
        return new CouponDetailsType();
    }

    /**
     * Create an instance of {@link PaxTicketDetailsType }
     * 
     */
    public PaxTicketDetailsType createPaxTicketDetailsType() {
        return new PaxTicketDetailsType();
    }

    /**
     * Create an instance of {@link FareBasisSettingsType }
     * 
     */
    public FareBasisSettingsType createFareBasisSettingsType() {
        return new FareBasisSettingsType();
    }

    /**
     * Create an instance of {@link NonRefundableAmountDetailsType }
     * 
     */
    public NonRefundableAmountDetailsType createNonRefundableAmountDetailsType() {
        return new NonRefundableAmountDetailsType();
    }

    /**
     * Create an instance of {@link SsrFieldDetails }
     * 
     */
    public SsrFieldDetails createSsrFieldDetails() {
        return new SsrFieldDetails();
    }

    /**
     * Create an instance of {@link CartDetailsType }
     * 
     */
    public CartDetailsType createCartDetailsType() {
        return new CartDetailsType();
    }

    /**
     * Create an instance of {@link AuxDetailsChangeType }
     * 
     */
    public AuxDetailsChangeType createAuxDetailsChangeType() {
        return new AuxDetailsChangeType();
    }

    /**
     * Create an instance of {@link SeatAssignMentFeeType }
     * 
     */
    public SeatAssignMentFeeType createSeatAssignMentFeeType() {
        return new SeatAssignMentFeeType();
    }

    /**
     * Create an instance of {@link GiftVoucherNameAndAddress }
     * 
     */
    public GiftVoucherNameAndAddress createGiftVoucherNameAndAddress() {
        return new GiftVoucherNameAndAddress();
    }

    /**
     * Create an instance of {@link TripInfoType }
     * 
     */
    public TripInfoType createTripInfoType() {
        return new TripInfoType();
    }

    /**
     * Create an instance of {@link SegmentInfoType }
     * 
     */
    public SegmentInfoType createSegmentInfoType() {
        return new SegmentInfoType();
    }

    /**
     * Create an instance of {@link FlightIdentifierInfoType }
     * 
     */
    public FlightIdentifierInfoType createFlightIdentifierInfoType() {
        return new FlightIdentifierInfoType();
    }

    /**
     * Create an instance of {@link OperatingAirlineInfoType }
     * 
     */
    public OperatingAirlineInfoType createOperatingAirlineInfoType() {
        return new OperatingAirlineInfoType();
    }

    /**
     * Create an instance of {@link TravelPointInfoType }
     * 
     */
    public TravelPointInfoType createTravelPointInfoType() {
        return new TravelPointInfoType();
    }

    /**
     * Create an instance of {@link AircraftInfoType }
     * 
     */
    public AircraftInfoType createAircraftInfoType() {
        return new AircraftInfoType();
    }

    /**
     * Create an instance of {@link DeiInfoType }
     * 
     */
    public DeiInfoType createDeiInfoType() {
        return new DeiInfoType();
    }

    /**
     * Create an instance of {@link SegmentAvailabilityType }
     * 
     */
    public SegmentAvailabilityType createSegmentAvailabilityType() {
        return new SegmentAvailabilityType();
    }

    /**
     * Create an instance of {@link PricingInfoType }
     * 
     */
    public PricingInfoType createPricingInfoType() {
        return new PricingInfoType();
    }

    /**
     * Create an instance of {@link PaxPricingInfoType }
     * 
     */
    public PaxPricingInfoType createPaxPricingInfoType() {
        return new PaxPricingInfoType();
    }

    /**
     * Create an instance of {@link PricingComponentInfoType }
     * 
     */
    public PricingComponentInfoType createPricingComponentInfoType() {
        return new PricingComponentInfoType();
    }

    /**
     * Create an instance of {@link SegmentLinkInfoType }
     * 
     */
    public SegmentLinkInfoType createSegmentLinkInfoType() {
        return new SegmentLinkInfoType();
    }

    /**
     * Create an instance of {@link SegmentReferenceInfoType }
     * 
     */
    public SegmentReferenceInfoType createSegmentReferenceInfoType() {
        return new SegmentReferenceInfoType();
    }

    /**
     * Create an instance of {@link AmountInfoType }
     * 
     */
    public AmountInfoType createAmountInfoType() {
        return new AmountInfoType();
    }

    /**
     * Create an instance of {@link PaxBaseFareType }
     * 
     */
    public PaxBaseFareType createPaxBaseFareType() {
        return new PaxBaseFareType();
    }

    /**
     * Create an instance of {@link PaxSegmentMapping }
     * 
     */
    public PaxSegmentMapping createPaxSegmentMapping() {
        return new PaxSegmentMapping();
    }

    /**
     * Create an instance of {@link ItineraryInfo }
     * 
     */
    public ItineraryInfo createItineraryInfo() {
        return new ItineraryInfo();
    }

    /**
     * Create an instance of {@link JourneyInfo }
     * 
     */
    public JourneyInfo createJourneyInfo() {
        return new JourneyInfo();
    }

    /**
     * Create an instance of {@link OandDInfo }
     * 
     */
    public OandDInfo createOandDInfo() {
        return new OandDInfo();
    }

    /**
     * Create an instance of {@link SegmentDetailsInfo }
     * 
     */
    public SegmentDetailsInfo createSegmentDetailsInfo() {
        return new SegmentDetailsInfo();
    }

    /**
     * Create an instance of {@link SSRSegmentMapping }
     * 
     */
    public SSRSegmentMapping createSSRSegmentMapping() {
        return new SSRSegmentMapping();
    }

    /**
     * Create an instance of {@link FeeResponseDetails }
     * 
     */
    public FeeResponseDetails createFeeResponseDetails() {
        return new FeeResponseDetails();
    }

    /**
     * Create an instance of {@link ItemDetails }
     * 
     */
    public ItemDetails createItemDetails() {
        return new ItemDetails();
    }

    /**
     * Create an instance of {@link PNRRemovalStatus }
     * 
     */
    public PNRRemovalStatus createPNRRemovalStatus() {
        return new PNRRemovalStatus();
    }

    /**
     * Create an instance of {@link FareComponentAmountType }
     * 
     */
    public FareComponentAmountType createFareComponentAmountType() {
        return new FareComponentAmountType();
    }

    /**
     * Create an instance of {@link PaxFareComponentAmountDtlsType }
     * 
     */
    public PaxFareComponentAmountDtlsType createPaxFareComponentAmountDtlsType() {
        return new PaxFareComponentAmountDtlsType();
    }

    /**
     * Create an instance of {@link FareComponentTaxDetailsType }
     * 
     */
    public FareComponentTaxDetailsType createFareComponentTaxDetailsType() {
        return new FareComponentTaxDetailsType();
    }

    /**
     * Create an instance of {@link FareComponentSurchargeDetailsType }
     * 
     */
    public FareComponentSurchargeDetailsType createFareComponentSurchargeDetailsType() {
        return new FareComponentSurchargeDetailsType();
    }

    /**
     * Create an instance of {@link CurrencyDisplayDetailsType }
     * 
     */
    public CurrencyDisplayDetailsType createCurrencyDisplayDetailsType() {
        return new CurrencyDisplayDetailsType();
    }

    /**
     * Create an instance of {@link FareDisplayCurrencyDetailsType }
     * 
     */
    public FareDisplayCurrencyDetailsType createFareDisplayCurrencyDetailsType() {
        return new FareDisplayCurrencyDetailsType();
    }

    /**
     * Create an instance of {@link GiftVoucherTax }
     * 
     */
    public GiftVoucherTax createGiftVoucherTax() {
        return new GiftVoucherTax();
    }

    /**
     * Create an instance of {@link FlightSegmentType }
     * 
     */
    public FlightSegmentType createFlightSegmentType() {
        return new FlightSegmentType();
    }

    /**
     * Create an instance of {@link ContinentDetailsType }
     * 
     */
    public ContinentDetailsType createContinentDetailsType() {
        return new ContinentDetailsType();
    }

    /**
     * Create an instance of {@link CountryDetailsType }
     * 
     */
    public CountryDetailsType createCountryDetailsType() {
        return new CountryDetailsType();
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link FOP }
     * 
     */
    public FOP createFOP() {
        return new FOP();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link TaxDetailType }
     * 
     */
    public TaxDetailType createTaxDetailType() {
        return new TaxDetailType();
    }

    /**
     * Create an instance of {@link CustomFieldType }
     * 
     */
    public CustomFieldType createCustomFieldType() {
        return new CustomFieldType();
    }

    /**
     * Create an instance of {@link CustomInfoListType }
     * 
     */
    public CustomInfoListType createCustomInfoListType() {
        return new CustomInfoListType();
    }

    /**
     * Create an instance of {@link CustomInfoFieldType }
     * 
     */
    public CustomInfoFieldType createCustomInfoFieldType() {
        return new CustomInfoFieldType();
    }

    /**
     * Create an instance of {@link PositionInfoType }
     * 
     */
    public PositionInfoType createPositionInfoType() {
        return new PositionInfoType();
    }

    /**
     * Create an instance of {@link IdDetailsType }
     * 
     */
    public IdDetailsType createIdDetailsType() {
        return new IdDetailsType();
    }

    /**
     * Create an instance of {@link TaxInvoiceType }
     * 
     */
    public TaxInvoiceType createTaxInvoiceType() {
        return new TaxInvoiceType();
    }

    /**
     * Create an instance of {@link TaxInvoiceFieldType }
     * 
     */
    public TaxInvoiceFieldType createTaxInvoiceFieldType() {
        return new TaxInvoiceFieldType();
    }

    /**
     * Create an instance of {@link PassengerBaggageAllowanceType }
     * 
     */
    public PassengerBaggageAllowanceType createPassengerBaggageAllowanceType() {
        return new PassengerBaggageAllowanceType();
    }

    /**
     * Create an instance of {@link WeightAllowanceType }
     * 
     */
    public WeightAllowanceType createWeightAllowanceType() {
        return new WeightAllowanceType();
    }

    /**
     * Create an instance of {@link MaximumAllowanceType }
     * 
     */
    public MaximumAllowanceType createMaximumAllowanceType() {
        return new MaximumAllowanceType();
    }

    /**
     * Create an instance of {@link MediaType }
     * 
     */
    public MediaType createMediaType() {
        return new MediaType();
    }

    /**
     * Create an instance of {@link CustomerProfileConsentDetails }
     * 
     */
    public CustomerProfileConsentDetails createCustomerProfileConsentDetails() {
        return new CustomerProfileConsentDetails();
    }

    /**
     * Create an instance of {@link GuestSeatDetailsType }
     * 
     */
    public GuestSeatDetailsType createGuestSeatDetailsType() {
        return new GuestSeatDetailsType();
    }

    /**
     * Create an instance of {@link ResidenceType }
     * 
     */
    public ResidenceType createResidenceType() {
        return new ResidenceType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link DccPaymentDetailsType }
     * 
     */
    public DccPaymentDetailsType createDccPaymentDetailsType() {
        return new DccPaymentDetailsType();
    }

    /**
     * Create an instance of {@link BillingAddressType }
     * 
     */
    public BillingAddressType createBillingAddressType() {
        return new BillingAddressType();
    }

    /**
     * Create an instance of {@link PaymentElementDetailsType }
     * 
     */
    public PaymentElementDetailsType createPaymentElementDetailsType() {
        return new PaymentElementDetailsType();
    }

    /**
     * Create an instance of {@link ThreeDSecurityDtlsType }
     * 
     */
    public ThreeDSecurityDtlsType createThreeDSecurityDtlsType() {
        return new ThreeDSecurityDtlsType();
    }

    /**
     * Create an instance of {@link AdditionalCreditCardInfoType }
     * 
     */
    public AdditionalCreditCardInfoType createAdditionalCreditCardInfoType() {
        return new AdditionalCreditCardInfoType();
    }

    /**
     * Create an instance of {@link ShopingCartDetailsType }
     * 
     */
    public ShopingCartDetailsType createShopingCartDetailsType() {
        return new ShopingCartDetailsType();
    }

    /**
     * Create an instance of {@link AncillaryDetailsType }
     * 
     */
    public AncillaryDetailsType createAncillaryDetailsType() {
        return new AncillaryDetailsType();
    }

    /**
     * Create an instance of {@link TaxDetailsPerGuestType }
     * 
     */
    public TaxDetailsPerGuestType createTaxDetailsPerGuestType() {
        return new TaxDetailsPerGuestType();
    }

    /**
     * Create an instance of {@link SurChargeDetailsPerGuestType }
     * 
     */
    public SurChargeDetailsPerGuestType createSurChargeDetailsPerGuestType() {
        return new SurChargeDetailsPerGuestType();
    }

    /**
     * Create an instance of {@link ApplicableSegmentsType }
     * 
     */
    public ApplicableSegmentsType createApplicableSegmentsType() {
        return new ApplicableSegmentsType();
    }

    /**
     * Create an instance of {@link AuxFieldDetailsType }
     * 
     */
    public AuxFieldDetailsType createAuxFieldDetailsType() {
        return new AuxFieldDetailsType();
    }

    /**
     * Create an instance of {@link SsrFieldDetailsType }
     * 
     */
    public SsrFieldDetailsType createSsrFieldDetailsType() {
        return new SsrFieldDetailsType();
    }

    /**
     * Create an instance of {@link GuestCheckInInfoType }
     * 
     */
    public GuestCheckInInfoType createGuestCheckInInfoType() {
        return new GuestCheckInInfoType();
    }

    /**
     * Create an instance of {@link GuestAmountDetailsType }
     * 
     */
    public GuestAmountDetailsType createGuestAmountDetailsType() {
        return new GuestAmountDetailsType();
    }

    /**
     * Create an instance of {@link GuestTicketDetailsType }
     * 
     */
    public GuestTicketDetailsType createGuestTicketDetailsType() {
        return new GuestTicketDetailsType();
    }

    /**
     * Create an instance of {@link GuestCouponDetailsType }
     * 
     */
    public GuestCouponDetailsType createGuestCouponDetailsType() {
        return new GuestCouponDetailsType();
    }

    /**
     * Create an instance of {@link DateOnlyDetailsType }
     * 
     */
    public DateOnlyDetailsType createDateOnlyDetailsType() {
        return new DateOnlyDetailsType();
    }

    /**
     * Create an instance of {@link FlightSegmentDetailsType }
     * 
     */
    public FlightSegmentDetailsType createFlightSegmentDetailsType() {
        return new FlightSegmentDetailsType();
    }

    /**
     * Create an instance of {@link AppliedFareDetailsForPaxType }
     * 
     */
    public AppliedFareDetailsForPaxType createAppliedFareDetailsForPaxType() {
        return new AppliedFareDetailsForPaxType();
    }

    /**
     * Create an instance of {@link FareDetailsForGuestType }
     * 
     */
    public FareDetailsForGuestType createFareDetailsForGuestType() {
        return new FareDetailsForGuestType();
    }

    /**
     * Create an instance of {@link FareOverrideDetailsType }
     * 
     */
    public FareOverrideDetailsType createFareOverrideDetailsType() {
        return new FareOverrideDetailsType();
    }

    /**
     * Create an instance of {@link PriceBreakDownType }
     * 
     */
    public PriceBreakDownType createPriceBreakDownType() {
        return new PriceBreakDownType();
    }

    /**
     * Create an instance of {@link GuestPriceBreakDownType }
     * 
     */
    public GuestPriceBreakDownType createGuestPriceBreakDownType() {
        return new GuestPriceBreakDownType();
    }

    /**
     * Create an instance of {@link SurchargeType }
     * 
     */
    public SurchargeType createSurchargeType() {
        return new SurchargeType();
    }

    /**
     * Create an instance of {@link TaxType }
     * 
     */
    public TaxType createTaxType() {
        return new TaxType();
    }

    /**
     * Create an instance of {@link DiscountDetailsType }
     * 
     */
    public DiscountDetailsType createDiscountDetailsType() {
        return new DiscountDetailsType();
    }

    /**
     * Create an instance of {@link AmountDetailsType }
     * 
     */
    public AmountDetailsType createAmountDetailsType() {
        return new AmountDetailsType();
    }

    /**
     * Create an instance of {@link GuestAmount }
     * 
     */
    public GuestAmount createGuestAmount() {
        return new GuestAmount();
    }

    /**
     * Create an instance of {@link PayableEntityBreakdownType }
     * 
     */
    public PayableEntityBreakdownType createPayableEntityBreakdownType() {
        return new PayableEntityBreakdownType();
    }

    /**
     * Create an instance of {@link FareTxnIDDetailsType }
     * 
     */
    public FareTxnIDDetailsType createFareTxnIDDetailsType() {
        return new FareTxnIDDetailsType();
    }

    /**
     * Create an instance of {@link SegmentChangeType }
     * 
     */
    public SegmentChangeType createSegmentChangeType() {
        return new SegmentChangeType();
    }

    /**
     * Create an instance of {@link CabinChangeDetails }
     * 
     */
    public CabinChangeDetails createCabinChangeDetails() {
        return new CabinChangeDetails();
    }

    /**
     * Create an instance of {@link PaxTypeAmount }
     * 
     */
    public PaxTypeAmount createPaxTypeAmount() {
        return new PaxTypeAmount();
    }

    /**
     * Create an instance of {@link InsuranceInfoDetailsType }
     * 
     */
    public InsuranceInfoDetailsType createInsuranceInfoDetailsType() {
        return new InsuranceInfoDetailsType();
    }

    /**
     * Create an instance of {@link ElementOverrideDetailsType }
     * 
     */
    public ElementOverrideDetailsType createElementOverrideDetailsType() {
        return new ElementOverrideDetailsType();
    }

    /**
     * Create an instance of {@link ChildSsrsType }
     * 
     */
    public ChildSsrsType createChildSsrsType() {
        return new ChildSsrsType();
    }

    /**
     * Create an instance of {@link PNRActionUserInfo }
     * 
     */
    public PNRActionUserInfo createPNRActionUserInfo() {
        return new PNRActionUserInfo();
    }

    /**
     * Create an instance of {@link PNRGeneralChangeInfo }
     * 
     */
    public PNRGeneralChangeInfo createPNRGeneralChangeInfo() {
        return new PNRGeneralChangeInfo();
    }

    /**
     * Create an instance of {@link ItineraryHistoryInfo }
     * 
     */
    public ItineraryHistoryInfo createItineraryHistoryInfo() {
        return new ItineraryHistoryInfo();
    }

    /**
     * Create an instance of {@link ItinPriceHistoryInfo }
     * 
     */
    public ItinPriceHistoryInfo createItinPriceHistoryInfo() {
        return new ItinPriceHistoryInfo();
    }

    /**
     * Create an instance of {@link GuestPriceBreakDownHistoryInfo }
     * 
     */
    public GuestPriceBreakDownHistoryInfo createGuestPriceBreakDownHistoryInfo() {
        return new GuestPriceBreakDownHistoryInfo();
    }

    /**
     * Create an instance of {@link PriceBreakDownHistoryInfo }
     * 
     */
    public PriceBreakDownHistoryInfo createPriceBreakDownHistoryInfo() {
        return new PriceBreakDownHistoryInfo();
    }

    /**
     * Create an instance of {@link GuestDetailsHistoryInfo }
     * 
     */
    public GuestDetailsHistoryInfo createGuestDetailsHistoryInfo() {
        return new GuestDetailsHistoryInfo();
    }

    /**
     * Create an instance of {@link GuestTicketHistoryInfo }
     * 
     */
    public GuestTicketHistoryInfo createGuestTicketHistoryInfo() {
        return new GuestTicketHistoryInfo();
    }

    /**
     * Create an instance of {@link SSRDetailsHistoryInfo }
     * 
     */
    public SSRDetailsHistoryInfo createSSRDetailsHistoryInfo() {
        return new SSRDetailsHistoryInfo();
    }

    /**
     * Create an instance of {@link SeatAssignmentHistoryDetails }
     * 
     */
    public SeatAssignmentHistoryDetails createSeatAssignmentHistoryDetails() {
        return new SeatAssignmentHistoryDetails();
    }

    /**
     * Create an instance of {@link PnrContactHistoryInfo }
     * 
     */
    public PnrContactHistoryInfo createPnrContactHistoryInfo() {
        return new PnrContactHistoryInfo();
    }

    /**
     * Create an instance of {@link PnrCommentsHistoryInfo }
     * 
     */
    public PnrCommentsHistoryInfo createPnrCommentsHistoryInfo() {
        return new PnrCommentsHistoryInfo();
    }

    /**
     * Create an instance of {@link GuestPaymentHistoryInfo }
     * 
     */
    public GuestPaymentHistoryInfo createGuestPaymentHistoryInfo() {
        return new GuestPaymentHistoryInfo();
    }

    /**
     * Create an instance of {@link FeeHistoryInfo }
     * 
     */
    public FeeHistoryInfo createFeeHistoryInfo() {
        return new FeeHistoryInfo();
    }

    /**
     * Create an instance of {@link TravelDocHistoryInfo }
     * 
     */
    public TravelDocHistoryInfo createTravelDocHistoryInfo() {
        return new TravelDocHistoryInfo();
    }

    /**
     * Create an instance of {@link FlightSegmentHistoryInfo }
     * 
     */
    public FlightSegmentHistoryInfo createFlightSegmentHistoryInfo() {
        return new FlightSegmentHistoryInfo();
    }

    /**
     * Create an instance of {@link PaxAmountPriceBreakdown }
     * 
     */
    public PaxAmountPriceBreakdown createPaxAmountPriceBreakdown() {
        return new PaxAmountPriceBreakdown();
    }

    /**
     * Create an instance of {@link PaxTotalPrice }
     * 
     */
    public PaxTotalPrice createPaxTotalPrice() {
        return new PaxTotalPrice();
    }

    /**
     * Create an instance of {@link PaxAmountToBePaid }
     * 
     */
    public PaxAmountToBePaid createPaxAmountToBePaid() {
        return new PaxAmountToBePaid();
    }

    /**
     * Create an instance of {@link FarePrice }
     * 
     */
    public FarePrice createFarePrice() {
        return new FarePrice();
    }

    /**
     * Create an instance of {@link FeePrice }
     * 
     */
    public FeePrice createFeePrice() {
        return new FeePrice();
    }

    /**
     * Create an instance of {@link AuxHistoryInfo }
     * 
     */
    public AuxHistoryInfo createAuxHistoryInfo() {
        return new AuxHistoryInfo();
    }

    /**
     * Create an instance of {@link BaggageAllowancePerSegmentType }
     * 
     */
    public BaggageAllowancePerSegmentType createBaggageAllowancePerSegmentType() {
        return new BaggageAllowancePerSegmentType();
    }

    /**
     * Create an instance of {@link CrossReferenceHistoryInfo }
     * 
     */
    public CrossReferenceHistoryInfo createCrossReferenceHistoryInfo() {
        return new CrossReferenceHistoryInfo();
    }

    /**
     * Create an instance of {@link CouponDetailsTypeInfo }
     * 
     */
    public CouponDetailsTypeInfo createCouponDetailsTypeInfo() {
        return new CouponDetailsTypeInfo();
    }

    /**
     * Create an instance of {@link CustomNameValueType }
     * 
     */
    public CustomNameValueType createCustomNameValueType() {
        return new CustomNameValueType();
    }

    /**
     * Create an instance of {@link SsrFieldMetaDataType }
     * 
     */
    public SsrFieldMetaDataType createSsrFieldMetaDataType() {
        return new SsrFieldMetaDataType();
    }

    /**
     * Create an instance of {@link EMDDetailsHistoryInfo }
     * 
     */
    public EMDDetailsHistoryInfo createEMDDetailsHistoryInfo() {
        return new EMDDetailsHistoryInfo();
    }

    /**
     * Create an instance of {@link SsrFieldsMetaDataType }
     * 
     */
    public SsrFieldsMetaDataType createSsrFieldsMetaDataType() {
        return new SsrFieldsMetaDataType();
    }

    /**
     * Create an instance of {@link SsrFieldType }
     * 
     */
    public SsrFieldType createSsrFieldType() {
        return new SsrFieldType();
    }

    /**
     * Create an instance of {@link RevDocCouponDetailsType }
     * 
     */
    public RevDocCouponDetailsType createRevDocCouponDetailsType() {
        return new RevDocCouponDetailsType();
    }

    /**
     * Create an instance of {@link RevDocTaxDetailsType }
     * 
     */
    public RevDocTaxDetailsType createRevDocTaxDetailsType() {
        return new RevDocTaxDetailsType();
    }

    /**
     * Create an instance of {@link RevDocSurchargeDetailsType }
     * 
     */
    public RevDocSurchargeDetailsType createRevDocSurchargeDetailsType() {
        return new RevDocSurchargeDetailsType();
    }

    /**
     * Create an instance of {@link PaymentFOPDetailsType }
     * 
     */
    public PaymentFOPDetailsType createPaymentFOPDetailsType() {
        return new PaymentFOPDetailsType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link FareEntityType }
     * 
     */
    public FareEntityType createFareEntityType() {
        return new FareEntityType();
    }

    /**
     * Create an instance of {@link TaxEntityType }
     * 
     */
    public TaxEntityType createTaxEntityType() {
        return new TaxEntityType();
    }

    /**
     * Create an instance of {@link SurchargeEntityType }
     * 
     */
    public SurchargeEntityType createSurchargeEntityType() {
        return new SurchargeEntityType();
    }

    /**
     * Create an instance of {@link FeeEntityType }
     * 
     */
    public FeeEntityType createFeeEntityType() {
        return new FeeEntityType();
    }

    /**
     * Create an instance of {@link AncillaryServices }
     * 
     */
    public AncillaryServices createAncillaryServices() {
        return new AncillaryServices();
    }

    /**
     * Create an instance of {@link IncludedAncillariesInfo }
     * 
     */
    public IncludedAncillariesInfo createIncludedAncillariesInfo() {
        return new IncludedAncillariesInfo();
    }

    /**
     * Create an instance of {@link AncillaryServiceDetails }
     * 
     */
    public AncillaryServiceDetails createAncillaryServiceDetails() {
        return new AncillaryServiceDetails();
    }

    /**
     * Create an instance of {@link AncillaryFeeInfo }
     * 
     */
    public AncillaryFeeInfo createAncillaryFeeInfo() {
        return new AncillaryFeeInfo();
    }

    /**
     * Create an instance of {@link AncillaryTaxDetails }
     * 
     */
    public AncillaryTaxDetails createAncillaryTaxDetails() {
        return new AncillaryTaxDetails();
    }

    /**
     * Create an instance of {@link AncillarySegmentInfo }
     * 
     */
    public AncillarySegmentInfo createAncillarySegmentInfo() {
        return new AncillarySegmentInfo();
    }

    /**
     * Create an instance of {@link GuestConsentDetailsRequestType }
     * 
     */
    public GuestConsentDetailsRequestType createGuestConsentDetailsRequestType() {
        return new GuestConsentDetailsRequestType();
    }

    /**
     * Create an instance of {@link GuestConsentDetailsResponseType }
     * 
     */
    public GuestConsentDetailsResponseType createGuestConsentDetailsResponseType() {
        return new GuestConsentDetailsResponseType();
    }

    /**
     * Create an instance of {@link ConsentsRequestType }
     * 
     */
    public ConsentsRequestType createConsentsRequestType() {
        return new ConsentsRequestType();
    }

    /**
     * Create an instance of {@link ConsentsResponseType }
     * 
     */
    public ConsentsResponseType createConsentsResponseType() {
        return new ConsentsResponseType();
    }

    /**
     * Create an instance of {@link RevDocInvoiceDetailsType }
     * 
     */
    public RevDocInvoiceDetailsType createRevDocInvoiceDetailsType() {
        return new RevDocInvoiceDetailsType();
    }

    /**
     * Create an instance of {@link FlightInfoGroupType }
     * 
     */
    public FlightInfoGroupType createFlightInfoGroupType() {
        return new FlightInfoGroupType();
    }

    /**
     * Create an instance of {@link FlightDtlsType }
     * 
     */
    public FlightDtlsType createFlightDtlsType() {
        return new FlightDtlsType();
    }

    /**
     * Create an instance of {@link FlightTimeInfoType }
     * 
     */
    public FlightTimeInfoType createFlightTimeInfoType() {
        return new FlightTimeInfoType();
    }

    /**
     * Create an instance of {@link DelayCodeType }
     * 
     */
    public DelayCodeType createDelayCodeType() {
        return new DelayCodeType();
    }

    /**
     * Create an instance of {@link DepartureType }
     * 
     */
    public DepartureType createDepartureType() {
        return new DepartureType();
    }

    /**
     * Create an instance of {@link ArrivalType }
     * 
     */
    public ArrivalType createArrivalType() {
        return new ArrivalType();
    }

    /**
     * Create an instance of {@link SurchargeDetails }
     * 
     */
    public SurchargeDetails createSurchargeDetails() {
        return new SurchargeDetails();
    }

    /**
     * Create an instance of {@link PNRExtractOandDDetails }
     * 
     */
    public PNRExtractOandDDetails createPNRExtractOandDDetails() {
        return new PNRExtractOandDDetails();
    }

    /**
     * Create an instance of {@link PnrPaxDetails }
     * 
     */
    public PnrPaxDetails createPnrPaxDetails() {
        return new PnrPaxDetails();
    }

    /**
     * Create an instance of {@link PNRExtractPnrContact }
     * 
     */
    public PNRExtractPnrContact createPNRExtractPnrContact() {
        return new PNRExtractPnrContact();
    }

    /**
     * Create an instance of {@link Comments }
     * 
     */
    public Comments createComments() {
        return new Comments();
    }

    /**
     * Create an instance of {@link PNRExtractBookerDetails }
     * 
     */
    public PNRExtractBookerDetails createPNRExtractBookerDetails() {
        return new PNRExtractBookerDetails();
    }

    /**
     * Create an instance of {@link PaymentDetails }
     * 
     */
    public PaymentDetails createPaymentDetails() {
        return new PaymentDetails();
    }

    /**
     * Create an instance of {@link PNRExtractFlightSegmentDetails }
     * 
     */
    public PNRExtractFlightSegmentDetails createPNRExtractFlightSegmentDetails() {
        return new PNRExtractFlightSegmentDetails();
    }

    /**
     * Create an instance of {@link FlightSegment }
     * 
     */
    public FlightSegment createFlightSegment() {
        return new FlightSegment();
    }

    /**
     * Create an instance of {@link PNRExtractLoyaltyDetails }
     * 
     */
    public PNRExtractLoyaltyDetails createPNRExtractLoyaltyDetails() {
        return new PNRExtractLoyaltyDetails();
    }

    /**
     * Create an instance of {@link SeatDetails }
     * 
     */
    public SeatDetails createSeatDetails() {
        return new SeatDetails();
    }

    /**
     * Create an instance of {@link PNRExtractSSRDetails }
     * 
     */
    public PNRExtractSSRDetails createPNRExtractSSRDetails() {
        return new PNRExtractSSRDetails();
    }

    /**
     * Create an instance of {@link FeeDetails }
     * 
     */
    public FeeDetails createFeeDetails() {
        return new FeeDetails();
    }

    /**
     * Create an instance of {@link ExemptionDetails }
     * 
     */
    public ExemptionDetails createExemptionDetails() {
        return new ExemptionDetails();
    }

    /**
     * Create an instance of {@link PNRExtractAddress }
     * 
     */
    public PNRExtractAddress createPNRExtractAddress() {
        return new PNRExtractAddress();
    }

    /**
     * Create an instance of {@link FlightIdentifier }
     * 
     */
    public FlightIdentifier createFlightIdentifier() {
        return new FlightIdentifier();
    }

    /**
     * Create an instance of {@link BoardPoint }
     * 
     */
    public BoardPoint createBoardPoint() {
        return new BoardPoint();
    }

    /**
     * Create an instance of {@link TaxDetails }
     * 
     */
    public TaxDetails createTaxDetails() {
        return new TaxDetails();
    }

    /**
     * Create an instance of {@link FareBreakDownDetails }
     * 
     */
    public FareBreakDownDetails createFareBreakDownDetails() {
        return new FareBreakDownDetails();
    }

    /**
     * Create an instance of {@link Surcharge }
     * 
     */
    public Surcharge createSurcharge() {
        return new Surcharge();
    }

    /**
     * Create an instance of {@link StopOverDetailsExtract }
     * 
     */
    public StopOverDetailsExtract createStopOverDetailsExtract() {
        return new StopOverDetailsExtract();
    }

    /**
     * Create an instance of {@link Stop }
     * 
     */
    public Stop createStop() {
        return new Stop();
    }

    /**
     * Create an instance of {@link PNRExtractCbbgFields }
     * 
     */
    public PNRExtractCbbgFields createPNRExtractCbbgFields() {
        return new PNRExtractCbbgFields();
    }

    /**
     * Create an instance of {@link PNRExtractPbaaFields }
     * 
     */
    public PNRExtractPbaaFields createPNRExtractPbaaFields() {
        return new PNRExtractPbaaFields();
    }

    /**
     * Create an instance of {@link PNRExtractPbaxFields }
     * 
     */
    public PNRExtractPbaxFields createPNRExtractPbaxFields() {
        return new PNRExtractPbaxFields();
    }

    /**
     * Create an instance of {@link PNRExtractCabinBaggageFields }
     * 
     */
    public PNRExtractCabinBaggageFields createPNRExtractCabinBaggageFields() {
        return new PNRExtractCabinBaggageFields();
    }

    /**
     * Create an instance of {@link PNRExtractPaymentElementType }
     * 
     */
    public PNRExtractPaymentElementType createPNRExtractPaymentElementType() {
        return new PNRExtractPaymentElementType();
    }

    /**
     * Create an instance of {@link PNRExtractInfFields }
     * 
     */
    public PNRExtractInfFields createPNRExtractInfFields() {
        return new PNRExtractInfFields();
    }

    /**
     * Create an instance of {@link PNRExtractPetcFields }
     * 
     */
    public PNRExtractPetcFields createPNRExtractPetcFields() {
        return new PNRExtractPetcFields();
    }

    /**
     * Create an instance of {@link PNRExtractTicketDetailsType }
     * 
     */
    public PNRExtractTicketDetailsType createPNRExtractTicketDetailsType() {
        return new PNRExtractTicketDetailsType();
    }

    /**
     * Create an instance of {@link PNRExtractCouponDetailsType }
     * 
     */
    public PNRExtractCouponDetailsType createPNRExtractCouponDetailsType() {
        return new PNRExtractCouponDetailsType();
    }

    /**
     * Create an instance of {@link PNRExtractPaxTicketDetailsType }
     * 
     */
    public PNRExtractPaxTicketDetailsType createPNRExtractPaxTicketDetailsType() {
        return new PNRExtractPaxTicketDetailsType();
    }

    /**
     * Create an instance of {@link PNRExtractSsrFieldDetails }
     * 
     */
    public PNRExtractSsrFieldDetails createPNRExtractSsrFieldDetails() {
        return new PNRExtractSsrFieldDetails();
    }

    /**
     * Create an instance of {@link RefundDetails }
     * 
     */
    public RefundDetails createRefundDetails() {
        return new RefundDetails();
    }

    /**
     * Create an instance of {@link BaggageInformation }
     * 
     */
    public BaggageInformation createBaggageInformation() {
        return new BaggageInformation();
    }

    /**
     * Create an instance of {@link PNRExtractSsrFieldMetaDataType }
     * 
     */
    public PNRExtractSsrFieldMetaDataType createPNRExtractSsrFieldMetaDataType() {
        return new PNRExtractSsrFieldMetaDataType();
    }

    /**
     * Create an instance of {@link ContactInfoPaxManifest }
     * 
     */
    public ContactInfoPaxManifest createContactInfoPaxManifest() {
        return new ContactInfoPaxManifest();
    }

    /**
     * Create an instance of {@link PassengerManifestDetails }
     * 
     */
    public PassengerManifestDetails createPassengerManifestDetails() {
        return new PassengerManifestDetails();
    }

    /**
     * Create an instance of {@link StandbyHireDetailsType }
     * 
     */
    public StandbyHireDetailsType createStandbyHireDetailsType() {
        return new StandbyHireDetailsType();
    }

    /**
     * Create an instance of {@link StandbyDetailsType }
     * 
     */
    public StandbyDetailsType createStandbyDetailsType() {
        return new StandbyDetailsType();
    }

    /**
     * Create an instance of {@link CabinSeatType }
     * 
     */
    public CabinSeatType createCabinSeatType() {
        return new CabinSeatType();
    }

    /**
     * Create an instance of {@link Tax.Amount }
     * 
     */
    public Tax.Amount createTaxAmount() {
        return new Tax.Amount();
    }

    /**
     * Create an instance of {@link Fee.Amount }
     * 
     */
    public Fee.Amount createFeeAmount() {
        return new Fee.Amount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBookingRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ibsplc.com/iRes/simpleTypes/", name = "CreateBookingRQ")
    public JAXBElement<CreateBookingRQ> createCreateBookingRQ(CreateBookingRQ value) {
        return new JAXBElement<CreateBookingRQ>(_CreateBookingRQ_QNAME, CreateBookingRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBookingRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ibsplc.com/iRes/simpleTypes/", name = "CreateBookingRS")
    public JAXBElement<CreateBookingRS> createCreateBookingRS(CreateBookingRS value) {
        return new JAXBElement<CreateBookingRS>(_CreateBookingRS_QNAME, CreateBookingRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightInfoRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ibsplc.com/iRes/simpleTypes/", name = "FlightInfoRQ")
    public JAXBElement<FlightInfoRQ> createFlightInfoRQ(FlightInfoRQ value) {
        return new JAXBElement<FlightInfoRQ>(_FlightInfoRQ_QNAME, FlightInfoRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightInfoRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ibsplc.com/iRes/simpleTypes/", name = "FlightInfoRS")
    public JAXBElement<FlightInfoRS> createFlightInfoRS(FlightInfoRS value) {
        return new JAXBElement<FlightInfoRS>(_FlightInfoRS_QNAME, FlightInfoRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyBookingRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ibsplc.com/iRes/simpleTypes/", name = "ModifyBookingRQ")
    public JAXBElement<ModifyBookingRQ> createModifyBookingRQ(ModifyBookingRQ value) {
        return new JAXBElement<ModifyBookingRQ>(_ModifyBookingRQ_QNAME, ModifyBookingRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyBookingRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ibsplc.com/iRes/simpleTypes/", name = "ModifyBookingRS")
    public JAXBElement<ModifyBookingRS> createModifyBookingRS(ModifyBookingRS value) {
        return new JAXBElement<ModifyBookingRS>(_ModifyBookingRS_QNAME, ModifyBookingRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreProcessPaymentRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ibsplc.com/iRes/simpleTypes/", name = "PreProcessPaymentRQ")
    public JAXBElement<PreProcessPaymentRQ> createPreProcessPaymentRQ(PreProcessPaymentRQ value) {
        return new JAXBElement<PreProcessPaymentRQ>(_PreProcessPaymentRQ_QNAME, PreProcessPaymentRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreProcessPaymentRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ibsplc.com/iRes/simpleTypes/", name = "PreProcessPaymentRS")
    public JAXBElement<PreProcessPaymentRS> createPreProcessPaymentRS(PreProcessPaymentRS value) {
        return new JAXBElement<PreProcessPaymentRS>(_PreProcessPaymentRS_QNAME, PreProcessPaymentRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostProcessPaymentRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ibsplc.com/iRes/simpleTypes/", name = "PostProcessPaymentRQ")
    public JAXBElement<PostProcessPaymentRQ> createPostProcessPaymentRQ(PostProcessPaymentRQ value) {
        return new JAXBElement<PostProcessPaymentRQ>(_PostProcessPaymentRQ_QNAME, PostProcessPaymentRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostProcessPaymentRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ibsplc.com/iRes/simpleTypes/", name = "PostProcessPaymentRS")
    public JAXBElement<PostProcessPaymentRS> createPostProcessPaymentRS(PostProcessPaymentRS value) {
        return new JAXBElement<PostProcessPaymentRS>(_PostProcessPaymentRS_QNAME, PostProcessPaymentRS.class, null, value);
    }

}
