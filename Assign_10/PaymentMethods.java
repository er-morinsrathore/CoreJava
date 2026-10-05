package assignments8_;

public class PaymentMethods {

	void topUp(double amount) {
        System.out.println("Payment method used");
    }
}

class CardPayment4 extends PaymentMethods {

    @Override
    void topUp(double amount) {

        if (amount > 1000) {
            System.out.println("Top up of ₹" + amount + " using Card");
            System.out.println("Congratulations! You received cashback.");
        } else {
            System.out.println("Top up of ₹" + amount + " using Card");
        }
    }

    public static void main(String[] args) {

        CardPayment4 card = new CardPayment4();

        card.topUp(500);
        card.topUp(1500);

	}

}
