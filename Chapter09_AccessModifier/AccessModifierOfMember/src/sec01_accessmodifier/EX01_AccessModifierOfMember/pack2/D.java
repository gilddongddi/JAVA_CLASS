package sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;

public class D extends A {			//DŬ������ AŬ������ �ڽ�Ŭ������ ����(..extends A)
	public void print() {
		//�ڽ�Ŭ������ ��ü ������ �ʿ� ����. protected���� ���� ���� 
		//A a = new A();
		
		//��� Ȱ��
		System.out.print(a + " ");	//��ü ���� �ٷ� AŬ������ ����� ����
		System.out.print(b + " ");
		//System.out.print(c + " ");
		//System.out.print(d);
		System.out.println();
	}
}
