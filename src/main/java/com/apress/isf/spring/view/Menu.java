package com.apress.isf.spring.view;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.springframework.core.io.Resource;

public class Menu {
	private Resource resource;
	
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public Resource getResource() {
		return resource;
	}
	public void printMenu() throws IOException{
		InputStream inputStream = resource.getInputStream();
		Scanner sc = new Scanner(inputStream);
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
		}
		sc.close();
		inputStream.close();
	}
}
