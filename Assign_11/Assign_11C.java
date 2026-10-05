package Assignment11_;

abstract class UPITransaction {

    abstract void processTransaction(double amount);
}

class PaytmTransaction extends UPITransaction {

    void processTransaction(double amount) {
        System.out.println("Paytm is processing ₹" + amount);
    }
}

class PhonePeTransaction extends UPITransaction {

    void processTransaction(double amount) {
        System.out.println("PhonePe is processing ₹" + amount);
    }
}

public class Assign_11C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        UPITransaction transaction1 = new PaytmTransaction();
        UPITransaction transaction2 = new PhonePeTransaction();

        transaction1.processTransaction(500);
        transaction2.processTransaction(1000);
	}

}
