import java.util.Scanner;

public class Lab1_3DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 		int a = 1;
		do {
			System.out.print(a);
			System.out.print(" ");
			a *= 2;
		} while (n >= a );

	}

}