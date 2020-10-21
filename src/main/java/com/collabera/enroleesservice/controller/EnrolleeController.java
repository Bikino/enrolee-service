package com.collabera.enroleesservice.controller;

import com.collabera.enroleesservice.model.Enrollee;
import com.collabera.enroleesservice.service.EnrolleeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api")
public class EnrolleeController {

    @Autowired
    EnrolleeService enrolleeService;

    @GetMapping("/enrollee")
    public List<Enrollee> getAllEnrollee(){
        return enrolleeService.findAllEnrolees();
    }
    @PostMapping("/enrollee")
    public Enrollee createEnrollee(@RequestBody Enrollee enrollee){
        return  enrolleeService.saveEnrollee(enrollee);
    }

    @PutMapping("/update/enrollee/{id}")
    public Enrollee updateEnrollee(@PathVariable Integer id){
        return new Enrollee();
    }

//    @DeleteMapping("/delete/enrolle/{id}")
//    public void removeEnrollee(@PathVariable Integer id){
//        enrolleeService.fi
//        enrolleeService.removeEnrolee();
//    }


}
