//클래스의 상속과 사용할 수 있는 멤버
package sec01_ingeritancepolymorphism.EX01_Inheritance;

class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}
}
class Student extends Human{	//Human클래스 상속
	int studentID;
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
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();
		
		//Student 객체 생성
		Student s = new Student();
		s.name = "김민성";
		s.age = 16;
		s.studentID = 128;		//추가로 정의한 멤버
		s.eat();
		s.goToschool();   		//추가로 정의한 멤버
		
		//Worker 객체 생성
		Worker w = new Worker();
		w.name = "봉윤정";
		w.age = 45;
		w.workerID = 128; 		//추가로 정의한 멤버
		w.eat();
		w.sleep();
		w.goToWork();  		 	//추가로 정의한 멤버
				
	}
}
