package com.firsov.spring.springboot.dao;





import com.firsov.spring.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
