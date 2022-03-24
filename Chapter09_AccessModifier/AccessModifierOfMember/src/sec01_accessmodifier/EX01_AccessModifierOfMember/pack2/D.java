package sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;

public class D extends A {			//D클래스를 A클래스의 자식클래스로 선언(..extends A)
	public void print() {
		//자식클래스는 객체 생성할 필요 없음. protected까지 접근 가능 
		//A a = new A();
		
		//멤버 활용
		System.out.print(a + " ");	//객체 없이 바로 A클래스의 멤버에 접근
		System.out.print(b + " ");
		//System.out.print(c + " ");
		//System.out.print(d);
		System.out.println();
	}
}
