//���� Ÿ�Կ� ���� ����� �� �ִ� ���
package sec02_typecasting.EX02_Typecasting_2;

class A{
	int m = 3;
	void abc() {
		System.out.println("A Ŭ����");
	}
}
class B extends A {
	int n = 4;
	void bcd() {
		System.out.println("B Ŭ����");
	}
}
public class Typecasting_2 {
	public static void main(String[] args) {
		//A Ÿ�� / A ������
		A aa = new A();
		System.out.println(aa.m);		//3
		aa.abc();						//A Ŭ����
		
		//BŸ�� / B ������
		B bb = new B();
		System.out.println(bb.m);		//3
		System.out.println(bb.n);		//4
		bb.abc();						//A Ŭ����
		bb.bcd();						//B Ŭ����
		
		//AŸ�� / B ������: ������ ǥ��
		A ab = new B();
		System.out.println(ab.m);		//3
		ab.abc();						//A Ŭ����
	}
}
