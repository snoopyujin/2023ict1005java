import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = arr[0];
		int cnt = 0;
		int maxIndex = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(cnt = 0; cnt < arr.length; cnt ++) {
			if(max < arr[cnt]) {
				max = arr[cnt];
				maxIndex = cnt;
			}
		}
	
		System.out.println(max);
		System.out.println(maxIndex+1);
	}
}