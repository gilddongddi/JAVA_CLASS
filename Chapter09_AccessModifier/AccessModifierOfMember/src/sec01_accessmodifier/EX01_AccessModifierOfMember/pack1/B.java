package sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class B {
	public void print() {
		//��ü ����
		A a = new A();		//�ٸ� Ŭ������ �ν���Ʈ ����� ����ϱ� ���� ��ü ����
		
		//��� Ȱ��
		System.out.print(a.a + " ");
		System.out.print(a.b + " ");
		System.out.print(a.c + " ");
		//System.out.print(a.d + " ");		//private �� �ٸ� Ŭ�������� ���� �Ұ���
		System.out.println();
	}
}
