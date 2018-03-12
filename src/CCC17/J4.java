package CCC17;
import java.util.*;

public class J4 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			sc.close();
			int count = 0;
			int startTime = 1201;
			count += (input/720)*31;
			int leftOver = input % 720;
			for (int i = leftOver; i > 0; i--) {
				String temp = Integer.toString(startTime);
				if (temp.length()==4) {
					int [] newDigits = new int [4];
					newDigits[0] = startTime % 10;
					newDigits[1] = (startTime/10) % 10;
					newDigits[2] = (startTime/100) % 10;
					newDigits[3] = (startTime/1000) % 10;
					int diffOne = newDigits[0] - newDigits[1];
					int diffTwo = newDigits[1] - newDigits[2];
					int diffThree = newDigits[2] - newDigits[3];
					if (diffOne == diffTwo) {
						if (diffTwo == diffThree) {
							count++;
						}
					}
				}
				else {
					int [] newDigits = new int [3];
					newDigits[0] = startTime % 10;
					newDigits[1] = (startTime/10) % 10;
					newDigits[2] = (startTime/100) % 10;
					int diffOne = newDigits[0] - newDigits[1];
					int diffTwo = newDigits[1] - newDigits[2];
					if (diffOne == diffTwo) {
						count++;
					}
				}
				startTime++;
				if (startTime == 1260) {
					startTime = 100;
				}
				else if (startTime % 100 == 60) {
					startTime+=40;
				}
			}
			System.out.println(count);

	}
}
