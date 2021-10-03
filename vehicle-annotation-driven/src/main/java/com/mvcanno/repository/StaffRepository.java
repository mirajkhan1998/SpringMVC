package com.mvcanno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mvcanno.entities.Vehicle;

public interface StaffRepository extends JpaRepository<Vehicle, Integer> {

	@Query("select v from Vehicle v where v.vehicleNo=:vehicleNo")
	Vehicle getVehicleByVehicleNo(int vehicleNo);

}
