import java.util.Scanner;
public class Game {
public static void main (String[] args){
  Scanner sc=new Scanner(System.in);
  int player_one,player_two;
  System.out.println("select the move of player one 1 to 3");
  System.out.println("select the move of player two 1 to 3");
  player_one=sc.nextInt();
   player_two=sc.nextInt();
  //1=rock, 2=scissor, 3= paper
  if(player_one==player_two)
    System.out.print("tie the match");
  else if((player_one==1) && (player_two==2))
    System.out.print("player one win");
  else if((player_one==2) && (player_two==3))
    System.out.print("player one win");
    else if((player_one==3) && (player_two==1))
   System.out.print("player one win");
  else 
    System.out.print("player two wins");   
}
}
  
  
    