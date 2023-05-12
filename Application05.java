package oop;

import java.util.Arrays;
import java.util.Scanner;

public class Application05 {

	public static void main(String[] args) {
//		String[]strAry=new String[2];
//		
//		strAry[0]="1st";
//		strAry[1]="2nd";
//		strAry[2]="3rd";
		Book[]ary=null;
		int bookNum=0;
		while(true) {
			System.out.println();
			Scanner scanner=new Scanner(System.in);
			System.out.println("1.책수 2.책입력 3.정보확인 4.종료");
			System.out.println();
			String str=scanner.nextLine();
			
			if(str.equals("1")) {
				System.out.println("책 수?");
				bookNum=Integer.parseInt(scanner.nextLine());
			}else if(str.equals("2")) {
				
				ary=new Book[bookNum];
				for(int i=0;i<ary.length;i++) {
					Book book=new Book();
					System.out.println("제목");
					book.name=scanner.nextLine();
					
					System.out.println("종류");
					book.type=scanner.nextLine();
					
					System.out.println("가격");
					book.price=scanner.nextInt();
					scanner.nextLine();
					
					System.out.println("도서번호");
					book.no=scanner.nextInt();
					scanner.nextLine();
					
					System.out.println("출판사");
					book.company=scanner.nextLine();
					
					ary[i]=book;
					System.out.println(Arrays.toString(ary));
					
				}
			}else if(str.equals("3")) {
				for(int i=0;i<ary.length;i++) {
					System.out.println((i+1)+"번째 책 정보");
					ary[i].getInfo();
					System.out.println();
				}
			}else if(str.equals("4")) {
				System.out.println("close");
				break;
			}else {
				System.out.println("please put 1~4");
			}
		}
	}

}
