import java.util.Scanner;

public class Lab1_2While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 		
		while (n >= 10 ) {
			System.out.print(n);
			System.out.print(" ");
			n -= 10;
		}

	}

}