package prj01;

import java.util.Scanner;

public class randomGame {
	Scanner sc=new Scanner(System.in);
	int pick;
	randomGame(){
		
	
	}
	
	public void run(int select) {
		if(pick>5) {
			Keypad rpg=new RPGgame();
			while(true) {
				System.out.println("============================================================================================\r\n"
						+ "<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>\r\n"
						+ "============================================================================================");
				System.out.println("choice>>");
				int menu=Integer.parseInt(sc.nextLine());
				if(menu==1) {
					rpg.leftUpButton();
				}
				if(menu==2) {
					rpg.leftDownButton();
				}
				if(menu==3) {
					rpg.rightUpButton();
				}
				if(menu==4) {
					rpg.rightDownButton();
				}
				if(menu==5) {
					rpg.changeMode();
				}
				if(menu==0) {
					if(rpg.type()=="RPG") {
						rpg= new ArcadeGame();		
					}
					else if(rpg.type()=="Arcade") {
						rpg= new RPGgame();		
					}
				
				}
				if(menu==9) {
					System.out.println("Exit");
					break;
				}
			}
			
		}else {			Keypad arcade=new ArcadeGame();

			while(true) {
				System.out.println("============================================================================================\r\n"
						+ "	<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>\r\n"
						+ "============================================================================================");
				System.out.println("choice>>");
				int menu=Integer.parseInt(sc.nextLine());
				if(menu==1) {
					arcade.leftUpButton();
				}
				if(menu==2) {
					arcade.leftDownButton();
				}
				if(menu==3) {
					arcade.rightUpButton();
				}
				if(menu==4) {
					arcade.rightDownButton();
				}
				if(menu==5) {
					arcade.changeMode();
				}
				if(menu==0) {
					if(arcade.type()=="RPG") {
						arcade= new ArcadeGame();		
					}
					else if(arcade.type()=="Arcade") {
						arcade= new RPGgame();		
					}
					
				}
				if(menu==9) {
					System.out.println("Exit");
					break;
				}
		}
		}
		}
}


