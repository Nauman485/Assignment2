package geekster;
import java.util.Scanner;

public class Strlength1 {
	
    public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String str = sc.nextLine();
		sc.close();
		str+='\n';
		char c;
		int length = 0;
		while(str.charAt(length)!='\n') {
			length++;
		}
		if(length<4) {
			System.out.println("Name has less character");
		}
		else {
			System.out.println("Name has more character");
		}
		
		
    }
}
