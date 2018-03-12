package CCC01;
import java.util.*;

public class S1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String clubs = input.substring(input.indexOf('C')+1, input.indexOf('D'));
		String diamonds = input.substring(input.indexOf('D')+1, input.indexOf('H'));
		String hearts = input.substring(input.indexOf('H')+1, input.indexOf('S'));
		String spades = input.substring(input.indexOf('S')+1);
		
		int clubsCount = 0;
		int diamondsCount = 0;
		int heartsCount = 0;
		int spadesCount = 0;
		
		for (int i = 0; i < clubs.length(); i++) {
			char temp = clubs.charAt(i);
			switch (temp) {
			case 'J':
				clubsCount++;
				break;
			case 'Q':
				clubsCount +=2;
				break;
			case 'K':
				clubsCount +=3;
				break;
			case 'A':
				clubsCount +=4;
				break;
			}
		}
		
		for (int i = 0; i < diamonds.length(); i++) {
			char temp = diamonds.charAt(i);
			switch (temp) {
			case 'J':
				diamondsCount++;
				break;
			case 'Q':
				diamondsCount +=2;
				break;
			case 'K':
				diamondsCount +=3;
				break;
			case 'A':
				diamondsCount +=4;
				break;
			}
		}
		
		for (int i = 0; i < hearts.length(); i++) {
			char temp = hearts.charAt(i);
			switch (temp) {
			case 'J':
				heartsCount++;
				break;
			case 'Q':
				heartsCount +=2;
				break;
			case 'K':
				heartsCount +=3;
				break;
			case 'A':
				heartsCount +=4;
				break;
			}
		}
		
		for (int i = 0; i < spades.length(); i++) {
			char temp = spades.charAt(i);
			switch (temp) {
			case 'J':
				spadesCount++;
				break;
			case 'Q':
				spadesCount +=2;
				break;
			case 'K':
				spadesCount +=3;
				break;
			case 'A':
				spadesCount +=4;
				break;
			}
		}
		
		int total = clubsCount + diamondsCount + heartsCount + spadesCount;
		System.out.println("Cards Dealt              Points");
		
		System.out.println("Clubs");
		for (int i = 0; i < clubs.length(); i++) {
			System.out.print(" " + clubs.charAt(i));
		}
		if (clubsCount >= 10) {
			for (int j = 0; j < 24 - clubs.length()*2; j++) {
				System.out.print(" ");
			}
			System.out.print(clubsCount);
		}
		else {
			for (int j = 0; j < 25 - clubs.length()*2; j++) {
				System.out.print(" ");
			}
			System.out.print(clubsCount);
		}
		
		System.out.println("Diamonds");
		for (int i = 0; i < diamonds.length(); i++) {
			System.out.print(" " + diamonds.charAt(i));
		}
		if (diamondsCount >= 10) {
			for (int j = 0; j < 21 - diamonds.length()*2; j++) {
				System.out.print(" ");
			}
			System.out.print(diamondsCount);
		}
		else {
			for (int j = 0; j < 22 - diamonds.length()*2; j++) {
				System.out.print(" ");
			}
			System.out.print(diamondsCount);
		}
		
		System.out.println("Hearts");
		for (int i = 0; i < hearts.length(); i++) {
			System.out.print(" " + hearts.charAt(i));
		}
		if (heartsCount >= 10) {
			for (int j = 0; j < 23 - hearts.length()*2; j++) {
				System.out.print(" ");
			}
			System.out.print(heartsCount);
		}
		else {
			for (int j = 0; j < 24 - hearts.length()*2; j++) {
				System.out.print(" ");
			}
			System.out.print(heartsCount);
		}
		
		System.out.println("Spades");
		for (int i = 0; i < spades.length(); i++) {
			System.out.print(" " + spades.charAt(i));
		}
		if (spadesCount >= 10) {
			for (int j = 0; j < 23 - spades.length()*2; j++) {
				System.out.print(" ");
			}
			System.out.print(spadesCount);
		}
		else {
			for (int j = 0; j < 24 - spades.length()*2; j++) {
				System.out.print(" ");
			}
			System.out.print(spadesCount);
		}
		
		System.out.println();
		if (total >= 10) {
			for (int i = 0; i < 23; i++) {
				System.out.print(" ");
			}
			System.out.print("Total " + total);
		}
		else {
			for (int i = 0; i < 24; i++) {
				System.out.print(" ");
			}
			System.out.print("Total " + total);
		}
	}

}
