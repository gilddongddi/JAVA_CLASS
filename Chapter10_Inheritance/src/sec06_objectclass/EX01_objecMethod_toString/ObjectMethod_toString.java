package sec06_objectclass.EX01_objecMethod_toString;

class A{    // extends Object 를 컴파일러가 자동으로 추가
    int a = 3;
    int b = 4;
}
class B{
    int a = 3;
    int b = 4;

    public String toString(){   // toString() 객체 정보를 문자열로 출력하는 메서드
        return "필드값(a, b) = " + a + " " + b;
    }
}

public class ObjectMethod_toString {
    public static void main(String[] args){
        //객체 생성
        A a = new A();
        B b = new B();

        //메서드 호출
        System.out.printf("%x\n", a.hashCode());  // hashCode를 16진수로 표현,
        System.out.println(a.toString());       //  (a) == (a.toString())
        System.out.println(b);
    }
}
// hashCode()의 출력값은 객체의 정확한 위치값이 아니라 위치를 기반으로 생성된 고유값 정도.
