
public class NestedLoop {
	public static void main(String[] args) {
		
		//for문을 이용한 구구단
		for(int i=1; i<10; i++) {		//단수
			for(int j=1; j<10; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print('\t');
			}
			System.out.println();
		}
		System.out.println();
		
		//while 문을 이용한 구구단
		int i=1;
		while(i<10) {
			int j=1;
			while(j<10) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print('\t');
				j++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println();
		
		//do~while문을 이용한 구구단
		i=1;
		do {
			int j=1;
			do {
				
				System.out.print(i+"*"+j+"="+i*j);
				System.out.print('\t');
				j++;
			} while(j<10);
			System.out.println();
			i++;
		} while	(i<10);
		
		//소문자 a~ 대문자 Z까지 출력하기
		System.out.println();
		
		char c = 'A';

		do {
			System.out.print(c);
			c = (char)(c+1);
		} while(c<='z');
					
		
	}
}
