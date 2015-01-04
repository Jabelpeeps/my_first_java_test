package Jabel_First;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class test {
  
	public static void main(String[] args) {
		
		System.out.println("Select example code to run:-");
		System.out.println("1 - add two static numbers");
		System.out.println("2 - greeting dialogs");
		System.out.println("3 - area calculator");
		int option;
		
		try (Scanner user_input = new Scanner(System.in)) {
			do {
				System.out.print("Please enter only:- 1, 2 or 3 ");
				while (!user_input.hasNextInt() ) {
					System.out.print("Please enter numbers only. ");
					user_input.next();
				}
			option = user_input.nextInt();
			} while ( option > 3 || option == 0 );
		}
		switch (option) {
			case 1:
			//brief code to add two int's
				int first_number = 10;
				int second_number = 25;
				System.out.println(first_number + " + " + second_number + " = "	+ (first_number + second_number));
			
				break;				
			
			case 2:
			//example code to use JOptionPane class for user input.
				String first_name, second_name, full_name;
				
				first_name = JOptionPane.showInputDialog("What is your first name?", "Type here");
				second_name = JOptionPane.showInputDialog("What is your last name?", "Here again");
				full_name = "Hello " + first_name + " " + second_name;
				
				JOptionPane.showMessageDialog(null, full_name, "And Finally..", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				
				break;
			
			case 3:
			//example code to calculate the area of rectangles	
					
				String width, length;
				width = JOptionPane.showInputDialog("What is the width of your rectangle?");
				length = JOptionPane.showInputDialog("What is the length of your rectangle?");
				
				float area = Float.valueOf(width) * Float.valueOf(length);
				
				JOptionPane.showMessageDialog(null, "The area of your rectangle is " + area);
				System.exit(0);
				
				break;
			}
		}
	}

		//example code to use Scanner class for user input.
		/*
		String first_name;
		System.out.print("What is your first name? ");
		first_name = user_input.next();
		
		String second_name;
		System.out.print("What is your last name? ");
		second_name = user_input.next();
		
		String full_name;
		full_name = first_name + " " + second_name;
		System.out.println("Hello " + full_name);
		*/	