//인터페이스 상속 자식 클래스의 접근 지정자
package sec02_interface.EX03_InheritanceOfInterface_2;

interface A{
	public abstract void abc();
}
interface B{
	void bcd();		//public abstract가 자동추가
}
class C implements A{
	public void abc() {
		//...
	}
}
/*
class D implements B{
	void bcd() {		// public 메서드를 default 메서드로 완성할 수 없음. 불가능
		
	}
}
*/

public class InheritanceOfInterface_2 {
	public static void main(String[] args) {
		
	}
}
