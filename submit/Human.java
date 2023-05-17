package submit;

public class Human {
	protected String name;
	protected int height;
	protected int weight;
	protected double standardWeight;
	protected double obesity;
	
	public Human(String name, int height, int weight){
		this.name=name;
		this.height=height;
		this.weight=weight;
	}



	public void getInformation() {
		System.out.printf("%s,%d,%d",name,height,weight);
	}
}

