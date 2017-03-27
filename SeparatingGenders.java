/*
 * Program that shows amount of men and women.
 * Calculates the average age of men and the
 * average weight of women.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class SeparatingGenders {

	Scanner input = new Scanner(System.in);

	private String name;
	private char gender;
	private int age;
	private double weight; 

	private int ageMale;      // used to count age of men
	private int weightFemale; // used to count weight of women

	private int male;    // used to count men
	private int female;  // used to count women

	private boolean goAhead = true;

	// it separates men from women with theirs age and weight  
	public void detailsGender() {

		if (gender == 'm') {
			male++;
			ageMale += age;
		} else if (gender == 'f') {
			female++;
			weightFemale += weight;
		}
	} // end method detailsGender()

	public void inputs() {
		for (int i = 0; i < 10; i++) {
			do {
				try {
					System.out.print("Enter your name: ");
					name = input.next();

					System.out.print("Enter your gender (m/f): ");
					gender = input.next().charAt(0);

					System.out.print("Enter your age: ");
					age = input.nextInt();

					System.out.print("Enter your weight: ");
					weight = input.nextDouble();

					goAhead = false;

					System.out.println();

					detailsGender();
				} catch (InputMismatchException e2) {
					System.err.println("ERROR! No letters allowed!");
					break;
				}
			} while (goAhead);
		}
	}

	// show informations 
	public void info() {

		System.out.println("There are " + male + " men and " + female
				+ " women.");

		try {
			System.out.println("Average age men: " + ageMale / male);
			System.out
					.println("Average weight women: " + weightFemale / female);
		} catch (ArithmeticException e) {
			System.err.println("ERROR! Division by zero!");
		}
	} // end method info()
}