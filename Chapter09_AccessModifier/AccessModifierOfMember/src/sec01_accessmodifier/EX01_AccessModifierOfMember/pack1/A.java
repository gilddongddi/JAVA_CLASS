package sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class A {
	public int a = 1;			//동일패키지의 모든 클래스 + 다른 패키지의 모든 클래스
	protected int b = 2;		//동일패키지 모든 클래스 + 다른 패키지 자식클래스
	int c = 3;					//(default)동일패키지 모든 클래스
	private int d = 4;			//동일 클래스
	
	public void print() {
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.print(c + " ");
		System.out.print(d);
		System.out.println();
	}
}
