import java.util.Scanner;

public class TheDoubleTrouble {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int re=doubleTheNumber(num);
		System.out.println(re);

	}

	public static int doubleTheNumber(int num) {
		int a=2*num;
		return a;
	}

}
