package com.apress.isf.java.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.apress.isf.java.model.Type;

public class TypeDataRepository implements TypeDataDAO {

	private Map<String, Type> types;
	
	public void setTypes(Map<String, Type> types) {
		this.types = types;
	}
	public Map<String, Type> getDatas() {
		return types;
	}
	
	@Override
	public List<Type> getAll() {
		return new ArrayList<Type>(types.values());
	}

	@Override
	public Type findById(String id) {
		return types.get(id);
	}

}
