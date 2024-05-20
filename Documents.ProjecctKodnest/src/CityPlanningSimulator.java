import java.util.Scanner;

public class CityPlanningSimulator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sl=sc.nextInt();
		double sl1=sc.nextDouble();
		System.out.println(calculatePlotArea(sl));
		System.out.println(calculatePlotArea(sl1));
	}
	private static int calculatePlotArea(int sl) 
	{
		int p=sl*sl;
		return p;
	}

	private static double calculatePlotArea(double sl1) 
	{
		double d=sl1*sl1;
		return d;
			
	}

}
