package Day1;

import java.util.Scanner;

public class Suffixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date");
		int date = sc.nextInt();
		int endnum = 0;
		if(date > 31 || date <= 0) {
			System.out.println("Invalid date");
		}
		else {
			endnum = date % 10;
			if(endnum == 1) {
				System.out.println(date+"st");
			}
			else if(endnum == 2) {
				System.out.println(date+"nd");
			}
			else if(endnum == 3) {
				System.out.println(date+"rd");
			}
			else {
				System.out.println(date+"th");
			}
		}
		
		
		

	}

}
