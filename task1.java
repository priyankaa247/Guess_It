import java.util.Scanner;

public class NumberGame {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int chance=5;
        int finals=0;
        boolean playAgain=true;
        System.out.println(x:"Welcome to the game !");
        System.out.rintln("You have about " + chance + "chances to win this game.");
        while(playAgain) {
            int rand= getrandN(min:1,max:100);
            boolean guess=false;
            for (int i=0; i<chance ; i++){
                System.out.println("Chance" + (i+1) + " Enter your guess:");
                int user = sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println(x:"You WON the game.");
                    break;
                }
                else if(user>rand){
                    System.out.println(x:"Too High");
                }
                else{
                    System.out.println(x:"Too Low");
                }
            }
            if(guess==false){
                System.out.println("Your chances are over , the number is " + rand);
            }
            System.out.println(x:"Do you want to play again(y/n)?");
            String again=sc.next();
            playAgain=again.equalsIgnoreCase(anotherString:"y");
        }
        System.out.println(x:"Here is your score: " + finals);
        
    }
    public static int getrandN(int min,int max){
        return(int)(Math.random()*(max-min+1)+min);
    }
}