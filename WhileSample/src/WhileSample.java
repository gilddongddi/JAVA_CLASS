import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		
		//while��
/*		int i=0;
		while(i<10) {
			System.out.print(i);
			i++;
		}*/
		
		//WhileSample.java
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���");1		int count=0, sum=0;
		
		int n = scanner.nextInt();
		
		while(n != -1) {
			sum += n;
			count++;
			n = scanner.nextInt();	//�����Է�
		}
		if(count ==0) System.out.println("�Էµ� ���� �����ϴ�.");
		else {
			System.out.print("������ ������ " + count + "���̸� ");
			System.out.println("����� " + (double)sum/count + "�Դϴ�.");
		}
	}

}
