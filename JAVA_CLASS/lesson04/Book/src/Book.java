
public class Book {
	String title;			//�ʵ�
	String author;			//�ʵ�
	
	public Book(String t) {				//������
		title = t; 
		author = "���ڹ̻�";
	}
	
	public Book(String t, String a) {	//������ �����ε�
		title = t; 
		author = a;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("�����", "�������丮");
		Book loveStory = new Book("������");
		
		System.out.println(littlePrince);
		System.out.println(loveStory);
	}
}
