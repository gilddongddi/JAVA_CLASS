package sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class B {
	public void print() {
		//객체 생성
		A a = new A();		//다른 클래스의 인스턴트 멤버를 사용하기 위해 객체 생성
		
		//멤버 활용
		System.out.print(a.a + " ");
		System.out.print(a.b + " ");
		System.out.print(a.c + " ");
		//System.out.print(a.d + " ");		//private 은 다른 클래스에서 접근 불가능
		System.out.println();
	}
}
