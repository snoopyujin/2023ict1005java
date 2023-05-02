import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();                  
		sc.nextLine();                       
		String a=sc.nextLine();                
		String[] input=a.split(" ");          
		int cnt=0;                            

		int tcnt=0;                            
		int number=0;                          

		for(int i=0; i<num; i++) {
			number=Integer.parseInt(input[i]);      
			cnt=0;                                  
			if(1<number) {                          
				for(int j=2;j<=number;j++) if(number%j==0) cnt++;  
			}
			if(cnt==1) tcnt++;        
		}
		System.out.println(tcnt);      
	}
}


