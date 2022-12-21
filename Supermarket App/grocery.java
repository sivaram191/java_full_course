package supermarket.products;

import java.util.ArrayList;

public class grocery 
{
	private String name;
	private double price;
	private double discount;
	public grocery(String name, double price, double discount) 
	{
		this.name=name;
		this.price=price;
		this.discount=discount; 
	}
	public double getsp()
	{
		return price-(price*discount/100);
	}
	public String display()
	{
		return("name: "+name+"\n"+"price: "+price+"\n"+"discount: "+discount+"%");
		
			
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public static void main(String [] args)
	{
		ArrayList<grocery> cart=new ArrayList <grocery>();
		grocery toast=new grocery("Toast",100,2);
		cart.add(toast);
		cold_drinks pepsi =new cold_drinks("pepsi",45,1,sugarlevels.ZERO);
		cart.add(pepsi);
		dairy_items milk =new dairy_items("milk",45,1,fat.HALFCREAM);
		cart.add(milk);
		double total = 0;
		for(int i=0;i<cart.size();i++)
		{
			total=total+cart.get(i).getsp();
		}
		System.out.println("------------------------------------");
	    System.out.println("the total bill = "+ total);
	    System.out.println("------------------------------------");
	}
	 
}
