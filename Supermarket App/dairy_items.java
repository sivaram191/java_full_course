package supermarket.products;

public class dairy_items extends grocery 
{
	private fat Fat;
	public dairy_items(String name, double price, double discount, fat Fat) {
		super(name,price,discount);
		this.Fat=Fat;
	}
	public String display()
	{
		return(super.display()+"\nFat Level: "+Fat);
	}
	public fat getFat() {
		return Fat;
	}
	public void setFat(fat fat) {
		Fat = fat;
	}
}
