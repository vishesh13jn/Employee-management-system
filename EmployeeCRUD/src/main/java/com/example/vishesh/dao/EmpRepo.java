package com.example.vishesh.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.vishesh.model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
