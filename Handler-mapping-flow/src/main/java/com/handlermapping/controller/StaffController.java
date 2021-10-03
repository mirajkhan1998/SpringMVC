package com.handlermapping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.handlermapping.dto.StaffDto;
import com.handlermapping.service.ManageStaffService;

public class StaffController extends AbstractController {
	private ManageStaffService manageStaffService;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView modelAndView = null;
		List<StaffDto> staffs = null;
		staffs = manageStaffService.getAllStaff();

		modelAndView = new ModelAndView();
		modelAndView.addObject("staffs", staffs);
		modelAndView.setViewName("staffs");

		return modelAndView;
	}

	public void setManageStaffService(ManageStaffService manageStaffService) {
		this.manageStaffService = manageStaffService;
	}

}
