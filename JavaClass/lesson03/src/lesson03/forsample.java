package lesson03;

public class forsample {
	public static void main(String[] args) {
		int i;
		for(i=0;i<10;i++)
			System.out.print(i);
		
		System.out.println();
		
		//0~100���� ��
		int sum =0;
		for(int j=0; j<=100;j++)
			sum += j;
		System.out.print(sum);
		
		//0~100������ ��. ������������ ���ϱ�
		System.out.println();
		
		sum=0;
		for(int k=100;k>=0;k--)
			sum += k;
		System.out.print(sum);
	}
}
