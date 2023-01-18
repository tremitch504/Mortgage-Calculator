// public: access modifier 
// class: container for related functions, use to organize our code.
//input parameters: (String[] args)
//final: keyword is useful when you want a variable to always store the same value, cannot be overridden
//byte: primitive to store simple values. 8-bits size. max: 127

//java.util.Scanner: Want to add data to the program on the fly while its running?
//import from the java util package 
//system.in will be able to get data from the User.
//scanner.nextInt(): scanner takes the input data as an int. method of the scanner class to scan the input.

//When you declare a variable. that variable scopes to the block in which its defined.

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;

        Scanner scanner = new Scanner(System.in);
        
//What if the user is putting in a invalid answer/input?
//we need to ask the same question over again until we get a valid answer
//Infinite loop.

while(true){
    System.out.print("Principal: ");
    principal = scanner.nextInt();
    //if the given input is greater than or equal 1000 and less than or eqaul to 1,000,000
    //break out of the infinite loop
    if(principal >= 1000 && principal <= 1_000_000) 
       break;

       //if it is valid. lets print an error message to ask the user to enter a valid input
       System.out.println("Please enter a value between 1,000 and 1,000,000");


}
       
    
       





    }

}
