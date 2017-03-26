/*
 * Program that calculates compound interest.
 */

import java.text.NumberFormat;

public class CompoundInterest {
	public static void main(String[] args) {	

		double money = 1000;
		double interest = 0.00830;
		int months;

		for(int i = 0; i < 12; i++)
		money += money * interest;

		NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

		System.out.print(numberFormat.format(money));
	}
}