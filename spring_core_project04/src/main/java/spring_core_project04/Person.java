package spring_core_project04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	@Qualifier(value = "realme")
	Mobile mobile;
	void details() {
		System.out.println("Person phone Details");
		mobile.ring();
	}

}
