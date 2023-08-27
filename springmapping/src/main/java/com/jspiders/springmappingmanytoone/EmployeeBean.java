package com.jspiders.springmappingmanytoone;

import lombok.Data;

@Data
public class EmployeeBean {
	
	private int id;
	private String name;
	private int age;
	private CompanyBean company;
	

}
