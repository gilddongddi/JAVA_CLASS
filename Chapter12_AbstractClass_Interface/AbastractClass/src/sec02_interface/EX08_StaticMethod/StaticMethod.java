//�������̽� ���� ���� �޼���
package sec02_interface.EX08_StaticMethod;

interface A{
	static void abc() {
		System.out.println("A �������̽��� ���� �޼��� abc()");
	}
}
public class StaticMethod {
	public static void main(String[] args) {
		//���� �޼��� ȣ��
		A.abc();  			//��ü�� ������ �ʰ� '�������̽���.�����޼����'���� �ٷ� ȣ��
	}
}
