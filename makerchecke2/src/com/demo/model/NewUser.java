package com.demo.model;

public class NewUser {

	//private int customerId ;
	private	String customerCode ;
	private String customerName ;
	private String customerAddress1;
	private String customerAddress2;
	private String customerPinCode ;
   private String emailaddress;
	private String contactNumber ;
	private String primaryContactPerson ;
	private String recordStatus; 
	private String activeInactiveFlag;
	private String createDate;
	private String createdBy ;
	private String modifiedDate;
	private String modifiedBy ;
	private String authorizedDate;
	private String authorizedBy ;
	/**
	 * @return the customerCode
	 */
	public String getCustomerCode() {
		return customerCode;
	}
	/**
	 * @param customerCode the customerCode to set
	 */
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerAddress1
	 */
	public String getCustomerAddress1() {
		return customerAddress1;
	}
	/**
	 * @param customerAddress1 the customerAddress1 to set
	 */
	public void setCustomerAddress1(String customerAddress1) {
		this.customerAddress1 = customerAddress1;
	}
	/**
	 * @return the customerAddress2
	 */
	public String getCustomerAddress2() {
		return customerAddress2;
	}
	/**
	 * @param customerAddress2 the customerAddress2 to set
	 */
	public void setCustomerAddress2(String customerAddress2) {
		this.customerAddress2 = customerAddress2;
	}
	/**
	 * @return the customerPinCode
	 */
	public String getCustomerPinCode() {
		return customerPinCode;
	}
	/**
	 * @param customerPinCode the customerPinCode to set
	 */
	public void setCustomerPinCode(String customerPinCode) {
		this.customerPinCode = customerPinCode;
	}
	/**
	 * @return the emailaddress
	 */
	public String getEmailaddress() {
		return emailaddress;
	}
	/**
	 * @param emailaddress the emailaddress to set
	 */
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}
	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	/**
	 * @return the primaryContactPerson
	 */
	public String getPrimaryContactPerson() {
		return primaryContactPerson;
	}
	/**
	 * @param primaryContactPerson the primaryContactPerson to set
	 */
	public void setPrimaryContactPerson(String primaryContactPerson) {
		this.primaryContactPerson = primaryContactPerson;
	}
	/**
	 * @return the recordStatus
	 */
	public String getRecordStatus() {
		return recordStatus;
	}
	/**
	 * @param recordStatus the recordStatus to set
	 */
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}
	/**
	 * @return the activeInactiveFlag
	 */
	public String getActiveInactiveFlag() {
		return activeInactiveFlag;
	}
	/**
	 * @param activeInactiveFlag the activeInactiveFlag to set
	 */
	public void setActiveInactiveFlag(String activeInactiveFlag) {
		this.activeInactiveFlag = activeInactiveFlag;
	}
	/**
	 * @return the createDate
	 */
	public String getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the modifiedDate
	 */
	public String getModifiedDate() {
		return modifiedDate;
	}
	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	/**
	 * @return the modifiedBy
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}
	/**
	 * @param modifiedBy the modifiedBy to set
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	/**
	 * @return the authorizedDate
	 */
	public String getAuthorizedDate() {
		return authorizedDate;
	}
	/**
	 * @param authorizedDate the authorizedDate to set
	 */
	public void setAuthorizedDate(String authorizedDate) {
		this.authorizedDate = authorizedDate;
	}
	/**
	 * @return the authorizedBy
	 */
	public String getAuthorizedBy() {
		return authorizedBy;
	}
	/**
	 * @param authorizedBy the authorizedBy to set
	 */
	public void setAuthorizedBy(String authorizedBy) {
		this.authorizedBy = authorizedBy;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NewUser [customerCode=" + customerCode + ", customerName=" + customerName + ", customerAddress1="
				+ customerAddress1 + ", customerAddress2=" + customerAddress2 + ", customerPinCode=" + customerPinCode
				+ ", emailaddress=" + emailaddress + ", contactNumber=" + contactNumber + ", primaryContactPerson="
				+ primaryContactPerson + ", recordStatus=" + recordStatus + ", activeInactiveFlag=" + activeInactiveFlag
				+ ", createDate=" + createDate + ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate
				+ ", modifiedBy=" + modifiedBy + ", authorizedDate=" + authorizedDate + ", authorizedBy=" + authorizedBy
				+ "]";
	}
	
	
}	