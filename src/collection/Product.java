package collection;

public class Product implements Comparable<Product> {
	private String productID;
	private String productName;
	private int productPrice;

	public Product() {
	}

	public Product(String productID, String productName, int productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			return productID.equals(((Product) obj).productID);
		}
		return false;
	}

	public int hashCode() {
		return productID.hashCode();
	}

	@Override
	public String toString() {
		return String.format("%-10s%-10s%-10s", productID, productName, productPrice);
	}

	public int compareTo(Product p) {
		int result = 0;
/*		if(productID.equals(p.productID) == true)
			return 0;*/
		
		if (productPrice > p.productPrice)
			result = 1;
		else if(productPrice == p.productPrice)
			result = 0;
		else
			result = -1;
		
		return result;
	}
}
