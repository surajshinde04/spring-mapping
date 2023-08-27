package com.jspiders.springmapping.onetoone;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HusbandWifeMain {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("HusbandWifeConfig.xml");
		HusbandBean husband1 = context.getBean(HusbandBean.class);
		System.out.println(husband1);
		((ClassPathXmlApplicationContext)context).close();
	}


}
