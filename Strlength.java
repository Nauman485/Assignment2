package geekster;
import java.util.*;

public class Strlength {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String str = sc.nextLine();
		sc.close();
	   
		if(str.length()<4) {
			System.out.println("Name has less character");
		}
		else {
			System.out.println("Name has more character");
		}
	}
	

}
