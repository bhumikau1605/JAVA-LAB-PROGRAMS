import java.util.Scanner;
class Student{
    String usn, name;
    int n;
    int[] credits, marks;
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter USN: ");
        usn=sc.nextLine();
        System.out.println("Enter Name: ");
        name=sc.nextLine();
        System.out.println("Enter number of subjects: ");
        n=sc.nextInt();
        credits=new int[n];
        marks=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter credits for subject"+(i+1)+":");
            credits[i]=sc.nextInt();8
        }
        for(int i=0;i<n;i++){
            System.out.println("Enter marks for the subject: "+(i+1)+":");
            marks[i]=sc.nextInt();
        }
    }
    void display(){
        System.out.println("\nUSN: "+usn);
        System.out.println("Name:"+name);
        System.out.println("SGPA: "+calculatedSGPA());
    }
    double calculatedSGPA(){
        int totalcredits=0, weightedsum=0;
        for(int i=0;i<n;i++){
            int gradepoint;
            if(marks[i]>=90) gradepoint=10;
            else if(marks[i]>=80) gradepoint=9;
            else if(marks[i]>=70) gradepoint=8;
            else if(marks[i]>=60) gradepoint=7;
            else if(marks[i]>=50) gradepoint=6;
            else if(marks[i]>=40) gradepoint=5;
            else gradepoint=0;
            weightedsum+=gradepoint*credits[i];
            totalcredits+=credits[i];
        }
        return (double) weigh