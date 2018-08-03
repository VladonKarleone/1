import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner (System.in);
		int i = sc.nextInt();
		int A = 10;
		int n = 0;
		int Sum = 0;
		while(n < i) {
			Sum = Sum + A;
			A = A + 3;
			n++;
		}
		System.out.println(Sum);

	}
	

}
