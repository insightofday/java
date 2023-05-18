package objobj;

public interface Payment {
	final static double ONLINE_PAYMENTRATIO=0.05;
	final static double OFFLINE_PAYMENTRATIO=0.03;
	
	public int online(int price);
	public int offline(int price);
	public void showInfo();
}
