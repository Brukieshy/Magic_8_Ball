import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    public static void main (String [] args){

        //declare
        String keepGoing;
        Scanner keyboard;
        int go;
        //initialize
        keyboard = new Scanner(System.in);
        go = 0;
        Random generator  = new Random();
        System.out.println("Welcome! Have all of your dying yes or no questions answered!");
        while (go == 0) {

            System.out.println("Ask me a yes or no question.");
            System.out.println("Type a question and press enter when ready.");
            String answer = keyboard.nextLine();
            int choice = 1 + generator.nextInt(10);
            String response = "";
            if (choice == 1)
                response = "I believe you could.";
            else if (choice == 2)
                response = "Absolutely!";
            else if (choice == 3)
                response = "I see a yes in your future.";
            else if (choice == 4)
                response = "You betcha!.";
            else if (choice == 5)
                response = "YASSSSSS!";
            else if (choice == 6)
                response = "Absolutely not.";
            else if (choice == 7)
                response = "Nahh";
            else if (choice == 8)
                response = "Heck no!";
            else if (choice == 9)
                response = "I see a no in your future.";
            else if (choice == 10)
                response = "Not in a million years.";
            System.out.println(response);
            System.out.println("Would you like to continue?");
            System.out.println("Type 'y' for yes or 'n' for no.");
            keepGoing = keyboard.nextLine();
            go = keepGoing.indexOf("y");
        }



        System.out.println("Thank you for playing the Magic 8 Ball game! Goodbye!");
    }



}







