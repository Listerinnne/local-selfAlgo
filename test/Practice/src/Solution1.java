import java.util.Scanner;

public class Solution1 {
//dp로 풀기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			
			int h = sc.nextInt();
			
			long[] dp = new long[61];
			dp[1] = 1;
			dp[2] = 1;
			dp[3] = 2;
			dp[4] = 4;
			
			for(int i=5; i<61; i++) {
				dp[i] = dp[i-1] + dp[i-3] + dp[i-4];
			}
			
			System.out.printf("#%d %d\n", tc, dp[h]);
			
		}
		
	}

}
