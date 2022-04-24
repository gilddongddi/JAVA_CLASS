package sec06_objectclass.EX02_ObjectMethod_equals;

class A{
    String name;
    A(String name){
        this.name = name;
    }
}
class B{
    String name;
    B(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        if(this.name ==((B)obj).name){
            return true;
        }else
            return false;
    }
}
public class ObjectMethod_equals {
    public static void main(String[] args){
        A a1 = new A("안녕");
        A a2 = new A("안녕");
        System.out.println(a1 == a2);           // 위치값을 비교
        System.out.println(a1.equals(a2));      // 위치값을 비교

        B b1 = new B("안녕");
        B b2 = new B("안녕");
        System.out.println(b1 == b2);           // 위치값을 비교
        System.out.println(b1.equals(b2));      // 레퍼런스가 가리키는 실제값을 비교
    }
}
