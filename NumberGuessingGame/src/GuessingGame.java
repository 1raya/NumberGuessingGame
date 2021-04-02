import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    int gameLevel;
    String playAgain;
    public GuessingGame(){
        System.out.println("Select Game Level :");
        System.out.println("1 = EASY , 2 = MEDIUM , 3 = DIFFICULT") ;
        System.out.print("Your Choice? ");
        gameLevel = input.nextInt(); }

    public void startPlay () {
        int num, userGuess = 0;
        int Counter = 0;

        if (gameLevel == 1) {
            num = random.nextInt(10) + 1;
            System.out.println("Try to guess the number from 1-10 ");
        } else if (gameLevel == 2) {
            num = random.nextInt(30) + 1;
            System.out.println("Try to guess the number from 1-30 ");
        } else {
            num = random.nextInt(50) + 1;
            System.out.println("Try to guess the number from 1-50 "); }

        // Creating the instance of user
        User user1 = new User();
        while (userGuess != num)
        {
            Counter++;
            System.out.print("Enter your guess :");
            userGuess = input.nextInt();
            user1.setChoices(userGuess);

            if ((gameLevel == 1 && userGuess  > 10) || (gameLevel == 2 && userGuess  > 30) || (gameLevel == 3 && userGuess   > 50))
                System.out.println("The entered number is beyond the limit!");
            else if (userGuess > num)
                System.out.println("Your guess is high, TRY AGAIN ");
            else if (userGuess < num)
                System.out.println("Your guess is low, TRY AGAIN "); }

        if (Counter < 5)
        {
            System.out.println("\n--------------------------------");
            System.out.println("\t\t CONGRATULATIONS!\n" + "\t\t\t🎈YOU WIN!🎈\n\t It only took you " + Counter + " tries");
            System.out.println("\t  EXCELLENT PERFORMANCE  ");
            System.out.println("--------------------------------"); }
        else if (Counter <= 10)
        {
            System.out.println("--------------------------------");
            System.out.println("\t\t\t🎉YOU WIN!🎉 \n\t\tGOOD PERFORMANCE");
            System.out.println("\t It only took you " + Counter + " tries");
            System.out.println("--------------------------------"); }
        else
        {
            System.out.println("\t-------------------------------------");
            System.out.println("\t\tyou have guessed the number\n\t but you have tried too many times😔!");
            System.out.println(" \t\t\tBAD PERFORMANCE");
            System.out.println("\t-------------------------------------"); }

        // displaying the choices made by the user
        System.out.println("\nResult Details:");
        System.out.println("You've made "+(user1.getChoices().size()-1)+" wrong tries");
        System.out.print("Your Choices are : "+user1.getChoices());

        System.out.println("\n\nWould you like to play again (y/n)?");
        playAgain = input.next();
        while (playAgain.equalsIgnoreCase("y")){
            System.out.println("\t\tWELCOME AGAIN");
            startPlay(); }
    }
}

