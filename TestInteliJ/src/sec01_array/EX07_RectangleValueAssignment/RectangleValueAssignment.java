package sec01_array.EX07_RectangleValueAssignment;

public class RectangleValueAssignment {
    public static void main(String[] args){
        //배열 객체의 생성 및 원소 값 대입(방법1)
        int[][] array1 = new int [2][3];
        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[0][2] = 3;
        array1[1][0] = 4;
        array1[1][1] = 5;
        array1[1][2] = 6;

        System.out.println(array1[0][0] + " " + array1[0][1] + " " + array1[0][2]);
        System.out.println(array1[1][0] + " " + array1[1][1] + " " + array1[1][2]);
        System.out.println();
    }
}
