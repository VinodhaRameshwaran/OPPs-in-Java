class ReservationThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Reservation Status: Ticket Reserved - " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class StatusThread implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ticket Confirmation: Confirmed - " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class MultithreadingDemo {

    public static void main(String[] args) {

        ReservationThread reservation = new ReservationThread();
        StatusThread status = new StatusThread();
        Thread confirmation = new Thread(status);
        reservation.start();
        confirmation.start();
    }
}