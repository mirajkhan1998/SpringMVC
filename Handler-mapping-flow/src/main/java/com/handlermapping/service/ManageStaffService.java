package com.handlermapping.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.handlermapping.dto.StaffDto;
import com.handlermapping.repository.StaffRepository;

public class ManageStaffService {

	private StaffRepository staffRepository;

	public List<StaffDto> getAllStaff() {
		return staffRepository.getAllStaff().stream().map(staff -> {
			StaffDto staffDto = new StaffDto();
			BeanUtils.copyProperties(staff, staffDto);
			return staffDto;
		}).collect(Collectors.toList());

	}

	public void setStaffRepository(StaffRepository staffRepository) {
		this.staffRepository = staffRepository;
	}

}
