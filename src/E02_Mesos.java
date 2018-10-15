/*
Author: Alexander Moreno Castro
Initial date: 15/10/18
Ending date: 15/10/18
Objective: Program that requests a number of a month and show which month is by screen.
*/
import java.util.Scanner;
public class E02_Mesos {
    //Declared variables
    public static void main(String[] args){
        Scanner requestNumber;
        int monthNumber;
    //Library is initialized
        requestNumber = new Scanner(System.in);
    //Welcome message for the user and request for the number
        System.out.println("Please, insert the number of the month and click the enter key.");
        monthNumber= requestNumber.nextInt();
        requestNumber.nextLine();
    //Determining which month is.
            switch (monthNumber) {
                case 1:
                    System.out.println("That month is January.");
                    break;
                case 2:
                    System.out.println("That month is February.");
                    break;
                case 3:
                    System.out.println("That month is March.");
                    break;
                case 4:
                    System.out.println("That month is April.");
                    break;
                case 5:
                    System.out.println("That month is May.");
                    break;
                case 6:
                    System.out.println("That month is June.");
                    break;
                case 7:
                    System.out.println("That month is July.");
                    break;
                case 8:
                    System.out.println("That month is August.");
                    break;
                case 9:
                    System.out.println("That month is September.");
                    break;
                case 10:
                    System.out.println("That month is October.");
                    break;
                case 11:
                    System.out.println("That month is November.");
                    break;
                case 12:
                    System.out.println("That month is December.");
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 12 (January to December), just integers.");
            }
    }
}
