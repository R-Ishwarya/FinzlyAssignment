package forloop;
import java.util.Scanner;
public class series8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0;
		int y=1;
		int n=sc.nextInt();
		System.out.print(x+" "+y+" ");
		int z=0;
		for(int i=0;i<=n;i++)
		{
               z=x+y;
               x=y;
               y=z;
				System.out.print(z+" ");
				
		}

	}

}
