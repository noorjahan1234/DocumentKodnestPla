package com.FinanceCalculator;

import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double principal=sc.nextDouble();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		FinanceCalculator fc=new FinanceCalculator();
		System.out.println(fc.calculateSimpleInterest(principal,rate,time));
	}

}
