// 동적 크기와 정적 크기를 지니고 있는 리스트 객체 생성
package sec01_list.EX02_CreateListObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
    public static void main(String[] args){

        // 1. List 구현 클래스의 생성자를 사용해 객체를 생성해보자
        List<Integer> aList1 = new ArrayList<>();   // capacity = 10
        List<Integer> aList2 = new ArrayList<>(30);
        List<Integer> aList3 = new Vector<>();  // 10
        List<Integer> aList4 = new Vector<>(30);
        List<Integer> aList5 = new LinkedList<>();  // 10
//        List<Integer> aList6 = new LinkedList<>(30);    // 지정 불가

        // 2. Arrays 클래스의 정적 매서드 활용
        List<Integer> aList7 = Arrays.asList(1,2,3,4);
        List<String> aList8 = Arrays.asList("안녕", "방가");
        aList7.set(1,7);
        aList8.set(0, "감사");
//        aList7.add(5);      // 불가능, 포장만 리스트이지 속은 배열.
//        aList8.remove(0);  // 불가능,포장만 리스트이지 속은 배열.

        System.out.println(aList7);
        System.out.println(aList8);
    }
}
