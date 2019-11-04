package com.xywei.webservice.test.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xywei.webservice.service.StudentService;

public class TestClientSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		StudentService studentService = (StudentService) applicationContext.getBean("webServiceClient");
		System.out.println(studentService.findById());
		System.out.println(studentService.findByIdAndAge("aa", 3));

		applicationContext.close();
	}

}
