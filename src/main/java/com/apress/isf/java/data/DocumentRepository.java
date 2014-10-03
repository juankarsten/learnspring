package com.apress.isf.java.data;

import java.util.ArrayList;
import java.util.List;

import com.apress.isf.java.model.Document;

public class DocumentRepository implements DocumentDAO {
	private Document doc1, doc2, doc3, doc4;
	
	public void setDoc1(Document doc1) {
		this.doc1 = doc1;
	}
	public void setDoc2(Document doc2) {
		this.doc2 = doc2;
	}
	public void setDoc3(Document doc3) {
		this.doc3 = doc3;
	}
	public void setDoc4(Document doc4) {
		this.doc4 = doc4;
	}
	public Document getDoc1() {
		return doc1;
	}
	public Document getDoc2() {
		return doc2;
	}
	public Document getDoc3() {
		return doc3;
	}
	public Document getDoc4() {
		return doc4;
	}
	
	
	@Override
	public List<Document> getAll() {
		List<Document> documents = new ArrayList<Document>();
		documents.add(doc1);
		documents.add(doc2);
		documents.add(doc3);
		documents.add(doc4);
		return documents;
	}

}
