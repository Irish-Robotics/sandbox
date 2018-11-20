/*************************************
* Programmer:Katie Guthrie
* Exercise2: IPO
* Irish Robotics
* Fall 2018
* Date completed: 11/??/18
**************************************
* Program Explanation
* 
* Write about what your program does, how it does it, and why.
* 
**************************************/

import  java.util.Scanner 
/**
 *
 * @author Your Name
 */

    //This makes the code public and names it
public class Exercise2 {

    //Explain what this line does (then delete this comment).
    public static void main(String[] args) 
    {
        /* Review the JavaBook Wiki page at

        https://github.com/reateach/JavaBook/wiki/Strings

        Then, do the following:

        1. Get a user's name
        2. Get an integer (intOne)
        3. Get another integer (intTwo)
        4. Calculate the sum, difference, product, and quotient. Store them a svariables.
        5. Output the user's name
        6. Output the sum of the numbers
        7. Output the difference of the numbers
        8. Output the product of the numbers
        9. Output the quotient of the numbers (anything off?)

        */

        // Make sure to explaine everything about your code.
         //creating int to store user input
         String userName = "";
         int intOne = 0;


         //creating scanner object
         Scanner keyboard = new Scanner(System.in);
 
         //asking user to enter name
         System.out.print("Enter your name: ");
         //setting input equal to the userName
         userName = keyboard.nextLine();
 
         System.out.print("Enter a number: ")
         intOne= keyboard.nextInt()
         //outputs all inputs
         System.out.println("Your name is " + userName);
         System.out.println("Your first number is " + intOne);


        
    }
    
}
