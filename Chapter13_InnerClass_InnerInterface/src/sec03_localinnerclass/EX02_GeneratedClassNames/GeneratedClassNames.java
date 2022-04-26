// 지역 이너 클래스의 컴파일 이후 생성되는 클래스 파일
package sec03_localinnerclass.EX02_GeneratedClassNames;

class A{
    void abc(){
        class B{}   // A$1C.class
        class C{}   // A$1C.class
    }
    void bcd(){
        class C{}   // A$2C.class  아우터 클래스 안에 같은 이름의 지역 이너 클래스가 두개이므로 1,2로 구별
        class D{}   // A$1D.class
    }
}
public class GeneratedClassNames {
    public static void main(String[] args){

    }
}
