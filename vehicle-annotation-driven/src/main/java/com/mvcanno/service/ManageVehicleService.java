package com.mvcanno.service;

import com.mvcanno.dto.VehicleDto;
import com.mvcanno.entities.Vehicle;
import com.mvcanno.repository.StaffRepository;

public class ManageVehicleService {
	private StaffRepository staffRepository;

	public VehicleDto getVehicleByVehicleNo(int vehicleNo) {
		VehicleDto vehicleDto = null;
		Vehicle vehicle = null;
		vehicleDto = new VehicleDto();
		vehicle = staffRepository.getVehicleByVehicleNo(vehicleNo);

		vehicleDto.setChasisNo(vehicle.getChasisNo());
		vehicleDto.setModelName(vehicle.getModelName());
		vehicleDto.setPrice(vehicle.getPrice());
		vehicleDto.setRegistrationDate(vehicle.getRegistrationDate());
		return vehicleDto;

	}

	public void setStaffRepository(StaffRepository staffRepository) {
		this.staffRepository = staffRepository;
	}

}
