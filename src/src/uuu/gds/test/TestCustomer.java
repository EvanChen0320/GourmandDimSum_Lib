package src.uuu.gds.test;

import java.time.LocalDate;

import src.uuu.gds.entity.Customer;


public class TestCustomer{	
	public static void main(String[] args) {
		int i=Integer.parseInt("1");
		
		Customer customer = null;
		if(true) {
			customer = new Customer();
			customer.id = new String("A123456789");
			customer.password = "asdf1234";
			customer.name = "狄會貴";
			customer.gender = "M".charAt(0);
			//Date d = new  GregorianCalendar(1999,7,5).getTime();
			//System.out.println(d);
			//customer.birthday = LocalDate.of(20000,1,24);
			customer.birthday = LocalDate.parse("+20000-01-24");
			customer.email = "test01@uuu.com.tw";			
		
			System.out.println(customer.id);//A123456789
			System.out.println(customer.password);//asdf1234
			System.out.println(customer.name);//狄會貴
			System.out.println(customer.gender);//M
			System.out.println(customer.birthday);//2021-04-12
			System.out.println(customer.email);//test01@uuu.com.tw
			System.out.println(customer.address);//
			System.out.println(customer.phone);//
			System.out.println(customer.subscribed);//false
			System.out.println(customer);
		}
		i = 1;
		System.out.println(i);
	}
}