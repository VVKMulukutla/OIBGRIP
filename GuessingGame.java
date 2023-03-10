import java.util.*;

public class GuessingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int roundCounter = 1, marks = 0,attemptCount, guess = -1;
        System.out.println("<------------Welcome to the Number Guessing Game------------>");
        System.out.println("Guess the number correctly to win the game!!");
        System.out.print("Do you wish to play this fun game?(Y/N) : "); char ch = sc.nextLine().toLowerCase().charAt(0);
        if(ch == 'y'){
            System.out.println("\nPerfect! Lets start the Game.\n");
            System.out.println("This Game consists of 3 Rounds.\nGuess the number correctly in more than 2 rounds to win!\n");
            while(roundCounter != 4) {
                attemptCount = 1;
                System.out.println("<----------------------------------------------------------->");
                System.out.println("ROUND - " + roundCounter);
                int x = rd.nextInt(101);
                System.out.println("Now, the Rando-Number has been generated!");
                System.out.println("It is now the time to guess it.");
                System.out.println("You have five attempts to clear it!\n");
                while (x != guess) {
                    System.out.print("Enter your guess : ");
                    guess = sc.nextInt();
                    if (x < guess) {
                        System.out.println("Your guess is Higher than the Surprise Number.\n");
                        //System.out.println("Try for a number of Lower Value!");
                    } else {
                        System.out.println("Your guess is Lower than the Surprise Number.\n");
                        //System.out.println("Try for a number of Higher Value!");
                    }
                    ++attemptCount;
                    if (attemptCount == 6) break;
                }
                System.out.println("\nRound - "+roundCounter+" - Outcome : ");
                if (x == guess) {
                    System.out.println("HOORAY!! Bulls Eye!\n");
                    System.out.println("You have successfully Guessed the number correctly!\n");
                    ++marks;
                    if (roundCounter != 3) {
                        System.out.println("Keep up the spirit and Let's Move on to the Next Round!");
                    } else {
                        System.out.println("You have Guessed the Number in the Final Round.");
                    }
                }
                if (attemptCount == 6) {
                    System.out.println("You Ran out of your attempts, Mr.Player!");
                    if (roundCounter != 3) {
                        //System.out.println("But you try in the next round and I'm Sure you can do this!");
                    } else {
                        System.out.println("With this Round, We Finished the game!");
                        System.out.println("Time for the Results.");
                    }
                }
                ++roundCounter;
            }
            System.out.println("<----------------------------------------------------------->");
            if (marks >= 2) {
                System.out.println("You Have Guessed the correct number in more than 2 rounds!");
                System.out.println("YOU WON THE GAME!!!");
            } else {
                System.out.println("You haven't guessed the correct number for at least 2 Rounds!");
                System.out.println("Very sad to say that you LOST the Game.!");
            }
            System.out.println("<----------------------------------------------------------->\n\n");
            System.out.println("Thank you for playing this game and Have a Wonderful Day!");
        } else if(ch == 'n'){
            System.out.println("Understandable, Have a nice day :)");
        } else{
            System.out.println("Please run again and enter a valid choice!");
        }
        sc.close();
    }
}
