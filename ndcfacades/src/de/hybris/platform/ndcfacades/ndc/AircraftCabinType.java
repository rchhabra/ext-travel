//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.07 at 04:46:04 PM GMT 
//


package de.hybris.platform.ndcfacades.ndc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * AIRCRAFT CABIN representation.Aircraft Compartment/Class of service as defined in IATA SSIM and AIRIMP (RBD).
 * 
 * Encoding Scheme: PADIS codeset element 9800 - Reservation Booking Designator. 
 * 
 * Examples: 1 (All Cabin Classes), C (Business Class), F (First Class), Y (Coach Economy)
 * 
 * <p>Java class for AircraftCabinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftCabinType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}CodesetType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftCabinType")
@XmlSeeAlso({
    de.hybris.platform.ndcfacades.ndc.SeatAvailabilityRS.Flights.Cabin.class
})
public class AircraftCabinType
    extends CodesetType
{


}
