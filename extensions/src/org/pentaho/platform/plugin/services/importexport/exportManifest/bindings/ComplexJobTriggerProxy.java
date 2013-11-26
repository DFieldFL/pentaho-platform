/*
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License, version 2 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/gpl-2.0.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 *
 * Copyright 2006 - 2013 Pentaho Corporation.  All rights reserved.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.25 at 11:25:28 AM EDT 
//

package org.pentaho.platform.plugin.services.importexport.exportManifest.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

/**
 * <p/>
 * Java class for complexJobTriggerProxy complex type.
 * <p/>
 * <p/>
 * The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="complexJobTriggerProxy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cronString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="daysOfMonth" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"
 * minOccurs="0"/>
 *         &lt;element name="daysOfWeek" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"
 * minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="monthsOfYear" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"
 * minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="uiPassParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weeksOfMonth" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"
 * minOccurs="0"/>
 *         &lt;element name="years" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlType( name = "complexJobTriggerProxy", propOrder = { "cronString", "daysOfMonth", "daysOfWeek", "endTime",
    "monthsOfYear", "startTime", "uiPassParam", "weeksOfMonth", "years" } )
public class ComplexJobTriggerProxy {

  protected String cronString;
  @XmlElement( nillable = true )
  protected List<Integer> daysOfMonth;
  @XmlElement( nillable = true )
  protected List<Integer> daysOfWeek;
  @XmlSchemaType( name = "dateTime" )
  protected XMLGregorianCalendar endTime;
  @XmlElement( nillable = true )
  protected List<Integer> monthsOfYear;
  @XmlSchemaType( name = "dateTime" )
  protected XMLGregorianCalendar startTime;
  protected String uiPassParam;
  @XmlElement( nillable = true )
  protected List<Integer> weeksOfMonth;
  @XmlElement( nillable = true )
  protected List<Integer> years;

  /**
   * Gets the value of the cronString property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCronString() {
    return cronString;
  }

  /**
   * Sets the value of the cronString property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setCronString( String value ) {
    this.cronString = value;
  }

  /**
   * Gets the value of the daysOfMonth property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the daysOfMonth property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getDaysOfMonth().add( newItem );
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Integer }
   * 
   * 
   */
  public List<Integer> getDaysOfMonth() {
    if ( daysOfMonth == null ) {
      daysOfMonth = new ArrayList<Integer>();
    }
    return this.daysOfMonth;
  }

  /**
   * Gets the value of the daysOfWeek property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the daysOfWeek property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getDaysOfWeek().add( newItem );
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Integer }
   * 
   * 
   */
  public List<Integer> getDaysOfWeek() {
    if ( daysOfWeek == null ) {
      daysOfWeek = new ArrayList<Integer>();
    }
    return this.daysOfWeek;
  }

  /**
   * Gets the value of the endTime property.
   * 
   * @return possible object is {@link XMLGregorianCalendar }
   * 
   */
  public XMLGregorianCalendar getEndTime() {
    return endTime;
  }

  /**
   * Sets the value of the endTime property.
   * 
   * @param value
   *          allowed object is {@link XMLGregorianCalendar }
   * 
   */
  public void setEndTime( XMLGregorianCalendar value ) {
    this.endTime = value;
  }

  /**
   * Gets the value of the monthsOfYear property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the monthsOfYear property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getMonthsOfYear().add( newItem );
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Integer }
   * 
   * 
   */
  public List<Integer> getMonthsOfYear() {
    if ( monthsOfYear == null ) {
      monthsOfYear = new ArrayList<Integer>();
    }
    return this.monthsOfYear;
  }

  /**
   * Gets the value of the startTime property.
   * 
   * @return possible object is {@link XMLGregorianCalendar }
   * 
   */
  public XMLGregorianCalendar getStartTime() {
    return startTime;
  }

  /**
   * Sets the value of the startTime property.
   * 
   * @param value
   *          allowed object is {@link XMLGregorianCalendar }
   * 
   */
  public void setStartTime( XMLGregorianCalendar value ) {
    this.startTime = value;
  }

  /**
   * Gets the value of the uiPassParam property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getUiPassParam() {
    return uiPassParam;
  }

  /**
   * Sets the value of the uiPassParam property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setUiPassParam( String value ) {
    this.uiPassParam = value;
  }

  /**
   * Gets the value of the weeksOfMonth property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the weeksOfMonth property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getWeeksOfMonth().add( newItem );
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Integer }
   * 
   * 
   */
  public List<Integer> getWeeksOfMonth() {
    if ( weeksOfMonth == null ) {
      weeksOfMonth = new ArrayList<Integer>();
    }
    return this.weeksOfMonth;
  }

  /**
   * Gets the value of the years property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the years property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getYears().add( newItem );
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Integer }
   * 
   * 
   */
  public List<Integer> getYears() {
    if ( years == null ) {
      years = new ArrayList<Integer>();
    }
    return this.years;
  }

}
