package secondproject;

import java.util.Scanner;

public class project512 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 5 == 0) {
				sum += i;
			}

			
		}
		System.out.println("1���� " + num + " ������ 5�� ����� ���� " + sum + "�Դϴ�.");
		
	}

}
