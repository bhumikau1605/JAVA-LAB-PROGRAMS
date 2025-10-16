
import java.util.Scanner;
class Book {
    private String name;
    private String author;
    private double price;
    private int num_pages;
    public Book(String name, String author,double price, int num_pages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setNum_Pages(int num_pages){
        this.num_pages=num_pages;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getNum_Pages(){
        return num_pages;
    }
    public String toString(){
    return("\nBook Name: "+name+"\n Author: "+author+"\nPrice:Rs."+price+"\nNumber of pages: "+num_pages);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of books: ");
        int n=sc.nextInt();
        sc.nextLine();
        Book[] books=new Book[n];
        for(int i=0;i<n;i++){
            System.out.println("\nDetails: "+(i+1)+":");
            System.out.println("Enter book name: ");
            String name=sc.nextLine();
            System.out.println("Enter author name: ");
            String author=sc.nextLine();
            System.out.println("No.of pages: ");
            int num_pages=sc.nextInt();
            sc.nextLine();
            System.out.println("Price: ");
            double price=sc.nextDouble();
            books[i]=new Book(name,author,price,num_pages);
        }
        System.out.println("\nBook details: \n");
        for(int i=0;i<n;i++){
            System.out.println("\n Book"+(i+1)+":\n"+books[i].toString());
        }
        sc.close();
    }
}