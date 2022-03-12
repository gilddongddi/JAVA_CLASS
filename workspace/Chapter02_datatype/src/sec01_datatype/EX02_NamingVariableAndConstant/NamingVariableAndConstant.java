//변수와 상수명 짓기

package sec01_datatype.EX02_NamingVariableAndConstant;

public class NamingVariableAndConstant {
	public static void main(String[] args) {
		//변수
		boolean aBcD; 		//대문자는 새로운 단어의 앞 글자에 사용 권장
		byte 가나다;			//한글로 번수명 작성 가능하다, 권장하지 않음
		short _abcd;
		char $ab_cd;		//특수문자는 $, _만 사용할 수 있고, 맨 앞에 와도 됨
		//int 3abcd;		//숫자는 사용할 수 있으나, 맨 앞에 오면 안 됨
		long abcd3;		
		//float int;		//예약어는 변수명으로 사용할 수 없음
		double main;
		//int my Work;		//스페이스, 특수키는 사용할 수 없음
		String myClassName; //변수명에서 두단어 이상 합쳐질때는 두번째 단어부터 첫자를 대문자로 표시(낙타표기법)
		int ABC;			//가능하지만, 상수와 비교하기 위해 전부 대문자로 작성하는 것은 권장하지 않음
		
		
		//상수
		final double PI;	//상수는 대문자로만 표시
		final int MY_DATA;	//상수는 여러 단어일 때 단어사이에 언더바(_)로 구분. 가독성
		final float myData;	//가능하나, 변수표기법과 구별하기 위해 소문자 사용은 권장하지 않음
	}
}
