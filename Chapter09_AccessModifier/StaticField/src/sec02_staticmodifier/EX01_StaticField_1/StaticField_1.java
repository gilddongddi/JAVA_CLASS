//�μ�ư�� �ʵ�� ���� �ʵ��� Ȱ�� ���
package sec02_staticmodifier.EX01_StaticField_1;

class A{
	int m = 3;			//�ν��Ͻ� �ʵ�
	static int n = 5;	//���� �ʵ�
}
public class StaticField_1 {
	public static void main(String[] args) {
		//�ν��Ͻ� �ʵ� Ȱ�� ���(��ü�� ������ �� ��� ����)
		A a1 = new A();
		System.out.println(a1.m);
		
		//���� �ʵ� Ȱ�� ���
		//1. ��ü ���� ���� Ŭ���������� �ٷ� Ȱ��
		System.out.println(A.n);
		//2. ��ü�� ������ �� Ȱ��(�������� ����)
		A a2 = new A();
		System.out.println(a2.n);
		
		System.out.println();
		
		//���� �ʵ��� ���� Ư�� ��
		a1.m = 5;						//2���� ��ü, ������ ���޸𸮰��� �Ҵ�
		a2.m = 6;						//�ν���Ʈ �ʵ� m�� ���� �ٸ� ������ ������ ����. 
		System.out.println(a1.m);
		System.out.println(a2.m);
		System.out.println();
		
		a1.n= 7;						//�����ʵ�� �����ʵ� �޸� ������ �Ѱ��� ����. 
		a2.n= 8;						//�� ��ü������ n�� ���������� n�� ������, �ּҰ��� �Ұ�
		System.out.println(a1.n);		//���� ���ŵ� �ϳ��� n ������ ����
		System.out.println(a2.n);
		System.out.println();
		
		A.n = 9;
		System.out.println(a1.n);
		System.out.println(a2.n);
	}
}
