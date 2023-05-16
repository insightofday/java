package poly;

public class smartPhone extends Phone {

	public smartPhone(String Owner) {
		super(Owner);////////////상위생성자 호출!!!!!!!!!!!방식!!!!!
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("추상메서드 구현");
		super.superi();

	}

}
