package com.mvcanno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvcanno.service.ManageVehicleService;

@Controller
@RequestMapping("/vehicle.action")
public class StaffController {

	private ManageVehicleService manageVehicleService;

}
