package com.example.JPASample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    // Service injecten

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable String id) {
        // Im Service die Methode findEmployeeById aufrufen und gefundenen Employee zurück geben.

        return null;
    }

}
