package sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class A {
	public int a = 1;			//������Ű���� ��� Ŭ���� + �ٸ� ��Ű���� ��� Ŭ����
	protected int b = 2;		//������Ű�� ��� Ŭ���� + �ٸ� ��Ű�� �ڽ�Ŭ����
	int c = 3;					//(default)������Ű�� ��� Ŭ����
	private int d = 4;			//���� Ŭ����
	
	public void print() {
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.print(c + " ");
		System.out.print(d);
		System.out.println();
	}
}
