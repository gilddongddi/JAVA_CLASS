//�⺻ �������� �ڵ� �߰�
package sec03_constructor.EX01_DefaultConstructor;

class A{
	int m;
	void work() {
		System.out.println(m);
	}
	/*							//�⺻ �����ڴ� ��� �����Ϸ����� �ڵ� �߰�
	 * C(){
	 * 
	 * }
	 */
}

class B{
	int m;
	void work() {
		System.out.println(m);
	}
	B(){
		
	}
}

class C{
	int m;
	void work() {
		System.out.println(m);		//�����ڷ� �Ѿ�� ��
	}
	C(int a){					//�Է¸Ű������� �����ϴ� ������ ����
		m = a;					//�Է¸Ű������� ������ ������ �ʵ� �ʱ�ȭ
	}
}
public class DefaultConstructor {
	public static void main(String[] args) {
		
		//Ŭ���� ��ü ����
		A a = new A();
		B b = new B();
		//C c = new C();		//�⺻������ ȣ��Ұ���. ���� ������ �����ڸ� ȣ���� ��ü �����ؾ� ��
		C c = new C(3);
		
		//�޼��� ȣ��
		a.work();
		b.work();
		c.work();
	}
}
