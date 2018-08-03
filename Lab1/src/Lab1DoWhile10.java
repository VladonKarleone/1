import java.util.Scanner;

public class Lab1DoWhile10 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner (System.in);
		int i = sc.nextInt();
		int A = 10;
		int n = 0;
		int Sum = 0;
		do {
			Sum = Sum + A;
			A = A + 3;
			n++;
		} while(n < i);
		System.out.println(Sum);

	}
	

}
