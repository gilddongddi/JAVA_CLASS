import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		
		//�������� 0�� ��� ���ܹ߻�.
		/*
		 * Scanner scanner = new Scanner(System.in); int dividend; int divisor;
		 * 
		 * System.out.print("�������� �Է��Ͻÿ� : "); dividend = scanner.nextInt();
		 * System.out.print("�������� �Է��Ͻÿ� : "); divisor = scanner.nextInt();
		 * 
		 * System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend/divisor
		 * + "�Դϴ�."); scanner.close();
		 */
		
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;
		
		while(true) {
			System.out.print("�������� �Է��Ͻÿ� : ");
			dividend = scanner.nextInt();
			System.out.print("�������� �Է��Ͻÿ� : ");
			divisor = scanner.nextInt();
			try {
				System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
				break;
			}
			catch(ArithmeticException e) {		//����ó���ڵ�
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���.");
			}
		}
		scanner.close();
	}
}
