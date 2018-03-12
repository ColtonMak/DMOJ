package CCC00;
import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        
        System.out.println("Sun Mon Tue Wed Thr Fri Sat");
        switch(x) {
        case 1:
        	System.out.println("  1   2   3   4   5   6   7");
        	System.out.println("  8   9  10  11  12  13  14");
        	System.out.println(" 15  16  17  18  19  20  21");
        	System.out.println(" 22  23  24  25  26  27  28");
        	switch (y) {
        	case 28:
        		break;
        	case 29:
            	System.out.println(" 29");
            	break;
        	case 30:
            	System.out.println(" 29  30");
            	break;
        	case 31:
            	System.out.println(" 29  30  31");
            	break;
        	}
        	break;

        case 2:
        	System.out.println("      1   2   3   4   5   6");
        	System.out.println("  7   8   9  10  11  12  13");
        	System.out.println(" 14  15  16  17  18  19  20");
        	System.out.println(" 21  22  23  24  25  26  27");
        	switch (y) {
        	case 28:
        		System.out.println(" 28");
        		break;
        	case 29:
            	System.out.println(" 28  29");
            	break;
        	case 30:
            	System.out.println(" 28  29  30");
            	break;
        	case 31:
            	System.out.println(" 28  29  30  31");
            	break;
        	}
        	break;
        	
        case 3:
        	System.out.println("          1   2   3   4   5");
        	System.out.println("  6   7   8   9  10  11  12");
        	System.out.println(" 13  14  15  16  17  18  19");
        	System.out.println(" 20  21  22  23  24  25  26");
        	switch (y) {
        	case 28:
        		System.out.println(" 27  28");
        		break;
        	case 29:
            	System.out.println(" 27  28  29");
            	break;
        	case 30:
            	System.out.println(" 27  28  29  30");
            	break;
        	case 31:
            	System.out.println(" 27  28  29  30  31");
            	break;
        	}
        	break;
        case 4:
        	System.out.println("              1   2   3   4");
        	System.out.println("  5   6   7   8   9  10  11");
        	System.out.println(" 12  13  14  15  16  17  18");
        	System.out.println(" 19  20  21  22  23  24  25");
        	switch (y) {
        	case 28:
        		System.out.println(" 26  27  28");
        		break;
        	case 29:
            	System.out.println(" 26  27  28  29");
            	break;
        	case 30:
            	System.out.println(" 26  27  28  29  30");
            	break;
        	case 31:
            	System.out.println(" 26  27  28  29  30  31");
            	break;
        	}
        	break;
        case 5:
        	System.out.println("                  1   2   3");
        	System.out.println("  4   5   6   7   8   9  10");
        	System.out.println(" 11  12  13  14  15  16  17");
        	System.out.println(" 18  19  20  21  22  23  24");
        	switch (y) {
        	case 28:
        		System.out.println(" 25  26  27  28");
        		break;
        	case 29:
        		System.out.println(" 25  26  27  28  29");
            	break;
        	case 30:
        		System.out.println(" 25  26  27  28  29  30");
            	break;
        	case 31:
        		System.out.println(" 25  26  27  28  29  30  31");
            	break;
        	}
        	break;
        case 6:
        	System.out.println("                      1   2");
        	System.out.println("  3   4   5   6   7   8   9");
        	System.out.println(" 10  11  12  13  14  15  16");
        	System.out.println(" 17  18  19  20  21  22  23");
        	switch (y) {
        	case 28:
        		System.out.println(" 24  25  26  27  28");
        		break;
        	case 29:
        		System.out.println(" 24  25  26  27  28  29");
            	break;
        	case 30:
        		System.out.println(" 24  25  26  27  28  29  30");
            	break;
        	case 31:
        		System.out.println(" 24  25  26  27  28  29  30");
        		System.out.println(" 31");
            	break;
        	}
        	break;
        case 7:
        	System.out.println("                          1");
        	System.out.println("  2   3   4   5   6   7   8");
        	System.out.println("  9  10  11  12  13  14  15");
        	System.out.println(" 16  17  18  19  20  21  22");
        	switch (y) {
        	case 28:
        		System.out.println(" 23  24  25  26  27  28");
        		break;
        	case 29:
        		System.out.println(" 23  24  25  26  27  28  29");
            	break;
        	case 30:
        		System.out.println(" 23  24  25  26  27  28  29");
        		System.out.println(" 30");
        		break;
        	case 31:
        		System.out.println(" 23  24  25  26  27  28  29");
        		System.out.println(" 30  31");
            	break;
        	}
        	break;
        }
    }    
}