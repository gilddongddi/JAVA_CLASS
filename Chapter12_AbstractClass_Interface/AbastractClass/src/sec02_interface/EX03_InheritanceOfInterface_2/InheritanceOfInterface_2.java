//�������̽� ��� �ڽ� Ŭ������ ���� ������
package sec02_interface.EX03_InheritanceOfInterface_2;

interface A{
	public abstract void abc();
}
interface B{
	void bcd();		//public abstract�� �ڵ��߰�
}
class C implements A{
	public void abc() {
		//...
	}
}
/*
class D implements B{
	void bcd() {		// public �޼��带 default �޼���� �ϼ��� �� ����. �Ұ���
		
	}
}
*/

public class InheritanceOfInterface_2 {
	public static void main(String[] args) {
		
	}
}
