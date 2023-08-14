package forloop;
public class evensum {
	public static void main(String[] args) {
		int i;
		int a=0;
		for(i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				a+=i;
				
			}
		}
		System.out.println(a);
	}
}
