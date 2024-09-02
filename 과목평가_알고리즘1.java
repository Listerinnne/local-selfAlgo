import java.util.Arrays;
import java.util.Scanner;

public class 과목평가_알고리즘1 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		int t = sc.nextInt();
		for(int tc = 1; tc<=t; tc++) {
			
			int n = sc.nextInt();
			char[][] arr = new char[100][n];
			String star = sc.next();
			
			for(int i=0; i<star.length(); i++) {	//star의 길이만큼 반복
				
				for(int r=arr.length-1; r>=0; r--) {	//arr의 세로길이만큼 반복, 아래 -> 위
						if(arr[r][(int)star.charAt(i)-'0'] == '*') 	//이미 *이 차있으면 continue
							continue;
						arr[r][star.charAt(i)-'0'] = '*';	//아무것도 없으면 * 채우고 break
						break;
					
				}
			
			}
			
//			int rStart = n-1;	//출력을 시작할 열의 인덱스
//			int rEnd = 0;	//출력을 끝낼 열의 인덱스
//			for(int i=arr.length-1; i>=0; i--) {//아래-> 위
//				char[] tmp1 = new char[n];
//				char[] tmp2 = new char[n];
//				Arrays.fill(tmp2, '*');	//비교를 위해 *로 채움
//				for(int j=0; j<arr[i].length; j++) {	//tmp2와 비교하기 위한 배열을 채움
//					tmp1[i] = arr[i][j]; 
//				}
//				if(Arrays.equals(tmp1, tmp2)) {	//tmp1의 모든 행이 *로 차있으면 rEnd를 그 이전 열로 설정
//					rEnd = i-1;
//					break;
//				}
//				
//			}
//			for(int i=0; i<arr.length; i++) {//위 -> 아래
//				char[] tmp1 = new char[n];
//				char[] tmp2 = new char[n];
//				Arrays.fill(tmp2, ' ');	//공백으로 채우기
//				for(int j=0; j<arr[i].length; j++) {	
//					tmp1[i] = arr[i][j]; 
//				}
//				if(Arrays.equals(tmp1, tmp2)) {	//tmp1의 모든 행이 공백으로 차있으면 rStart를 그 이후 열로 설정
//					rStart = i+1;
//					break;
//				}
//				
//			}
			for(int i=0; i<=n-1; i++) {	//위 -> 아래
				for(int j=0; j<arr[i].length-1; j++) {	//왼 -> 오
					
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			
		}
		
		
	}

}

//2
//3
//01201011
//4
//000000123121
