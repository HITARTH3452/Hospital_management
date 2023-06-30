package com.satyam.HospitalManagement.controller;

import com.satyam.HospitalManagement.model.Patient;
import com.satyam.HospitalManagement.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping
    public ResponseEntity<String> addPatient(@Valid @RequestBody Patient patient){
        return patientService.addPatient(patient);
    }

    @GetMapping("/doctor/{patientId}")
    public String suggestDoctor(@PathVariable Long patientId){
        return patientService.suggestDoctor(patientId);
    }
}

