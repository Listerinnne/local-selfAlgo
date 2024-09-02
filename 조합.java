import java.util.Arrays;

public class 조합 {
	static int[] arr = {4,3,2,1};
	static int n = arr.length;
	static int r = 2;
	static int[] result = new int[r];
	public static void main(String[] args) {

		combination(0,0);
		
	}
	private static void combination(int idx, int sidx) {
		
		if(sidx == r) {
			System.out.println(Arrays.toString(result));
			return;
		}
		
		for(int i=idx; i<=n-r+sidx; i++) {
			result[sidx] = arr[i];
			combination(i+1, sidx+1);
		}
		
	}

}
