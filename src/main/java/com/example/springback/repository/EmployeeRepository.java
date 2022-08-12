package com.example.springback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springback.model.Employee;

@Repository
// Is an interface that extends JPARepository for CRUD <Table, PK type>
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
