import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int dataType = N/4;

		for(int i = 0; i < dataType; i++){ 
			System.out.print("long ");
		}
		System.out.print("int");
	}
}

