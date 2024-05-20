import java.util.Scanner;

public class GalacticArithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter firs number");
		long num1=sc.nextLong();
		System.out.println("Enter second number");
		long num2=sc.nextLong();
		galacticAddition(num1,num2);
	}

	public static void galacticAddition(long num1, long num2) {
		long num=num1+num2;
		System.out.println(num);
		
	}

}
