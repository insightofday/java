package submitInterface;

public class execute16 {

	public static void main(String[] args) {
		RPGgame rpg=new RPGgame();
		rpg.leftUpButton();
		rpg.rightUpButton();
		rpg.changeMode();
		rpg.leftUpButton();
		rpg.rightDownButton();
		rpg.changeMode();
		rpg.rightDownButton();
		System.out.println("=============================");
		ArcadeGame ag=new ArcadeGame();
		ag.leftUpButton();
		ag.rightUpButton();
		ag.leftDownButton();
		ag.changeMode();
		ag.rightUpButton();
		ag.leftUpButton();
		ag.rightDownButton();
	}

}
