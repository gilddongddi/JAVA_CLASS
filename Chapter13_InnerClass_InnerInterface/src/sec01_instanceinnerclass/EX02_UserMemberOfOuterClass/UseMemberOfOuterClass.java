package sec01_instanceinnerclass.EX02_UserMemberOfOuterClass;

class A{
    int a = 3;
    int b = 4;
    void abc(){
        System.out.println("A 클래스 메서드");
    }
    //인스턴스 이너 클래스를 정의해보자
    class B{
        int a = 5;
        int b = 6;
        void abc(){
            System.out.println("B 클래스 메서드");
        }
        void bcd(){
            // 아래는 이너클래스의 멤버 호출 또는 사용하게 됨
            System.out.println(a);
            System.out.println(b);
            abc();

            // 아래는 아우터클래스의 멤버를 호출 또는 사용할 때 "아우터클래스.this."
            System.out.println(A.this.a);
            System.out.println(A.this.b);
            A.this.abc();
        }
    }
}
// main() 메서드에서 호출하기 전까진 위에 작성한 값들이 출력이 안됨.
public class UseMemberOfOuterClass {
    public static void main(String[] args){
        // 이너 클래스 객체에서 아우터 클래스 멤버를 참조하기 위해 아우터 클래스 객체 먼저 생성
        A a = new A();

        // 그 다음 이너 클래스 객체 생성
        A.B b = a.new B();
        b.bcd();
    }
}
