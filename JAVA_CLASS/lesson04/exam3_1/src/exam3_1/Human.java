package exam3_1;

public class Human {
	String name;
	int age;
	int height;
	int weight;
	
	public static void main(String[] args) {
		Human[] h;
		h = new Human[5];
		for(int i=0; i<h.length; i++) {
			h[i] = new Human();
			System.out.print(h[i] + " ");
		}
			
	}
}
  