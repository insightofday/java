package objobj;

public class Card {

	String cardNo;
	int validDate;
	int CVC;
	
	Card(String cardNo,int validDate, int CVC){
		this.cardNo=cardNo;
		this.validDate=validDate;
		this.CVC=CVC;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public int getValidDate() {
		return validDate;
	}
	
	
	public int getCVC() {
		return CVC;
	}
	public void showCardInfo() {
		System.out.println("카드정보 (Card No : "+cardNo+", 유효기간 : "+validDate+", CVC : "+CVC+")");
	}
	
}
