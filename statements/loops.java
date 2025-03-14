package com.java.statements;

import java.util.Scanner;

public class loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vaalue of n");
		int n = sc.nextInt();
		int i = 0;
		do {
			System.out.println("Hello World");
			i++;
		}
		while(i < 5);
		
	}

}
