package com.apress.isf.java.service;

import java.util.List;

import com.apress.isf.java.data.DocumentDAO;
import com.apress.isf.java.model.Document;
import com.apress.isf.java.model.Type;

public interface SearchEngine {
	public List<Document> findByType(Type type);
	public List<Document> listAll();
	public void setDocumentDAO(DocumentDAO documentDAO);
	public DocumentDAO getDocumentDAO();
}
