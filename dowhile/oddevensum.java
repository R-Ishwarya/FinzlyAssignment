package dowhileloop;
import java.util.Scanner;
public class oddevensum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=0;
		int b=0;
		int i=x;
		do {
			if(i%2!=0)
			{
				a+=i;
			}else
			{
				b+=i;
			}
			
			i++;
		}while(i<=y);
		System.out.println("Sum of odd numbers"+" "+a);
		System.out.println("Sum of odd numbers"+" "+b);

	}

}
