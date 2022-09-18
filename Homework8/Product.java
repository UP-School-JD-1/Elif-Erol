package Homework8;

public class Product extends AbstractProduct implements Priceable {

	public double price;
	public double tax;

	Product(String sku, String description, double price, double tax) {
		super(description, sku);
		this.price = price;
		this.tax = tax;

	}

	public final double getPrice() {
		return price;
	}

	public final void setPrice(double price) {
		this.price = price;
	}

	public final double getTax() {
		return tax;
	}

	public final void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public void purchase() {
		System.out.println("This product" + super.getDescription() + " selling for " + this.getPrice());

	}

	@Override
	public String toString() {
		return "Product: " + super.description + "Price: " + price + "Tax: " + tax;
	}

}