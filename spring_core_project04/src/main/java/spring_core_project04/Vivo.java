package spring_core_project04;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Vivo implements Mobile {
       @Override
    public void ring() {
    	System.out.println("vivo is Ringing");
    	
    }
}
