//final�޼���� finalŬ������ Ư¡
package sec01_finalmodifier.EX02_FinalModifier_2;

class A{
	void abc() {
		
	}
	final void bcd() { 			//final�޼���. ���̻� �ڽ�Ŭ�������� �ҷ��� �� ����. �������̵� �Ұ���
		
	}
}
class B extends A{
	void abc() {
		
	}
	//void bcd() {} ->(�Ұ���)
}

final class C{
	
}
//class D extends C {} -> �Ұ���

public class FinalModifier_2 {
	public static void main(String[] args) {
		
	}
}
