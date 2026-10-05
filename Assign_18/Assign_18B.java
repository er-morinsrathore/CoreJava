package Assignment11_;

class CashbackThread implements Runnable {

    double cashback = 0;

    public void run() {

        for (int i = 1; i <= 6; i++) {

            cashback = cashback + 10;

            System.out.println("Cashback added: Rs. 10");
            System.out.println("Current cashback: Rs. " + cashback);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }

        System.out.println("Final cashback balance: Rs. " + cashback);
    }
}

public class Assign_18B {

	public static void main(String[] args) {
        CashbackThread cashbackThread = new CashbackThread();

        Thread t = new Thread(cashbackThread);

        t.start();

	}

}
