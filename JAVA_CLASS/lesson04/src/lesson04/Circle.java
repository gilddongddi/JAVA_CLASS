package lesson04;

public class Circle {
	public int radius;		//원의 반지름 필드
	public String name;		//원의 이름 필드
	
	public Circle() {			//생성자(constructor) 클래스 이름과 동일, 객체가 생성될 때 사용, 
								//메서드의 일종
		
	}
	
	public double getArea() {	//메서드 
		return 3.14*radius*radius;
	}
	
	
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();			//Circle 객체 생성
		pizza.radius = 10;				//피자의 반지름을 10으로 설정
		pizza.name = "자바피자";			//피자의 이름 설정
		double area = pizza.getArea();	//피자의 면적 알아내기
		System.out.println(pizza.name + "의 면적은 " + area);
		
		
		Circle donut = new Circle();	
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
	
	
}

