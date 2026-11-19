package com.claimguard.service;

import com.claimguard.dto.PatientRequest;
import com.claimguard.dto.PatientResponse;
import com.claimguard.entity.Patient;
import com.claimguard.repository.PatientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
    // declare dependency => this service class needs PatientRepository

    private final PatientRepository patientRepository;
// constructor dependency injection

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public PatientResponse create(PatientRequest request){
        // create pateint object everytime new date comes
        Patient patient=new Patient();
        patient.setName(request.name());
        patient.setDob(request.dob());
        patient.setGender(request.gender());
        Patient saved=patientRepository.save(patient);
        return toResponse(saved);
    }

    public List<PatientResponse> getAll(){
        List<Patient> patients=patientRepository.findAll();
        List<PatientResponse> response=new ArrayList<>();
                for(Patient patient:patients){
                    response.add(toResponse(patient));
        }
                return response;

    }

    public PatientResponse getById(Long id){
        return toResponse(findOrThrow(id));
    }
    public PatientResponse update(Long id, PatientRequest request){
        Patient patient=findOrThrow(id);
        patient.setName((request.name()));
        patient.setGender(request.gender());
        patient.setDob(request.dob());
        return toResponse(patientRepository.save(patient));

    }

    private Patient findOrThrow(Long id){
        return patientRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Patient not found with id "+ id
                        ));
    }

    private PatientResponse toResponse(Patient p) {
        return new PatientResponse(p.getId(),p.getName(),p.getDob(),p.getAge(),p.getGender())
    }


}
