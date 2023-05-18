package objobj;

public class SimplePayment implements Payment {
	double simplePaymentRatio;
	
	SimplePayment(double simplePaymentRatio){
		this.simplePaymentRatio=simplePaymentRatio;
	}

	@Override
	public int online(int price) {
		int total= (price-(int)(price*ONLINE_PAYMENTRATIO+price*simplePaymentRatio));
		
		return total;
	}

	@Override
	public int offline(int price) {
	int total= (price-(int)(price*OFFLINE_PAYMENTRATIO+price*simplePaymentRatio));
		return total;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : "+(ONLINE_PAYMENTRATIO+simplePaymentRatio));
		System.out.println("오프라인 결제 시 총 할인율 : "+(OFFLINE_PAYMENTRATIO+simplePaymentRatio));


	}

}
