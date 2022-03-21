
public class Book {
	String title;			//필드
	String author;			//필드
	
	public Book(String t) {				//생성자
		title = t; 
		author = "작자미상";
	}
	
	public Book(String t, String a) {	//생성자 오버로딩
		title = t; 
		author = a;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		
		System.out.println(littlePrince);
		System.out.println(loveStory);
	}
}
