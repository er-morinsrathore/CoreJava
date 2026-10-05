package assignments8_;

public class PaymentMethod {
	void topUp(double amount) {
        System.out.println("Payment method used");
    }
}

class CardPayment extends PaymentMethod {

    void topUp(double amount) {
        System.out.println("Top up of ₹" + amount + " using Card");
    }
}

class UpiPayment extends PaymentMethod {

    void topUp(double amount) {
        System.out.println("Top up of ₹" + amount + " using UPI");
    }
}

class CryptoPayment extends PaymentMethod {

    void topUp(double amount) {
        System.out.println("Top up of ₹" + amount + " using Crypto");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CardPayment card = new CardPayment();
	        UpiPayment upi = new UpiPayment();
	        CryptoPayment crypto = new CryptoPayment();

	        card.topUp(500);
	        upi.topUp(500);
	        crypto.topUp(500);
	}

}
