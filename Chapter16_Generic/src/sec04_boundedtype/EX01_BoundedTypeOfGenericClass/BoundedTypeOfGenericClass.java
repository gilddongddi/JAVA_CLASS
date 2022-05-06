// 제네릭 '클래스'에서의 제네릭 타입 범위 제한
package sec04_boundedtype.EX01_BoundedTypeOfGenericClass;

class A{}
class B extends A{}
class C extends B{}

class D <T extends B> {      // 제네릭 클래스의 범위를 B 이하로 제한.
    private T t;
    public T get(){
        return t;
    }
    public void set(T t){
        this.t = t;
    }
}

public class BoundedTypeOfGenericClass {
    public static void main(String[] args){
//        D<A> d1 = new D<>();  // 불가능
        D<B> d2 = new D<>();
        D<C> d3 = new D<>();
        D d4 = new D();     // D<B> d4 = new D<>();

        d2.set(new B());
        d2.set(new C());

//        d3.set(new B());  // d3 는 제네릭 타입으로 C를 지정했으므로 B객체는 입력 불가능
        d3.set(new C());
        d4.set(new B());
        d4.set(new C());    // d4 는 제네릭 타입을 B로 지정했으므로 B객체,C객체 모두 입력 가능
    }
}
