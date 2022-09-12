//interface program
interface Dragon
{
	void Dragondetails(String){
	}
}
class Targaryen import Dragon
{
	String nameofDragon;
	void Dragondetails(String nameofDragon){
		System.out.println("master name = "+"Daemon Targaryen");
		System.out.print(" master of dragonstones");
		System.out.println("Dragon color"+" red");
	}
}
class Main{
	public static void main(String[] args){
		Targaryen t = new Targaryen();
		t.Dragondetails("Craxes");
	}
}


