
package dowhileloop;

public class oddcount {
	public static void main(String[] args) {
		int i=1;
		int a=0;
		do {
			if(i%2!=0)
			{
				a++;
			
			}
			i++;
		}while(i<=25);
		System.out.println(a);

	}

}
