package oop;

import java.util.Arrays;
import java.util.Scanner;

public class test0512 {

	public static void main(String[] args) {
		/////////////?///////////////////////////////////1번
		int a=10;
		float b=10;
		System.out.println(b);
		System.out.println(a+(int)b);
		System.out.println(a*(int)b);
		System.out.println(a-(int)b);
		System.out.println(a/(int)b);
		//////////////////////////////////////////////////2번
		//1)false
		//2)true
		//3)false
		
		//////////////////////////////////////////////////3번
		int[] coinUnit= {500,100,50,10};
		int money=2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			if(money>499) {
				int five=money/coinUnit[0];
				money-=five*coinUnit[0];
				System.out.print(coinUnit[0]+"원: "+five+"개, ");
			}
			if(money>99) {
				int hundred=money/coinUnit[1];
				money-=hundred*coinUnit[1];
				System.out.print(coinUnit[1]+"원: "+hundred+"개, ");
			}
			if(money>49) {
				int fifty=money/coinUnit[2];
				money-=fifty*coinUnit[2];
				System.out.print(coinUnit[2]+"원: "+fifty+"개, ");
			}
			if(money>9) {
				int ten=money/coinUnit[3];
				money-=ten*coinUnit[3];
				System.out.print(coinUnit[3]+"원: "+ten+"개");
				break;
			}

		}
		///////////////////////////////////////////4번
		System.out.println();
		System.out.println("4번문제시작~");
		for(int i=2;i<10;i++) {
			for(int j=1;j<i;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		/////////////////////////////////5번
		Scanner scanner=new Scanner(System.in);
		boolean close=true;
		int size=0;
		int[] rolls= new int[size];
		
		while(close) {
				System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4. 가장 많이 나온 수 5. 종료===");
				System.out.println("메뉴 > ");
				int num=Integer.parseInt(scanner.nextLine());
				
				if(num==1) {
					System.out.println("주사위 크기 >");
					size=Integer.parseInt(scanner.nextLine());
					if(size<5||size>10) {
						System.out.println("주사위의 크기는 5부터 10까지만 입력해야 합니다.");
					}
				}
				////////////3번을 고려하지 않았을 때의 로직//////////////////////////////
//				if(num==2) {
//					int roll=Integer.parseInt(scanner.nextLine());
//					int count=0;
//					if(roll!=5) {
//						roll=Integer.parseInt(scanner.nextLine());
//						++count;
//					}else {
//						System.out.println("5가 나올 때 까지 주사위를"+count+"번 굴렸습니다.");
//					}
//				}
				//////////3번을 고려한 로직////////////////
				
				if(true) {
						if(num==2) {
							System.out.println(size);
							int roll=(int)(Math.random()*size)+1;
							int count=0;
							while(roll!=5) {
								roll=(int)(Math.random()*10)+1;
									if(roll==1) {
										rolls[0]++;
									}
									else if(roll==2) {
										rolls[1]++;
									}
									else if(roll==3) {
										rolls[2]++;
									}
									else if(roll==4) {
										rolls[3]++;
									}
									else if(roll==6) {
										rolls[5]++;
									}
									else if(roll==7) {
										rolls[6]++;
									}
									else if(roll==8) {
										rolls[7]++;
									}
									else if(roll==9) {
										rolls[8]++;
									}
									else if(roll==10) {
										rolls[9]++;
									}
									++count;
							}
							System.out.println("5가 나올 때 까지 주사위를"+count+"번 굴렸습니다.");
						
								System.out.println(Arrays.toString(rolls));
							
						}

						
						
						if(num==3) {
							System.out.println(Arrays.toString(rolls));
							for(int i=0; i<4; i++) {
								System.out.println((i+1)+"은 "+rolls[i]+"번 나왔습니다.");
							}	
							
							for(int i=5; i<11;i++) {
								System.out.println((i+1)+"는"+ rolls[i]+"번 나왔습니다");
							}
						}
						
						if(num==4) {
							int max=rolls[0];
							for(int i=1;i<rolls.length;i++) {
								if(max<rolls[i]) {
									max=rolls[i];
								}
							}
							System.out.println("가장 많이 나온 수는"+max +"입니다.");
						}
				}
				if(num==5) {
					System.out.println("프로그램 종료");
					close=false;
				}
					
				
				
				
				
				
				
				
				
				
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
