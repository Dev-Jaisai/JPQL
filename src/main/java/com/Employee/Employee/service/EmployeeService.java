package com.Employee.Employee.service;

import com.Employee.Employee.entity.Employee;
import com.Employee.Employee.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;


    public List<Employee> findAllEmployeeFromDataBase(){
        List<Employee> allEmployee = employeeRepo.findAllEmployee();
        return allEmployee;
    }


    public List<Employee> findByDepartment(String departmentName){
        List<Employee> allEmployee = employeeRepo.findByDepartment(departmentName);
        return allEmployee;
    }


}
