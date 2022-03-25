//����� �̿��� ��ü�� ������ ǥ��
package sec01_ingeritancepolymorphism.EX02_Polymorphism;

//��� ���� �����
class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Polymorphism {
	public static void main(String[] args) {
		//A Ÿ���� ������ ǥ��
		A a1 = new A();		//A�� A�̴�.
		A a2 = new B();		//B�� B�̴�.
		A a3 = new C();		//C�� C�̴�.
		A a4 = new D();		//D�� D�̴�.
		
		//B Ÿ���� ������ ǥ�� 
		B b1 = new A();		//A�� B�̴�(X)
		B b2 = new B();		//B�� B�̴�(0)
		B b3 = new C();		//C�� B�̴�(0)
		B b4 = new D(); 	//D�� B�̴�(0)
		
		//C Ÿ���� ������ ǥ��
		C c1 = new A();		//A�� C�̴�(x)
		C c2 = new B();		//B�� C�̴�(x)
		C c3 = new C();		//C�� C�̴�(��)
		C c4 = new D();  	//D�� C�̴�(x)
		
		//D Ÿ���� ������ ǥ��
		D d1 = new A();		//A�� D�̴�(x)
		D d2 = new B(); 	//B�� D�̴�(x)
		D d3 = new C();		//C�� D�̴�(x)
		D d4 = new D();		//D�� D�̴�(��)
	}
}
