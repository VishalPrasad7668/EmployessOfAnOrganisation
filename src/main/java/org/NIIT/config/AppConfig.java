package org.NIIT.config;

import org.NIIT.domain.Department;
import org.NIIT.domain.Employee;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("employee")
    public Employee getEmployeeDetails() {
        Employee employee = new Employee();
        employee.setEmpId(9);
        employee.setEmpName("Ramanujan Rathore");
        employee.setEmpAddress("Gurugram");
        employee.setEmpSalary(500000.0);
        return employee;
    }

    @Bean
    public Department getDepartment() {
        return new Department(2, "Consultancy");
    }


}
