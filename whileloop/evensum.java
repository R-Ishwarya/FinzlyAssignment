package whileloop;
public class evensum {
	public static void main(String[] args) {
		int i=1;
		int a=0;
		while(i<=50)
		{
			if(i%2==0)
			{
				a+=i;
			}
			i++;
		}
		System.out.println(a);

	}

}
