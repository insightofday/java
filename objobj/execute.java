package objobj;

public class execute {

	public static void main(String[] args) {
		Person p= new Person(950327-1111111, "dd", "lajfljaljflwa");
		
		Card c= new TossCard("123156413-15346-123415634",12646461,453,"신빛용");
		c.showCardInfo();
		c=new Card("123156413-15346-123415634",12646461,453);
		c.showCardInfo();
		c=new DGBCard("123156413-15346-123415634",12646461,453,"신빛용");
		c.showCardInfo();
		
		
		int price=10000;
		Payment card=new CardPayment(0.08);
		card.showInfo();
		System.out.println("온라인 결제 금액 : "+card.online(price));
		System.out.println("오프라인 결제 금액 : "+card.offline(price));
		
		Payment simple=new SimplePayment(0.05);
		simple.showInfo();
		System.out.println("온라인 결제 금액 : "+simple.online(price));
		System.out.println("오프라인 결제 금액 : "+simple.offline(price));
		

	}

}
