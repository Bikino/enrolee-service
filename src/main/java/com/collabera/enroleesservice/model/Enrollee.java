package com.collabera.enroleesservice.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;
import java.time.LocalDate;
import java.util.List;

@Document()
public class Enrollee {
    @Id
    private Integer id;

    private String name;

    private Boolean status;

    private LocalDate birthDate;

    private String phoneNumber;

    private List<Dependent> listDependents;

    public Enrollee() {
    }

    public Enrollee(Integer id, String name, Boolean status, LocalDate birthDate, String phoneNumber, List<Dependent> listDependents) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.listDependents = listDependents;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Dependent> getListDependents() {
        return listDependents;
    }

    public void setListDependents(List<Dependent> listDependents) {
        this.listDependents = listDependents;
    }
}
