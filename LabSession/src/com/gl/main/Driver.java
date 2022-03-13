package com.gl.main;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.CredentialService;

public class Driver {

	public static void main(String[] args) {

		CredentialService service = new CredentialService();
		try (Scanner scan = new Scanner(System.in)) {
			Employee employee = new Employee("Krashnat", "Gurav");
			System.out.println("Please Enter the Department From the Following \n");
			System.out.println("1.Technical \n 2.Admin \n 3.Human Resource \n 4.Legal");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
				System.out.println("Email--->" + service.generateEmailAddress(employee.getFirstName().toLowerCase(),
						employee.getLastName().toLowerCase(), "tech"));
				System.out.println("Password---->" + service.generatePassword());
				break;
			case 2:

				System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
				System.out.println("Email    --->" + service.generateEmailAddress(employee.getFirstName().toLowerCase(),
						employee.getLastName().toLowerCase(), "admin"));
				System.out.println("Password---->" + service.generatePassword());
				break;
			case 3:

				System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
				System.out.println("Email--->" + service.generateEmailAddress(employee.getFirstName().toLowerCase(),
						employee.getLastName().toLowerCase(), "hr"));
				System.out.println("Password---->" + service.generatePassword());
				break;
			case 4:

				System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
				System.out.println("Email--->" + service.generateEmailAddress(employee.getFirstName().toLowerCase(),
						employee.getLastName().toLowerCase(), "legal"));
				System.out.println("Password---->" + service.generatePassword());
				break;
			}
		}

	}

}
