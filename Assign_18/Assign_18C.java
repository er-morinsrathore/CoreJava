package Assignment11_;

class MusicCheck implements Runnable {

    public void run() {

        while (true) {

            System.out.println("Background music check running...");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                break;
            }
        }
    }
}

public class Assign_18C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicCheck mc = new MusicCheck();

        Thread t = new Thread(mc);

        t.start();
	}

}
//Multiple threads allow an application like Zomato to perform different tasks at the same time instead of making the user wait for each task to finish. 
//For example, one thread can update the order status when the restaurant accepts the order, another can send a notification to the user, 
//and another can calculate the estimated delivery time. This makes the application more responsive because these operations can run concurrently.