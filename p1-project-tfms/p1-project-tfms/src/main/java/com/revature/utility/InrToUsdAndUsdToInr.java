package com.revature.utility;
import java.util.Scanner;
public class InrToUsdAndUsdToInr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose 1 for INR to USD");
		System.out.println("Choose 2 for USD to INR");
		int choose = sc.nextInt();
		switch(choose) {
		case 1:{
			System.out.print("Enter ammount: ");
			double inr = sc.nextDouble();
			double usd = 0.012*inr;
			System.out.print(""+inr+" INR in USD is equal to USD "+usd);
			break;
		}
		case 2: {
			System.out.print("Enter ammount: ");
			double usd = sc.nextDouble();
			double inr = 82.521*usd;
			System.out.print(""+usd+" USD in INR is equal to Rs "+inr);
			break;
		}
		default: 
			System.out.println("Please choose a valid number");
		}
		sc.close();
	}
}
	



