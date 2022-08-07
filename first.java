import java.util.*;
//program to generate random integers between 1 to 666666"
public class Main{
	public static void main(String[] args){
		Random random = new Random();
			int x = random.nextInt(6)+1;
			System.out.println("random number between 1 to 6 is "+x);
	}
}

