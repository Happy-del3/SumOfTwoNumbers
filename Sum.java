// Access and get user input
import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        // Declare variables  
        int firstNumber, secondNumber, sum;
    
        // Instantiate --> Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt for user to enter the firstNumber   
        System.out.print("Please enter the first number: ");
 
        // Read an integer from the input, entered by the user and store it to the firstNumber
        firstNumber = input.nextInt();
 
        // Prompt for user to enter the secondNumber
        System.out.print("Please enter the second number: ");
 
        // Read an integer from the input, entered by the user and store it to the secondNumber
        secondNumber = input.nextInt();

        // Call / Invoke determineSum()
        sum = determineSum(firstNumber, secondNumber);
   
        // Call / Invoke displaySum()
        displaySum(firstNumber, secondNumber, sum);

    }
    public static int determineSum(int firstNumber, int secondNumber){
        // Determine sum of the two numbers
        int sum;

        return sum = firstNumber + secondNumber;

    }
    public static void displaySum(int firstNumber, int secondNumber, int sum){
        // Display sum of the two numbers
     
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum );
   
    }

}
     
