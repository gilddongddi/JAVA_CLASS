//this() �޼����� ������ Ư¡�� �ǹ�
package sec05_thismethod.EX01_ThisMethod_1;

//Ŭ���� ����
class A{
	A(){
		System.out.println("ù ��° ������");
	}
	A(int a){
		this();		//�ݵ�� ù��, �ٸ� ������ ȣ��
		System.out.println("�� ��° ������");
	}
	
	/*
	 * void abc() { this(); //������ �� �޼��忡���� this() ��� �Ұ� }
	 */
	
}

public class ThisMethod_1 {
	public static void main(String[] args) {
		//��ü ����
		A a1 = new A();		//ù ��° ������ ȣ��
		System.out.println();
		A a2 = new A(3);	//�� ��° ������ ȣ��(���ο��� ù��° ������ ȣ��)
	}
}
