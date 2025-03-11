package spring_core_proj3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Passenger {
	@Autowired
	Ticket ticket;
	
	void details() {
		System.out.println("passenger is traveling");
		ticket.ticketBooked();
	}

}
