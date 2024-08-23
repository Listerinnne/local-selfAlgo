import java.util.Scanner;

public class boj_1592_huiju2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int a = 1;	//던지는 자리 - 1부터 시작
		int b = 1;	//a가 공 받은 횟수 - 공을 받는 횟수도 포함이므로 1부터 시작
		int aCnt = 0;	//공을 받은 횟수를 세는 변수
		int bCnt = 0;	//b의 자리가 m이 될 때까지 세는 변수
		int[] aArr = new int[n];	//공을 받은 사람의 인덱스를 올릴 배열
		
		//(a, b) -> (1, 1)부터 시작
//		int cnt = 0;	//총 몇 번 돌아갔는지 셀 변수
		
		for(;;) {
			
			while(b%2 == 1) {	//b가 홀수일 때
				
				if(aArr[a-1] ==2) {b++; break;}	//a자리의 수가 한 번 이상 나왔을 때 while문을 빠져나감
				a = (a+l) %n ; // 현재 공이 있는 자리 구하기
				aArr[a-1]++;	// 공을 받은 사람의 인덱스를 1씩 올림
				aCnt++;	//돌아간 횟수 카운트
				
			}
			
			aArr = new int[n];	//aArr 초기화
			bCnt++;
			
			while(b%2 == 0) {	//b가 짝수일 때
				
				if(aArr[a-1] ==2) {b++; break;}	//a자리의 수가 한 번 이상 나왔을 때 while문을 빠져나감
				a = (a-l) %n ;	//n자리 구하기
				aArr[a-1]++;	// 공을 받은 사람의 인덱스를 1씩 올림
				aCnt++;	//돌아간 횟수 카운트
				
			}
			
		}
		
				
		
		
	}
}


	


