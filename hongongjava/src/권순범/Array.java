package 권순범;

public class Array {

	public static void main(String[] args) {
		// 2024.09.26과제
		//1.배열에 저장 된 값들의 합,최대값,최소값 구하기
		
		int[] array = new int[10];
		int sum = 0;
		int max = Integer.MIN_VALUE;	
		int min = Integer.MAX_VALUE;
		System.out.print("배열 값 ");
		for(int i=0; i<array.length; i++) {
			int random = (int)(Math.random()*100)+1;
			array[i]=random;
			sum += array[i];
			System.out.print(array[i]+" ");
			if(max < i) {
				max = i;
			}
			if(min > i) {
				min = i;
			}
		}
		System.out.printf("\n합계 %d 최대값 %d 최소값 %d\n",sum,max,min);
		
		//2.2차원 배열 출력
		
		int[][] scor = {
				{1,2,3},
				{1,2},
				{1},
				{1,2,3}
		};
		for(int i=0; i<scor.length; i++) {
			for(int j=0; j<scor[i].length; j++) {
				System.out.print(scor[i][j] + " ");
			}System.out.println();
		}
		
		//3.현재 관객의 수 출력
		
		int[][] cha = new int[3][10];
		int count = 0;
		for(int i=0; i<cha.length; i++) {
			for(int j=0; j<cha[i].length; j++) {
				int pers = (int)(Math.random()*2);
				cha[i][j]=pers;
				if(pers == 1) {
					count ++;
				}
				System.out.print(cha[i][j]+" ");
			}System.out.println();
		}System.out.printf("현재 관객 수는 %d명\n",count);
			
		//4.학생 별 평균 계산하기
		
		
		
		//5.카드를 랜덤하게 선택하여 화면에 출력
		
		//6.2차원 배열 만들기
		

	}//end main

}
