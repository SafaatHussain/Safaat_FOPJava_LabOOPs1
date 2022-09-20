package com.greatlearning.app;
import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;


public class DriverClass {
	
	
	
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Name");
		
		String fn=sc.next();
		
		System.out.println("Enter Last Name");
		
		String ln=sc.next();
		
		Employee e1=new Employee(fn,ln);//PC
		
		CredentialService cs=new CredentialService();
		
		String generateEmail="";
		
		char[] genPwd=null;
		
		do
		{
		System.out.println("Pls choose your department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("5. Exit");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"technical");
			genPwd=cs.generatePassword();
			break;
		case 2:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"admin");
			genPwd=cs.generatePassword();
			break;
		case 3:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"humanresource");
			genPwd=cs.generatePassword();
			break;
		case 4:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"legal");
			genPwd=cs.generatePassword();
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Pleases enter valid choice");
		}
		
		cs.displayEmpDetails(e1.getFirstName(),e1.getLastName(),generateEmail,genPwd);
		//System.out.println("Email ID :" +generateEmail);
		//System.out.println("Password :" +genPwd);
		}while(true);
	}

}