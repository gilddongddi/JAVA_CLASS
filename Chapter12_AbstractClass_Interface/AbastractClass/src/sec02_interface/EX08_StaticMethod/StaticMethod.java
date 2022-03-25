//인터페이스 내의 정적 메서드
package sec02_interface.EX08_StaticMethod;

interface A{
	static void abc() {
		System.out.println("A 인터페이스의 정적 메서드 abc()");
	}
}
public class StaticMethod {
	public static void main(String[] args) {
		//정적 메서드 호출
		A.abc();  			//객체를 만들지 않고 '인터페이스명.정적메서드명'으로 바로 호출
	}
}
