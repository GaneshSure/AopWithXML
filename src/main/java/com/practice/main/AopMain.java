package com.practice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.spring.aop.model.Product;

public class AopMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object obj = ctx.getBean("pimpl");
		Product p = (Product)obj;
		
		System.out.println("====================");
		p.add(10,20 );
		System.out.println("=======================");
		p.multiply(10, 20);
		

	}

}
