package assignments8_;

public class FoodOrder {
	double orderAmount;

    FoodOrder(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    double calculateTotal() {
        return orderAmount;
    }
}

class ZomatoGoldOrder extends FoodOrder {

    ZomatoGoldOrder(double orderAmount) {
        super(orderAmount);
    }

    double calculateTotal() {
        double total = super.calculateTotal();
        return total - (total * 0.10);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZomatoGoldOrder order = new ZomatoGoldOrder(1000);

        System.out.println("Final Amount: ₹" + order.calculateTotal());
	}

}
