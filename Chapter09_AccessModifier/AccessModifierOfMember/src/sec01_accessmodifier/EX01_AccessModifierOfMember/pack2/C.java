package sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;

public class C {
	public void print() {
		//객체 생성
		A a = new A();
		
		//멤버 활용
		System.out.print(a.a + " ");
		//System.out.print(a.b + " ");		//다른 패키지에서는 자식클래스가 아니면 public 접근 지정자만 사용가능
		//System.out.print(a.c + " ");
		//System.out.print(a.d + " ");
		System.out.println();  			
	}
}
