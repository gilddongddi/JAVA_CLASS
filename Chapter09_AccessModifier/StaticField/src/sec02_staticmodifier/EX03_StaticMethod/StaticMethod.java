//�ν��Ͻ� �޼���� ���� �޼���
package sec02_staticmodifier.EX03_StaticMethod;

class A{
	void abc() {			//�ν��Ͻ� �޼���
		System.out.println("instance �޼���");
	}
	static void bcd() {		//���� �޼���
		System.out.println("static �޼���");
	}
}
public class StaticMethod {
	public static void main(String[] args) {
		//�ν��Ͻ� �޼��� Ȱ��(��ü�� ������ �� ��� ����)
		A a1 = new A();
		a1.abc();
		
		//���� �޼��� Ȱ��
		//1. Ŭ���������� �ٷ� ������ �ذ�
		A.bcd();
		//2. ��ü�� ������ �� ���(�������� ����)
		A a2 = new A();
		a2.bcd();
	}
}
