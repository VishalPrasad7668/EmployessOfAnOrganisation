package org.NIIT.main;

import org.NIIT.config.AppConfig;
import org.NIIT.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeImpl {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
