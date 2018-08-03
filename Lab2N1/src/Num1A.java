
public class Num1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6, i = 1, j = 1, a = 1;
		while (i <= n) {
			while (j <= n) {
				System.out.print(a);
				System.out.print(' ');
				j++;
				a += 2;
			}
			i++;
			a = i;
			System.out.println();
			j = 1;
		}
	}

}
