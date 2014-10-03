package com.apress.isf.java.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;
import com.apress.isf.spring.config.MyDocumentContext;

public class LocalSearchEngineTest {
	private SearchEngine localSearchEngine;
	private Type type;
	private AnnotationConfigApplicationContext context;
	
	@Before
	public void setup() {
//		context = 
//				new ClassPathXmlApplicationContext("META-INF/spring/beancontext.xml");
		context = new AnnotationConfigApplicationContext(MyDocumentContext.class);
		localSearchEngine = context.getBean(SearchEngine.class);
		type = context.getBean(Type.class);
	}
	
	@Test
	public void findByType(){
		
		
		Type type = this.type;
		
		List<Document> documents = localSearchEngine.findByType(type);
		Assert.assertEquals(1, documents.size());
		Assert.assertEquals("Pro Spring Security Book", documents.get(0).getName());
		
	}
	
	@Test
	public void listAll(){
		
		List<Document> documents = localSearchEngine.listAll();
		System.out.println(documents.size());
		Assert.assertEquals(4, documents.size());
		
	}
}
