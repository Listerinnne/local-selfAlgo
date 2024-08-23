import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class swea_11315_huiju {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("11315_input.txt");
		Scanner sc = new Scanner(file);

		int t = sc.nextInt();
		boolean isTrue = true;
		int result = 0;

		for(int tc=0; tc<t; tc++) {	//테케 개수만큼 반복

			int n = sc.nextInt();
			char[][] field = new char[n][n];
			for(int i=0; i<n; i++) {
				field[i] = sc.next().toCharArray();
			}

			System.out.println(Arrays.deepToString(field));
			//---------------------------------------
				//가로
				System.out.println("가로");
				for(int r=0; r<field.length; r++) {
					isTrue = true;
					for(int c=0; c<field.length; c++) {
						if(field[r][c] == '.') {
							System.out.println("field[r][c] == '.' : " + (field[r][c] == '.'));
							isTrue = false;
							break;
						}
						System.out.printf("r = %d, c = %d일 때 \'o\'이 존재함\n",r,c);
					}
					result = isTrue == true ? ++result : result;
					System.out.println("result : "+ result);
					if(isTrue == true) break ;
				}
				
				//세로
				System.out.println("세로");
				for(int c=0; c<field.length; c++) {
					isTrue = true;
					for(int r=0; r<field.length; r++) {
						if(field[r][c] == '.') {
							System.out.println("field[r][c] == '.' : " + (field[r][c] == '.'));
							isTrue = false;
							break;
						}
					}
					result = isTrue == true ? ++result : result;
					System.out.println("result : "+ result);
				}

				//대각선 \
				System.out.println("대각선1");
				for(int r=0; r<field.length; r++) {
					isTrue = true;
					if(field[r][r] == '.') {
						isTrue = false;
						break;
					}
				}
				result = isTrue == true ? ++result : result;
				System.out.println("result : "+ result);

				//대각선 /
				System.out.println("대각선2");
				for(int r=0; r<field.length; r++) {
					isTrue = true;
					if(field[r][n-r-1] == '.') {
						isTrue = false;
						break;
					}
					System.out.printf("r = %d일 때 \'o\'이 존재함\n",r);
				}
				result = isTrue == true ? ++result : result;
				System.out.println("result : "+ result);


				if(result > 0) System.out.println("YES");
				else System.out.println("NO");

				if(result == 0) {
					System.out.println("NO");
					break ;
			
			}
		}
	}

}
