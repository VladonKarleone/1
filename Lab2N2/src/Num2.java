
public class Num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6, i = 1, j = 1, a = 1, b = 1;
		while (b <= n) {
			while (i <= b) {
				while (j <= b) {
					System.out.print(a);
					System.out.print(' ');
					a++;
					j++;
				}
				i++;
				a = 1;
				System.out.println();
				j = 1;
			}
			b++;
		}

	}
}
