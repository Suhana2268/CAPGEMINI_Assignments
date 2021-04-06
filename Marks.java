package Day1;
import java.util.Scanner;
import java.util.*;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks of the subjects English, Java, DB, SpringTools");
		int englishMark = sc.nextInt();
		int java = sc.nextInt();
		int db = sc.nextInt();
		int springTools = sc.nextInt();
		int total_marks = englishMark+java+db+springTools;
		System.out.println("Total Marks are:"+ total_marks);
		float average = total_marks/4;
		System.out.println("Average is:" + average);
		
		
		

	}

}
