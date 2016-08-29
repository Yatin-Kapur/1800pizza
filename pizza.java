/* Yatin Kapur */

import java.util.InputMismatchException;
import java.util.Scanner;

public class PIZZA {

	public static void main (String [] args) {
		System.out.println("No internet? No problem! \nThe phone is your tool for survival. \n");		// welcome
		
		int yes = 0;			// to start the while loop; and assigning variables
		String output = null, number_o = null, number = null; 
		int cases = 0, length, digits = 0;
		boolean ok = true;
				
		Scanner input = new Scanner(System.in);
		
		while (yes == 0) {			// to get the while loop started	
		
			while (ok == true) {		
													
		try {
			
			System.out.println("Enter the amount of times you want to use the program: "); 		// how many test cases
			cases = input.nextInt();		// assign variable cases to the number of cases
			input.nextLine();
			digits = 0;			
			ok = false;
			
			if (cases <= 0) {
				System.out.println("Please enter a valid integer.");
				ok = true;
				yes = 0;
				
			} 			
		} catch (InputMismatchException e) {
			System.out.println("Please enter a valid integer.");
			input.nextLine();
 			ok = true;
 			yes = 0;
 			
		}
		}
			
		while (digits == 0) {	
			
		for (int x = 0; x < cases; x++) {
			
			System.out.println("Enter a 10 digit alphanumeric code: ");		// taking in the test case(s)
			number = input.nextLine(); 		// assign variable number to the code
			number_o = number;
								
			number = number.replace("-", "");				// replacing the characters which are not counted in the ten-digit code
			number = number.replace(" ", "");
			number = number.replace("(", "");
			number = number.replace(")", "");
			number = number.replace("-", "");
			number = number.replace("!", ""); 
			number = number.replace("@", ""); 
			number = number.replace("#", ""); 
			number = number.replace("$", ""); 
			number = number.replace("%", ""); 
			number = number.replace("^", ""); 
			number = number.replace("&", ""); 
			number = number.replace("*", ""); 
			number = number.replace("+", ""); 
			number = number.replace("=", ""); 
			number = number.replace("{", ""); 
			number = number.replace("}", ""); 
			number = number.replace("[", ""); 
			number = number.replace("]", ""); 
			number = number.replace(";", ""); 
			number = number.replace(":", ""); 
			number = number.replace("'", "");  
			number = number.replace("?", ""); 
			number = number.replace(">", ""); 
			number = number.replace("<", ""); 
			number = number.replace(".", ""); 
			number = number.replace(".", ""); 
			number = number.replace("_", ""); 
								
			number = number.replace("a", "2");		// replacing for number 2
			number = number.replace("b", "2");
			number = number.replace("c", "2");
			number = number.replace("A", "2");
			number = number.replace("B", "2");
			number = number.replace("C", "2");
			
			number = number.replace("d", "3");		// replacing for number 3
			number = number.replace("e", "3");
			number = number.replace("f", "3");
			number = number.replace("D", "3");
			number = number.replace("E", "3");
			number = number.replace("F", "3");
			
			number = number.replace("g", "4"); 		// replacing for number 4
			number = number.replace("h", "4");
			number = number.replace("i", "4");
			number = number.replace("G", "4");
			number = number.replace("H", "4");
			number = number.replace("I", "4");
			
			number = number.replace("j", "5");		// replacing for number 5
			number = number.replace("k", "5");
			number = number.replace("l", "5");
			number = number.replace("J", "5");
			number = number.replace("K", "5");
			number = number.replace("L", "5");
				
			number = number.replace("m", "6");		// replacing for number 6
			number = number.replace("n", "6");
			number = number.replace("o", "6");
			number = number.replace("M", "6");
			number = number.replace("N", "6");
			number = number.replace("O", "6");
						
			number = number.replace("p", "7");		// replacing for number 7
			number = number.replace("q", "7");
			number = number.replace("r", "7");
			number = number.replace("s", "7");
			number = number.replace("P", "7");
			number = number.replace("Q", "7");
			number = number.replace("R", "7");
			number = number.replace("S", "7");
			
			number = number.replace("t", "8");		// replacing for number 8
			number = number.replace("u", "8");
			number = number.replace("v", "8");
			number = number.replace("T", "8");
			number = number.replace("U", "8");
			number = number.replace("V", "8");
			
			number = number.replace("w", "9");		// replacing for number 9
			number = number.replace("x", "9");
			number = number.replace("y", "9");
			number = number.replace("z", "9");
			number = number.replace("W", "9");
			number = number.replace("X", "9");
			number = number.replace("Y", "9");
			number = number.replace("Z", "9");
		
			output = number;
			length = output.length();		// counting the length of the string
			if (length >= 10) {
			output = String.format("(%s) %s-%s", 	output.substring(0, 3), 			// formatting the output into telephone number format
													output.substring(3, 6), 
													output.substring(6, 10));
				
			System.out.println("\n" + "Your number output for the code " + number_o + " is " + output
								+ "\nx----------------x---------------x");
								
			yes = 1; 			// end loop
			digits = 1;
			} else if (length < 10) {
				System.out.println("Please enter at least 10 digits");
				digits = 0;
				cases ++;					// so that even if the error accounts for one place, this fills in for it
			}
			
			}
					
			}
		
		}
		
		input.close();		// closing the scanner	
		
													// x---x---x //		
		}
																
	}


	
