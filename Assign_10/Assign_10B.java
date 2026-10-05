package assignments8_;

class PaymentMethod2 {

    void topUp(double amount) {
        System.out.println("Payment method used");
    }
}

class CardPayment2 extends PaymentMethod2 {

    void topUp(double amount) {
        System.out.println("Top up of ₹" + amount + " using Card");
    }
}

class UpiPayment2 extends PaymentMethod2 {

    void topUp(double amount) {
        System.out.println("Top up of ₹" + amount + " using UPI");
    }
}

class CryptoPayment2 extends PaymentMethod2 {

    void topUp(double amount) {
        System.out.println("Top up of ₹" + amount + " using Crypto");
    }
}

public class Assign_10B {
	 static void processWalletTopUp(PaymentMethod2 method, double amount) {
	        method.topUp(amount);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CardPayment2 card = new CardPayment2();
        UpiPayment2 upi = new UpiPayment2();
        CryptoPayment2 crypto = new CryptoPayment2();

        processWalletTopUp(card, 500);
        processWalletTopUp(upi, 500);
        processWalletTopUp(crypto, 500);

	}

}
