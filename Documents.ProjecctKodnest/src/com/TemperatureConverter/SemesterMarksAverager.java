package com.TemperatureConverter;

import java.util.Scanner;

public class SemesterMarksAverager {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter all number");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	int n4=sc.nextInt();
	int n5=sc.nextInt();
	int n6=sc.nextInt();
	int n7=sc.nextInt();
	int n8=sc.nextInt();
	double res=calculateAverage(n1,n2,n3,n4,n5,n6,n7,n8);
	System.out.println(res);
	}
	
	private static  double calculateAverage(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
		double ave=(n1+n2+n3+n4+n5+n6+n7+n8)/8;
		return ave;
	}

}
