package constructor;
import java.util.Scanner;
public class tictactoe {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] ch = new char[3][3];
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length;j++) {
				ch[i][j]=' ';
			}
		}
		char player='X';
		boolean game=false;
		while(!game)
		{
			printch(ch);
			System.out.println("Enter player"+" "+ player);
			int i=sc.nextInt();
			int j=sc.nextInt();
			if(ch[i][j]==' ')
			{
				ch[i][j]=player;
				game=won(ch,player);
				if(game) {
					System.out.println("Player " + player +" Won:");
				}else {
					if(player=='X')
					{
						player='O';
					}else {
						player = 'X';
					}
				}
			}else {
				System.out.println("Invalid position");
			}
		}
		printch(ch);
	}
	public static boolean won(char[][] ch,char player) {
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i][0]==player && ch[i][1]==player && ch[i][2]==player)
				return true;
		}
		for(int j=0;j<ch.length;j++)
		{
			if(ch[0][j]==player && ch[1][j]==player && ch[2][j]==player)
				return true;
		}
		if(ch[0][0] ==player && ch[1][1] ==player&& ch[2][2] ==player) {
			return true;
			
		}
		else if(ch[0][2] ==player && ch[1][1] ==player&& ch[2][0] ==player) {
        	return true;
			
		}
        return false;
	}
	public static void printch(char[][] ch) {
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]+"|");
			}
			System.out.println();
		}
		

	}

}
