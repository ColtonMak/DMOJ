package CCC01;
import java.util.*;

public class J2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		int z;
		for (int i = 0; i < y; i++) {
			z = x * i;
			z--;
			if (z % y == 0) {
				System.out.println(i);
				break;
			}
			else if (i==y-1) {
				System.out.println("No such integer exists.");
			}
		}
	}

}
