package secondproject;

import java.util.Scanner;

public class project512 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 5 == 0) {
				sum += i;
			}

			
		}
		System.out.println("1부터 " + num + " 사이의 5의 배수의 합은 " + sum + "입니다.");
		
	}

}
