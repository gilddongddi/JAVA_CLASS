// Vector<E> 클래스의 주요 메서드 활용 방법
/* 멀티쓰레드에서 동기화 기능이 추가된 이외에 ArrayList<E>와 완전히 동일하다 */
package sec01_list.EX04_VectorMethod;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorMethod {
    public static void main(String[] args){
        List<Integer> vector1 = new Vector<Integer>();
        vector1.add(1);
        vector1.add(2);
        vector1.add(3);
        System.out.println(vector1.toString()); // [1,2,3]

        List<Integer> vector2 = new Vector<Integer>();
        vector2.add(1);
        vector2.add(2);
        vector2.addAll(vector1);
        System.out.println(vector2);    // [1,2,1,2,3]

        vector2.set(0,5);
        System.out.println(vector2);

        vector2.remove(1);
        System.out.println(vector2);
        System.out.println(vector2.size());

        vector2.clear();
        System.out.println(vector2);
        System.out.println(vector2.size());

        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        System.out.println(vector2.get(2));

        List<Integer> vector3 = new Vector<Integer>(30);


    }
}
