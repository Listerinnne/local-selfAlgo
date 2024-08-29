//가장 긴 증가하는 부분수열

import java.util.Arrays;
import java.util.Scanner;

public class boj_11053_huiju {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] dp = new int[n];
		int max = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			dp[i] = 1;
		}
//		System.out.println(Arrays.toString(arr));
		//---------------------------------------
		
		for(int i=1; i<n; i++) {
			for(int j=i-1; j>=0; j--) {
				if(arr[i] < arr[j]) {
					
					dp[i] = Math.max(max, dp[j]) + 1;
					
				}
			}
		}
		
		
		
	}
}
