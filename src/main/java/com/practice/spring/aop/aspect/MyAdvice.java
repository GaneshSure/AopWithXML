package com.practice.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class MyAdvice {
	
	public void before(JoinPoint jp) {
		
	String methodName = jp.getSignature().getName();
	Object args[] =jp.getArgs();
	System.out.println(" I am befor advice to :" + methodName);
	System.out.println("it's arguments values are :" + args[0]+","+args[1]);
		
	}
	
	public void afterReturning(JoinPoint jp, Object result) {
		String methodName = jp.getSignature().getName();
		Object obj[] = jp.getArgs();
		System.out.println("I am after returning advive to :" +methodName);
		System.out.println("it's arguments values are :" + obj[0]+","+obj[1]);
		System.out.println(" The result of this method is :"+ result);
	}

}
