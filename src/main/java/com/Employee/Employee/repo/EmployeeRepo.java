package com.Employee.Employee.repo;

import com.Employee.Employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {


    @Query("SELECT e FROM Employee e")
    List<Employee> findAllEmployee();

    @Query("SELECT e FROM Employee e WHERE e.department=:dept")
    List <Employee> findByDepartment(@Param("dept") String department);
}
