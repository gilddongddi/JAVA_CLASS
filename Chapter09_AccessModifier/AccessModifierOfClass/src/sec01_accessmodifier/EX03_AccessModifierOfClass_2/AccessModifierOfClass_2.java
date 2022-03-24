package sec01_accessmodifier.EX03_AccessModifierOfClass_2;

import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.AA;
//import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.BB;	//불가능
import sec01_accessmodifier.EX03_AccessModifierOfClass_2.pack.CC;
public class AccessModifierOfClass_2 {
	public static void main(String[] args) {
		//객체생성
		AA a = new AA();
		//BB b = new BB();		//B가 default클래스라 임포트 불가
		//CC c = new CC();
	}
}
