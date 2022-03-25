//인서튼서 필드와 정적 필드의 활용 방법
package sec02_staticmodifier.EX01_StaticField_1;

class A{
	int m = 3;			//인스턴스 필드
	static int n = 5;	//정적 필드
}
public class StaticField_1 {
	public static void main(String[] args) {
		//인스턴스 필드 활용 방법(객체를 생성한 후 사용 가능)
		A a1 = new A();
		System.out.println(a1.m);
		
		//정적 필드 활용 방법
		//1. 객체 생성 없이 클래스명으로 바로 활용
		System.out.println(A.n);
		//2. 객체를 생성한 후 활용(권장하지 않음)
		A a2 = new A();
		System.out.println(a2.n);
		
		System.out.println();
		
		//정적 필드의 공유 특성 예
		a1.m = 5;						//2개의 객체, 각각의 힙메모리공간 할당
		a2.m = 6;						//인스턴트 필드 m은 서로 다른 공간에 별도로 존재. 
		System.out.println(a1.m);
		System.out.println(a2.m);
		System.out.println();
		
		a1.n= 7;						//정적필드는 정적필드 메모리 영역에 한개만 존재. 
		a2.n= 8;						//각 객체에서늬 n은 실제데이터 n의 참조값, 주소값에 불과
		System.out.println(a1.n);		//따라서 갱신된 하나의 n 값만이 존재
		System.out.println(a2.n);
		System.out.println();
		
		A.n = 9;
		System.out.println(a1.n);
		System.out.println(a2.n);
	}
}
