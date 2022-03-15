package lesson03;

public class forsample {
	public static void main(String[] args) {
		int i;
		for(i=0;i<10;i++)
			System.out.print(i);
		
		System.out.println();
		
		//0~100까지 합
		int sum =0;
		for(int j=0; j<=100;j++)
			sum += j;
		System.out.print(sum);
		
		//0~100까지의 합. 내림차순으로 더하기
		System.out.println();
		
		sum=0;
		for(int k=100;k>=0;k--)
			sum += k;
		System.out.print(sum);
	}
}
