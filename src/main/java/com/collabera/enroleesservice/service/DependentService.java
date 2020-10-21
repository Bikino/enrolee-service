package com.collabera.enroleesservice.service;

import com.collabera.enroleesservice.model.Dependent;

public interface DependentService {

    void addDependant(Dependent dependent);
    void removeDependentById(Integer id);
    void updateExistingDependent(Dependent dependent);

}
