package com.example.casestudy.controller;
import com.example.casestudy.service.IDivisionService;
import com.example.casestudy.service.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class EmployeeController {
    @Autowired
    private IDivisionService divisionService;
    @Autowired
    private IEducationDegreeService educationDegreeService;
}
