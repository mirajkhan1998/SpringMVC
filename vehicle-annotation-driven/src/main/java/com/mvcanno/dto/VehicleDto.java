package com.mvcanno.dto;

import java.util.Date;

public class VehicleDto {

	protected int vehicleNo;
	protected String modelName;
	protected String chasisNo;
	protected double price;
	protected Date registrationDate;

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "VehicleDto [vehicleNo=" + vehicleNo + ", modelName=" + modelName + ", chasisNo=" + chasisNo + ", price="
				+ price + ", registrationDate=" + registrationDate + "]";
	}

}
