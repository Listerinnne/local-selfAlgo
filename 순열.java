import java.util.Arrays;

public class 순열 {
	static int[] arr = {4,3,2,1};
	static int n = arr.length;
	static boolean[] visited = new boolean[n];
	static int[] tmp = new int[n];
	public static void main(String[] args) {
		perm(0);
	}

	private static void perm(int idx) {

		if(idx == n) {
			System.out.println(Arrays.toString(tmp));
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(visited[i]) continue;
			
			tmp[idx] = arr[i];
			visited[i] = true;
			perm(idx + 1);
			visited[i] = false;
		}
		
	}
	
	

}
