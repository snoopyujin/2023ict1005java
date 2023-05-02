import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();                
		int num2=sc.nextInt();                

		int cnt=0;                             
		int min=num2;                        
		int max=0;                            

		for(int i=num1; i<=num2; i++) {       
			cnt=0;                             
			if(1<i) {                         
				for(int j=2;j<=i;j++) {        
					if(i%j==0) cnt++;          
					if(j==i&&cnt==1) {         
						max=max+j;             
						min=Math.min(min,j);   
					}
				}
			}

		}
		if(max!=0) {                         
			System.out.println(max);         
			System.out.println(min);         
		}else System.out.println(-1);       
	}
}