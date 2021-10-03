package com.student.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.StudentDto;
import com.student.entity.Student;
import com.student.service.ManageStudentService;

@RestController
@RequestMapping("/student")
public class StudentConroller {
	@Autowired
	private ManageStudentService manageStudentService;

	@GetMapping(value = { "/studentInfo/{studentId}" }, produces = { "application/json" })
	public ResponseEntity<Student> displayStudent(@PathVariable("studentId") int studentId) {
		Student student = null;
		StudentDto dto = manageStudentService.getStudentById(studentId);
		student = new Student();
		BeanUtils.copyProperties(dto, student);

		return ResponseEntity.ok(student);

	}

	public void setManageStudentService(ManageStudentService manageStudentService) {
		this.manageStudentService = manageStudentService;
	}

}
