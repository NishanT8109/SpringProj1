// SpringI18nTest.java
package com.nt.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {
	public static void main(String[] args) {
		// Create IOC container
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
	// Read inputs
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter language code");
		String langcode=sc.next();
		
		System.out.println("Enter Country code");
		String CountryCode=sc.next();
		
		// Create Locale Object having language	and country
		Locale locale=new Locale(langcode,CountryCode);
		
		//GET message from locale specific properties file
		String msg=ctx.getMessage("wish.message", new Object[] {}, locale);
		System.out.println("Wish Message is :: "+msg);
		ctx.close();
	
	}

}
