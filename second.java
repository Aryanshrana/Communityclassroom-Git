//guess game from 1 to 6, guess same as computer
import java.util.*;
class Main{
        public static void main(String[] args){
                Random rn = new Random();
                int x = rn.nextInt(6)+1;
                Scanner sc = new Scanner(System.in);
                System.out.println("guess the number from 1 to 6");
                int j = sc.nextInt();
                System.out.println("computer guess "+x);
                if(x == j)
                        System.out.println("You win the game");
                else
                        System.out.println("Sorry you loose the game");

        }
}
