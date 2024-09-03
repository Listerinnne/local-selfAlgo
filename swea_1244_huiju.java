import java.util.Arrays;
import java.util.Scanner;

public class swea_1244_huiju {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int tc=1; tc<=t; tc++) {

			String str = sc.next();
			int n = sc.nextInt();
			int max = 0;
			for(int i=0; i<str.length(); i++) {
				max = Math.max(max, str.charAt(i)-'0');	//str에서 최댓값 구하기
			}
			for(int i=0; i<n;) {

				//				if() {}

			}

		}

	}
}