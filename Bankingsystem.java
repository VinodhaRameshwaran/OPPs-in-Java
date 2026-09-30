class Account {
    String Name;
    int accno;

    void display() {
        System.out.println("Name: " + Name);
        System.out.println("AccountNo: " + accno);
    }
}

class SavingsAccount extends Account {
    void Savings() {
        System.out.println("Savings Account");
    }
}

class CurrentAccount extends Account {
    void Current() {
        System.out.println("Current Account");
    }
}

class PremiumSavingsAccount extends Account {
    void Premium() {
        System.out.println("Premium Savings Account");
    }
}

public class Bankingsystem {
    public static void main(String[] args) {

        SavingsAccount S = new SavingsAccount();
        S.Name = "Arun";
        S.accno = 101;
        S.display();
        S.Savings();

        CurrentAccount C = new CurrentAccount();
        C.Name = "Priya";
        C.accno = 102;
        C.display();
        C.Current();

        PremiumSavingsAccount P = new PremiumSavingsAccount();
        P.Name = "Rahul";
        P.accno = 103;
        P.display();
        P.Premium();
    }
}