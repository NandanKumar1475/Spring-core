package org.jsp.student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("configuration.xml");
		Student stu = bf.getBean("mystudent",Student.class);
		System.out.println(stu.getName());
		System.out.println(stu);
	}

}
