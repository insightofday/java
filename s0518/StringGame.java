package s0518;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringGame {
	private String[]StrData= {"Orange","Game","Phone","Smart"};
	private String strAnswer;//랜덤으로 뽑은 단어
	private List<Character>charData;//list는 가변적이라 가변데이터를 보관할 때 사용
	
	StringGame(){
		init();
	}
	
	public void setCharData() {
		showStrData();
		if(charData.size()==strAnswer.length()) {//charData는같은글자가있을때넣는배열, stranswer은 랜덤으로 뽑은 단어가 들어오는 배열. 따라서 둘의 길이가 같으면 같은문자임
			System.out.println("문자열을 구성하는 문자를 다 입력함");
		}else {
			String inputStr=inputData();
			if(strAnswer.indexOf(inputStr.charAt(0))!=-1) {
				System.out.println("문자열을 구성하는 문자입니다.");
				charData.add(inputStr.charAt(0));
			}else {
				System.out.println("문자열을 구성하는 문자가 아닙니다.");
			}
		}
	}
	public void showStrData() {
		System.out.println("현재까지 확인된 문자열은 다음과 같습니다");
		for(char Data:charData) {
			System.out.println(Data+" ");
		}
		System.out.println();
	}
	private String inputData() {
		System.out.println("입력값>");
		return new Scanner(System.in).next().toLowerCase();//method chaining
	}
	public void setStrData() {
		showStrData();
		String inputStr=inputData();
		if(strAnswer.equals(inputStr)) {
			System.out.println("correct!");
		}else {
			showStrData(inputStr);
		}
	}
	public void showStrData(String inputStr) {
		if(strAnswer.length()==inputStr.length()) {
			for(int i=0;i<strAnswer.length();i++) {
				if(strAnswer.charAt(i)==inputStr.charAt(i)) {
					System.out.println("O");
				}else {
					System.out.println("X");
				}
			}
			System.out.println();
		}else {
			System.out.println("입력된 문자열의 길이가 정답과 다릅니다.");//예외처리를 하는것임
		}
		
	}
	public void init() {
		strAnswer=getStrAnswer();
		charData=new ArrayList<>();//입력한 내역 초기화
		
	}
	private String getStrAnswer() {
		int idx=(int)(Math.random()*4);
		String str=StrData[idx].toLowerCase();
		return str;
	}
		
	}
	
