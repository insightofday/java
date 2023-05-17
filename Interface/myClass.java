package Interface;

public class myClass {
//필드를 인터페이스로 정의
remoteControl rc=new television();


myClass(){}

//인터페이스를 생성자에 넣기 ㄱㄴ
public myClass(remoteControl rc) {
	this.rc=rc;//매개변수rc를 필드의 rc로 초기화함
	rc.turnOn();
}
//인터페이스를 메서드에 넣기 ㄱㄴ
public void method1() {
	remoteControl rc=new Audio();
	rc.turnOff();
}
//메서드의 매개변수
public void method3(remoteControl rc) {
	rc.turnOff();
}

}
