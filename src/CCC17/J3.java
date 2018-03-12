package CCC17;
import java.util.*;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xOne = sc.nextInt();
        int yOne = sc.nextInt();
        int xTwo = sc.nextInt();
        int yTwo = sc.nextInt();
        int z = sc.nextInt();
        sc.close();

        int xDifference = Math.abs(xTwo - xOne);
        int yDifference = Math.abs(yTwo - yOne);

        int spaces = xDifference + yDifference;

        if (z >= spaces) {
            if ((z - spaces) % 2 == 0) {
                System.out.println("Y");
            }
            else {
                System.out.println("N");
            }
        }
        else {
            System.out.println("N");
        }


    }
}