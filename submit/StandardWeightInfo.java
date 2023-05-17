package submit;

public class StandardWeightInfo extends Human {
	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
		//this.standardWeight=standardWeight;
	}


	public void getInformation() {
		System.out.printf("%s,%d,%d, %f",name, height, weight,standardWeight);
	}
	
	public double getStandardWeight() {
		standardWeight=(height-100)*(double)0.9;
		System.out.println(standardWeight);
		return standardWeight;
	}
}
