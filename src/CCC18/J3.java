package CCC18;
import java.util.*;

public class J3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		int four = sc.nextInt();
		sc.close();
		
		System.out.print("0" + " ");
		System.out.print(one + " ");
		System.out.print(one + two + " ");
		System.out.print(one + two + three + " ");
		System.out.print(one + two + three + four);
		
		System.out.println();
		System.out.print(one + " ");
		System.out.print("0" + " ");
		System.out.print(two + " ");
		System.out.print(two + three + " ");
		System.out.print(two + three + four + " ");
		
		System.out.println();
		System.out.print(one + two + " ");
		System.out.print(two + " ");
		System.out.print("0" + " ");
		System.out.print(three + " ");
		System.out.print(three + four + " ");
		
		System.out.println();
		System.out.print(one + two + three + " ");
		System.out.print(two + three + " ");
		System.out.print(three + " ");
		System.out.print("0" + " ");
		System.out.print(four + " ");
		
		System.out.println();
		System.out.print(one + two + three + four + " ");
		System.out.print(two + three + four + " ");
		System.out.print(three + four + " ");
		System.out.print(four + " ");
		System.out.print("0" + " ");
	}
}
