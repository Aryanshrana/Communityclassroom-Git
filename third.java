// a simple program to calculate simple intrest
class Aryansh{
    float simple(int p, float r , int t)
    {
        return (p*r*t)/100;
    }
    
    public static void main(String args[])
    {
        float ans,ans1;
        Aryansh s1 = new Aryansh();
	Aryansh s2 = new Aryansh();
        ans = s1.simple(4000,10.5f,4);
        ans1 = s2.simple(3000,4.5f,2);
        System.out.println("The simple intrest for 1st output "+ans);
	System.out.println("The simple intrest for 2nd outout is "+ans1);
    }
}


