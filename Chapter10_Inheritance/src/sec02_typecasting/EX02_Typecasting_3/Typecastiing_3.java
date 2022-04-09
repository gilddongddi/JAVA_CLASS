// 선언 타입에 따른 사용할 수 있는 멤버
package sec02_typecasting.EX02_Typecasting_3;

class A{
    int m = 3;
    void abc(){
        System.out.println("A 클래스");
    }
}
class B extends A{
    int n = 4;
    void bcd(){
        System.out.println("B 클래스");
    }
}
public class Typecastiing_3 {
    public static void main(String[] args){
        // A 타입 / A 생성자
        A aa = new A();
        System.out.println(aa.m);
        aa.abc();

        // B 타입 / B 생성자
        B bb = new B();
        System.out.println(bb.m);
        System.out.println(bb.n);
        bb.abc();
        bb.bcd();

        // A 타입 / B 생성자: 다형적 표현
        A ab = new B();
        System.out.println(ab.m);
        ab.abc();
    }
}
