//Ŭ������ ��Ӱ� ����� �� �ִ� ���
package sec01_ingeritancepolymorphism.EX01_Inheritance;

class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}
}
class Student extends Human{	//HumanŬ���� ���
	int studentID;
	void goToschool() {}
}
class Worker extends Human{		//HumanŬ���� ���
	int workerID;
	void goToWork() {}
}

public class Inheritance {
	public static void main(String[] args) {
		//Human��ü ����
		Human h = new Human();
		h.name = "������";
		h.age = 11;
		h.eat();
		h.sleep();
		
		//Student ��ü ����
		Student s = new Student();
		s.name = "��μ�";
		s.age = 16;
		s.studentID = 128;		//�߰��� ������ ���
		s.eat();
		s.goToschool();   		//�߰��� ������ ���
		
		//Worker ��ü ����
		Worker w = new Worker();
		w.name = "������";
		w.age = 45;
		w.workerID = 128; 		//�߰��� ������ ���
		w.eat();
		w.sleep();
		w.goToWork();  		 	//�߰��� ������ ���
				
	}
}
