package com.mybean;

public class Customer {
	private String customerName;
	private String emailId;
	private String mobileNo;
	private String service_plan;
	
	public Customer() {}
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getService_plan() {
		return service_plan;
	}
	public void setService_plan(String service_plan) {
		this.service_plan = service_plan;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", emailId=" + emailId + ", mobileNo=" + mobileNo
				+ ", service_plan=" + service_plan + "]";
	}
	public Customer(String customerName, String emailId, String mobileNo, String service_plan) {
		super();
		this.customerName = customerName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.service_plan = service_plan;
	}
	
}