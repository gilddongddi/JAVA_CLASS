//�������̽� ���� �� ����Ʈ �޼����� �������̵�
package sec02_interface.EX06_DefaultMethod_1;

interface A{
	void abc();
	default void bcd() {
		System.out.println("A �������̽��� bcd()");
	}
}
class B implements A{
	public void abc() {
		System.out.println("B Ŭ������ abc()");
	}
}
class C implements A{
	public void abc() {
		System.out.println("C Ŭ������ abc()");
	}
	public void bcd() {
		System.out.println("C Ŭ������ bcd()");
	}
}
public class DefaultMethod_1 {
	public static void main(String[] args) {
		//��ü ����
		A a1 = new B();
		A a2 = new C();
		
		//�޼��� ȣ��
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();
	}
}
