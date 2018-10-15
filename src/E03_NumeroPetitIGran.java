/*
Author: Alexander Moreno Castro
Initial date: 15/10/18
Ending date: 15/10/18
Objective: Program that requests two numbers  (if the first number is higher or the same than second, the value of numbers will be exchanged).
*/
import java.util.Scanner;
public class E03_NumeroPetitIGran {
    //Declared variables
    public static void main(String[] args) {
        Scanner requestNumber;
        double firstNumber;
        double secondNumber;
        double support;
    //Library is initialized
        requestNumber = new Scanner(System.in);
    //Welcome message for the user and request for the first number
        System.out.println("Please, insert the first number and click the enter key.");
        firstNumber = requestNumber.nextDouble();
        requestNumber.nextLine();
    //Request for the second number
        System.out.println("Please, insert the second number and click the enter key.");
        secondNumber = requestNumber.nextDouble();
        requestNumber.nextLine();
    //Now, the program is going to calculate those numbers
        if (firstNumber < secondNumber) {
            System.out.println("These are your numbers: ");
            System.out.println("First Number: " + firstNumber + ".");
            System.out.println("Second Number: " + secondNumber + ".");
        }   else if (firstNumber > secondNumber) {
                support = secondNumber;
                secondNumber = firstNumber;
                firstNumber = support;
                System.out.println("Numbers's values have exchanged, now these are your numbers: ");
                System.out.println("First Number: " + firstNumber + ".");
                System.out.println("Second Number: " + secondNumber + ".");
        }   else{
                support = secondNumber;
                secondNumber = firstNumber;
                firstNumber = support;
                System.out.println("Numbers's values have exchanged, now these are your numbers: ");
                System.out.println("First Number: " + firstNumber + ".");
                System.out.println("Second Number: " + secondNumber + ".");
            }

    } }
















        /*//Program shows them by screen
        if (firstNumber < secondNumber) {
            System.out.println("These are the numbers you wrote: " + firstNumber + ", " + secondNumber + ".");
        }
        else if (firstNumber >= secondNumber) {
            System.out.println("These are the numbers you wrote: " + secondNumber + ", " + firstNumber + ".");

        }}}*/
