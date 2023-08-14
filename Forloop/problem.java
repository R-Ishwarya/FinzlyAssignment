package forloop;
import java.util.Scanner;
public class problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int t=0;
		for(int j=2;j<=n;j++){
	         int c=0;
	         for(int i=1;i<=j;i++){
	            if(j%i==0){
	               c++;
	            }
	         }
	       if(c==2)
	         {	 
	         t+=j;
	         }
	      }
		System.out.print(t);
	}

}
