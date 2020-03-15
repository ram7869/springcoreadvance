package com.balram.springcoreadvance.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/balram/springcoreadvance/autowire/config.xml");
		
    Employee bean = applicationContext.getBean("emp", Employee.class);
    System.out.println(bean.getAddress());
		

	}

}
