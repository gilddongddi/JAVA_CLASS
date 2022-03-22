package sec02_externalclass.EX02_ExternalClass_2.pack2;
import sec02_externalclass.EX02_ExternalClass_2.pack1.A;

//외부 클래스(A)를 별도의 파일로 분리해서 public클래스로 선언하면 다른 패키지에서 임포트 가능
public class ExternalClass_2 {
	public static void main(String[] args) {
		A a = new A();
		a.print();
	}
}
