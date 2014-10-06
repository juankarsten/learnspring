package com.apress.isf.spring.view;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class MenuResourceLoader {
	@Autowired
	private ResourceLoader resourceLoader;

	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
	public ResourceLoader getResourceLoader() {
		return resourceLoader;
	}
	public void printMenu(String location) throws IOException{
		InputStream inputStream = resourceLoader.getResource(location)
				.getInputStream();
		Scanner sc = new Scanner(inputStream);
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
		}
		sc.close();
		inputStream.close();
	}
}
