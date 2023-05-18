package objobj;

public class DGBCard extends Card {
	String company="대구은행";
	String cardStaff;

	DGBCard(String cardNo, int validDate, int CVC, String cardStaff) {
		super(cardNo, validDate, CVC);
		this.cardStaff=cardStaff;
	}

	
	DGBCard(String cardNo, int validDate, int CVC,String cardStaff, String company) {
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
