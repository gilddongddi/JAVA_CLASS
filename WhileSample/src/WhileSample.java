import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		
		//while문
/*		int i=0;
		while(i<10) {
			System.out.print(i);
			i++;
		}*/
		
		//WhileSample.java
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");1		int count=0, sum=0;
		
		int n = scanner.nextInt();
		
		while(n != -1) {
			sum += n;
			count++;
			n = scanner.nextInt();	//정수입력
		}
		if(count ==0) System.out.println("입력된 수가 없습니다.");
		else {
			System.out.print("정수의 개수는 " + count + "개이며 ");
			System.out.println("평균은 " + (double)sum/count + "입니다.");
		}
	}

}
