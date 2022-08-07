import java.util.*;
//program to generate random integers from 1 to 6
public class Main{
	public static void main(String[] args){
		Random random = new Random();
			int x = random.nextInt(6)+1;
			System.out.println("hello user");
			System.out.println("random number from 1 to 6 is "+x);
	}
}

