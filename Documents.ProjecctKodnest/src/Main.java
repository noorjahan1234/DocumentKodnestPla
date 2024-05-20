import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		   int size=sc.nextInt();
		   long a[]=new long[size];
		   for(int i=0;i<a.length;i++)
		   {
		    a[i]=sc.nextLong();
		   }
		   long num=0;
		   for(long i:a)
		   {
		    long n=i;
		    while(n>0)
		    {
		      long rem=n%10;
		      num=num*10+rem;
		      break;
		    }
		   }
		   if(num%10==0)
		   {
		    System.out.println("Yes");
		   }
		   else
		   {
			   System.out.println("No");
		   }
	}

}
