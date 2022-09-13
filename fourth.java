import java.util.*;
class Arya
{
	public int add(int a,int b){
		int sum;
		sum = a+b;
		return sum;
	}
	public double multiply(double a,double b){
		double mult;
		mult = a*b;
		return mult;
	}
	public float division(float a,float b){
		float div;
		div = a/b;
		return div;
	}
}
class Arent extends Arya{
	public float minus(float a,float b){
		float sub;
		sub = a-b;
		return sub;
	}
}
class Demo{
	public static void main(String[] args){
		Arent a1 = new Arent();
		int s = a1.add(13,67);
		double m = a1.multiply(12.98,78.97);
		float d = a1.division(125.7f,5.7f);
		float s1 = a1.minus(12.9f,3.8f);
		System.out.println("sum of all - "s + m + d + s1);
	}
}
