package API;

import java.io.UnsupportedEncodingException;

public class stringEx {
	public static void main(String[] args) {
		byte[] bytes= {72,101,108,108,111,32,74,97,118,97};
		String str1=new String(bytes);
		System.out.println(str1);
		
		String str2=new String(bytes, 6,4);
		System.out.println(str2);
		
		String n="123456789-156748";
		char gender=n.charAt(10);
		System.out.println(gender);
	
		switch (gender) {
		case '1':
		case '3':
			System.out.println("man");
			break;
		case '2'://문자기때문에''이 꼭 필요햄
		case '4':
			System.out.println("woman");
			break;
		}
		
		String str3="dd";
		String str4="dd";
		String str5=new String("dd");
		
		if(str3.equals(str4)) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
		
		if(str3.equals(str5)) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
		System.out.println();//object의 equals를 String클래스에서 오버라이딩해서 
		//그 내용은)1객체가 같으면 true를 반환
		//       )2객체의 내용을 비교하여 같은 내용이면 true를 반환함
		//str1.equals(str2)일 때 str1이 null이라면 NPE발생
		//그러나, str2가 null이라면 NPE는 발생하지 않는다.
		
		//Object.equals(str1,str2)를 하게 되면 NPE발생하지 않도록
		//API가 마련되어 있어 그걸 쓰면 조와
		
		//equalsIgnoreCase()쓰면 대소문자구별x
		
		//==은 equals와 달리 객체(객체의 hashcode)를 비교하기 때문에 내용이 같은지는 알 수 없음
		//comepareTo는 앞의 것과 뒤의 것을 비교해서 각각 양수, 음수를 출력한다.
		//str.compareTo(str2);의 꼴로 사용하면 됨
		
		
		
		
		String str6="hi";
		byte[]byte1=str6.getBytes();
		
		for(byte word:byte1) {
			System.out.println(word);
		}
		
		String str7=new String(byte1);
		System.out.println("byte>String "+str7);
		
		//byte<->String+encoding type
		try {
			//string을 바이트로 바꾸는데 인코딩타입이 euc-kr(utf-8,utf-16...도 쓸 수 있음)
			byte[]byte2=str6.getBytes("EUC-KR");
			//byte배열을 string으로 바꾸는데 인코딩타입이 euc-kr
			String str8=new String(byte2,"EUC-KR");
		} 
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.println();
		
		String subject="java programming";
		int idx=subject.indexOf("ramming");
		System.out.println(idx);
		idx=subject.indexOf("sss");
		System.out.println(idx);//못찾으면-1
		
		System.out.println(subject.length());
		String h="0100161531-456767685";
		if(h.length()==14) {
			System.out.println("주민번호맞을 수도?");
		}else {
			System.out.println("주민번호 아닐듯?");
		}
		
		
		
		
		
		
		System.out.println();
		
		
		String oldStr="java programming";
		String newStr=oldStr.replace("java", "C");
		System.out.println(newStr);
		
		String sub=subject.substring(0,5);
		System.out.println(sub);
		sub=subject.substring(5);
		System.out.println(sub);
		
		
		
		
		
		
		System.out.println();
		
		String big="AAAAAAA";
		System.out.println(big.toLowerCase());
		
		String small="aaaaaaa";
		System.out.println(small.toUpperCase());
		
		String trim="            hahahasda fawf wae f        jawfej       j     ";
		System.out.println(trim.trim());
		
		System.out.println();
		
		String temp=String.valueOf(123);//"123"
		System.out.println(temp);
		temp=String.valueOf(false);//"false"
		System.out.println(temp);
		
		
		
		
		
		
		
		
		
		System.out.println();
		String value="1,2,3,,4,5,6,7,8,9,5,4,3,8,7,63,41,8,3,4,8,3,1,8";
		String[]strAry=value.split(",");
		System.out.println(strAry.toString());//이렇게하면 주소값이 뜸
		
		for(String data:strAry) {
			System.out.print(data);
		}
		
		
		
		
		
		
		
		
		
		System.out.println();
		
		String empty="";
		if(empty.isEmpty()) {
			System.out.println("empty");
		}else {
			System.out.println("there is a letter");
		}
		
		///StringBuilder(단일쓰레드), StringBuffer(멀티쓰레드):둘 다 더하기연산 등을 할 때 새로운 공간을 할당하지 않아 String보다 나음///////////////////
		StringBuilder sb=new StringBuilder();
		sb.append("f");
		sb.append("afj");
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.delete(0, 1);
		System.out.println(sb);
		
		
		
		//concat(합치기,"+"로대체가능)
		//contains(indexOf로 대체가능)
		System.out.println(big.endsWith("A"));
		
	}
	
}
