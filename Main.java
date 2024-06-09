import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Please enter your name: ");
    Scanner scan1 = new Scanner(System.in);
    String user = scan1.nextLine();
    Game game = new Game(user);

    System.out.println("\nWelcome " + game.getName() + "!");
    System.out.println("This is a mental math game, so no calculators allowed!! Guess a 5-letter word by completing each level. \nRules:\n1. You have 5 tries to get 3 questions right per level. \n2. Each level will give you a letter. \n3. All answers should be in fraction form. \n4. The letters will be scrambled.");

    int level = 0;
    String[] word = {"f", "r", "a", "m", "e"};
    ArrayList<String> lettersGiven = new ArrayList<>();

    while (level >= 0 && level < 5) {
      System.out.println();
      int numOfQue = 0;
      int correctAnswers = 0;
      ArrayList<Integer> queNums = new ArrayList<>();
      System.out.println("Level: " + (level + 1));

      while (correctAnswers < 3 && numOfQue < 5) {
        int queNum = (int) (Math.random() * 5);
        while (game.repeats(queNums,queNum)) {
          queNum = (int) (Math.random() * 5);
        }  

        queNums.add(queNum);
        System.out.println((numOfQue + 1) + ". " + game.question(level, queNum));
        Scanner scan2 = new Scanner(System.in);
        String answer = scan2.nextLine();

        if (game.checkAnswer(level, queNum, answer)) {
        game.addScore();
          correctAnswers++;
        }

        numOfQue++;

        if (correctAnswers >= 3) {
          int letterNum = (int) (Math.random() * 5);
          String letter = word[letterNum];
          while (lettersGiven.contains(letter)) {
            letterNum = (int) (Math.random() * 5);
            letter = word[letterNum];
          }
          lettersGiven.add(letter);
        }  
      }
      level++;

    }

    System.out.println ("\nYou are given the letters: ");
    for (String letter : lettersGiven) {
      System.out.print(letter + ", ");
    }
    System.out.println("\nGuess the word: ");
    Scanner scan3= new Scanner(System.in);
    if (scan3.nextLine().equals("frame")){
      System.out.print ("Correct!");
    } 
    else{
      System.out.println("Try again!");
      Scanner scan4= new Scanner(System.in);
      if (scan4.nextLine().equals("frame")){
        System.out.print ("Correct!");
      } 
      else{
        System.out.println("Retry the game!");
      }
    }
  }
}