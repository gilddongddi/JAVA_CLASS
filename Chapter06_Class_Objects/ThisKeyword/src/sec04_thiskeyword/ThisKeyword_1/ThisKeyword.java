// ������ this Ű���� �ڵ� �߰�
package sec04_thiskeyword.ThisKeyword_1;

//Ŭ���� ���ο��� �ʵ�, �޼��忡 �ռ� �ٴ� �ڵ����� �ٴ� this Ű����
class A{
	int m;
	int n;
	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;			//this.�� �����ϸ� �ڵ����� �߰�
		this.n = b;			//this.�� �����ϸ� �ڵ����� �߰�
		
	}
	void work() {
		this.init(2,  3);; 	//this.�� �����ϸ� �ڵ����� �߰�
	}
}

public class ThisKeyword {
	public static void main(String[] args) {
		//Ŭ���� ��ü ����
		A a = new A();
		//�޼��� ȣ�� / �ʵ尩�� Ȱ��
		a.work();
		System.out.println(a.m);
		System.out.println(a.n);
	}
}
