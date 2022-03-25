//일반 클래스를 상속해 오버라이딩 수행
package sec02_abstractmodifier.EX01_AbstractModifier_1;

class Animal{
	void cry() {
		/*cry()메서드에 아무런 기능이 없음. 자식 클래스에서 오버라이딩해 사용하기 때문. 
		그럼에도 불구하고 아무런 기능이 없는 cry() 메서드를 Animal클래스에 정의한 이유는? */
	}
}
class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}

public class AbstractModifier_1 {
	public static void main(String[] args) {
		//객체생성
		Animal animal1 = new Cat();  		//클래스를 생성자로 이용한것??
		animal1.cry();  	//야옹
		Animal animal2 = new Dog();
		animal2.cry();  	//멍멍
	}
}
