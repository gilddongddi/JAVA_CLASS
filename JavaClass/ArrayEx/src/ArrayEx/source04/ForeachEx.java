package ArrayEx.source04;

public class ForeachEx {
	public static void main(String[] args) {
		String names[] = { "���", "��", "�ٳ���", "ü��", "����", "����" };
		
		//for~each��
		for(String str : names)
			System.out.print(str + " ");
		System.out.println();
		System.out.println();
		
		//for��
		for(int i=0; i<names.length;i++)
			System.out.print(names[i] + " ");
		System.out.println();
		System.out.println();
		
		//while��
		int i=0;
		while(i<names.length) {
			System.out.print(names[i] + " ");
			i++;
		}
		System.out.println();
		System.out.println();
		
		//do~while��
		i=0;
		do {
			System.out.print(names[i] + " ");
			i++;
		} while(i<names.length);
		System.out.println();
		System.out.println();
		
		//10���� ������ �����ϴ� tenArray �����ϰ� �ʱ�ȭ
		/*
		 * int[] tenArray; tenArray = new int[10];
		 * 
		 * int[] tenArray = new int[10];
		 * 
		 * int tenArray[] = new int[10];
		 */
	}
}
