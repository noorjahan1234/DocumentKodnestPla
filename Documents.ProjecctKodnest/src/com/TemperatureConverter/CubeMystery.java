package com.TemperatureConverter;

import java.util.Scanner;

public class CubeMystery {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int res=cubeNumber(n);
		System.out.println(res);
	}

	public static int cubeNumber(int n) {
		int num=n*n*n;
		return num;
	}

}
