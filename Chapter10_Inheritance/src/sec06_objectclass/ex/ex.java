package sec06_objectclass.ex;

class A{
    String name;
    A(String name){
        this.name = name;
        this.toString();
    }
}
class B{
    String name;
    B(String name) {
        this.name = name;
    }
}


public class ex {
    public static void main(String[] args){
        A a1 = new A("문자열1");
        A a2 = new A("문자열1");
        B b1 = new B("문자열2");
        B b2 = new B("문자열2");

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));

        System.out.println(a1);
        System.out.println(a2.toString());
        System.out.println(b1);
        System.out.println(b2.toString());
    }

}
