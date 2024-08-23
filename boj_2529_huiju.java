import java.util.Scanner;

public class boj_2529_huiju {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//스위치 갯수 저장
		int switchNum = sc.nextInt();
		//스위치 상태 저장하는 배열 공간 생성
		int[] switchArr = new int[switchNum];
		//스위치 상태 저장하는 배열 안에 값 저장
		for(int i=0; i<switchNum; i++) 	
			switchArr[i] = sc.nextInt();
		
		//학생 수 저장
		int studentNum = sc.nextInt();
		//학생 성별, 받은 수 저장할 이차원 배열 생성
		int[][] studentInfo = new int[studentNum][2];
		for(int k=0; k<studentNum; k++) {	//학생의 성별, 받은 수 정보 저장
			studentInfo[k][0] = sc.nextInt();
			studentInfo[k][1] = sc.nextInt();
		}
		
		for(int i=0; i<studentNum; i++) {	//학생 수만큼 반복
			if(studentInfo[i][0] == 2) {	//여성인 경우
				
				//받은 수 -1까지 반복(대칭으로 탐색)
				for(int j=1; j<studentInfo[i][1]-1; j++) {
					//학생이 받은 수의 +j -j 값이 같으면 continue
					if(switchArr[studentInfo[i][1]+j]
							==switchArr[studentInfo[i][1]-j])
						continue;
					
					//대칭된 스위치 값이 다르면 그 사이 인덱스 범위 내의 스위치 온오프를 반대로 바꾼다
					else {
						for(int t=studentInfo[i][1]-j+1; t<studentInfo[i][1]+j; t++){
							switchArr[t] = (switchArr[t]==0)? 1 : 0 ;
						}
					}
				}
			}else {	//남성인 경우
				for(int j=0; j<switchNum/studentInfo[i][1]; j++) {	//스위치 갯수/ 받은 수 만큼 반복
					
				}
			}
			
		}
	}

}

//8
//0 1 0 1 0 0 0 1
//2
//1 3
//2 3
