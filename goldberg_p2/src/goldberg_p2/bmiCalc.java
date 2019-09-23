package goldberg_p2;

import java.util.Scanner;

public class bmiCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int userInput;
		double bmi, weight, height;
		
		System.out.println("Welcome to a BMI calculator!");
		System.out.println("Would you like to use (1)pounds/inches or (2)kilograms/meters? ");
		userInput = sc.nextInt();
		
		if (userInput == 1) {
			
			System.out.println("Enter your weight in pounds: ");
			weight = sc.nextDouble();
			
			System.out.println("Enter your height in inches: ");
			height = sc.nextDouble();
			
			bmi = (703 * weight) / (Math.pow(height, 2));
			
			System.out.println("Your bmi is: ");
			System.out.printf("%.2f", bmi);
			System.out.println("\n\nBMI Categories: \nUnderweight =< 18.5 \nNormal weight = 18.5 - 24.9 \nOverweight = 25 - 29.9 \nObesity = 30 or greater");
			
		}
		else if (userInput == 2) {
			
			System.out.println("Enter your weight in kilograms: ");
			weight = sc.nextDouble();
			
			System.out.println("Enter your height in meters: ");
			height = sc.nextDouble();
			
			bmi = (weight) / (Math.pow(height, 2));
			
			System.out.println("Your bmi is: ");
			System.out.printf("%.2f", bmi);
			System.out.println("\n\nBMI Categories: \nUnderweight =< 18.5 \nNormal weight = 18.5 - 24.9 \nOverweight = 25 - 29.9 \nObesity = 30 or greater");
			
		}
		else System.out.println("You did not enter 1 or 2, exiting program now.");
		
		//System.out.println("Your bmi is: ");
		//System.out.printf("%.2f", bmi);
		}
	}


