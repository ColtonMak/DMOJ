package CCC18;
import java.util.*;

public class J1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		int four = sc.nextInt();
		sc.close();
		
		if ((one == 8 || one == 9) && (four == 8 || four == 9) && two == three) {
			System.out.println("ignore");
		}
		else {
			System.out.println("answer");
		}
	}

}