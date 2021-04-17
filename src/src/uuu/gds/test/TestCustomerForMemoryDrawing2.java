package src.uuu.gds.test;

import java.time.LocalDate;
import src.uuu.gds.entity.Customer;

public class TestCustomerForMemoryDrawing2{	
	public static void main(String[] args) {		
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
		customer.birthday = LocalDate.of(2000,10,3);		
		customer.birthday = LocalDate.parse("2000-10-03");
		customer.email = "test01@uuu.com.tw";			
	
		System.out.println("*****以下為customer物件的內容:*****");
		System.out.println(customer.id);//A123456789
		System.out.println(customer.password);//asdf1234
		System.out.println(customer.name);//狄會貴
		System.out.println(customer.gender);//
		System.out.println(customer.birthday);//2000-10-13
		System.out.println(customer.email);//test01@uuu.com.tw
		System.out.println(customer.address);//
		System.out.println(customer.phone);	 //null
		System.out.println(customer.subscribed);//false
		System.out.println(customer);
		
		System.out.println("*****以下為customer 2 物件的內容:*****");
		Customer customer2 = new Customer();//customer;
		customer2.id = "A123123123";
		customer2.name = customer.name;
		customer2.email = "test02@uuu.com.tw";	
		customer2.gender = customer.gender;
		
		System.out.println(customer2.id);//A123123123
		System.out.println(customer2.password);//asdf1234
		System.out.println(customer2.name);//狄會貴
		System.out.println(customer2.gender);//
		System.out.println(customer2.birthday);//2000-10-13
		System.out.println(customer2.email);//test02@uuu.com.tw
		System.out.println(customer2.address);//
		System.out.println(customer2.phone);	 //
		System.out.println(customer2.subscribed);//false
		System.out.println(customer2);
		System.out.println("*****以下為customer物件的內容:*****");
		System.out.println(customer.id);//A123456789
		System.out.println(customer.password);//asdf1234
		System.out.println(customer.name);//狄會貴
		System.out.println(customer.gender);//
		System.out.println(customer.birthday);//2000-10-13
		System.out.println(customer.email);//test01@uuu.com.tw
		System.out.println(customer.address);//
		System.out.println(customer.phone);	 //null
		System.out.println(customer.subscribed);//false
		System.out.println(customer);
	}
}