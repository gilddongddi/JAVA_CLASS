//추상 클래스를 상속해 오버라이딩 수행
package sec02_abstractmodifier.EX02_AbstractModifier_2;

abstract class Animal{		//추상 메서드를 포함하면 클래스도 추상이어야 함
	abstract void cry();	//추상 메서드
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
public class AcstractModifier_2 {
	public static void main(String[] args) {
		//객체 생성
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		//메서드 호출
		animal1.cry();
		animal2.cry();
	}
}
