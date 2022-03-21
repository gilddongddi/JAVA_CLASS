//기본 생성자의 자동 추가
package sec03_constructor.EX01_DefaultConstructor;

class A{
	int m;
	void work() {
		System.out.println(m);
	}
	/*							//기본 생성자는 없어도 컴파일러에서 자동 추가
	 * C(){
	 * 
	 * }
	 */
}

class B{
	int m;
	void work() {
		System.out.println(m);
	}
	B(){
		
	}
}

class C{
	int m;
	void work() {
		System.out.println(m);		//생성자로 넘어온 값
	}
	C(int a){					//입력매개변수를 포함하는 생성자 정의
		m = a;					//입력매개변수를 전달한 값으로 필드 초기화
	}
}
public class DefaultConstructor {
	public static void main(String[] args) {
		
		//클래스 객체 생성
		A a = new A();
		B b = new B();
		//C c = new C();		//기본생성자 호출불가능. 직접 정의한 생성자를 호출해 객체 생성해야 함
		C c = new C(3);
		
		//메서드 호출
		a.work();
		b.work();
		c.work();
	}
}
