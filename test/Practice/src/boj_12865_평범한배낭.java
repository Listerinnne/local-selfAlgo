import java.util.Scanner;

public class boj_12865_평범한배낭 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] met = new int[n+1][2];
		int[][] dp = new int[n+1][k+1];
		
		for(int i=0; i<n; i++) {
			met[i][0] = sc.nextInt();	//w
			met[i][1] = sc.nextInt();	//v
		}
		
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=k; j++) {	//j는 해당 줄에서 가방에 담을 수 있는 최대 무게
				
				if(met[i][0] > j) {	// 해당 물건의 무게가 현재 최대 무게보다 클 때
					//위 혹은 옆의 값 중 더 큰 값을 그대로 가지고 온다
					dp[i][j] = dp[i-1][j];
					
				}else {	//해당 물건을 넣을 수 있을 때
					//이전 최대의 무게(바로 위의 값) / dp[i-1(바로 윗줄)][j - met[i][0](j - 내 무게)] + 내 가치 => 내 무게가 더해질 수 없었을 때의 최대값에 내 무게를 더하는 것
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - met[i][0]] + met[i][1]);
				}
				
			}
			
		}
		
		System.out.println(dp[n][k]);
		
	}

}
