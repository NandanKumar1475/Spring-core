package spring_core_proj3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
		Passenger ps = context.getBean("passenger",Passenger.class);
		ps.details();
	}

}
