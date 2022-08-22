import java.io.*;
class Aryansh{

	int num(int q){
		return q*2;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int x = sc.nextInt();
		Aryansh a1 = new Aryansh();
		int y = a1.num(x);
		System.out.println(y);
	}
}
