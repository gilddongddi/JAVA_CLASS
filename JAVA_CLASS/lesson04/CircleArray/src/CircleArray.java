


public class CircleArray {
	
	
		
	public static void main(String[] args) {
		Circle[] c = new Circle[5]; 		//��ü �迭 ���� �� ����
		
		for(int i=0; i<c.length; i++)		//��ü �迭�� �� ���ҿ� ��ü�� ����
			c[i]= new Circle(i);
		
		for(int i=0; i < c.length; i++)  	//��ü �迭�� �� ���ҿ� ����
			System.out.print((int)(c[i].getArea()) + " ");
	}
}

class Circle {
	public int radius;		//�ʵ�
	public String name;		//�ʵ�
	
	public Circle() {
		
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}