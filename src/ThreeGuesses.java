import java.util.Scanner;
public class ThreeGuesses {
    // Written by Joy Hosny
    // Writing a code to let the user type in a code to get access to their bank account.
    // the user only get 3 chances.
 public static void main(String[] args) {
    
    Scanner pass = new Scanner(System.in);
    int code, guess1, guess2, guess3;
    code = 51;
    System.out.print("Welcome to Everyday Bank.");
    System.out.print( "\n" + "Please enter your secret code:  ");
    guess1 = pass.nextInt();
    
    if (code == guess1)
        System.out.println("Correct! Go ahead.");
    else {
        System.out.print("Sorry, that is not it. Try again: ");
        guess2 = pass.nextInt();
        if (code == guess2)
            System.out.println("Fine, go ahead.");
        else {
            System.out.print("Sorry, last chance. Try again: ");
            guess3 = pass.nextInt();
            if (code == guess3)
                System.out.println("Fine, go ahead.");
            else {
                System.out.println("You have entered the wrong password. Please call for help.");
        }}}
    }}


        
         
            
    