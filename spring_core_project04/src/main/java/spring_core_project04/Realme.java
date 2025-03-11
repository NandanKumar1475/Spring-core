package spring_core_project04;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Realme implements Mobile {
	@Override
	public void ring() {
		System.out.println("Realme is Ringing");

	}

}
