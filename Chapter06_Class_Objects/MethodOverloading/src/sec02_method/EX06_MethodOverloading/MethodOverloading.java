//�޼��� �����ε�
package sec02_method.EX06_MethodOverloading;

public class MethodOverloading {
	public static void main(String[]                                                                                                                                                                                                        args) {
		print();										//�����Ͱ� �����ϴ�
		print(3);										//3				
		print(5.8);										//5.8
		print(2,5);   	//���� 5���� ��� ���� �ٸ� �ñ״�ó	//a = 2, b = 5
	}
	public static void print() {
		System.out.println("�����Ͱ� �����ϴ�.");
	}
	public static void print(int a) {
		System.out.println(a);
	}
	public static void print(double a) {
		System.out.println(a);
	}
	public static void print(int a, int b) {
		System.out.println("a: " + a + " b: " + b); 
	}
}
