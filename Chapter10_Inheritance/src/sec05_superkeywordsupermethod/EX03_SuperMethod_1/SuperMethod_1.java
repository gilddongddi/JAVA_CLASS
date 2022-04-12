// super() 메서드의 기능 및 컴파일러에 따라 super() 자동 추가
package sec05_superkeywordsupermethod.EX03_SuperMethod_1;

class A{
    A(){
        System.out.println("A 생성자");
    }
}
class B extends A{
    B(){
        super();    // 부모 클래스의 기본생성자 호출(생략하면 컴파일러가 자동추가)
        System.out.println("B 생성자");
    }
}
class C{
    C(int a){
        System.out.println("C 생성자");
    }
}
class D extends C{
//    D(){
//        super();      //부모의 '기본'생성자만 불러오기 때문에 사용불가능
//    }
    D(){
        super(3);
    }
}
public class SuperMethod_1 {
    public static void main(String[] args){
        A aa = new A();
        System.out.println();

        B bb = new B();
    }
}

