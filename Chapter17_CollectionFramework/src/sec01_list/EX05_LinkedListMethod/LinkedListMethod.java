// LinkedList<E> 클래스의 중요 메서드 활용 방법
/* ArrayList<E> 와 내부적으로 데이터 저장방법만 다를 뿐 완벽히 동일하다 */
package sec01_list.EX05_LinkedListMethod;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethod {
    public static void main(String[] args){

        List<Integer> linkedlist1 = new LinkedList<Integer>();
        linkedlist1.add(1);
        linkedlist1.add(2);
        linkedlist1.add(3);
        linkedlist1.add(4);
        System.out.println(linkedlist1.size());
        System.out.println(linkedlist1.toString());

//        List<Integer> linkedlist2 = new LinkedList<Integer>(30);
        // 오류. LinkedList<E> 는 객체 생성시 저장용량을 지정할 매개변수가 없음.

        List<Integer> linkedlist2 = new LinkedList<Integer>();
        linkedlist2.add(1);
        linkedlist2.add(2);
        linkedlist2.addAll(linkedlist1);
        System.out.println(linkedlist2.size());
        System.out.println(linkedlist2.toString());

        linkedlist2.set(1, 7);
        System.out.println(linkedlist2);
        System.out.println(linkedlist2.get(1));
        linkedlist2.remove(1);
        System.out.println(linkedlist2);
        linkedlist2.remove(new Integer(4));
        System.out.println(linkedlist2);

        linkedlist2.clear();
        System.out.println(linkedlist2.size());
        System.out.println(linkedlist2.toString());
    }
}
