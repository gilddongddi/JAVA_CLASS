// final �ʵ�� final ���������� Ư¡
package sec01_finalmodifier.EX01_FinalModifier_1;

class A1{				//����� ���� ���ÿ� �������� ��
	int a = 3;
	final int b = 5;
	A1(){
		
	}
}
class A2{				//����� ���� ������ �и����� ��. �� �� final�ʵ��� �ʱ�ȭ�� �ݵ�� �����ڿ���.
	int a;
	final int b;
	A2(){
		a = 3;
		b = 5;
	}
}
class A3{				//final�ʵ尪�� ������ �Ŀ��� �߰� �� ���� �Ұ���
	int a = 3;
	final int b = 5;
	A3(){
		a = 5;
		//b = 9;//�Ұ���
	}
}
class B{
	void bcd() {
		int a = 3;
		final int b = 5;
		a=7;
		// b=9;(�Ұ���)  final ���������� ���� ����� ���� ���� ������ �� ����. �Է���ü �ȵ�.
	}
}
public class FinalModifier_1 {
	public static void main(String[] args) {
		//��ü ����
		A1 a1 = new A1();
		a1.a = 7;
		//a1.b = 9;//�Ұ���
		
		A2 a2 = new A2();
		a2.a = 7;
		//a2.b = 9;(�Ұ���)
		
		B b = new B();
		b.bcd();
	}
}
