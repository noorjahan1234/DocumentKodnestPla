package com.TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter speed");
		double fahrenheit=sc.nextDouble();
		TemperatureConverter tc=new TemperatureConverter();
		System.out.println(tc.convertFahrenheitToCelsius(fahrenheit));
		
	}

}
