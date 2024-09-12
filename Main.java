import java.util.Random;
import java.util.Scanner;


public class Main{
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();

    public static void guessingGame(){
        int x = random.nextInt(100);
        int guess=-1;
        int count=0;
        
        System.out.println("I'll think of a number. Guess between 1 to 100!");
        
        while (guess!=x && count<10) {
            guess=scan.nextInt();
            if (guess<x){
                System.out.println("Too Low!!");
            }
            else{
                System.out.println("Too High!!");
            }
            count++;
        }
        
        if (count<7) {
            System.out.println("You Passed! You got a great score of: "+count);    
        }
        else if(count<10){
            System.out.println("You Passed! Trials took: "+count);
        }
        else{
            System.out.println("That wasn't so good :( Want to try again?)");
        }
        
    }

    public static void main(String[] args) {
        String playagain;
        Scanner scan1 = new Scanner(System.in);
        do {
            guessingGame();
            System.out.println("Do you want to play again?");
            playagain=scan1.nextLine();
        }
        while(playagain.equals(Character.toString('Y')) || playagain.equals(Character.toString('y'))||playagain.equals("yes"));

    }
}
