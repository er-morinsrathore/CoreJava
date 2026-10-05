package assignments8_;

class PaymentMethod3 {

    void topUp(double amount) {
        System.out.println("Payment method used");
    }
}

class CardPayment3 extends PaymentMethod3 {

    void topUp(double amount) {
        System.out.println("Top up of ₹" + amount + " using Card");
    }
}

class UpiPayment3 extends PaymentMethod3 {

    void topUp(double amount) {
        System.out.println("Top up of ₹" + amount + " using UPI");
    }
}

class CryptoPayment3 extends PaymentMethod3 {

    void topUp(double amount) {
        System.out.println("Top up of ₹" + amount + " using Crypto");
    }
}

public class Assign_10C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentMethod3[] methods = {
	            new CardPayment3(),
	            new UpiPayment3(),
	            new CryptoPayment3()
	        };

	        for (int i = 0; i < methods.length; i++) {
	            methods[i].topUp(500);
	        }
	}

}
//Compile-time polymorphism means method overloading.
//The same method name can have different parameters and Java decides which method to call during compilation.
//For example, a PhonePe payment system could have pay(int amount) and pay(int amount, String UPIId).
//Runtime polymorphism means method overriding, where a parent reference can call different subclass methods depending on the actual object.
//For example, a PaymentMethod reference could call CardPayment, UpiPayment, or CryptoPayment's topUp() method.