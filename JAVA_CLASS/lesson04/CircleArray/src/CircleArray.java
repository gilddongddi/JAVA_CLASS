


public class CircleArray {
	
	
		
	public static void main(String[] args) {
		Circle[] c = new Circle[5]; 		//객체 배열 선언 및 생성
		
		for(int i=0; i<c.length; i++)		//객체 배열의 각 원소에 객체를 생성
			c[i]= new Circle(i);
		
		for(int i=0; i < c.length; i++)  	//객체 배열의 각 원소에 접근
			System.out.print((int)(c[i].getArea()) + " ");
	}
}

class Circle {
	public int radius;		//필드
	public String name;		//필드
	
	public Circle() {
		
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}