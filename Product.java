/**
 * A class that models a product.
 * But Dan, why is Product abstract?  It has no abstract methods!
 * It is abstract because we shouldn't be able to make instances of it.
 * The type is not complete.
 * @author Liam O'Reilly
 *
 */
public abstract class Product {
	protected double price;
	protected int numStock;
	
	/**
	 * Create a new product.
	 * @param price The price of the product in pounds.
	 * @param numStock The amount of the product in stock. 
	 */
	public Product(double price, int numStock) {
		this.price = price;
		this.numStock = numStock;
	}

	protected Product() {
	}

	/**
	 * Get the price of the product.
	 * @return The price of the product in pounds.
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Set the price of the product.
	 * @param price The price of the product in pounds.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Get the amount of product in stock.
	 * @return The amount of product in stock.
	 */
	public int getNumStock() {
		return numStock;
	}
	
	/**
	 * Set the amount of product in stock.
	 * @param numStock The amount of product in stock.
	 */
	public void setNumStock(int numStock) {
		this.numStock = numStock;
	}
}
