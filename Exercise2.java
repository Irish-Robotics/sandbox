/*************************************
* Programmer: Devi DeYoung
* Exercise2: IPO
* Irish Robotics
* Fall 2018
* Date completed: 11/21/18
**************************************
* Program Explanation
* 
* Write about what your program does, how it does it, and why.
* 
**************************************/

import  java.util.Scanner 

/**
 *
 * @author Devi DeYoung
 */

    //This line makes the code public and names it Exercise 2.
public class Exercise2 {

    //Explain what this line does (then delete this comment).
    public static void main(String[] args) 
    
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
       int userNumber=""
        String userInput=""

        //creating scanner object
        Scanner keyboard= new Scanner(System.in);
        
        //Asks user to enter their name
        System.out.print(Enter your name:"");
        userInput=keyboard.nextLine();

        //asking user to enter number
        System.out.print(Enter a number:"");

        //setting input equal to the user number
        userNumber=keyboard.nextInt();

        //outputs the userNumber and userInput
        System.out.println(Your name is: "" + userInput);
        System.out.println(Your number is ""+ userNumber)
    }

    
}
