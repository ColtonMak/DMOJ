package CCC00;
import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inputOne = sc.nextInt();
		int inputTwo = sc.nextInt();
		sc.close();
		int count = 0;
		for (int i = inputOne; i <= inputTwo; i++) {
			String num = Integer.toString(i);
			StringBuilder newNum = new StringBuilder(num);
			newNum.reverse();
			String numOne = newNum.toString();
			String strOne = numOne.replace("6", "w");
			String strTwo = strOne.replace("9", "6");
			String str = strTwo.replace ("w", "9");
			if (str.contains("2") || str.contains("3") || str.contains("4") || str.contains("5") || str.contains("7")) {
				continue;
			}
			else {
				if (num.equals(str)) {
					count++;
				}
			}
					
		}
		System.out.println(count);
	}

}
