package com.ExceptionHandling;

import java.util.Scanner;

class InvalidUserException extends Exception {
	public String getmessage() {
		return("Invalid User. Please try Again!!");
	}
}
class Custemer {
	int accno = 111;
	int pin = 123;
	int acc_new;
	int pin_new;
	
	void CollectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the accno: ");
		acc_new = sc.nextInt();
		System.out.println("Enter the pin: ");
		pin_new = sc.nextInt();
		
	}
	void Verify() throws InvalidUserException {
		if(accno == acc_new && pin == pin_new) {
			System.out.println("Valid User");
		}
		else {
			InvalidUserException iue = new InvalidUserException();
			System.out.println(iue.getMessage());
			throw iue;
		}
	}
}
class Bank {
	void ValidateCustemer (Custemer c) {
		try {
			c.CollectData();
			c.Verify();
		}
		catch (InvalidUserException e1) {
			try {
				c.CollectData();
				c.Verify();
			}
			catch (InvalidUserException e2) {
				try {
					c.CollectData();
					c.Verify();
				}
				catch (InvalidUserException e3) {
					System.out.println("User Blocked");
				}
			}
			
		}
	}
}
public class CustomException {
	public static void main(String[] args) {
		Bank b = new Bank();
		Custemer c = new Custemer();
		b.ValidateCustemer(c);
	}
}
