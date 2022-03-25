//final메서드와 final클래스의 특징
package sec01_finalmodifier.EX02_FinalModifier_2;

class A{
	void abc() {
		
	}
	final void bcd() { 			//final메서드. 더이상 자식클래스에서 불러올 수 없음. 오버라이등 불가능
		
	}
}
class B extends A{
	void abc() {
		
	}
	//void bcd() {} ->(불가능)
}

final class C{
	
}
//class D extends C {} -> 불가능

public class FinalModifier_2 {
	public static void main(String[] args) {
		
	}
}
