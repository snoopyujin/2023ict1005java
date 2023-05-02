import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();   
        int M = sc.nextInt();   
        int tmp = 0;

        int[] basket = new int[N];

        for(int cnt = 0; cnt < N; cnt++){   
            basket[cnt] = cnt + 1;
        }

        for(int cnt = 0; cnt < M; cnt++){   
            int i = sc.nextInt();
            int j = sc.nextInt();

            tmp = basket[i - 1];
            basket[i - 1] = basket[j - 1];
            basket[j - 1] = tmp;
        }

        for(int cnt = 0; cnt < N; cnt++){   
            System.out.print(basket[cnt] + " ");
        }
   } 
}
