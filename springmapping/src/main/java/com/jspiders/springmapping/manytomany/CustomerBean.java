package com.jspiders.springmapping.manytomany;

import java.util.List;

import lombok.Data;

@Data
public class CustomerBean {
	
	private int id;
	private String name;
	private String city;
	private List<ProductBean>products;

}
