package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("app-context.xml");
		Employee employee=new Employee();
		employee.setName("rajeev");
		employee.setId(1);
		EmployeeDAO employeeDAO=new EmployeeDAO();
		employeeDAO.saveEmployee(employee);
	}
}
