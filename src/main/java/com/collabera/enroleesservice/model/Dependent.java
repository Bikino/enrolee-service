package com.collabera.enroleesservice.model;

import com.sun.javafx.beans.IDProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collation = "dependent")
public class Dependent {
    @Id
    private Integer id;
    private String name;
    private LocalDate birthDate;
}
