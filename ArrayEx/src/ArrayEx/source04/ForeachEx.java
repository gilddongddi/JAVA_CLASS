package ArrayEx.source04;

public class ForeachEx {
	public static void main(String[] args) {
		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };
		
		//for~each문
		for(String str : names)
			System.out.print(str + " ");
		System.out.println();
		System.out.println();
		
		//for문
		for(int i=0; i<names.length;i++)
			System.out.print(names[i] + " ");
		System.out.println();
		System.out.println();
		
		//while문
		int i=0;
		while(i<names.length) {
			System.out.print(names[i] + " ");
			i++;
		}
		System.out.println();
		System.out.println();
		
		//do~while문
		i=0;
		do {
			System.out.print(names[i] + " ");
			i++;
		} while(i<names.length);
		System.out.println();
		System.out.println();
		
		//10개의 정수를 저장하는 tenArray 선언하고 초기화
		/*
		 * int[] tenArray; tenArray = new int[10];
		 * 
		 * int[] tenArray = new int[10];
		 * 
		 * int tenArray[] = new int[10];
		 */
	}
}
