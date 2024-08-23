import java.util.Arrays;
import java.util.Scanner;

public class swea_1984 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//테스트케이스 갯수
		int[] arr = new int[10];	//입력받은 수들을 저장할 변수
		
		for(int i=0; i<n; i++) {	//테스트케이스 갯수만큼 반복
			int sum = 0;	//배열 안 모든 정수를 합해서 저장할 변수
			for(int j=0; j<10; j++) {	//배열에 입력받은 수를 저장
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);	//정렬
			for(int k=1; k<9; k++) {	//첫 번째, 마지막 변수를 제외하고 전부 더함
				sum += arr[k];
			}
			System.out.printf("#%d %d\n",i+1,Math.round(sum/8.0));
		}
	
//		System.out.println(5.0/4);
//		System.out.println(Math.round(5.0/4));
		
	
		
	}

}
