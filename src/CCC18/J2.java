package CCC18;
import java.util.*;

public class J2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int spaces = sc.nextInt();		
		String dayOne = sc.next();
		String dayTwo = sc.next();
		sc.close();
		int count = 0;
		
		for (int i = 0; i < spaces; i++) {
			if (dayOne.charAt(i) == 'C' && dayTwo.charAt(i) == 'C') {
				count++;
			}
		}
		System.out.println(count);
	}
}
