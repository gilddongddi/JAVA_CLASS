// 멤버 앞에 있는 super 키워드를 사용했을 대의 메서드 호출
package sec05_superkeywordsupermethod.EX02_SuperKeyword_2;

class A{
    void abc(){
        System.out.println("A 클래스의 abc()");
    }
}
class B extends A{
    void abc(){
        System.out.println("B 클래스의 abc()");
    }
    void bcd(){
        super.abc();    // 부모 클래스 객체의 abc() 메서드 호출
    }
}
public class SuperKeyword_2 {
    public static void main(String[] args){

        B bb = new B();

        bb.bcd();
    }
}