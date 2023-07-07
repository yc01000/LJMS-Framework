//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2020.12.01 시간 08:47:33 AM KST 
//


package com.lj.core.integration.soap.ibs.domain.inventory;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lj.support.integration.soap.ibs.domain.inventory package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lj.support.integration.soap.ibs.domain.inventory
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RealTimeRMSRequestRQ }
     * 
     */
    public RealTimeRMSRequestRQ createRealTimeRMSRequestRQ() {
        return new RealTimeRMSRequestRQ();
    }

    /**
     * Create an instance of {@link InventoryChannelKeyType }
     * 
     */
    public InventoryChannelKeyType createInventoryChannelKeyType() {
        return new InventoryChannelKeyType();
    }

    /**
     * Create an instance of {@link CabinDetails }
     * 
     */
    public CabinDetails createCabinDetails() {
        return new CabinDetails();
    }

    /**
     * Create an instance of {@link RealTimeRMSRequestRS }
     * 
     */
    public RealTimeRMSRequestRS createRealTimeRMSRequestRS() {
        return new RealTimeRMSRequestRS();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link RealTimeRMSUpdateRQ }
     * 
     */
    public RealTimeRMSUpdateRQ createRealTimeRMSUpdateRQ() {
        return new RealTimeRMSUpdateRQ();
    }

    /**
     * Create an instance of {@link RealTimeRMSUpdateRS }
     * 
     */
    public RealTimeRMSUpdateRS createRealTimeRMSUpdateRS() {
        return new RealTimeRMSUpdateRS();
    }

    /**
     * Create an instance of {@link RealTimeInventoryRQ }
     * 
     */
    public RealTimeInventoryRQ createRealTimeInventoryRQ() {
        return new RealTimeInventoryRQ();
    }

    /**
     * Create an instance of {@link RealTimeInventoryRS }
     * 
     */
    public RealTimeInventoryRS createRealTimeInventoryRS() {
        return new RealTimeInventoryRS();
    }

    /**
     * Create an instance of {@link FlightDetails }
     * 
     */
    public FlightDetails createFlightDetails() {
        return new FlightDetails();
    }

    /**
     * Create an instance of {@link LegFareClassDetails }
     * 
     */
    public LegFareClassDetails createLegFareClassDetails() {
        return new LegFareClassDetails();
    }

    /**
     * Create an instance of {@link SegmentFareClassDetails }
     * 
     */
    public SegmentFareClassDetails createSegmentFareClassDetails() {
        return new SegmentFareClassDetails();
    }

    /**
     * Create an instance of {@link BaseInventoryRQ }
     * 
     */
    public BaseInventoryRQ createBaseInventoryRQ() {
        return new BaseInventoryRQ();
    }

    /**
     * Create an instance of {@link FareClassDetails }
     * 
     */
    public FareClassDetails createFareClassDetails() {
        return new FareClassDetails();
    }

}
