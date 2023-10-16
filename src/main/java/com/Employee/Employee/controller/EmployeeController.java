package com.Employee.Employee.controller;

import com.Employee.Employee.entity.Employee;
import com.Employee.Employee.repo.EmployeeRepo;
import com.Employee.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

        @GetMapping("/get")
        public ResponseEntity<List<Employee>> getAllEmployee(){

            List<Employee> allEmployeeFromDataBase = employeeService.findAllEmployeeFromDataBase();
            return  new ResponseEntity<>(allEmployeeFromDataBase, HttpStatus.OK);
    }

    @GetMapping("/getByDep")
    public ResponseEntity<List<Employee>> findByDepartmentName(@RequestParam String department){

        List<Employee> allEmployeeBasedOnDepartment = employeeService.findByDepartment(department);
        return  new ResponseEntity<>(allEmployeeBasedOnDepartment, HttpStatus.OK);
    }
}
