package CCC01;
import java.util.*;

public class J1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		for (int i = 1; i < input; i+=2) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				}
			int spaces = (input-i)*2;
			for (int k = 0; k < spaces; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		for (int i = 0; i < input*2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = input-2; i > 0; i-=2) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				}
			int spaces = (input-i)*2;
			for (int k = 0; k < spaces; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}

}
