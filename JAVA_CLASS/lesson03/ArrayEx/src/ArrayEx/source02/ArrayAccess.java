package ArrayEx.source02;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[]) {
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];		//요소가 5개인 배열을 생성해서 레퍼런스변수에 주소를 대입
		
		int max = 0;						
		System.out.println("양수 5개를 입력하세요.");
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt();	//입력받은 정수를 배열에 저장
			if(intArray[i]>max)
				max = intArray[i];
		}
		System.out.print("가장 큰 수는 " + max + "입니다.");
		
		scanner.close();
		
	}
}
