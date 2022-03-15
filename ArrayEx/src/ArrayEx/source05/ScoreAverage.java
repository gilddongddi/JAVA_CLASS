package ArrayEx.source05;

public class ScoreAverage {
	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4},	//1학년 1,2학기 평점
				{3.5, 3.6},				//2학년 1,2학기 평점
				{3.7, 4.0},				//3학년 1,2학기 평점
				{4.1, 4.2}};			//4학년 1,2학기 평점
		
		double sum =0;
		for(int year=0; year<score.length; year++)
			for(int term =0; term<score[year].length; term++)
				sum += score[year][term];
		
		int n=score.length;				//배열의 행 개수, 학년
		int m=score[0].length;			//배열의 열 개수, 학기
		System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
		
	}
}
