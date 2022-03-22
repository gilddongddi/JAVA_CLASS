//외부 패키지의 클래스 사용 방법 1(클래스의 풀네임 사용)

package sec01_packageimport.EX01_PackageImport_1;

public class PackageImport_1 {
	public static void main(String[] args) {
		//객체생성
		//A a = new A();			//오류
		sec01_packageimport.common.A a = new sec01_packageimport.common.A();
		
		//멤버 활용
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
}
