import java.util.Scanner;

public class BreakExample {
	public static void main(String[]) {
		Scanner scanner = new Scanner(System.in)
				
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while(True) {
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("exit"))
				break;
		}
		System.out.println("�����մϴ�...");
		
		scanner.close();
	}
}
