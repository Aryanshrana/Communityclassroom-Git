// a simple program to calculate simple intrest
class Aryansh{
    float simple(int p, float r , int t)
    {
        return (p*r*t)/100;
    }
    
    public static void main(String args[])
    {
        float ans;
        Aryansh s1 = new Aryansh();
        ans = s1.simple(4000,10.5f,4);
        
        System.out.println(ans);
    }
}


