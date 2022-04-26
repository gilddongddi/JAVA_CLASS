package sec02_staticinnerclass.EX01_CreateObjectAndAccessMember;

class A{
    int a = 3;
    static int b = 4;
    void method1(){
        System.out.println("instance method");
    }
    static void method2(){
        System.out.println("static method");
    }
    // 정적 이너 클래스를 만들어보자.
    static class B{
        void bcd(){
//            System.out.println(a);  불가. 정적 이너 클래스는 정적 멤버만 사용 가능
            System.out.println(b);   // 사용가능. b는 아우터 클래스의 정적 멤버
//            method1();              불가. 정적 이너 클래스는 아우터클래스의 정적 멤버만 사용 가능
            method2();              // 사용가능. method2는 아우터 클래스의 정적 멤버
        }
    }
}
// 여기까지는 아무것도 발생하지 않음. main() 메서드에서 호출해야 비로소 출력됨
public class CreateObjectAndAccessMember {
    public static void main(String[] args){
        // 정적 이너 클래스의 객체를 생성해보자.
        // 아우터 클래스의 객체를 생성할 필요 없음.
        A.B b = new A.B();
        // 메서드 호출
        b.bcd();
    }
}
