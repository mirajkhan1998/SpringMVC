package com.vehicle.controller;

import java.util.List;

import org.springframework.ui.Model;

import com.controller.service.ManageVehicleService;
import com.vehicle.dto.VehicleDto;

public class VehicleController {
	private ManageVehicleService manageVehicleService;

	public String getVehicle(Model model) {
		List<VehicleDto> vehicleDto = null;
		vehicleDto = manageVehicleService.getAllVehicle();
		return null;

	}

	public void setManageVehicleService(ManageVehicleService manageVehicleService) {
		this.manageVehicleService = manageVehicleService;
	}

}
