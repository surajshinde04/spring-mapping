package com.jspiders.springmapping.onetomany;

import java.util.List;

import lombok.Data;

@Data
public class FatherBean {

	private int id;
	private String  name;
	private int age;
	private List<ChildBean> children;

}
