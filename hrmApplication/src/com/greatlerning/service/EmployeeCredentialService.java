package com.greatlerning.service;

import java.util.Random;

import com.greatlerning.model.Employee;

public class EmployeeCredentialService {

	public char[] generatePassword() {
		char[] password = new char[8];
		String upperCase  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		 String number= "123456789";
		 String SpecialChar = "@#$%^&*><?=";
		 String  values = upperCase + lowerCase + number + SpecialChar;


	

Random random =new Random();

for (int i = 0; i < 8; i++) {
 password[i]=values.charAt(random.nextInt(values.length()));
}
	 
	 return password;
	}

	public String generateEmail(String firstName, String lastName, String department) {

		return firstName + lastName + "@" + department + "greatlerning.com";

	}

	public void showCredentials(Employee obj, String email, char[] generatePassword) {
		System.out.println("\nEmployee : "+obj.getFirstName());
		System.out.println("email :"+email);
		System.out.println("password:"+generatePassword);
		
		
	}
}
