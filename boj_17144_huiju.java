import java.util.Arrays;
import java.util.Scanner;

public class boj_17144_huiju {
	static int r;
	static int c;
	static int apIdx;
	static int[][] tmp;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		r = sc.nextInt();	//2차원배열 가로
		c = sc.nextInt();	//2차원배열 세로
		int t = sc.nextInt();	//시간(초)
		apIdx = 0;					//air purifier..의 r인덱스
		int[][] arr = new int[r][c];	//원본 배열
		tmp = new int[r][c];	//임시 배열
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
			//원본배열 사방 탐색
			for(int i=0; i<r; i++) {
				for(int j=0; j<c; j++) {
					
					for(int k=0; k<4; k++) {	//델타배열 길이만큼 반복
						
						int ir = i + dr[k];
						int jc = j + dc[k];
						//배열을 벗어날 경우 
						if(ir < 0 || jc < 0 || ir >= r || jc >= r) continue;
						//5 이상일 경우
						else if(arr[ir][jc] >= 5) {	
							tmp[i][j] += arr[ir][jc] / 5 ; 	//임시배열 업데이트
							arr[ir][jc] -= arr[ir][jc] - arr[ir][jc] / 5;	//원본배열 업데이트
						}
					}
				}	
			}//원본배열 사방 탐색 끝
			
//			//원본배열에 임시배열 덮어씌우기
//			for(int i=0; i<r; i++) {
//				for(int j=0; j<c; j++) {
//					arr[i][j] = tmp[i][j];
//				}
//			}
			//공청기로 들어가는 부분의 미세먼지 처리
			tmp[apIdx-1][0] = -1;
			tmp[apIdx+2][0] = -1;
			
			//배열 밖으로 벗어날 수 있는 요소 저장
			int point1 = tmp[0][0];
			int point2 = tmp[0][c];
			int point3 = tmp[r][0];
			int point4 = tmp[r][c];
			
			
			
		}//주어진 시간만큼 반복 끝
		
		
		
		
	}//main
	
	static void pushLR(int col) {	//왼 -> 오
		for(int i=r-2; i>=0; i--) {
			tmp[col][i+1] = tmp[col][i];
		}
	}
	static void pushRL(int col) {	//오 -> 왼
		for(int i=0; i<r-2; i++) {
			tmp[col][i] = tmp[col][i+1];
		}
	}
	static void pushUD(int row) {	//위 -> 아래
		if(row == 0) {
			for(int i=apIdx-1; i>=row; i--) {
				tmp[i+1][0] = tmp[i][0];
			}
		}else {
			for(int i=apIdx-1; i>=row; i--) {
				tmp[i+1][r] = tmp[i][r];
			}
			
		}
		
	}
	static void pushDU(int row) {	//아래 -> 위 이거아닌것같은데,,
		if(row == r) {
			for(int i=apIdx-1; i<r; i++) {
				tmp[i+1][c] = tmp[i][c];
			}
		}
		
	}

}
