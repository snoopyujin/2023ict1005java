import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int a=0;
		int b=0;
		int price=0;
		int result=0;
		
		for(int i =0;i<n;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			price=a*b;
			result+=price;
		}
		if(result==x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
			
		}
	}
}

