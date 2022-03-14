package com.greatlerning.controller;


import java.util.Scanner;

import com.greatlerning.model.Employee;
import com.greatlerning.service.EmployeeCredentialService;

public class EmployeeController {
public static void main(String[] args) {
	
	Employee obj =new Employee("pramod","p");
	EmployeeCredentialService service = new EmployeeCredentialService();
	Scanner sc=new Scanner(System.in);
	String email;
	char[] generatedPassword;
	System.out.println("SELECT DEPARTMENT\n 1)Technical,\n2)Admin,\n3)HR");
	 
	int option = sc.nextInt();
	
	switch (option) {
	case 1:
		email =service.generateEmail(obj.getFirstName(),obj.getLastName(),"technical");
		 generatedPassword =service.generatePassword();
		 service.showCredentials(obj,email,generatedPassword);
			break;
	case 2:
		email =service.generateEmail(obj.getFirstName(),obj.getLastName(),"admin");
		 generatedPassword =service.generatePassword();
		 service.showCredentials(obj,email,generatedPassword);
			break;
	case 3:
		email =service.generateEmail(obj.getFirstName(),obj.getLastName(),"HR");
		 generatedPassword =service.generatePassword();
		 service.showCredentials(obj,email,generatedPassword);
			break;
			
				

		default:System.out.println("invalid choice");
			break;
		}
		
	
}
}
