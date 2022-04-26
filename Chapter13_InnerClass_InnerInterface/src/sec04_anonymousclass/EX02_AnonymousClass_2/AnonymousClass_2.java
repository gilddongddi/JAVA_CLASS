// 익명 이너 클래스를 활용해 인터페이스 객체 생성
package sec04_anonymousclass.EX02_AnonymousClass_2;

class A{
    C c = new C(){
        public void bcd(){
            System.out.println("익명 이너 클래스");
        }
    };              // 여기 진짜 세미콜론(;)이 필요하네.. 왜???
    void abc(){
        c.bcd();
    }
}
interface C{
    public abstract void bcd();
}
public class AnonymousClass_2 {
    public static void main(String[] args){
        A a = new A();
        a.abc();
    }
}
