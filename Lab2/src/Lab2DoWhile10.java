
public class Lab2DoWhile10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int i = 1;
		int j;
		do {
			if (i % 2 == 0) {
				j = 1;
				do {
					System.out.print(j);
					System.out.print(' ');
					j++;
				} while (j <= i);
				System.out.println();
			} else {
				j = i;
				do {
					System.out.print(j);
					System.out.print(' ');
					j--;
				} while (j >= 1);
				System.out.println();
			}
			i++;
		} while (i <= n);


	}

}