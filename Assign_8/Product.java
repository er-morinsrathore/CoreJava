package assignments8_;

public class Product {
	String name;
    double price;

    Product() {
        name = "Unknown";
        price = 0;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    Product(Product p) {
        this.name = p.name;
        this.price = p.price;
    }

    void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: ₹" + price);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Product p1 = new Product();
	        Product p2 = new Product("Laptop", 55000);
	        Product p3 = new Product(p2);

	        System.out.println("Default Constructor:");
	        p1.displayDetails();

	        System.out.println("\nParameterized Constructor:");
	        p2.displayDetails();

	        System.out.println("\nCopy Constructor:");
	        p3.displayDetails();
	}

}
