package src.uuu.gds.entity;

import java.time.LocalDate;

public class Customer {	
	public String id; 	//required,PKey,須符合ROC ID格式與規則
	public String password;	//required,6~20個字元
	public String name;	//required,2~20個字元
	public char gender;	//required, 'M':男, 'F':女
	public LocalDate birthday;	//required,年滿12歲
	public String email;	//required,須符合email格式
	public String address="";	//optional
	public String phone="";		//optional
	public boolean subscribed;	//optional	
	
	public int getAge() {
		//TODO: 根據客戶生日計算年齡
		return 0;
	}
}
