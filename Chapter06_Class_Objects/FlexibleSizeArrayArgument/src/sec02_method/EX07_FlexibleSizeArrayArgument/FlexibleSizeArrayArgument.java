//�޼����� ���� ���� �迭 �Է¸Ű�����
package sec02_method.EX07_FlexibleSizeArrayArgument;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {
	public static void main(String[] args) {
		// method1(int...values)
		method1(1, 2);
		method1(1, 2, 3);
		method1();
	
		//method2(String...value)
		method2("�ȳ�", "�氡");
		method2("��ť", "����", "����");
		method2();
	}
	public static void method1(int...values) {
		System.out.println("�迭�� ����: " + values.length);
		/*
		 * //�迭 ��� ���1 for(int i=0; i < values.length; i++) { System.out.print(values[i]
		 * + " "); }
		 */
		//�迭 ��¹��2
		for(int k: values) {
			System.out.print(k+ " ");;
		}
		/*
		 * //�迭 ��¹��3 System.out.println(Arrays.toString(values));
		 */	
		System.out.println();
	}
	
	public static void method2(String...values) {
		System.out.println("�迭�� ����: " + values.length);
		//�迭 ��� ��� 1
		/*
		 * for(int i = 0; i < values.length; i++) { System.out.print(values[i] + " "); }
		 */
		//�迭 ��� ��� 2
		for(String k: values) {
			System.out.print(k + " ");
		}
		//�迭 ��� ��� 3
		/* System.out.println(Arrays.toString(values)); */
		
		System.out.println();
	}
}
