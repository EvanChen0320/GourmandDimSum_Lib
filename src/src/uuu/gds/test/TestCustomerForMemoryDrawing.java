package src.uuu.gds.test;

import java.time.LocalDate;
import src.uuu.gds.entity.Customer;

public class TestCustomerForMemoryDrawing{	
	public static void main(String[] args) {
		System.out.println(args.length);
		int i;
		i = 1;
		int j = i;
		i++;
		System.out.println(i);//2
		System.out.println(j);//1
		
		Customer customer = new Customer();
		customer.id = new String("A123456789");
		customer.password = "asdf1234";
		customer.name = "狄會貴";
		customer.gender = "M".charAt(0);
		customer.birthday = LocalDate.parse("2000-10-13");		
		customer.email = "test01@uuu.com.tw";			
	
		System.out.println(customer.id);//A123456789
		System.out.println(customer.password);//asdf1234
		System.out.println(customer.name);//狄會貴
		System.out.println(customer.gender);//
		System.out.println(customer.birthday);//null
		System.out.println(customer.email);//test01@uuu.com.tw
		System.out.println(customer.address);//
		System.out.println(customer.phone);	 //null
		System.out.println(customer.subscribed);//false
		System.out.println(customer);
	}
}