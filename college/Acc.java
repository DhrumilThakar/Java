import java.util.Date;
import java.util.*;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this(0, 500.0);
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0.07;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

public class Acc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the ID : ");
        int id = s.nextInt();
        System.out.print("Enter your bank balance : ");
        double ba = s.nextDouble();
        System.out.print("Enter your annual interest : ");
        double inc = s.nextDouble();
        Account account = new Account(id, ba);
        account.setAnnualInterestRate(inc);
        System.out.println("Account ID: " + account.getId());
        System.out.println("Initial Balance: " + account.getBalance());
        System.out.println("Annual Interest Rate: " + account.getAnnualInterestRate() + " %");
        System.out.println("Date of creation is : "+account.getDateCreated());
        System.out.print("Enter the amount you have to deposit : ");
        int dep = s.nextInt();
        account.deposit(dep);
        System.out.println("Balance after deposit: " + account.getBalance());
        System.out.print("Enter the amount you have to withdraw : ");
        int wit = s.nextInt();
        account.withdraw(wit);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        System.out.println("Your Monthly Interest Rate: " + account.getMonthlyInterestRate() + " %");
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        s.close();
    }
}