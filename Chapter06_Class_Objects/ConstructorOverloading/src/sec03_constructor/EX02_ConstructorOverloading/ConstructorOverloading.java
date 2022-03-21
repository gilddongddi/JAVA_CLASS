//다양한 생성자를 사용한 다양한 객체 생성 방법
package sec03_constructor.EX02_ConstructorOverloading;

class A{
	A(){										//생성자 오버로딩
		System.out.println("첫 번째 생성자");
	}
	A(int a){
		System.out.println("두 번째 생성자");
	}
	A(int a, int b){
		System.out.println("세 번째 생성자");
	}
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A(3);
		A a3 = new A(3,5);
	}
}
