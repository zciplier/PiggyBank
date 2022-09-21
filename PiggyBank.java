/*
 * This project is made by Zander Coffman (@zciplier on GitHub) on the date of 9/18/2022
 * This program gets the user's input of whether they have a cent, dime, nickel, or a quarter
 * and multiplies it by the price of the value and adds it to the money variable to get the total
 * and then prints it to console.
 * This uses a while loop to continue the loop while the button "NO" is not pressed.
 */
import javax.swing.JOptionPane;
public class PiggyBank 
{

	public static void main(String[] args) 
	{
		//constant variables that says the price of each type of money
		final double CENT_PRICE = 0.01;
		final double DIME_PRICE = 0.10;
		final double NICKEL_PRICE = 0.50;
		final double QUARTER_PRICE = 0.25;
		int amount_of_cents = 0;
		int amount_of_dimes = 0;
		int amount_of_nickels = 0;
		int amount_of_quarters = 0;
		String[] options = {"Penny", "Dime", "Nickel", "Quarter", "See money.", "Cancel"};
		//the variables are used to multiply the amount of coins that the user has
		//asks the user for how many coins they have
		double money = 0.00;
		//this variable is set to true to keep track of whether the program should run or not
		boolean run = true;
		while (run == true)
		{
			int choice = JOptionPane.showOptionDialog(
					null, 
					"Would you like to add pennie(s), dime(s), nickel(s), or quarter(s)?", 
					"Choose an Option.",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.DEFAULT_OPTION,
					null,
					options,
					options[0]);
			
			if (choice == 0)
			{
				String money_placeholder_CENTS = JOptionPane.showInputDialog("How many cents would you like to add?");
				amount_of_cents += Integer.parseInt(money_placeholder_CENTS);
				money += (CENT_PRICE * Integer.parseInt(money_placeholder_CENTS));
				JOptionPane.showMessageDialog(null, "You have $" + money + " dollar(s) in the bank.");
			}
			else if (choice == 1)
			{
				String money_placeholder_DIME = JOptionPane.showInputDialog("How many dimes would you like to add?");
				amount_of_dimes += Integer.parseInt(money_placeholder_DIME);
				money += (DIME_PRICE * Integer.parseInt(money_placeholder_DIME));
				JOptionPane.showMessageDialog(null, "You have $" + money + " dollar(s) in the bank.");
			}
			else if (choice == 2)
			{
				String money_placeholder_NICKEL = JOptionPane.showInputDialog("How many nickels would you like to add?");
				amount_of_nickels += Integer.parseInt(money_placeholder_NICKEL);
				money += (NICKEL_PRICE * Integer.parseInt(money_placeholder_NICKEL));
				JOptionPane.showMessageDialog(null, "You have $" + money + " dollar(s) in the bank.");
			}
			else if (choice == 3)
			{
				String money_placeholder_QUARTER = JOptionPane.showInputDialog("How many quarters would you like to add?");
				amount_of_quarters += Integer.parseInt(money_placeholder_QUARTER);
				money += (QUARTER_PRICE * Integer.parseInt(money_placeholder_QUARTER));
				JOptionPane.showMessageDialog(null, "You have $" + money + " dollar(s) in the bank.");
			}
			else if (choice == 4)
			{
				JOptionPane.showMessageDialog(null, "You have $" + money + " dollar(s) in the bank.");
				JOptionPane.showMessageDialog(null, "You have " + amount_of_cents + " pennies, " + amount_of_dimes + " dimes, " + amount_of_nickels + " nickels, and " + amount_of_quarters + " quarters.");
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Goodbye! You deposited $" + money + " into your bank account.");
				run = false;
			}
		}
	}
}