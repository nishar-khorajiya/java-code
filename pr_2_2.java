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
        System.out.println("Total balance in your account is :" +
                balance + " Rupees");
        System.out.println("The intrest given by the bank is :" +
                annualInterestRate);
        System.out.println("The at which your account was created is :"
                + dateCreated);
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

public class pr_2_2 {
    public static void main(String[] args) {
        System.out.println("An example for you to to create a proper account :");
        Account a1 = new Account();
        a1.Accessor();
        Scanner s = new Scanner(System.in);
        int id;
        double balance, withdraw, deposit, monintrate, monint;
        String date;
        System.out.println("Enter the Account number of your account :");
        id = s.nextInt();
        System.out.println("Enter the initial balance your account :");
        balance = s.nextDouble();
        System.out.println("Enter the date at which you created your account :");
        date = s.next();
        Account a2 = new Account(id, balance, date);
        a2.Accessor();
        monintrate = a2.getMonthlyInterestRate();
        monint = a2.getMonthlyInterest();
        System.out.println("Bank give " + monintrate + "% monthly intrest rate.");
        System.out.println("Your monthly intrest is " + monint + " Rupees");
        int i;
        System.out.println("Enter 1 to withdraw and 2 to deposit.");
        i = s.nextInt();
        switch (i) {
            case 1: {
                System.out.println("Enter amount to be withdrawn :");
                withdraw = s.nextDouble();
                a2.withdraw(withdraw);
                System.out.println("The amount remained in your account after withdrawal is :" + a2.balance);
                break;
            }
            case 2: {
                System.out.println("Enter amount to be deposited :");
                deposit = s.nextDouble();
                balance = a2.deposit(deposit);
                System.out.println("The amount remained in your account after deposit is :" + balance);
                break;
            }
            default: {
                System.out.println("You have changed anything :");
                break;
            }
        }
        System.out.println("Your account afer withdrawal or deposit :");
        a2.Accessor();
        int p = 1;
        while (p == 1) {
            System.out.println("Enter 1 use another account and 2 to not.");
            i = s.nextInt();
            if (i == 1) {
                System.out.println("Enter the Account number of your account :");
                id = s.nextInt();
                System.out.println("Enter the initial balance your account :");
                balance = s.nextDouble();
                System.out.println("Enter the date at which you created your account :");
                date = s.next();
                a2.mutator(id, balance, date);
                a2.Accessor();
                monintrate = a2.getMonthlyInterestRate();
                monint = a2.getMonthlyInterest();
                System.out.println("Bank give " + monintrate + "% monthly intrest rate.");
                System.out.println("Your monthly intrest is " + monint + " Rupees");
                System.out.println("Enter 1 to withdraw and 2 to deposit.");
                i = s.nextInt();
                switch (i) {
                    case 1: {
                        System.out.println("Enter amount to be withdrawn :");
                        withdraw = s.nextDouble();
                        a2.withdraw(withdraw);
                        System.out.println("The amount remained in your account after withdrawal is :" + a2.balance);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter amount to be deposited :");
                        deposit = s.nextDouble();
                        balance = a2.deposit(deposit);
                        System.out.println("The amount remained in your account after deposit is :" + balance);
                        break;
                    }
                    default: {
                        System.out.println("You have changed anything :");
                        break;
                    }
                }
            } else {
                System.out.println("--------------thanks for coming---------------------");
                break;
            }
        }
    }
}
