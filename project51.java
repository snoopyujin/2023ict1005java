package secondproject;

import java.util.Scanner;

public class project51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
        int num;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("숫자:");
            num = sc.nextInt();
            sum += num;
        } while (sum < 100);

        System.out.println("합계: " + sum);
    }

		
	}
