package com.collabera.enroleesservice.service;

import com.collabera.enroleesservice.model.Enrollee;
import com.collabera.enroleesservice.repository.EnrolleeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrolleeServiceImpl implements EnrolleeService {

    @Autowired
    EnrolleeRepository enrolleeRepository;
    @Override
    public Enrollee saveEnrollee(Enrollee enrollee) {
        return enrolleeRepository.save(enrollee);
    }

    @Override
    public Enrollee updateEnrolleeById(Enrollee enrollee) {

        return enrolleeRepository.save(enrollee);
    }

    @Override
    public List<Enrollee> findAllEnrolees() {
        return enrolleeRepository.findAll();
    }

    @Override
    public void removeEnrolee(Enrollee enrollee) {
        enrolleeRepository.delete(enrollee);
    }
}
