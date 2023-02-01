// public: access modifier 
// class: container for related functions, use to organize our code.
//input parameters: (String[] args)
//final: keyword is useful when you want a variable to always store the same value, cannot be overridden
//byte: primitive to store simple values. 8-bits size. max: 127

//java.util.Scanner: Want to add data to the program on the fly while its running?
//import from the java util package 
//system.in will be able to get data from the User. 
//scanner.nextInt(): scanner takes the input data as an int. method of the scanner class to scan the input.
//float: primitive, for decimal values and larger values
//When you declare a variable. that variable scopes to the block in which its defined.

//to formant a decimal number properly and round it we can use a Java class called number formant
//NumberFormant.getCurrencyInstance().formant()

//If using java built in classes import
import java.util.Scanner; 
import java.text.NumberFormat; 
public class Main {
    
    //declare a constant, meaning that this variable could not not be changed.
    private static final int MONTHS_IN_YEAR = 12;
    public static void main(String[] args){
        // final byte MONTHS_IN_YEAR = 12; 
        final byte PERCENT = 100;
        int principal = 0;
        float monthlyInt = 0;
        int numbersOfPayments = 0;

        Scanner scanner = new Scanner(System.in);
        
//What if the user is putting in a invalid answer/input?
//we need to ask the same question over again until we get a valid answer
//Infinite loop.

while(true){
    System.out.print("Enter Principal: ");
    principal = scanner.nextInt();
    //if the given input is greater than or equal 1000 and less than or eqaul to 1,000,000
    //break out of the infinite loop
    if(principal >= 1000 && principal <= 1_000_000) 
       break;

       //if it is valid. lets print an error message to ask the user to enter a valid input
       System.out.println("Please enter a value between 1,000 and 1,000,000");
}


while(true){
    //asking the user to enter an Annual Intrest Rate
    System.out.print("Annual Interest Rate: ");
    //Whatever the user enter as the value, it will equal to this annual interest varible 
    float annInterest = scanner.nextFloat();
    if(annInterest >= 1 && annInterest <= 30){
        //calculate the monthly interest rate.
        //i = monthly interest rate 
        monthlyInt = annInterest / PERCENT / MONTHS_IN_YEAR;
        break;
    }
    System.out.println("Enter a value between 1 and 30");
}

while(true){
    //How many years?
    System.out.print("Preiod (Years): ");
    byte years = scanner.nextByte();
    //check if a user enters a valid input
    if(years >= 1 &&  years <= 30){
        numbersOfPayments = years * MONTHS_IN_YEAR;
         break;
    }
    System.out.println("Enter a value between 1 and 30.");
}

scanner.close(); //potential resource leak, so we need to close our scanner
//Calculate the monthly payment using the formula
//need a varible to hold the monthly payment

double monthlyPayment = principal * ((monthlyInt * (Math.pow(1 + monthlyInt, numbersOfPayments))) / (Math.pow(1 + monthlyInt, numbersOfPayments) - 1 ));

//then lets print out the monthly payment result.
System.out.println("Monthly payment: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));


//What if the user wants to know how much is needed to payback
System.out.println("Total payback amount: " + NumberFormat.getCurrencyInstance().format(monthlyPayment * numbersOfPayments));
 }

}
