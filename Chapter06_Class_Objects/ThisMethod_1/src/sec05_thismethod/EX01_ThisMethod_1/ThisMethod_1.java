//this() 메서드의 문법적 특징과 의미
package sec05_thismethod.EX01_ThisMethod_1;

//클래스 정의
class A{
	A(){
		System.out.println("첫 번째 생성자");
	}
	A(int a){
		this();		//반드시 첫줄, 다른 생성자 호출
		System.out.println("두 번째 생성자");
	}
	
	/*
	 * void abc() { this(); //생성자 외 메서드에서는 this() 사용 불가 }
	 */
	
}

public class ThisMethod_1 {
	public static void main(String[] args) {
		//객체 생성
		A a1 = new A();		//첫 번째 생성자 호출
		System.out.println();
		A a2 = new A(3);	//두 번째 생성자 호출(내부에서 첫번째 생성자 호출)
	}
}
