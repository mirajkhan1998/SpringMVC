package com.student.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dto.StudentDto;
import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class ManageStudentService {
    @Autowired
	private StudentRepository repository;

	public StudentDto getStudentById(int studentId) {

		Student student = null;
		StudentDto studentDto = null;
		student = repository.getStudentById(studentId);
		studentDto = new StudentDto();
		System.out.println(student);

		BeanUtils.copyProperties(student, studentDto);

		return studentDto;
	}

	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}

}
