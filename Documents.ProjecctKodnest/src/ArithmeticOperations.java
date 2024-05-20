import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		int re= additioNumbers(num1,num2);
		System.out.println(re);
		 int re1=subtractNumbers(num1,num2);
		 System.out.println(re1);
		int re2= multiplyNumbers(num1,num2);
		System.out.println(re2);
		 int re3=divideNumbers(num1,num2);
		 System.out.println(re3);
		int re4= remenderNumbers(num1,num2);
		System.out.println(re4);
	}

	public static int additioNumbers(int num1, int num2) 
	{
		int num=num1+num2;
		return num;
	}

	public static int subtractNumbers(int num1, int num2) {
		int num=num1-num2;
		return num;
	}

	public static int multiplyNumbers(int num1, int num2) {
	int num=num1*num2;	
	return num;
	}

	public static int divideNumbers(int num1, int num2) {
		int num=num1/num2;
		return num;
		
	}

	public static int remenderNumbers(int num1, int num2) {
		int num=num1%num2;
		return num;
	}

}
