//�ڽ� Ŭ�������� �θ� �������̽��� ����Ʈ �޼��� ȣ��
package sec02_interface.EX07_DefaultMethod_2;

interface A{
	default void abc() {
		System.out.println("A �������̽��� abc()");
	}
}
class B implements A{
	public void abc() {
		A.super.abc(); 		//�θ� �������̽� A�� abc()�޼��� ȣ��
		System.out.println("B Ŭ������ abc()");
	}
}
public class DefaultMethod_2 {
	public static void main(String[] args) {
		//��ü ����
		B b = new B();
		
		//�޼��� ȣ��
		b.abc();  			//B ��ü�� abc()�� ȣ���� �� A �������̽��� abc() �޼��尡 ���� ȣ���
	}
}
