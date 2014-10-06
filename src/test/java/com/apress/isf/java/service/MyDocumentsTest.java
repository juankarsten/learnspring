package com.apress.isf.java.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDocumentsTest {
	private ClassPathXmlApplicationContext context;
	
	@Before
	public void setUp(){
		context = 
				new ClassPathXmlApplicationContext("META-INF/spring/beanchapter5.xml");
	}
	
	@Test
	public void testMenu() {
		
	}

}
