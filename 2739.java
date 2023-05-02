import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in); 
	 
	int num1 = sc.nextInt();
	
	for(int num2 = 0; num2 < 9; num2++) {
		System.out.println(num1 + " * " + (num2 + 1)
				+ " = " + num1 * (num2 + 1));
				
			
	}
	
	
	
	}
}