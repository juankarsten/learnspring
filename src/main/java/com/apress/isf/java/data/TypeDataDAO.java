package com.apress.isf.java.data;

import java.util.List;

import com.apress.isf.java.model.Type;

public interface TypeDataDAO {
	public List<Type> getAll();
	public Type findById(String id);
}
