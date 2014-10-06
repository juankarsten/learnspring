package com.apress.isf.java.service;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import com.apress.isf.spring.view.MenuResourceLoader;

public class MyDocumentsInjectedTest {
	private ClassPathXmlApplicationContext context;
	
	@Before
	public void setUp(){
		context = 
				new ClassPathXmlApplicationContext("META-INF/spring/beanchapter6-resourceloader-injector.xml");
	}
	
	@Test
	public void testMenu() throws IOException {
		MenuResourceLoader menuResourceLoader = context.getBean(MenuResourceLoader.class);
		menuResourceLoader.printMenu("classpath:META-INF/data/menu.txt");
	}

}
