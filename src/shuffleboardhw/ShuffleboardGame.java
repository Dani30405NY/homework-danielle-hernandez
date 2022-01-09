package shuffleboardhw;

import java.util.Random;
import java.util.Scanner;

 //These are the packages you will need to play the game

public class ShuffleboardGame {

 
public boolean playGame(Scanner sc) {
      int ans = generateRandomNumber();
      System.out.println("Pick 1, 2 or 3!");

      int user = sc.nextInt();
      sc.nextLine();

      return ans == user;
      
      //If the number is guessed correctly, the method will return as true.
    
  }
 
 
public int generateRandomNumber() {
      Random rand = new Random();
      return rand.nextInt(3) + 1;
      
      //A random number from 1 to 3 will populate 
  }

 
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ShuffleboardGame obj = new ShuffleboardGame();

      System.out.println("Welcome to The Shuffleboard Game!\n");
      System.out.println("Where do you think the 0 is?\n");
      System.out.println("Would you like to play?");
      String userChoice = sc.nextLine();

      while (userChoice.equalsIgnoreCase("y")) {

          boolean win = obj.playGame(sc);
          if (win) {
              System.out.println("Good Guess!");
          } else {
              System.out.println("Sorry! That was not right");
          }

          System.out.println("Would you like to try again?");
          userChoice = sc.nextLine();

          if (userChoice.equalsIgnoreCase("n")) {
              break;
          } else if (userChoice.equalsIgnoreCase("y")) {
              continue;
          } else {
              while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n")) {
                  System.out.println("Do you want to try again?");
                  userChoice = sc.nextLine();
              }
          }

      }

      System.out.println("See you next time!");

  }

}

