package com.practice.spring.aop.model;

public class ProductImpl implements Product {

	@Override
	public void add(int x, int y) {
		System.out.println("Addition = " +(x=y));
		
	}

	@Override
	public int multiply(int x, int y) {

		return (x*y);
	}

}
