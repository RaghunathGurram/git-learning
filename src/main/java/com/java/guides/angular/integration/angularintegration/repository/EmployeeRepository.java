package com.java.guides.angular.integration.angularintegration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.guides.angular.integration.angularintegration.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
