package sec01_basicsyntax.EX03_ConsoleOutput;

public class ConsoleOutput {
	public static void main(String[] ar) {
		// 1.System.out.println() .. ln=line, ����ϰ� �ٹٲ�
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ�" + "�ϼ���");
		System.out.println(2 + 4);
		System.out.println(4.6);
		System.out.println("����" + 1 + 2);
		System.out.println(1 + 2 + "����");
		System.out.println();
		int a = 5;
		String b = "�ϼ���";
		System.out.println(a);
		System.out.println(b);
		System.out.println("�ȳ�" + b);
		System.out.println(a + "�ȳ�" + b);
		System.out.println();

		// 2. System.out.print() ����ϰ� ���� �� �ٲ�
		System.out.print("�ݰ�");
		System.out.print("���ϴ�.");
		System.out.print("7");
		System.out.print("\n");
		System.out.print("\n");

		// 3. System.out.printf() ���Ĵ�� ����ϱ�, c����� printf()�� ������ ����
		System.out.printf("%d\n", 30);
		System.out.printf("%o\n", 30);
		System.out.printf("%x\n", 30);
		System.out.printf("%s\n", "���");
		System.out.printf("%f\n", 5.8);
		System.out.printf("%4.2f\n", 5.8);
		System.out.printf("%d�� %4.2f\n", 4, 5.8);
	}
}

