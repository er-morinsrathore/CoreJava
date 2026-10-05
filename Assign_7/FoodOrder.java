package assignments;

public class FoodOrder {
	 String items = "";

	    void addItem(String itemName) {
	        items = items + itemName + "\n";
	    }

	    void getOrderSummary() {
	        System.out.println("Order Summary:");
	        System.out.println(items);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FoodOrder order = new FoodOrder();

	        order.addItem("Pizza");
	        order.addItem("Burger");
	        order.addItem("Cold Drink");

	        order.getOrderSummary();
	}

}
