package source01;

public class Main_Parameter {
	public static void main(String[] args) {
		String a = args[0];		//"안녕하세요"
		String b = args[1];		//"3"
		String c = args[2];		//"5.8"
		
		System.out.println(a);	//"안녕하세요"
		System.out.println(b);	//"3"
		System.out.println(c);	//"5.8"
		
		System.out.println(b+1);
		System.out.println(c+1);
		System.out.println();
		
		int d = Integer.parseInt(b);	//3 , 정수로 강제변환
		double e = Double.parseDouble(c);	//5.8, 더블형으로 강제변환
		System.out.println(d+1);		//4
		System.out.println(e+1);		//6.8
		
	}
}
