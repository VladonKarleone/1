
public class Num4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6, i = n, j = 1, a = n;
		do {
			do {
				System.out.print(i);
				System.out.print(' ');
				i--;
			} while(i >= j);
			System.out.println();
			j++;
			n--;
			i = a;
		} while(n >= 1);

	}
}
