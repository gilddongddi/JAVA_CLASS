// 해결책 2: 제네릭 클래스를 사용한 다양한 객체의 저장
package sec02_genericclass.EX03_Solution2_Geniric;

class Apple{}
class Pencil{}
class Goods<T>{
    private T t;        // '필드 선언'
    public T get(){     // get() 메서드 호출
        return t;
    }
    public void set(T t){   // set() 메서드 호출, 입력매개변수로 T t 지정
        this.t = t;
    }
}

public class Solution2_Generic {
    public static void main(String[] args){
        // 1. Goods를 이용해 Apple 객체를 추가하거나 가져오기
        Goods<Apple> goods1 = new Goods<>();
        goods1.set(new Apple());
        Apple apple = goods1.get();     // 다운캐스팅이 필요 없음

        // 2. Goods를 이용해 Pencil 객체를 추가하거나 가져오기
        Goods<Pencil> goods2 = new Goods<>();
        goods2.set(new Pencil());
        Pencil pencil = goods2.get();

        // 3. 잘못된 타입 선언
        Goods<Apple> goods3 = new Goods<>();
        goods3.set(new Apple());
//        Pencil pencil2 = goods3.get();
    }
}
