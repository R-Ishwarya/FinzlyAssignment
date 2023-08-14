/**
 * 
 */
package constructor;
import java.util.Scanner;
public class vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		char c[]= s.toCharArray();
		int a=0,e=0,i=0,o=0,u=0;
		int x=s.length();
		int z=0;
		for(z=0;z<x;z++)
		{
			if(c[z]=='a'||c[z]=='A')	
			{
				a++;
			}else if(c[z]=='e'||c[z]=='E'){
				e++;
				
			}else if(c[z]=='i'||c[z]=='I'){
				i++;
				
			}else if(c[z]=='o'||c[z]=='O'){
				o++;
			}
			else if(c[z]=='u'||c[z]=='U'){
					u++;
			}
		}
		if(a>0 && e>0 && i>0 && o>0 && i>0)
		{
			System.out.println("Vowels present");
			System.out.println(s);
		}else {
				System.out.println("Not present");
			}
		
			

	}

}
