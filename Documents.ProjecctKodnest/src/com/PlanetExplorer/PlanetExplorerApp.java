package com.PlanetExplorer;

import java.util.Scanner;

public class PlanetExplorerApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		double raides=sc.nextDouble();
		PlanetExplorer pe=new PlanetExplorer();
		System.out.println(pe.calculateSurfaceArea(raides));

	}

}
