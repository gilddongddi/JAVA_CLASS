// final 필드와 final 지역변수의 특징
package sec01_finalmodifier.EX01_FinalModifier_1;

class A1{				//선언과 값을 동시에 대입했을 때
	int a = 3;
	final int b = 5;
	A1(){
		
	}
}
class A2{				//선언과 값을 대입을 분리했을 때. 이 때 final필드의 초기화는 반드시 생성자에서.
	int a;
	final int b;
	A2(){
		a = 3;
		b = 5;
	}
}
class A3{				//final필드값을 대입한 후에는 추가 값 대입 불가능
	int a = 3;
	final int b = 5;
	A3(){
		a = 5;
		//b = 9;//불가능
	}
}
class B{
	void bcd() {
		int a = 3;
		final int b = 5;
		a=7;
		// b=9;(불가능)  final 지역변수도 최초 선언된 이후 값을 대입할 수 없음. 입력자체 안됨.
	}
}
public class FinalModifier_1 {
	public static void main(String[] args) {
		//객체 생성
		A1 a1 = new A1();
		a1.a = 7;
		//a1.b = 9;//불가능
		
		A2 a2 = new A2();
		a2.a = 7;
		//a2.b = 9;(불가능)
		
		B b = new B();
		b.bcd();
	}
}
