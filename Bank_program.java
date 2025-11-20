import java.util.Scanner;
class Account{
    String customerName;
    int accountNumber;
    String accountType;
    double balance;
    
    Account(String name, int accNo,String type,double bal)
    {
        customerName=name;
        accountNumber=accNo;
        accountType=type;
        balance=bal;
    }
    void deposit(double amount){
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Amount deposited successfully!");
        }
        else{
            System.out.println("Invalid!");
        }
    }
    void displayBalance(){
        System.out.println("Account Holder"+customerName);
        System.out.println("Account no: "+accountNumber);
        System.out.println("Account type: "+accountType);
        System.out.println("Current balance: "+balance);
    }
}
class Sav_acc extends Account{
    final double interestRate=0.05;
    Sav_acc(String name,int accNo,double bal){
        super(name,accNo,"Savings",bal);
    }
    void computeInterest(int years){
        double interest=balance*Math.pow((1+interestRate),years)-balance;
        balance+=interest;
        System.out.println("Interest of "+interest+"added to balance");
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Withdrawal of "+amount+"successful");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
class Cur_acc extends Account{
    final double minBalance=5000;
    final double serviceCharge=100;
    Cur_acc(String name, int accNo,double bal){
        super(name,accNo,"Current",bal);
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Withdrawal of "+amount+"Successful");
            checkMinBalance();
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void checkMinBalance(){
        if(balance<minBalance){
            balance-=serviceCharge;
            System.out.println("Balance below minimum charge of "+serviceCharge+"imposed");
        }
    }
}
public class Bank_program {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        String name=sc.nextLine();
        System.out.println("Enter account number: ");
        int accNo=sc.nextInt();
        System.out.println("Enter initial balance: ");
        double balance=sc.nextDouble();
        System.out.println("Enter account type: 1 for Savings AND 2 for Current");
        int type=sc.nextInt();
        if(type==1)
        {
            Sav_acc sav=new Sav_acc(name,accNo,balance);
            sav.displayBalance();
            System.out.println("Enter amount to deposit: ");
            sav.deposit(sc.nextDouble());
            sav.displayBalance();
            System.out.println("Enter the number of years to compute the interest: ");
            int years=sc.nextInt();
            sav.computeInterest(years);
            sav.displayBalance();
            System.out.println("Enter amount to withdraw: ");
            sav.withdraw(sc.nextDouble());
            sav.displayBalance();
        }
        else if(type==2){
            Cur_acc cur=new Cur_acc(name,accNo,balance);
            cur.displayBalance();
            System.out.println("Enter the amount to deposit: ");
            cur.deposit(sc.nextDouble());
            cur.displayBalance();
            System.out.println("Enter amount to withdraw: ");
            cur.withdraw(sc.nextDouble());
            cur.displayBalance();
        }
        else
        {
            System.out.println("Invalid type!");
        }
        sc.close();
    }
}
