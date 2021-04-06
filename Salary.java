package Day1;
import java.util.*;


public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basic salary");
		double salary = sc.nextDouble();
		double hra = (40*salary)/100;
		double da =  (60*(salary+hra))/100;
		double annualSalary = (salary+hra+da)*12;
		double tax = 0;
		if(annualSalary < 200000) {
			tax = (0*annualSalary)/100;
		}
		else if(annualSalary >=200000 && annualSalary <= 600000) {
			tax = (10 *annualSalary)/100;
		}
		else if(annualSalary > 600000) {
			tax = (20*annualSalary)/100;
		}
		else {
			tax = 0;
		}
		System.out.println("The tax is "+tax);
		double res = annualSalary-tax;
		System.out.println("The annual Salary is: "+res);

	}

}
