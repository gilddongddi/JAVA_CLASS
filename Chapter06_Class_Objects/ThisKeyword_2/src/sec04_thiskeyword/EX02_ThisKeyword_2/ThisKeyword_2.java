//����� this Ű���� �߰�
package sec04_thiskeyword.EX02_ThisKeyword_2;

class A{
	int m;
	int n;
	void init(int m, int n) {
		m = m;
		n = n;
	}
}

class B{
	int m;
	int n;
	void init(int m, int n) {
		this.m = m;
		this.n = n;
	}
}

public class ThisKeyword_2 {
	public static void main(String[] args) {
		//�ʵ��� ������������ ����, this Ű���带 ������� ����
		A a = new A();
		a.init(2, 3);;
		System.out.println(a.m);		//0
		System.out.println(a.n);		//0
		
		//�ʵ��� ���� �������� ����, this Ű���带 �����
		B b = new B();
		b.init(2, 3);;
		System.out.println(b.m);			//2
		System.out.println(b.n);			//3
	}
}
