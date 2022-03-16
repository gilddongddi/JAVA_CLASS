package ArrayEx.source06;

public class IrregularArray {
	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		
		for(int i = 0; i < intArray.length; i++)
			for(int j=0; j < intArray[i].length; j++)
				intArray[i][j] = (i+1)*10+j;
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j=0;j < intArray[i].length; j++)
				System.out.print(intArray[i][j] + " ");
			System.out.println();
		}
		
		System.out.println();
		
		//3행 5열의 총 15개의 숫자를 저장할 수 있는 정수형 2차원 배열을 선언하고
		//1부터 15까지의 숫자로 초기화
		int threefive[][] = {{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15}};
		
		for(int i=0; i<threefive.length;i++) {
			for(int j=0 ; j<threefive[i].length;j++)
				System.out.print(threefive[i][j] + " ");
			System.out.println();
		}
		System.out.println();
		
		//각 행마다 행의 개수만큼 열을 가지는 정수형 비정방형 행렬 선언
		int irr_Array[][]= new int[5][];
		irr_Array[0] = new int[1];
		irr_Array[1] = new int[2];
		irr_Array[2] = new int[3];
		irr_Array[3] = new int[4];
		irr_Array[4] = new int[5];
		
		for(int i=0; i<irr_Array.length;i++) 
			for(int j=0; j<irr_Array[i].length; j++)
				irr_Array[i][j] = (i+1)+j;
			
		for(int i=0; i<irr_Array.length;i++) {
			for(int j=0; j<irr_Array[i].length; j++)
				System.out.print(irr_Array[i][j] + " ");
			System.out.println();
		}
	}
}


