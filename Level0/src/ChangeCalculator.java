

	// Copyright The League of Amazing Programmers 2014
	import javax.swing.JOptionPane;
	public class ChangeCalculator {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		
	
		
		String penny = JOptionPane.showInputDialog("How many counterfeit pennies do you have");
	int penny2 = Integer.parseInt(penny);
		
		String nickel = JOptionPane.showInputDialog("How many nickels have you stolen from your friends");
	int nickel2 = Integer.parseInt(nickel);
		
		String dime = JOptionPane.showInputDialog("How many dimes have you faked");
	int dime2 =	Integer.parseInt(dime);
	
		String quarter = JOptionPane.showInputDialog("How many quarters have you shipped over the border");
	int quarter2 = Integer.parseInt(quarter);
	
		double totalawesomeness = (penny2*1 + nickel2*5 + dime2*10 + quarter2*25  );
		
		JOptionPane.showMessageDialog(null, "You have a total of " + totalawesomeness);
		}
		
		
		
		
		
		// Ask the user how many nickels they have

		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

		
		
		
		
		
		
		
		
		/*
	 * I have a pocket full of change. I hate doing math. Make me a program that
	 * will calculate how much money I have without me having to use my brain. Then
	 * make me a sandwich.
	 */


		}
	



