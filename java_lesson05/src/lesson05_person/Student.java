package lesson05_person;
import lesson05_person.Person;

public class Student extends Person {
    String grade;
    String dept;

    public Student(String name) {
        super(name);
    }

/*    public void set(){
        age = 30;
        name = "홍길동";
        height = 175;
//        weight = 99;    // 오류 발생 // private 필드에 접근 불가
        setWeight(99);
    }*/
}
