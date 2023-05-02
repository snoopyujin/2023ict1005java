
import java.util.Scanner;
import java.util.ArrayList;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
	        int b = sc.nextInt();
	        ArrayList<Integer> sum = new ArrayList<Integer>();
	        
	        while(a + b != 0){
	            sum.add(a + b);
	            a = sc.nextInt();
	            b = sc.nextInt();
	        }

	        for(int j = 0; j < sum.size(); j++){
	            System.out.println(sum.get(j));
	        }
	        sc.close();
	    }
	}
