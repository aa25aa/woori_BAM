//5명의 영어 점수를 입력받아 총점과 평균을 계산하는 프로그램을 만드시오

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[5];
		int sum = 0;
		double average = 0.0;
		
		
		for(int i = 0; i < scores.length; i++){
			System.out.println(i + 1) ;
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		average = (double) sum / scores.length;
		System.out.println( "총점:" + sum);
		System.out.printf("평균: %.2f\n",average);
		
		sc.close();
	}
	
	

}
	
