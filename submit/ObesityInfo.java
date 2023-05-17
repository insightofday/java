package submit;

public class ObesityInfo extends StandardWeightInfo {
	

	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
//		this.standardWeight=standardWeight;
//		this.obesity=obesity;
	}


	public void getInformation() {
		this.obesity=obesity;
		System.out.printf("%s 님의 신장 %d, 몸무게 %d, ",name,height,weight );		
		if(obesity<=18.5) {
			System.out.println("저체중입니다.");
		}else if(obesity<=22.9||obesity>18.5) {
			System.out.println("표준체중입니다.");
		}else if(obesity<=24.9||obesity>22.9) {
			System.out.println("과체중입니다.");
		}
		
	}
	public double getObesity() {
		this.standardWeight=standardWeight;
		obesity=((weight-standardWeight)/standardWeight*100);
		System.out.println(obesity);
		return obesity;
	}
}
