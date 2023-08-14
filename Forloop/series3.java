
package forloop;

public class series3 {

	public static void main(String[] args) {
		int i;
		for (i = 0; i <= 10; i++) {

			if (i % 2 != 0) {
				System.out.print(i + " ");
			} else {
				System.out.print(i - (i + i) + " ");
			}

		}
	}

}
