	package com.example.springdemo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AdminModel {
@Id
private int loanId;
private String loneType;
private String applicationName;
private String applicationAddress;
private String applicationMobile;
private String applicationEmail;
private String applicationAadhar;
private String applicationPan;
private String applicationSalary;
private String loanAmountRequired;
private String loanRepaymentMonths;
public int getLoanId() {
	return loanId;
}
public void setLoanId(int loanId) {
	this.loanId = loanId;
}
public String getLoneType() {
	return loneType;
}
public void setLoneType(String loneType) {
	this.loneType = loneType;
}
public String getApplicationName() {
	return applicationName;
}
public void setApplicationName(String applicationName) {
	this.applicationName = applicationName;
}
public String getApplicationAddress() {
	return applicationAddress;
}
public void setApplicationAddress(String applicationAddress) {
	this.applicationAddress = applicationAddress;
}
public String getApplicationMobile() {
	return applicationMobile;
}
public void setApplicationMobile(String applicationMobile) {
	this.applicationMobile = applicationMobile;
}
public String getApplicationEmail() {
	return applicationEmail;
}
public void setApplicationEmail(String applicationEmail) {
	this.applicationEmail = applicationEmail;
}
public String getApplicationAadhar() {
	return applicationAadhar;
}
public void setApplicationAadhar(String applicationAadhar) {
	this.applicationAadhar = applicationAadhar;
}
public String getApplicationPan() {
	return applicationPan;
}
public void setApplicationPan(String applicationPan) {
	this.applicationPan = applicationPan;
}
public String getApplicationSalary() {
	return applicationSalary;
}
public void setApplicationSalary(String applicationSalary) {
	this.applicationSalary = applicationSalary;
}
public String getLoanAmountRequired() {
	return loanAmountRequired;
}
public void setLoanAmountRequired(String loanAmountRequired) {
	this.loanAmountRequired = loanAmountRequired;
}
public String getLoanRepaymentMonths() {
	return loanRepaymentMonths;
}
public void setLoanRepaymentMonths(String loanRepaymentMonths) {
	this.loanRepaymentMonths = loanRepaymentMonths;
}

}
