package CCC17;
import java.util.*;

public class J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int sum = x;

        for (int i=0; i < y; i++) {
            x*=10;
            sum+=x;
        }

        System.out.println(sum);
    }
}