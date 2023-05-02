import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().trim();       
        String[] wordArr = word.split(" ");        

        if(word.isEmpty()){
            System.out.println(0);                 
        }else{
            System.out.println(wordArr.length);    
    }
}
}
