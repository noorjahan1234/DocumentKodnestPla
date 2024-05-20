package com.TemperatureConverter;

import java.util.Scanner;

public class PowerofSquares {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(squareNumber(num));
	}

	public static int squareNumber(int num) {
		int ps=num*num;
		return ps;
	}

}
