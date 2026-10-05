package assignments;

public class Product {
	
	String productName;
    double price;

	public static void main(String[] args) {
		Product p = new Product();

        p.productName = "Laptop";
        p.price = 55000;

        System.out.println("Product Name: " + p.productName);
        System.out.println("Price: ₹" + p.price);
	}

}
