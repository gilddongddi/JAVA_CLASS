//���� �ʱ�ȭ ���
package sec02_staticmodifier.EX04_StaticInitialBlock;

class A{
	int a;
	static int b;
	static {
		b = 5; // ���� �ʵ��� �ʱ�ȭ�� static{} ������ ����
		System.out.println("Ŭ���� A�� �ε��߽��ϴ�!!");
	}
	A(){
		a = 3; //�ν��Ͻ� �ʵ� �ʱ�ȭ�� �Ϲ������� �����ڿ��� ����
	}
}
public class StaticIntialBlock {
	public static void main(String[] args) {
		System.out.println(A.b);
	}
}
