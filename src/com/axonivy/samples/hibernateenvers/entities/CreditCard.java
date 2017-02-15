package com.axonivy.samples.hibernateenvers.entities;

import org.hibernate.envers.Audited;

/**
 */
@SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name="CreditCard")
@Audited
public class CreditCard extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 537690226731126450L;

  /**
   * Identifier
   */
  @javax.persistence.Id
  @javax.persistence.GeneratedValue
  private java.lang.Integer id;

  /**
   * Gets the field id.
   * @return the value of the field id; may be null.
   */
  public java.lang.Integer getId()
  {
    return id;
  }

  /**
   * Sets the field id.
   * @param _id the new value of the field id.
   */
  public void setId(java.lang.Integer _id)
  {
    id = _id;
  }

  @javax.persistence.Column(length=200)
  private java.lang.String nameOnCard;

  /**
   * Gets the field firstName.
   * @return the value of the field firstName; may be null.
   */
  public java.lang.String getNameOnCard()
  {
    return nameOnCard;
  }

  /**
   * Sets the field firstName.
   * @param _nameOnCard the new value of the field firstName.
   */
  public void setNameOnCard(java.lang.String _nameOnCard)
  {
    nameOnCard = _nameOnCard;
  }

  @javax.persistence.Column(length=30)
  private java.lang.String creditcardType;

  /**
   * Gets the field creditcardType.
   * @return the value of the field creditcardType; may be null.
   */
  public java.lang.String getCreditcardType()
  {
    return creditcardType;
  }

  /**
   * Sets the field creditcardType.
   * @param _creditcardType the new value of the field creditcardType.
   */
  public void setCreditcardType(java.lang.String _creditcardType)
  {
    creditcardType = _creditcardType;
  }

  private java.lang.Integer creditcardValidMonth;

  /**
   * Gets the field creditcardValidMonth.
   * @return the value of the field creditcardValidMonth; may be null.
   */
  public java.lang.Integer getCreditcardValidMonth()
  {
    return creditcardValidMonth;
  }

  /**
   * Sets the field creditcardValidMonth.
   * @param _creditcardValidMonth the new value of the field creditcardValidMonth.
   */
  public void setCreditcardValidMonth(java.lang.Integer _creditcardValidMonth)
  {
    creditcardValidMonth = _creditcardValidMonth;
  }

  private java.lang.Integer creditcardValidYear;

  /**
   * Gets the field creditcardValidYear.
   * @return the value of the field creditcardValidYear; may be null.
   */
  public java.lang.Integer getCreditcardValidYear()
  {
    return creditcardValidYear;
  }

  /**
   * Sets the field creditcardValidYear.
   * @param _creditcardValidYear the new value of the field creditcardValidYear.
   */
  public void setCreditcardValidYear(java.lang.Integer _creditcardValidYear)
  {
    creditcardValidYear = _creditcardValidYear;
  }

  @javax.persistence.Column(length=4)
  private java.lang.String creditcardNumberLast4Digits;

  /**
   * Gets the field creditcardNumberLast4Digits.
   * @return the value of the field creditcardNumberLast4Digits; may be null.
   */
  public java.lang.String getCreditcardNumberLast4Digits()
  {
    return creditcardNumberLast4Digits;
  }

  /**
   * Sets the field creditcardNumberLast4Digits.
   * @param _creditcardNumberLast4Digits the new value of the field creditcardNumberLast4Digits.
   */
  public void setCreditcardNumberLast4Digits(java.lang.String _creditcardNumberLast4Digits)
  {
    creditcardNumberLast4Digits = _creditcardNumberLast4Digits;
  }

  private java.lang.Boolean isActive;

  /**
   * Gets the field isActive.
   * @return the value of the field isActive; may be null.
   */
  public java.lang.Boolean getIsActive()
  {
    return isActive;
  }

  /**
   * Sets the field isActive.
   * @param _isActive the new value of the field isActive.
   */
  public void setIsActive(java.lang.Boolean _isActive)
  {
    isActive = _isActive;
  }

}
