package lesson05_person;

import lesson05_person.Person;
import lesson05_person.Student;

public class UpcastingEx {
    public static void main(String[] args) {
        Person p;
        Student s = new Student("배청명");
        p = s;

        System.out.println(p.name);
//        p.grade = "A";      // 컴파일 오류, grade는 Person의 멤버가 아님
//        p.dept = "Com";     // 컴파일 오류, dept는 Person의 멤버가 아님
        s.grade = "A";
        s.dept = "Com";
    }
}