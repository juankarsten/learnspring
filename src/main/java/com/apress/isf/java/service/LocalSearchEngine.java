package com.apress.isf.java.service;

import java.util.ArrayList;
import java.util.List;

import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;

public class LocalSearchEngine implements SearchEngine{

	@Override
	public List<Document> findByType(Type type) {
		List<Document> result = new ArrayList<Document>();
		List<Document> list = storage();
		for(Document document : list){
			if(document.getType().getName().equals(type.getName())){
				result.add(document);
			}
		}
		return result;
	}

	@Override
	public List<Document> listAll() {
		return storage();
	}

	private List<Document> storage(){
		Type type = new Type();
		type.setName("pdf");
		type.setExtension("pdf");
		type.setDesc("file pdf");
		
		Document document = new Document();
		document.setName("Book");
		document.setType(type);
		document.setLocation("/book/Document");
		
		List<Document> list = new ArrayList<Document>();
		list.add(document);
		
		return list;
	}
}
