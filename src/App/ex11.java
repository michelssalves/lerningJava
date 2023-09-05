package App;

import java.util.Date;

import Classes.Order;
import Enum.OrderStatus;

public class ex11 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order);
		OrderStatus os1 = OrderStatus.PROCESSSING;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
