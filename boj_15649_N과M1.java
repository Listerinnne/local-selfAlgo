import java.util.Arrays;
import java.util.Scanner;

public class boj_15649_N과M1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		
		recursion(0,1);
		
	}
	static int n;
	static int m;
	static int[] arr;
	static void recursion(int idx, int num) {
		
		//기저조건
		for(int i=0; i<m; i++) {
			for(int j=0; j<m; j++) {
				
				if(arr[i] == arr[j]) {
					return;
				}
			}
		}
		if(idx == m) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		
		
	}
}
