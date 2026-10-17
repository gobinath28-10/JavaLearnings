package MyLearnings;

class Bank {

    String name;
    double balance;

    static int count = 0;

    Bank(String name, double balance) {
    	
    	System.out.println("First run ");

        this.name = name;
        this.balance = balance;

        count++;
    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    void deposit(double amount) {

        if (amount > 0) {

            balance = balance + amount;

            System.out.println("Deposit successful");

        } else {

            System.out.println("Invalid amount");
        }
    }

    static void displayCount() {

        System.out.println("Total customers: " + count);
    }
}

public class ThirdProject {

    public static void main(String[] args) {

        Bank b1 = new Bank("Gobi", 6000);

        b1.display();
        b1.deposit(2000);
        b1.display();  

        Bank b2 = new Bank("Sathish", 3000);

        b2.display();

       Bank.displayCount();
    }
}