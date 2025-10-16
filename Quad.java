class Quad
{
    public static void main(String args[])
    {
        double a=1,b=6,c=16;
        double D;
        double r1,r2;
        D=(Math.sqrt((b*b)-4*a*c));
        if(D==0)
        {
            System.out.println("Real and equal");
            r1=((-b)/2*a);
            r2=r1;
            System.out.println("The roots are: "+r1+"and"+r2);
        }
        else if(D>0)
        {
            System.out.println("Roots are real and distinct");
            r1=((-b+D)/2*a);
            r2=((-b-D)/2*a);
            System.out.println("The roots are: "+r1+"and"+r2);
        }
        else
        {
            System.out.println("Roots are imaginary");
        }
    }
}
