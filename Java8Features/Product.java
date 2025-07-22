package Java8Features;

public class Product {

	int id;
	String prodName;
	float price;
	
	
	public Product(int id, String prodName, float price) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + ", price=" + price + "]";
	}
	
	
}
