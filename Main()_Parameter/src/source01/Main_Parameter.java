package source01;

public class Main_Parameter {
	public static void main(String[] args) {
		String a = args[0];		//"�ȳ��ϼ���"
		String b = args[1];		//"3"
		String c = args[2];		//"5.8"
		
		System.out.println(a);	//"�ȳ��ϼ���"
		System.out.println(b);	//"3"
		System.out.println(c);	//"5.8"
		
		System.out.println(b+1);
		System.out.println(c+1);
		System.out.println();
		
		int d = Integer.parseInt(b);	//3 , ������ ������ȯ
		double e = Double.parseDouble(c);	//5.8, ���������� ������ȯ
		System.out.println(d+1);		//4
		System.out.println(e+1);		//6.8
		
	}
}
