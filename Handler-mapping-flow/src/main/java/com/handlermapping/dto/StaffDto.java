package com.handlermapping.dto;

public class StaffDto {

	protected int staffNo;
	protected String staffName;
	protected String gender;
	protected String emailAddress;
	protected String mobileNo;
	protected int age;

	public int getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StaffDto [staffNo=" + staffNo + ", staffName=" + staffName + ", gender=" + gender + ", emailAddress="
				+ emailAddress + ", mobileNo=" + mobileNo + ", age=" + age + "]";
	}

}
