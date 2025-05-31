import java.util.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 500;
        this.annualInterestRate = 0.07;
        this.dateCreated = new Date();
    }

    public Account(int x, double b) {
        this.id = x;
        this.balance = b;
        this.annualInterestRate = 0.07;
        this.dateCreated = new Date();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public Double getMonthlyIncome() {
        return balance / 12;
    }

}

public class Bank {
    public static void main(String[] args) {
        Account account = new Account(1, 1000.0);
        System.out.println("Account ID: " + account.getId());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Annual Interest Rate: " + account.getAnnualInterestRate());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}