import java.util.Arrays;
import java.util.Scanner;

public class swea_2068 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	//테스트케이스 갯수
		for(int j=0; j<n; j++) {	//테스트 케이스 갯수만큼 반복
			int[] arr = new int[10];	//10개의 공간을 가진 배열 생성
			
			for(int i=0; i<10; i++) {	//배열 속 요소에 값 할당
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.printf("#%d %d\n", j+1, arr[9]);
		}
	}

}
