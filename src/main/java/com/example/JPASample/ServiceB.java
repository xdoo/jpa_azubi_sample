package com.example.JPASample;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceB {

    private final EmployeeRepository repo;

    public ServiceB(EmployeeRepository repo) {
        this.repo = repo;
    }

    /**
     * Legt Hans an und findet ihn wieder. Oder auch nicht.
     *
     * @param id
     * @return
     * @throws Exception
     */
    public Employee findEmployeeById(String id) throws Exception {
        // HACK
        Employee hans = new Employee("4711E", "Hans");
        this.repo.save(hans);

        // Employee finden
        Optional<Employee> oEmployee = this.repo.findById(id);

        if(oEmployee.isPresent()) {
            return oEmployee.get();
        } else {
            throw new Exception();
        }
    }
}
