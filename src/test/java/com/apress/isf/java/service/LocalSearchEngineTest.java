package com.apress.isf.java.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;

public class LocalSearchEngineTest {
	private SearchEngine localSearchEngine = new LocalSearchEngine();
	
	
	@Test
	public void findByType(){
		Type type = new Type();
		type.setName("pdf");
		type.setExtension("pdf");
		type.setDesc("file pdf");
		
		List<Document> documents = localSearchEngine.findByType(type);
		Assert.assertEquals(1, documents.size());
		Assert.assertEquals("Book", documents.get(0).getName());
		
	}
	
	@Test
	public void listAll(){
		Type type = new Type();
		type.setName("pdf");
		type.setExtension("pdf");
		type.setDesc("file pdf");
		
		List<Document> documents = localSearchEngine.findByType(type);
		Assert.assertEquals(1, documents.size());
	}
}
