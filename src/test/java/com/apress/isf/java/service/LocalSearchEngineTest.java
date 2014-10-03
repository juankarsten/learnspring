package com.apress.isf.java.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;

public class LocalSearchEngineTest {
	private SearchEngine localSearchEngine;
	private Type type;
	private ClassPathXmlApplicationContext context;
	
	@Before
	public void setup() {
		context = 
				new ClassPathXmlApplicationContext("META-INF/spring/beancontext.xml");
		localSearchEngine = context.getBean(SearchEngine.class);
		type = context.getBean("webType",Type.class);
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
		Assert.assertEquals(4, documents.size());
		
	}
}
