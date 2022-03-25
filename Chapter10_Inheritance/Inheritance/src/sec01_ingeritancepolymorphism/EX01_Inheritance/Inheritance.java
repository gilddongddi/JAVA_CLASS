//클래스의 상속과 사용할 수 있는 멤버
package sec01_ingeritancepolymorphism.EX01_Inheritance;

class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}
}
class Student extends Human{	//Human클래스 상속
	int studuntID;
	void goToschool() {}
}
class Worker extends Human{		//Human클래스 상속
	int workerID;
	void goToWork() {}
}

public class Inheritance {
	public static void main(String[] args) {
		//Human객체 생성
		Human h = new Human();
		h.name =
	}
}
