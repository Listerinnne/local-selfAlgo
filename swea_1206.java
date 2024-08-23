import java.util.Arrays;
import java.util.Scanner;

public class swea_1206 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {	//테스트케이스(10번)만큼 반복/////////바까야함 3으로
			
			int cnt =0;	//조망권이 확보된 세대 수를 더하는 변수
			int[] arr = new int[sc.nextInt()];	//배열의 길이 정하기
			int[] arrTmp = new int[5];	//비교할 건물 높이를 넣을 임시 배열 생성
			
			for(int j=0; j<arr.length; j++) {	//배열에 값 대입하기
				arr[j] = sc.nextInt();
			}
			Arrays.toString(arr);
			
			for(int k=2; k<arr.length-2; k++) {	//인덱스로 2번째 건물부터 비교 시작
				for(int l=0; l<5; i++) {	//arrTmp 안에 비교할 5개의 요소를 대입 
					arrTmp[l] = arr[k-2+l];
				}
				Arrays.sort(arrTmp);	//오름차순으로 요소 정렬
				if(arr[k] == arrTmp[4]) 	//정렬된 배열의 마지막 요소와 k번째 값이 동일할 경우(주변 건물 중 가장 높을 경우)
					cnt += (arr[k] + arrTmp[3]);	//k번째 값에서 그 다음으로 큰 값을 빼서 cnt에 더한다. 
			}
			
			System.out.println(cnt);
		}
		
		
		
	}

}

//
//10
//0 0 254 185 76 227 84 175 0 0
//10
//0 0 251 199 176 27 184 75 0 0
//11
//0 0 118 90 243 178 99 100 200 0 0