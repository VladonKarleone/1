import java.util.Scanner;

public class Lab1_1DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 		int i = 1;
		do {
			System.out.print(i);
			System.out.print(" ");
			i++;
		} while (i <= n );

	}

}