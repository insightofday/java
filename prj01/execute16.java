package prj01;

import java.util.Scanner;

public class execute16 {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		//////////1번 실행문
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
		
		System.out.println();
		
		///////////2번실행문
		PortableNotebook pn=new PortableNotebook("한글2020","크롬","영화","안드로이드앱");
		pn.writeDocumentaion();
		pn.watchVideo();
		pn.useApp();
		pn.searchInternet();
		
		System.out.println();
		
		///////3번실행문
		int pick=(int)(Math.random()*10);
		randomGame rg = new randomGame();
		rg.run(pick);
		
		
	}


}
