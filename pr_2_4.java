import java.util.*;

class Account {
    static public int id;
    static public double balance;
    final static private double annualInterestRate = 7;
    static public String dateCreated;

    public Account() {
        id = 0;
        balance = 500;
        dateCreated = "06/11/2003";
    }

    static Scanner s = new Scanner(System.in);

    public Account(int Ac, double bal, String d) {
        id = Ac;
        balance = bal;
        dateCreated = d;
    }

    public void Accessor() {
        System.out.println("Your Account :" + id);
        System.out.println("Total balance in your account is :" + balance + " Rupees");
        System.out.println("The intrest given by the bank is :" + annualInterestRate);
        System.out.println("The at which your account was created is :" + dateCreated);
    }

    public void mutator(int ac, double bal, String d) {
        id = ac;
        balance = bal;
        dateCreated = d;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return (annualInterestRate / 12) * balance / 100;
    }

    public void withdraw(double draw) {
        balance = balance - draw;
    }

    public double deposit(double dep) {
        return balance + dep;
    }

    @Override
    public String toString() {
        String res = "";
        res += "Account number : " + id + "\n";
        res += "Balance in account is : " + balance + "\n";
        res += "Annual Interest Rate given by bank is : " +
                annualInterestRate + "\n";
        res += "Date of creation of account is : " + dateCreated + "\n";
        return res;
    }
}

class CheckingAccount extends Account {
    protected double OVERDRAFT_LIMIT = -100;

    public CheckingAccount(int id, double balance, String date) {
        super(id, balance, date);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        } else
            System.out.println("Over drawing is passing the given limit :");
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + "mBalance=" + balance + '}';
    }
}

class SavingsAccount extends Account {
    protected double OVERDRAFT_LIMIT = 0;

    public SavingsAccount(int id, double balance, String date) {
        super(id, balance, date);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT || balance - amount <= OVERDRAFT_LIMIT)
            super.withdraw(amount);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" + "net Balance =" + balance + '}';
    }
}

public class pr_2_4 {
    public static void main(String[] args) {
        Account account = new Account(111, 200, "06-11-2003");
        System.out.println("simple account");
        System.out.println(account);
        System.out.println("--------------------------------------------------------------------------------------");
        CheckingAccount checkingAccount = new CheckingAccount(112, 250, "05-11-2003");
        System.out.println("Checking account");
        System.out.println(account);
        System.out.println("Enter ammount for withdrawing in checking  account :");
        Scanner s = new Scanner(System.in);
        double ammount = s.nextDouble();
        checkingAccount.withdraw(ammount);
        System.out.println(checkingAccount);
        SavingsAccount savingsAccount = new SavingsAccount(113,
                10000, "04-11-2003");
        System.out.println("-------------------------------------------- ------------------------------------------");
        System.out.println("Saving account");
        System.out.println(account);
        System.out.println("Enter ammount for withdrawing in saving  account :");
        double ammounts = s.nextDouble();
        savingsAccount.withdraw(ammounts);
        System.out.println(savingsAccount);
    }
}
