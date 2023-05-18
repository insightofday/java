package objobj;

public class TossCard extends Card {
	String company="Toss";
	String cardStaff;

	TossCard(String cardNo, int validDate, int CVC, String cardStaff) {
		super(cardNo, validDate, CVC);
		this.cardStaff=cardStaff;
	}

	
	TossCard(String cardNo, int validDate, int CVC, String company, String cardStaff) {
		super(cardNo, validDate, CVC);
		this.company=company;
		this.cardStaff=cardStaff;
	}

	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println("담당직원-"+cardStaff+", "+company);
	}
	
	

}
