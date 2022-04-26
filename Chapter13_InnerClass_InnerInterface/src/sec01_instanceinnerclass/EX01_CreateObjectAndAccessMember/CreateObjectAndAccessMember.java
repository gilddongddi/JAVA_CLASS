package sec01_instanceinnerclass.EX01_CreateObjectAndAccessMember;

class A{
    public int a = 3;
    protected int b = 4;
    int c = 5;
    private int d = 6;
    void abc(){
        System.out.println("A 클래스 메서드 abc()");
    }
    //인스턴스 이너 클래스
    class B{
        void bcd(){
            // 아우터 클래스의 필드를 사용해보자. 모든 멤버에 접근 가능. 접근지정자 상관없이.
            // 이너 클래스도 아우터 클래스의 멤버이니까 어찌보면 당연한 말
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            abc();
        }
    }
}
public class CreateObjectAndAccessMember {
    public static void main(String[] args){
        // 이너 클래스 멤버를 사용하기 위해 먼저 아우터 클래스 객체 생성
        A a = new A();
        // 그 다음 이너클래스 멤버 사용
        A.B b = a.new B();
        b.bcd();

    }
}
