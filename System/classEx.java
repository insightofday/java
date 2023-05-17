package System;

import API.member;

public class classEx {
	public static void main(String[] args) throws ClassNotFoundException {
		//class정보얻기
		Class clazz=member.class;
		System.out.println("class information: "+clazz);
		
		//경로를 입력해서 정보얻기
		clazz=Class.forName("API.member");
		System.out.println(clazz);
		
		//객체를 통해 정보얻기
		member member=new member("sdafdsfsf");
		clazz=member.getClass();
		System.out.println(clazz);
		System.out.println();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getPackage().getName());
		
		//절대경로 찾아오기
		String photoPath=clazz.getResource("img.jpg").getPath();
		System.out.println(photoPath);
		///src는 작성중인 폴더
		//bin의 class파일이 실행됨 그래서 getpath가 bin으로 뜸(bin에서 실행됨 저장된 곳으로 출력x)
	}
}
