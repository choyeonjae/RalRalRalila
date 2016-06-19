import java.util.InputMismatchException;
import java.util.Scanner;
//reference boboobo, Eojun

public class Monk {
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("What is your name?");
    
    String name = scanner.nextLine();
    
    Player player = new Player(name);
    
    System.out.printf("Boss:"+player.name + ", you were a good worker, I am sad you are leaving the company. Good luck on becoming a monk.%n%n" );
    
    while(player.zen < 100){
      try{
        
        System.out.printf("You have "+player.money + "$ and "+ player.money +" Zen points.%n "
                            + "%nWhat would you like to do?%n%n"
                            + "Meditate 0$, +1 Zen -> Press 1%n"
                            + "Help Someone -10$, +5 Zen -> Press 2%n"
                            + "Work at Company +$50, -30 Zen -> Press 3%n"
                            + "Purchase Temple -> Press 4%n"
                            + "Work at Temple +$5, +3 Zen -> Press 5%n%n");
        
        
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        
        if(input<0 || input>5){
          System.out.println("Please input only 1~5");
          continue;
        }
        
        if(input==1){
          player.Meditate(player);
        }
        if(input==2){
          player.Help_Someone(player);
        }
        if(input==3){
          player.Work_at_Company(player);
        }
        if(input==5){
          player.Work_at_Temple(player);
        }
           }
   catch(InputMismatchException a){
    System.out.println("Please input only 1~5");
    continue;
    
   }
  }
  System.out.printf("Good Job..");
 }
}
