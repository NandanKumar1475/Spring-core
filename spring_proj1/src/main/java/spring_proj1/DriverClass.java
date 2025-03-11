package spring_proj1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	public static void main(String[] args) {
		BeanFactory beanfact = new ClassPathXmlApplicationContext("configuration.xml");
		Employee emp = (Employee)beanfact.getBean("myemployee");
		System.out.println(emp);
	}

}
