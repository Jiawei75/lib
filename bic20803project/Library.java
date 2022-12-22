package bic20803project;

import java.util.InputMismatchException;

//Java Program to Illustrate Application CLass
//To Create The Menu For the Program

//Importing required classes
import java.util.Scanner;

//Class
public class Library {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating object of Scanner class
		// to take input from user
		Scanner input = new Scanner(System.in);
		
		librarian lb = new librarian();
		System.out.println(lb.getCode() + " ---> LOGIN SUCCESSFULLY");
		
		// Displaying menu
		System.out.println("\n**********************Welcome to the UTHM PTTA Library!**********************");
		System.out.println("                     Select From The Following Options:			 ");
		System.out.println("*****************************************************************************");

		// Creating object of book class
		books ob = new books();
		
		// Creating object of students class
		students obStudent = new students();

		int choice;
		int searchChoice;

		// Creating menu
		// using do-while loop
		do {
			ob.dispMenu();
			choice = input.nextInt();

			// Switch case
			switch (choice) {

			// Case 
			case 1:
				book b = new book();
				ob.addBook(b);
				break;

			// Case 
			case 2:
				ob.upgradeBookQty();
				break;

			// Case 
			case 3:
				do {
				System.out.println(" Press 1 to Search with Book Serial No. ");
				System.out.println(" Press 2 to Search with Book's Author Name. ");
				
				// constraint of searching book
				searchChoice = input.nextInt();
				if(!(searchChoice == 1 || searchChoice == 2)) {
					System.out.println("Error Input !!!");
					input.nextLine();
					}
				}while(!(searchChoice == 1 || searchChoice == 2));

				// Nested switch
				switch (searchChoice) {
				
				// Case 
				case 1:
					ob.searchBySno();
					break;
				
				// Case 
				case 2:
					ob.searchByAuthorName();
				}
				break;

			// Case
			case 4:
				ob.showAllBooks();
				break;

			// Case
			case 5:
				Student s = new Student();
				obStudent.addStudent(s);
				break;

			// Case
			case 6:
				obStudent.showAllStudents();
				break;

			// Case
			case 7:
				obStudent.checkOutBook(ob);
				break;

			// Case
			case 8:
				obStudent.checkInBook(ob);
				break;
				
			// Case
			case 9:
				ob.borrowRecord(ob.searchBook());
				break;
				
			case 0:
				// Print statement
				System.out.println("\t\t----------THANK YOU AND WELCOME AGAIN TO UTHM PTTA LIBRARY----------");
				break;
				
			// Default case that will execute for sure
			// if above cases does not match
			default:
				System.out.println("ERROR INPUT !!! PLEASE Re-enter again...\n");
			}
		// Checking condition at last where we are
		// checking case entered value is not zero
		}while (choice != 0);
	}
}
