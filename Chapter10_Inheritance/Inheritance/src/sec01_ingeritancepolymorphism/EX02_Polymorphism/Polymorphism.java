//상속을 이용한 객체의 다형적 표현
package sec01_ingeritancepolymorphism.EX02_Polymorphism;

//상속 관계 만들기
class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Polymorphism {
	public static void main(String[] args) {
		//A 타입의 다형적 표현
		A a1 = new A();		//A는 A이다.
		A a2 = new B();		//B는 B이다.
		A a3 = new C();		//C는 C이다.
		A a4 = new D();		//D는 D이다.
		
		//B 타입의 다형적 표현 
		B b1 = new A();		//A는 B이다(X)
		B b2 = new B();		//B는 B이다(0)
		B b3 = new C();		//C는 B이다(0)
		B b4 = new D(); 	//D는 B이다(0)
		
		//C 타입의 다형적 표현
		C c1 = new A();		//A는 C이다(x)
		C c2 = new B();		//B는 C이다(x)
		C c3 = new C();		//C는 C이다(ㅇ)
		C c4 = new D();  	//D는 C이다(x)
		
		//D 타입의 다형적 표현
		D d1 = new A();		//A는 D이다(x)
		D d2 = new B(); 	//B는 D이다(x)
		D d3 = new C();		//C는 D이다(x)
		D d4 = new D();		//D는 D이다(ㅇ)
	}
}
