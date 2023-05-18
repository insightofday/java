package API;

public class smartPhone {
	private String company;
	private int price;
	private String name;
	
	smartPhone(String company, int price, String name){
		this.company=company;
		this.price=price;
		this.name=name;
	}

	@Override
	public String toString() {
		return "smartPhone [company=" + company + ", price=" + price + ", name=" + name + "]";
	}

	
}
