import java.util.Scanner;
/**
 * 
 * @author Etka Uzun
 * @version 07/10/2018
 * A class to find perpendicular bisector of a line
 */

public class Pro1_150118504 {

	public static void main(String[] args) {
		// Create Scanner
		
		Scanner scan = new Scanner(System.in);
		
		// VARIABLES
		
		double x1, x2, y1, y2; 
		double slope;
		double x_mid, y_mid;
		double m;
		double y_intercept;
		String equation;
		
		// VALUES
		
		System.out.print("PLEASE ENTER VALUE OF x1 :");
		x1 = scan.nextDouble();
			
		System.out.print("PLEASE ENTER VALUE OF x2 :");
	    x2 = scan.nextDouble();
		
		System.out.print("PLEASE ENTER VALUE OF y1 :");
		y1 = scan.nextDouble();
		
		System.out.print("PLEASE ENTER VALUE OF y2 :");
		y2 = scan.nextDouble();
		
		// Create operation
		
		slope = (y2 - y1) / (x2 - x1);
		x_mid = (x2 + x1) / 2;
		y_mid = (y2 + y1) / 2;
		m = Math.pow(slope, -1) * -1;
		y_intercept = y_mid - m * x_mid;
		equation = "y = " + m + "x + " + y_intercept; 
		// the equation of the bisector line
		
		System.out.println("The equation of the perpendicular bisector of the line segment between (" + x1 + ","
		+ y1 + ") and (" + x2 + "," + y2 + ") is " + equation );
		
		
		
		
		
		

	}

}

