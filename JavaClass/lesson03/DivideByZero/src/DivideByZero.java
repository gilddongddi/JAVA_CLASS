import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		
		//나눌수가 0일 경우 예외발생.
		/*
		 * Scanner scanner = new Scanner(System.in); int dividend; int divisor;
		 * 
		 * System.out.print("나뉨수를 입력하시오 : "); dividend = scanner.nextInt();
		 * System.out.print("나눌수를 입력하시오 : "); divisor = scanner.nextInt();
		 * 
		 * System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor
		 * + "입니다."); scanner.close();
		 */
		
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;
		
		while(true) {
			System.out.print("나뉨수를 입력하시오 : ");
			dividend = scanner.nextInt();
			System.out.print("나눌수를 입력하시오 : ");
			divisor = scanner.nextInt();
			try {
				System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
				break;
			}
			catch(ArithmeticException e) {		//예외처리코드
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
			}
		}
		scanner.close();
	}
}
