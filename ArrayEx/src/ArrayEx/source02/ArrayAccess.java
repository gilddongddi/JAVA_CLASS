package ArrayEx.source02;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[]) {
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];		//��Ұ� 5���� �迭�� �����ؼ� ���۷��������� �ּҸ� ����
		
		int max = 0;						
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt();	//�Է¹��� ������ �迭�� ����
			if(intArray[i]>max)
				max = intArray[i];
		}
		System.out.print("���� ū ���� " + max + "�Դϴ�.");
		
		scanner.close();
		
	}
}
