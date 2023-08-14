/**
 * 
 */
package whileloop;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int i=x;
		System.out.println("Odd Numbers"+ " ");
		while(i<=y)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
			i++;
		}
		
		System.out.println();
		System.out.println("Even Numbers");
		i=x;
		
		while(i<=y)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			i++;
		}
		

	}

}
