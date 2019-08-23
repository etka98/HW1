import java.util.Scanner;
/**
 * 
 * @author Etka Uzun
 * @version 07/10/2018
 * Total profit
 */

public class Pro2_150118504 {

	

	public static void main(String[] args) {
		//Create Scanner
		Scanner scan = new Scanner(System.in);
        
		//variables
		double salary;
		double salaryPercent;
		double interestRate;
		double supportRate;
		double accountValue;
		double salaryToSave;
		//program code
		
		System.out.print("PLEASE ENTER YOUR MONTHLY SALARY :");
		salary = scan.nextDouble();
		System.out.print("PLEASE ENTER THE PERCENT OF YOUR SALARY TO SAVE :");
		salaryPercent = scan.nextDouble();
		System.out.print("PLEASE ENTER THE MONTHLY INTERST RATE :");
		interestRate = scan.nextDouble();
		System.out.print("PLEASE ENTER THE MONTHLY GOVERNMENT SUPPORT RATE :");
		supportRate = scan.nextDouble();
		 
		salaryToSave = salary * salaryPercent / 100;
		accountValue = salaryToSave;
		//first month
		accountValue = accountValue * ( 1 + supportRate / 100) * ( 1 + interestRate / 100);
		System.out.println("AFTER THE FIRST MONTH THE ACCOUNT VALUE IS :" + ((int)(accountValue *100)) / 100.0 + " TLs");

		//second month
		accountValue = ( accountValue + salaryToSave * ( 1 + supportRate / 100)) * ( 1 + interestRate / 100);
		System.out.println("AFTER THE SECOND MONTH THE ACCOUNT VALUE IS :" + ((int)(accountValue *100)) / 100.0 + " TLs");
		
		//third month
		accountValue = ( accountValue + salaryToSave * ( 1 + supportRate / 100)) * ( 1 + interestRate / 100);
		System.out.println("AFTER THE THIRD MONTH THE ACCOUNT VALUE IS :" +((int)(accountValue *100)) / 100.0 + " TLs");
		
		//fourth month
		accountValue =( accountValue + salaryToSave * ( 1 + supportRate / 100)) * ( 1 + interestRate / 100);
		System.out.println("AFTER THE FOURTH MONTH THE ACCOUNT VALUE IS :" + ((int)(accountValue *100)) / 100.0 + " TLs");
		
		//fifth month
		accountValue = ( accountValue + salaryToSave * ( 1 + supportRate / 100)) * ( 1 + interestRate / 100);
		System.out.println("AFTER THE FIFTH MONTH THE ACCOUNT VALUE IS :" + ((int)(accountValue *100) )/ 100.0 + " TLs");
		
		//sixth month
		accountValue = ( accountValue + salaryToSave * ( 1 + supportRate / 100)) * ( 1 + interestRate / 100);
		System.out.println("AFTER THE SIXTH MONTH THE ACCOUNT VALUE IS :" + ((int)(accountValue *100) )/ (100.0)+ " TLs");
		
		// total profit
		
		System.out.println("In total, you saved " + (6 * salaryToSave)
				+ " TLs and your total profit is " + ((int)((accountValue - 6 * salaryToSave) * 100) / 100.0) + " TLs");
		 
		
		

	}

}


