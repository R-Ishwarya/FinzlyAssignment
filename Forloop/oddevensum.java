package forloop;
import java.util.Scanner;
public class oddevensum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=0;
		int b=0;
		for(int i=x;i<=y;i++)
		{
			if(i%2!=0)
			{
				a+=i;	
			}else {
				b+=i;
			}
		}
		System.out.println("Sum of odd numbers:" + a);
		System.out.println("Sum of even numbers:" + b);

	}

}
