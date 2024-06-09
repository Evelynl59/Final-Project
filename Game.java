import java.util.ArrayList;

public class Game{
  private String[][] question = new String[5][5];
  private String[][] answer= new String[5][5];
  private String user;
  private double score = 0;
  private int numQuestions=0;

  public Game (String user){
    this.score= 0;
    this.user= user;
    
    // Level One Questions
    question[0][0]= "12 * 13 = ";
    question[0][1]= "54 / -6 =";
    question[0][2]= "11 - 32 =";
    question[0][3]= "-87 + 23 =";
    question[0][4]= "16 * 4 =";

    // Level Two Questions
    question[1][0]= "x - 12 = 4";
    question[1][1]= "7x + 4 = 32";
    question[1][2]= "4x/6 = 2";
    question[1][3]= "28x - 10 = 4";
    question[1][4]= "-12x = 36";

    // Level Three Questions
    question[2][0]= "(9/5)/(2/3)";
    question[2][1]= "3/4 + 1/3";
    question[2][2]= "(8/2) * (3/4)";
    question[2][3]= "(1/2) - (1/3)";
    question[2][4]= "(25/5) * (5/25)";

    // Level Four Questions
    question[3][0]= "2^5 * √144";
    question[3][1]= "(92+24) /4 ";
    question[3][2]= "(4^0 + 12) * (3^2)";
    question[3][3]= "15+23+19-20";
    question[3][4]= "(102/ 6)^2 + 4";

    // Level Five Questions
    question[4][0]= "(x+2)(x+1)";
    question[4][1]= "(x+6)^2";
    question[4][2]= "(2x+2)(x+3)";
    question[4][3]= "(x-1)(x+1)";
    question[4][4]= "(x-2)(x+2)";
    
    // Level One Answer
    answer[0][0]= "156";
    answer[0][1]= "-9";
    answer[0][2]= "-21";
    answer[0][3]= "-64";
    answer[0][4]= "64";

    // Level Two Answer
    answer[1][0]= "16";
    answer[1][1]= "4";
    answer[1][2]= "3";
    answer[1][3]= "1/2";
    answer[1][4]= "-3";

    // Level Three Answer
    answer[2][0]= "27/10";
    answer[2][1]= "13/12";
    answer[2][2]= "3";
    answer[2][3]= "1/6";
    answer[2][4]= "1";

    // Level Four Answer
    answer[3][0]= "384";
    answer[3][1]= "29";
    answer[3][2]= "117";
    answer[3][3]= "37";
    answer[3][4]= "293";

    // Level Five Answer
    answer[4][0]= "x^2+3x+4";
    answer[4][1]= "x^2+12x+36";
    answer[4][2]= "2x^2+8x+6";
    answer[4][3]= "x^2-1";
    answer[4][4]= "x^2-4";

  }

  public String question(int level, int r){
    numQuestions++;
    return question[level][r];
  }

  public String getAnswer(int level, int r){
    return answer[level][r];
  }

  public boolean checkAnswer (int level, int r, String input){
    return answer[level][r].equals(input);
  }

  public void addScore(){
    score++;
  }
  
  public double getScore(){
    return (int)((score/numQuestions)*100);
  }

  public String getName(){
    return user;
  }

  public boolean repeats (ArrayList<Integer> list, int num){
    for (int n: list){
      if (n==num){
        return true;
      }
    }
    return false;
  }
}