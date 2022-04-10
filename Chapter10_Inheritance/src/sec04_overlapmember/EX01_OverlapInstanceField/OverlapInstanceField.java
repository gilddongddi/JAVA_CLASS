// 인스턴스 필드의 중복
package sec04_overlapmember.EX01_OverlapInstanceField;

class A{
    int m = 3;
}
class B extends A{
    int m = 4;
}
public class OverlapInstanceField {
    public static void main(String[] args){
        A aa = new A();
        B bb = new B();
        A ab = new B();

        System.out.println(aa.m);
        System.out.println(bb.m);
        System.out.println(ab.m);
    }
}

/* 인스턴스 필드는 상속받은 필드와 동일하 ㄴ이름으로 자식 클래스에서 정의해도
각각의 저장 공간에 저장되므로 오버라이딩은 발생하지 않는다.
 */