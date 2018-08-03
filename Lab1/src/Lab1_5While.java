import java.util.Scanner;

public class Lab1_5While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 		int a = 1;
 		int i = 1;
		while (n >= i ) {
			a = a * i;
			System.out.print(a);
			System.out.print(" ");
			i++;
			
		}

	}
}