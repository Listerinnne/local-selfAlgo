import java.util.Scanner;
 
public class DP_byJW_Sample {
    static int N; // 거스름돈
    static int[] money = {1, 5, 10, 50, 100, 500, 1000, 5000};
    static int moneyCnt = money.length;
    static int[] dp; // 최소 개수
    static int[] dpNum; // 마지막으로 어떤 값을 더했는지
    static int[] result; // 최종 개수 세기
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         
        for (int t = 1; t <= T; t++) {
            N = sc.nextInt();
            N /= 10;
            dp = new int[N+1]; // 최소 개수 저장
            dpNum = new int[N+1]; // i원일 때 마지막으로 더한 동전의 인덱스
            result = new int[moneyCnt]; // 최종 N원일 떄 사용된 동전의 개수
             
            // 1원부터 ~ N원까지 비교
            for (int i = 1; i <= N; i++) {
                int minCnt = Integer.MAX_VALUE;
                int num = 0; // i원의 경우 어떤 값을 더해줬는지
                 
                // 각각의 동전들을 사용하는 경우와 비교
                for (int j = 0; j < moneyCnt; j++) {
                    if (i >= money[j]) {
                    	
                        // j번째 동전 사용했을 때 더 적은 개수
                        if (minCnt > dp[i-money[j]] + 1) {
                            minCnt = dp[i-money[j]]+1;
                            num = j;
                        }
                    }
                } // for j
                 
                // 업데이트!
                dp[i] = minCnt;
                dpNum[i] = num;
            } // for i
             
            // 최종 거스름돈 N에서 되돌아가면서 어떤 동전이 쓰였는지 확인
            int num = N;
            while(num > 0) {
                result[dpNum[num]]++;
                num -= money[dpNum[num]];
            }
             
            System.out.println("#" + t);
            for (int i = moneyCnt - 1; i >= 0; i--) {
                System.out.print(result[i] + " ");
            }
        System.out.println();
        } // for t
    } // main
} // Solution