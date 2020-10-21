package com.collabera.enroleesservice.service;

import com.collabera.enroleesservice.model.Enrollee;

import java.util.List;

public interface EnrolleeService {
    Enrollee saveEnrollee(Enrollee enrollee);
    Enrollee updateEnrolleeById(Enrollee enrollee);
    List<Enrollee> findAllEnrolees();
    public void removeEnrolee(Enrollee enrollee);
}
