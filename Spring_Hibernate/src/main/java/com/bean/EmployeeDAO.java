package com.bean;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDAO {
	HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void saveEmployee(Employee employee){
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		hibernateTemplate.save(employee);
	}
	
	public void updateEmployee(Employee employee){
		hibernateTemplate.update(employee);
	}
}
