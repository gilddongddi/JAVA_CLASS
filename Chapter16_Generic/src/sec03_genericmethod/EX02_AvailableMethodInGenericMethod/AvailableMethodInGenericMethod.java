// 제네릭 메서드 내부에서 사용할 수 있는 메서드
package sec03_genericmethod.EX02_AvailableMethodInGenericMethod;

class A{
    public <T> void method(T t){
//        System.out.println(t.length());    // 불가능(String 메서드 호출)
        System.out.println(t.equals("안녕")); // 가능(Object 메서드 호출)
    }
}

public class AvailableMethodInGenericMethod {
    public static void main(String[] args){

        A a = new A();
        a.<String>method("안녕");
    }
}

/* 제네릭에서는 문법적으로 모든 타입이 올 수 있도록 허용하고 있기 때문에 특정타입(예:String)
* 에서만 사용할 수 있는 메서드는 원칙적으로 사용할 수 없다. */