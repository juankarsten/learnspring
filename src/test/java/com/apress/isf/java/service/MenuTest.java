package com.apress.isf.java.service;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apress.isf.spring.view.Menu;

public class MenuTest {
	private ClassPathXmlApplicationContext context;
	
	@Before
	public void setUp(){
		context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/beanchapter6.xml");
	}
	
	@Test
	public void testPrintMenu() throws IOException {
		Menu menu = context.getBean(Menu.class);
		menu.printMenu();
	}

}
