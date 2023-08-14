package dowhileloop;
public class oddsum {

	public static void main(String[] args) {
		int i=1;
		int a=0;
		do {
			if(i%2!=0)
			{
				a+=i;
			}
			i++;
		}while(i<=50);
		System.out.println(a);

	}

}
