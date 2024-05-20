import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter speed");
		double speed=sc.nextDouble();
		System.out.println("Enter time");
		double time=sc.nextDouble();
		JourneyCalculator jc=new JourneyCalculator();
		System.out.println(jc. calculateDistance(speed,time));
	}

}
