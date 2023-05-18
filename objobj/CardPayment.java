package objobj;

public class CardPayment implements Payment {
	double cardRatio;
	
	CardPayment(double cardRatio){
		this.cardRatio=cardRatio;
	}

	@Override
	public int online(int price) {
	int total= (price-(int)(price*ONLINE_PAYMENTRATIO+price*cardRatio));
		
		return total;
	}

	@Override
	public int offline(int price) {
		int total= (price-(int)(price*OFFLINE_PAYMENTRATIO+price*cardRatio));
		
		return total;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : "+(ONLINE_PAYMENTRATIO+cardRatio));
		System.out.println("오프라인 결제 시 총 할인율 : "+(OFFLINE_PAYMENTRATIO+cardRatio));

	}
	
	//&&은 앞이 false면 뒤를 보지도 않고
	//&은 앞이 false라도 뒤의 값을 보고 계산함
	//따라서 반복문의 경우, 마지막 호출에서 불완전한 경우가 있는 것을 뒤에 배치하는 것이 옳은 전략

}
