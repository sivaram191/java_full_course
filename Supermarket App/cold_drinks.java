package supermarket.products;

public class cold_drinks extends grocery 
{
	private sugarlevels sugar;
	public cold_drinks(String name, double price, double discount, sugarlevels sugar ) {
		super(name,price,discount);
		this.sugar=sugar;
	}
	public String display()
	{
		return(super.display()+"\nsugar Level: "+sugar);
	}
	public sugarlevels getSugar() {
		return sugar;
	}
	public void setSugar(sugarlevels sugar) {
		this.sugar = sugar;
	}
	 
	
}
