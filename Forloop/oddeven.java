package forloop;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Odd numbers");
		for(int i=x;i<=y;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");	
			}
		}
		System.out.println();
		System.out.println("Even numbers");
		for(int i=x;i<=y;i++)
		{
			if(i%2==0)
			{
		
		     System.out.print(i+" ");
			}
		}

	}

}
