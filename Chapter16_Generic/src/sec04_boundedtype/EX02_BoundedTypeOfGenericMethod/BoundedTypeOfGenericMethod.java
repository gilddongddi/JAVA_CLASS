// 제네릭 '메서드'에서의 제네릭 타입 범위 제한
package sec04_boundedtype.EX02_BoundedTypeOfGenericMethod;

class A{

    // 제네릭 타입의 범위를 Number로 제한 -> Number의 메서드 사용가능
    public <T extends Number> void method1(T t){
        System.out.println(t.intValue());
    }
}

interface MyInterface{
    public abstract void print();
}

class B{
    // 제네릭 타입 범위를 인터페이스로 제한 -> 해당 인터페이스의 메서드 사용가능
    public <T extends MyInterface> void method1(T t){
        t.print();
    }
}

public class BoundedTypeOfGenericMethod {
    public static void main(String[] args){
        A a = new A();
        a.method1(5.8);     // == a.<Double>method1(5.8)

        B b = new B();
        b.method1(new MyInterface(){
            @Override
            public void print(){
                System.out.println("MyInterface의 print() 구현");
            }
        });
    }
}
