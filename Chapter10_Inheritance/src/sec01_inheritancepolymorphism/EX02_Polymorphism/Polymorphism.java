//상속을 이용한 객체의 다형적 표현
package sec01_inheritancepolymorphism.EX02_Polymorphism;

//상속 관계 만들기
class A{}
class B extends A {}
class C extends B {}
class D extends B {}


public class Polymorphism{
    public static void main(String[] args){
        //A 타입의 다형적 표현
        A a1 = new A();     //A 는 A이다(ㅇ)
        A a2 = new B();     // B 는 A이다(ㅇ)
        A a3 = new C();     // C 는 A이다(ㅇ)
        A a4 = new D();     // D 는 A이다(ㅇ)

        // B 타입의 다형적 표현
        //B b1 = new A();     // A 는 B이다(x)
        B b2 = new B();     // B 는 B이다(ㅇ)
        B b3 = new C();     // C 는 B이다(ㅇ)
        B b4 = new D();     // D 는 B이다(ㅇ)

        // C 타입의 다형적 표현
        //C c1 = new A();     // A는 C이다(x)
        //C c2 = new B();     // B는 C이다(x)
        C c3 = new C();     // C는 C이다(ㅇ)
        //C c4 = new D();     // D는 C이다(x)

        // D 타입의 다형적 표현
        //D d1 = new A();     // A는 D이다(x)
        //D d2 = new B();     // B는 D이다(x)
        //D d3 = new C();     // C는 D이다(x)
        D d4 = new D();     // D는 D이다(ㅇ)
    }
}
