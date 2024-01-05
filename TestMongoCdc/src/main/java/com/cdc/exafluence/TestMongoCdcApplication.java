package com.cdc.exafluence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestMongoCdcApplication {
	
	@Autowired
	private TestRepository repository;

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(TestMongoCdcApplication.class, args);
		
		
		
		TestMongoCdcApplication bean = run.getBean(TestMongoCdcApplication.class);
		bean.insert();
		
		
	}
	
	public void insert()
	{
		Test test = new Test();
		test.setName("lokesh");
		test.setRoll(229);
		
		repository.save(test);
	}

}
