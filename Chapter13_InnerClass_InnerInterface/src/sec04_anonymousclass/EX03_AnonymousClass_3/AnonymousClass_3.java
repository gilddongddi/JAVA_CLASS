// 클래스 정의 및 참조 변수명을 사용/미사용했을 때 입력매개변수 객체 전달
package sec04_anonymousclass.EX03_AnonymousClass_3;

interface A{
    public abstract void abc();
}
// 인터페이스 A의 자식클래스 직접 생성
class B implements A{
    public void abc(){      // 부모 A의 매서드 오버라이딩 후 재정의
        System.out.println("입력매개변수 전달");
    }
}
class C{
    void cde(A a){      // 클래스 c의 매서드 cde()의 입력매개변수로 인터페이스 A의 객체 사용
        a.abc();        // 인터페이스 A의 매서드 abc() 호출
    }
}
public class AnonymousClass_3 {
    public static void main(String[] args){
        C c = new C();  // 클래스 C의 객체 생성

        // 방법1. 클래스명 o + 참조 변수명 o
        A a = new B();  // 클래스 B의 생성자로 부모인 인터페이스 A의 객체 생성
        c.cde(a);

        // 방법2. 클래스명 ㅇ + 참조 변수명 x
        c.cde(new B());
    }
}
