package com.handlermapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.handlermapping.entities.Staff;
public interface StaffRepository extends JpaRepository<Staff, Integer> {

	@Query("select s from Staff s")
	List<Staff> getAllStaff();

}
