import CIE.*;
import SEE.*;
import java.util.*;
public class FinalMarks {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of students: ");
        int n=sc.nextInt();
        Personal[] p=new Personal[n];
        Internals[] i= new Internals[n];
        Externals[] e= new Externals[n];
        for(int s=0;s<n;s++){
            sc.nextLine();
            System.out.println("Enter details of Student "+(s+1)+":");
            System.out.println("USN: ");
            String usn=sc.nextLine();
            System.out.println("Name: ");
            String name=sc.nextLine();
            System.out.println("Semester: ");
            int sem=sc.nextInt();
            int[] inMarks=new int[5];
            System.out.println("Enter 5 Internal Marks: ");           
            for(int j=0;j<5;j++){
                System.out.println("Enter Internal Marks for Subject "+(j+1)+": ");
                inMarks[j]=sc.nextInt();
            }
            int[] seeMarks=new int[5];
            System.out.println("Enter 5 SEE Marks: ");
            for(int j=0;j<5;j++){
                System.out.println("Enter SEE Marks for Subject "+(j+1)+": ");
                seeMarks[j]=sc.nextInt();
            }
            p[s]=new Personal(usn,name,sem);
            i[s]=new Internals(inMarks);
            e[s]=new Externals(usn,name,sem,seeMarks);   
        }
        System.out.println("Final Marks: ");
        for(int s=0;s<n;s++){
            p[s].display();
            System.out.println("Final marks in 5 courses: ");
            for(int j=0;j<5;j++){
                int finalMark=(i[s].internalMarks[j]+e[s].seeMarks[j]);
                System.out.println(finalMark+"\t");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
