/*-------------------------------------------------------------
//AUTHOR: Chris Iang
//FILENAME: Lab3.
//SPECIFICATION: a program which takes 3 user inputs as homework grade, midterm grade, and final grade. Then, the program calculates the weighted total and shows if the student pass the class.
//FOR: CS 1400- Lab #3
//TIME SPENT: 1hr
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab3 {
 public static void main(String[] args) {
     // This scanner is prepared for you to get inputs
     Scanner scan = new Scanner(System.in);
     // Declare three variables for HW, midterm, and final exam grades
     // -->
     double hw = 0;
     double midterm = 0;
     double exam = 0;
     // Declare a loop control variable i
     // -->
     int i = 0;

     while (i<3) {
         // Design if-else control flow:
         //
         // if i is 0, asks for the homework grade
         // if i is 1, asks for the midterm exam grade
         // if i is 2, asks for the final exam grade
         //
         // You have to let the user re-try if any of the inputs is invalid.
         // - homework grade is in [0, 100]
         // - midterm grade is in [0, 100]
         // - final exam grade is in [0, 200]
         //
         // The first if-else statement is attached for your reference. You have to
         // finish the last two statments by yourself.

         if (i == 0) {
             // Ask the user for homework grade
             // -->
        	 System.out.println("Enter your homework grade: ");
        	 hw = scan.nextDouble();
             // Do input validation
             // -->
             if (hw > 100 || hw < 0) {
                 // Show the error message
                 // -->
            	 System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100].");
             } else {
                 // Update the loop variable
                 // -->
            	 i++;
             }
         }   
         // The other two if statements go here
         // -->
         else if(i == 1)
         {
        	 System.out.println("Enter your midterm grade: ");
        	 midterm = scan.nextDouble();
        	 
        	 if(midterm > 100 || midterm < 0)
        	 {
        		 System.out.println("[ERR] Invalid input. A midterm grade should be in [0, 100].");
        	 }
        	 else
        	 {
        		 i++;
        	 }
         }
         else
         {
        	 System.out.println("Enter your final grade: ");
        	 exam = scan.nextDouble();
        	 
        	 if(exam > 200 || exam < 0)
        	 {
        		 System.out.println("[ERR] Invalid input. A final grade should be in [0, 200] .");
        	 }
        	 else
        	 {
        		 i++;
        	 }
         }
     }

     // Calculate the weighted total 
     // -->
    double total = hw*0.25 + midterm*0.25 + exam/2*0.5;

     // Show the weighted total and tell the user s/he passed or not
     // -->
    System.out.printf("[INFO] Student's weighted total is %.2f%%\n", total);
    if (total >= 50) {
         // Print "Student PASSED the class."
    	 System.out.println("[INFO] Student PASSED the class!");
     } else {
         // Print "Student FAILED the class."
    	 System.out.println("[INFO] Student FAILED the class!!!!!");
     }

     scan.close();

 }  // End of main
}  // End of class
