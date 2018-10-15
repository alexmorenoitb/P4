/*
Author: Alexander Moreno Castro
Initial date: 15/10/18
Ending date: 15/10/18
Objective: Program that requests an integer and tells us if this number is positive, negative or zero.
*/
import java.util.Scanner;
public class E01_TipusSencer {
    //Declared variables.
    public static void main(String[] args){
        Scanner requestInteger;
        int integer;
    //Library is initialized
        requestInteger = new Scanner(System.in);
    //Welcome message for the user and request for the integer
        System.out.println("Please, insert the integer and click the enter key.");
    //Determining if the number is an integer and then, if it's positive, negative or zero.
        if (requestInteger.hasNextInt()) {
            integer = requestInteger.nextInt();
            requestInteger.nextLine();
            System.out.println("Now I am going to tell you if it is negative, positive or zero:");
            System.out.println("");
            if (integer > 0){
                System.out.println("That integer is positive.");
            }   else if (integer == 0) {
                System.out.println("That integer is zero.");
            }   else {
                System.out.println("That integer is negative.");
            }
        }   else {System.out.println("That's not an integer.");
            }
}
    }
