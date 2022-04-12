//  멤버 앞에 있는 참조 변수를 생략(this.)했을 때의 메서드 호출
package sec05_superkeywordsupermethod.EX01_SuperKeyword_1;

class A {
    void abc(){
        System.out.println("A 클래스의 abc()");
    }
}
class B extends A {
    void abc(){
        System.out.println("B 클래스의 abc()");
    }
    void bcd(){
        abc();      // this.abc();
    }
}
public class SuperKeyword_1 {
    public static void main(String[] args){

        B bb = new B();

        bb.bcd();
    }
}
