package oop;

import java.util.Arrays;
import java.util.Scanner;

public class Appliaction06 {

	public static void main(String[] args) {
		Student student=new Student();
		Student[]stuary=null;
		int insert;
		int stuNum=0;
		
		while(true) {
			System.out.println();
			Scanner scanner=new Scanner(System.in);
			System.out.println("1.학생수//2.정보입력//3.정보확인//4.분석//5.종료");
			System.out.println();
			String str=scanner.nextLine();
			
			if(str.equals("1")){
				System.out.println("학생은 몇 명??");
				stuNum=Integer.parseInt(scanner.nextLine());
			}else if(str.equals("2")) {
				
				stuary=new Student[stuNum];
				for(int i=0;i<stuary.length;i++) {
					Student stu=new Student();
					System.out.println("name");
					stu.name=scanner.nextLine();
					
					System.out.println("grade");
					stu.grade=scanner.nextInt();
					scanner.nextLine();
					
					System.out.println("kor score");
					stu.kor=scanner.nextInt();
					scanner.nextLine();
					
					System.out.println("eng score");
					stu.eng=scanner.nextInt();
					scanner.nextLine();
					
					System.out.println("math score");
					stu.math=scanner.nextInt();
					scanner.nextLine();
					
					stuary[i]=stu;
//					System.out.println(Arrays.toString(ary));
					
					/////////////////////////////////배열에 바로 객체 삽입
					
//					
//					stuary[i]=new Student();
//					
//					System.out.println("name");
//					stuary[i].name=scanner.nextLine();
//					
//					System.out.println("grade");
//					stuary[i].grade=scanner.nextInt();
//					scanner.nextLine();
//					
//					System.out.println("kor score");
//					stuary[i].kor=scanner.nextInt();
//					scanner.nextLine();
//					
//					System.out.println("eng score");
//					stuary[i].eng=scanner.nextInt();
//					scanner.nextLine();
//					
//					System.out.println("math score");
//					stuary[i].math=scanner.nextInt();
//					scanner.nextLine();
					
				}
			}else if(str.equals("3")) {
				for(int i=0;i<stuNum;i++) {
					stuary[i].getInfo();
				}
					System.out.println();
				}
			else if(str.equals("4")) {
				int sum=0;
				float avg=0;
			
				
				for(int i=0;i<stuNum;i++) {
					sum+=stuary[i].kor+stuary[i].math+stuary[i].eng;	
					avg=(float)sum/stuNum;
					
					
//					if(stuary[i].kor<stuary[i].eng) {
//						min=stuary[i].kor;
//					}else if(stuary[i].kor<stuary[i].math) {
//						min=stuary[i].kor;
//					}else if(stuary[i].eng<stuary[i].math) {
//						min=stuary[i].eng;
//					}
					int min=stuary[i].kor;
					int max=stuary[i].kor;
					//이하는 주석친 내가 만든 로직과 유사함
					
					if(stuary[i].eng<stuary[i].math) {
						if(max<stuary[i].math) {
							max=stuary[i].math;
						}
					}else {
						if(max<stuary[i].eng) {
							max=stuary[i].eng;
						}
					}
					//or 데이터를 배열에 넣어서 최댓값, 최소값을 구하기
				}
				System.out.println("avg is "+avg);
				System.out.println("sum is "+sum);
			
			}else if(str.equals("5")){
				System.out.println("close");
				break;
			}
		}

	}

}///////////버블정렬. 삽입정렬을 사용하여 위 로직을 다시 짜보기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
