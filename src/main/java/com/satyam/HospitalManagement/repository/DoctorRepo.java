package com.satyam.HospitalManagement.repository;

import com.satyam.HospitalManagement.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorRepo extends JpaRepository<Doctor,Integer> {
    Doctor findByEmail(String email);

    Doctor findByPhone(String phoneNumber);

    @Query(value = "SELECT d.doc_name FROM Doctor d WHERE d.speciality = ?1",nativeQuery = true)
    List<String> findBySpeciality(String speciality);
}
