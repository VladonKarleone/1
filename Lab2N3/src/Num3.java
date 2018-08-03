
public class Num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6, i = 1;
		do {
			do {
				System.out.print(i);
				System.out.print(' ');
				i++;
			} while(i <= n);
			System.out.println();
			i = 1;
			n--;
		} while (n >= 1);


	}
}
