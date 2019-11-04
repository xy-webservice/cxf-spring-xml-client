package com.xywei.webservice.test.client;

import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.xywei.webservice.service.Student;
import com.xywei.webservice.service.StudentService;

public class TestClientCode {

	public static void main(String[] args) {

		// 代理工厂
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();

		// 设置代理工厂address，interface
		jaxWsProxyFactoryBean.setAddress("http://127.0.0.1:8880/cxf-spring-xml-server/ws/student");
		jaxWsProxyFactoryBean.setServiceClass(StudentService.class);

		// 创建实例
		StudentService studentService = (StudentService) jaxWsProxyFactoryBean.create();

		// 调用
		Student student = studentService.findById();
		System.out.println(student);

		List<Student> students = studentService.findByIdAndAge("a", 23);
		System.out.println(students);
	}
}
