//�Ϲ� Ŭ������ ����� �������̵� ����
package sec02_abstractmodifier.EX01_AbstractModifier_1;

class Animal{
	void cry() {
		/*cry()�޼��忡 �ƹ��� ����� ����. �ڽ� Ŭ�������� �������̵��� ����ϱ� ����. 
		�׷����� �ұ��ϰ� �ƹ��� ����� ���� cry() �޼��带 AnimalŬ������ ������ ������? */
	}
}
class Cat extends Animal{
	void cry() {
		System.out.println("�߿�");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("�۸�");
	}
}

public class AbstractModifier_1 {
	public static void main(String[] args) {
		//��ü����
		Animal animal1 = new Cat();  		//Ŭ������ �����ڷ� �̿��Ѱ�??
		animal1.cry();  	//�߿�
		Animal animal2 = new Dog();
		animal2.cry();  	//�۸�
	}
}
