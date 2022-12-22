package bic20803project;

//Java Program to Illustrate book Class that
//takes Input from the books and related information

//Importing required classes
import java.util.Scanner;

//Class
public class book {

 // Class data members
 public long serialNo;
 public String bookName;
 public String authorName;
 public int bookQty;
 public int bookQtyCopy;
 
 Student[] historyStudent = new Student[10];
 int history = 0;

 // Creating object of Scanner class to
 // read input from users
 Scanner input = new Scanner(System.in);

 // Method
 // To add book details
 public book()
 {
     // Display message for taking input later
     // taking input via
     // nextInt(), nextLine() and nextLong() standard methods
     System.out.println("Enter Serial No of Book:");
     this.serialNo = input.nextLong();
     input.nextLine();	// advances this scanner past the current line and returns the input that was skipped 
     
     System.out.println("Enter Book Name:");
     this.bookName = input.nextLine();

     System.out.println("Enter Author Name:");
     this.authorName = input.nextLine();

     System.out.println("Enter Quantity of Books:");
     this.bookQty = input.nextInt();
     this.bookQtyCopy = this.bookQty;
 }
 
 public void borrowStudent(Student student) {
	 for(int i = history; i < 10; i++) {
		 if(this.historyStudent[i] == null) {
			 this.historyStudent[i] = student;
			 history++;
			 break;
		 }
	 }
  }
}

//check out = borrow
//check in = return