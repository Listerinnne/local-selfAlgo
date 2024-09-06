import java.util.Arrays;
import java.util.Scanner;

public class boj_17144_huiju {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();	//2차원배열 가로
		int c = sc.nextInt();	//2차원배열 세로
		int t = sc.nextInt();	//시간(초)
		int apIdx = 0;					//air purifier..의 r인덱스
		int[][] arr = new int[r][c];	//원본 배열
		int[][] tmp = new int[r][c];	//임시 배열
		int[] dr = {-1, 1, 0, 0};	//상하좌우
		int[] dc = {0, 0, -1, 1};	//상하좌우
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				arr[i][j] = sc.nextInt();
				//공청기의 인덱스 업데이트
				if(arr[i][j] == -1 && apIdx == 0) apIdx = i;
			}
		}
		//---------------------------------------
		
		for(int time=0; time<t; time++) {	//주어진 시간만큼 반복
			//
			for(int i=0; i<r; i++) {
				for(int j=0; j<c; j++) {
					
				}
			}
			
		}//주어진 시간만큼 반복 끝
		
		
		
		
	}

}
