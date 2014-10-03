package com.apress.isf.java.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.apress.isf.java.data.DocumentDAO;
import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;

public class LocalSearchEngine implements SearchEngine{
	private DocumentDAO documentDAO;
	
	private static final Logger log = 
			LoggerFactory.getLogger(LocalSearchEngine.class);
	
	public LocalSearchEngine() {
		if(log.isDebugEnabled())
			log.debug("create"+this);
	}
	
	public void setDocumentDAO(DocumentDAO documentDAO) {
		if(log.isDebugEnabled())
			log.debug("create dao"+documentDAO);
		this.documentDAO = documentDAO;
	}
	public DocumentDAO getDocumentDAO() {
		return documentDAO;
	}
	
	@Override
	public List<Document> findByType(Type type) {
		List<Document> result = new ArrayList<Document>();
		List<Document> list = listAll();
		for(Document document : list){
			if(document.getType().getName().equals(type.getName())){
				result.add(document);
			}
		}
		return result;
	}

	@Override
	public List<Document> listAll() {
		return getDocumentDAO().getAll();
	}

}
