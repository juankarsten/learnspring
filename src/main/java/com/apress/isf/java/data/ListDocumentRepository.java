package com.apress.isf.java.data;

import java.util.List;

import com.apress.isf.java.model.Document;

public class ListDocumentRepository implements DocumentDAO {

	private List<Document> documents;
	
	@Override
	public List<Document> getAll() {
		return documents;
	}
	
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	public List<Document> getDocuments() {
		return documents;
	}
}
