// 제네릭 클래스가 메서드의 매개변수일 때 타입 범위 제한
package sec04_boundedtype.EX03_BoundedTypeOfInputArguments;

class A{}
class B extends A{}
class C extends B{}
class D extends C{}

class Goods<T>{
    private T t;
    public T get(){
        return t;
    }
    public void set(T t){
        this.t = t;
    }
}
class Test{
    void method1(Goods<A> g){}           // case1
    void method2(Goods<?> g){}          // case2
    void method3(Goods<? extends B> g){} // case3
    void method4(Goods<? super B> g){}      //case4
}

public class BoundedTypeOfInputArguments {
    public static void main(String[] args){
        Test t = new Test();

        // case1 <A> <- A로 지정
        t.method1(new Goods<A>());
//        t.method1(new Goods<B>()); // 불가능
//        t.method1(new Goods<C>()); // 불가능
//        t.method4(new Goods<D>()); // 불가능

        // case2 , <?> <- 전부 가능
        t.method2(new Goods<A>());
        t.method2(new Goods<B>());
        t.method2(new Goods<C>());
        t.method2(new Goods<D>());

        // case3, <? extends B> <- B 이하 가능
//        t.method3(new Goods<A>()); // 불가능
        t.method3(new Goods<B>());
        t.method3(new Goods<C>());
        t.method3(new Goods<D>());

        // case4, <? super B> <- B 위로 가능
        t.method4(new Goods<A>());
        t.method4(new Goods<B>());
//        t.method4(new Goods<C>()); // 불가능
//        t.method4(new Goods<D>()); // 불가능
    }
}
