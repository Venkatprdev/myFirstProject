package com.venkat;

import java.util.Scanner;

public class Access {

	public static void main(String[] args) {
		Bank b1 = new Bank();
		System.out.println(b1.getBalance());
		
		//Reading input
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want deposit more (Yes/No)?");
		
		
		System.out.println("How amount you want to deposit:");
		int a = sc.nextInt();
		b1.deposit (a) ;
		System.out.println("After Deposit: "+ b1.getBalance());

		//withdraw
		
		System.out.println("Do you want withdraw more (Yes /No)?");
		
		
		System.out.println("How much You want to withdraw ? ");
		b1.withdraw(sc.nextInt());
	}

}
