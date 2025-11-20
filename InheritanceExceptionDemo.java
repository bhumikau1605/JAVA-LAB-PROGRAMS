import java.util.Scanner;
class WrongAgeException extends Exception{
    public WrongAgeException(String message){
        super(message);
    }
}
class Father{
    int fatherAge;
    Father (int age) throws WrongAgeException
    {
        if(age<0){
            throw new WrongAgeException("Age cannot be negative!");
        }
        fatherAge=age;
        System.out.println("Father's age: "+fatherAge);
    }
}
class Son extends Father{
    int sonAge;
    Son (int fatherAge, int sonAge) throws WrongAgeException{
        super(fatherAge);
        if(sonAge<0){
            throw new WrongAgeException("Son's age cannot be negative!");
        }
        if(sonAge>=fatherAge){
            throw new WrongAgeException("Son's age cannot be greater than or equal to the father's age");
        }
        this.sonAge=sonAge;
        System.out.println("Son's age: "+sonAge);
    }
}
public class InheritanceExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter Father's Age: ");
            int fatherAge=sc.nextInt();
            System.out.println("Enter Son's Age: ");
            int sonAge=sc.nextInt();
            Son s=new Son(fatherAge,sonAge);
        } catch (WrongAgeException e){
            System.out.println("Exception caught: "+e.getMessage());
        }finally{
            sc.close();
        }
        }
    }