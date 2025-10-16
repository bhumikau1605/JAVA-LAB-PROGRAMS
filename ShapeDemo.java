
import java.util.Scanner;

abstract class Shape{
    int a,b;
    abstract void printArea();
}
class Rectangle extends Shape{
    Rectangle(int length,int breadth)
    {
        a=length;
        b=breadth;
    }
    void printArea()
    {
        System.out.println("Area pof the rectangle is: "+(a*b));
    }
}
class Triangle extends Shape{
    Triangle(int base, int height)
    {
        a=base;
        b=height;
    }
    void printArea()
    {
        System.out.println("Area of the triangle is: "+(0.5*a*b));
    }
}
class
Circle extends Shape{
    Circle(int radius)
    {
        a=radius;
    }
    void printArea()
    {
        System.out.println("Area of the circle: "+(3.14159*a*a));
    }
}
public class ShapeDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of Rectangle: ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        Rectangle r=new Rectangle(l,b);
        r.printArea();
        System.out.println("Enter base and height of the triangle: ");
        int base=sc.nextInt();
        int height=sc.nextInt();
        Triangle t=new Triangle(base,height);
        t.printArea();
        System.out.println("Enter the radius of the Circle: ");
        int radius=sc.nextInt();
        Circle c=new Circle(radius);
        c.printArea();
        sc.close();
    }
}