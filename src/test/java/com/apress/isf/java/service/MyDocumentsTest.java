package com.apress.isf.java.service;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class MyDocumentsTest {
	private ClassPathXmlApplicationContext context;
	
	@Before
	public void setUp(){
		context = 
				new ClassPathXmlApplicationContext("META-INF/spring/beanchapter5.xml");
	}
	
	@Test
	public void testMenu() throws IOException {
		Resource resource = context.getResource("classpath:META-INF/data/menu.txt");
		InputStream inputStream = resource.getInputStream();
		Scanner sc = new Scanner(inputStream);
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
		}
		sc.close();
		inputStream.close();
	}

}
