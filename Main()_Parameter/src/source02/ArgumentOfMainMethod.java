package source02;

public class ArgumentOfMainMethod {
	public static void main(String[] args) {	//args에 abc, 13, 123, a 전달함
		//args 배열의 길이 구하기
		System.out.println(args.length);
		System.out.println();
		
		//입력매개변수 출력1
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println();
		
		//입력매개변수 출력2
		for(String s : args) {
			System.out.println(s);
		}
		System.out.println();
	}

}
