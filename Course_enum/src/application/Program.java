//Exemplo de enum
package application;

import java.util.Date;

import entities.Order;
import entities.enums.OderStatus;

public class Program {

	public static void main(String[] args) {
	   
		
		Order order = new Order(1080, new Date(), OderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
	}

}
