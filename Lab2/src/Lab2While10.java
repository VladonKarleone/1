import java.util.Scanner;

public class Lab2While10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;
		int j;
		while (i <= n) {
			if (i % 2 == 0) {
				j = 1;
				while (j <= i) {
					System.out.print(j);
					System.out.print(' ');
					j++;
				}
				System.out.println();
			} else {
				j = i;
				while (j >= 1) {
					System.out.print(j);
					System.out.print(' ');
					j--;
				}
				System.out.println();
			}
			i++;
		}


	}

}
