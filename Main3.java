class Payment {

    void makePayment(double amount) {
        System.out.println("Payment Amount: Rs. " + amount);
    }

    void makePayment(double amount, String method) {
        System.out.println("Payment Amount: Rs. " + amount);
        System.out.println("Payment Method: " + method);
    }
}

class UpiPayment extends Payment {

    @Override
    void makePayment(double amount) {
        System.out.println("UPI Payment Amount: Rs. " + amount);
        System.out.println("Payment completed using UPI.");
    }
}

public class Main3 {

    public static void main(String[] args) {

        Payment payment = new Payment();

        payment.makePayment(5000);
        payment.makePayment(3000, "Credit Card");

        System.out.println();

        Payment upi = new UpiPayment();

        upi.makePayment(2000);
    }
}