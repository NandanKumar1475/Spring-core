package spring_core_project04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		Person ps = context.getBean("person",Person.class);
		ps.details();
	}

}
