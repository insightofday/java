package API;

public class Stringss {
	public static void main(String[] args) {
		////1번
		String str="abcdef";
		char arr[]=new char[str.length()];
		
		for(int i=0;i<str.length()-1;i++) {
			arr[i]=(char)str.charAt(i);
		}
		
		char reversearr[]= new char[str.length()];
		
		for(int i=str.length()-1;i>=0;i--) {
				int j=0;
				reversearr[j]=arr[i];		
				System.out.print(reversearr[j]);
				j++;
			
		}
		
		//2번
		String str2="1n2ASD 330aa1";
		byte[] bytes=str2.getBytes();

		
		int ch=0;
		int blank=0;
		int num=0;
		for(int i=0;i<str2.length()-1;i++) {
			if(bytes[i]>=48&&bytes[i]<=57) {
				num++;
			}
			else if(bytes[i]>=65&&bytes[i]<=90||bytes[i]>=97&&bytes[i]<=122) {
				ch++;
			}
			else if(bytes[i]==32) {
				blank++;
			}
			
		}
		System.out.println();
		System.out.println("숫자 : "+num+"개, 알파벳: "+ch+"개, 공백(띄어쓰기): "+blank);
		
		
		//3번
		
		String jm="000102-1234567";

		
		int year=Integer.parseInt(jm.substring(0,2));
		System.out.println(year);
		
		
		if(year>=00&&year<=23) {//0보다 크다는 조건은 의미없는 조건임
			int age=23-year;
			System.out.println(age+"살인데용ㅎ");
		}
		else if (year>=24&&year<=99){
			int age=2023-(1900+year);
			System.out.println(age+"살인데용ㅎ");
		}
		
		
		//4번
		String strs="KKHHSSSSE";
		//결과:K2H2S4E
		
		String result="";
		int count=1;
		for(int i=0;i<strs.length();i++) {
			if(i<strs.length()-1&&strs.charAt(i)==strs.charAt(i+1)) {
				count++;
			}else {
				result+=strs.charAt(i);
				if(count>1) {
					result+=String.valueOf(count);
				}
				count=1;
			}
		}
		System.out.println(result);
		

		
		
		
		
	}
	
}
