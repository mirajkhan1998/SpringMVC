package com.controller.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.vehicle.dto.VehicleDto;
import com.vehicle.repositories.VehicleRepository;

public class ManageVehicleService {

	private VehicleRepository vehicleRepository;

	public List<VehicleDto> getAllVehicle() {
		return vehicleRepository.getVehicle().stream().map(vehicle -> {
			VehicleDto dto = new VehicleDto();
			BeanUtils.copyProperties(vehicle, dto);
			return dto;
		}).collect(Collectors.toList());

	}

	public void setVehicleRepository(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}

}
