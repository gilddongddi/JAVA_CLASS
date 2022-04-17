package middle_test_ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Human{
    String name;
    int age;
    double height;
    double weight;

    public Human(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}
public class Hi {
    public static void main(String[] args) {
/*
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
        int b = scanner.nextInt();
*/
        /*int x = 2, y = 10, z = 10;
        z = x++*2+--y-5+x*(y%2);*/


        /*System.out.println(8 >> 2);
        System.out.println(-16 >>2);*/

        /*int i = 4;
        if(i%2 ==0)
            if(i%3==0)
                System.out.println("6의 배수");
            else
                System.out.println("홀수");*/

        // for 문을 사용
        /*for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.print(j + "x" + i + "=" + j*i + "/t");
                System.out.println("\n");*/
         /*   }
        }*/

        // while문을 사용
        /*int i=1;
        while(i<=9){
            int j=1;
            while(j<=9){
                System.out.print(j + "x" + i + "=" + j*i+"\t");
                j++;
            }
            System.out.print("\n");
            i++;*/
        // }

        // do ~ while문을 사용하는 경우
        /*int i = 1, j = 1;
        ;
        do {
            j = 1;
            do {
                System.out.print(j + "x" + i + "=" + j * i + "\t");
                j++;
            } while (j <= 9);
            System.out.print("");
            i++;
        } while (i <= 9);*/

        /*for( char chr = 'a';chr<='z';chr++){
            System.out.print(chr);
        }
        System.out.println("");
        for(char chr = 'A'; chr<='Z';chr++){
            System.out.print(chr);
        }*/

        /*int[] num = {1,2,3,4,5};
        int sum = 0;

        for(int k : num)
            sum += k;

        System.out.println("합은" + sum);*/

        /*int[] num = {1,2,3,4,5};
        int sum = 0;

        for(int i=0;i<num.length;i++)
            sum+= num[i];

        System.out.println("합은 " +sum);*/

        /*int[] num = {1,2,3,4,5};
        int sum = 0;

        int i=0;
        while(i<num.length){
            sum += num[i];
            i++;
        }
        System.out.println("합은 " + sum);*/

        /*int[] num = {1,2,3,4,5};
        int sum = 0;

        int i=0;
        do {
            sum += num[i];
            i++;
        }while(i<num.length);
        System.out.println("합은 " + sum);*/

        // 10개의 정수를 담은 배열을 선언하고, 1부터 10까지의 숫자로 초기화하는 프로그램 코드
        /*int[] tenArray = new int[10];

        for(int i=0; i<tenArray.length; i++){
            tenArray[i] = i+1;
            System.out.print(tenArray[i]);
        }*/

        // 3열 5행의 정부 배열을 선언하고, 1부터 15까지의 숫자를 차레대로 초기화함

        /*int[][] myArray = new int[3][5];

        int k = 1;
        for(int i=0;i<myArray.length; i++){
            for(int j=0;j<myArray[i].length;j++){
                myArray[i][j] = k++;
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println("");*/

        /*  Scanner의 nextlnt() 메서드를 사용한 명령에 대해 InputMismatchException이 발생하도록 하고
        이에 대해 해결하기 위한 try-catch-finally 구조가 포함된 프로그램을 작성해보세요*/

        /*Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("정수를 입력하세요: ");
            int a = scanner.nextInt();

            System.out.println("당신이 입력한 정수는 " + a + "입니다.");

        }
        catch(InputMismatchException e){
            System.out.println("정수를 입력하지 않았습니다.");
        }
        finally{
            System.out.println("프로그램 실행을 마칩니다.");
        }*/

        Human() = new Human[5];

        human[0] = new Human("홍길동", 20, 177.1,62.6);
        human[1] = new Human("김세종", 25, 172.1, 62.5);
        human[2] = new Human("이민우", 30, 167.2, 57.7);
        human[3] = new Human( "현정민", 40, 157.4, 48.9);
        human[4] = new Human("현정민", 40, 157.4, 48.9);

    }
}



