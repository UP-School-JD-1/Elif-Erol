package Homework8;

public class Consultancy extends Product implements Priceable{
	Consultancy(String sku, String description, double price, double tax) {
		super(sku, description, price, tax);
		// TODO Auto-generated constructor stub
	}

	public void ConsultingService(String description, String sku, double price, double tax) {
		super(description, sku, price, tax);

	}

	public void consulting() {
		System.out.println(super.getDescription() + " provided");
	}

	@Override
	public void purchase() {
		System.out.println(super.getDescription() + " cost " + super.getPrice());
	}
}