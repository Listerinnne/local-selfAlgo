import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Virus{	//바이러스의 좌표를 저장할 클래스
	int x, y;
	Virus(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class boj_14502_연구소 {
	static int n;			//가로
	static int m;			//세로
	static int max;			//안전지대 최대 넓이
	static int[] dx = {-1, 1, 0, 0};	//상하좌우
	static int[] dy = {0, 0, -1, 1};	
	static int[][] arr;		//원본배열
	static int[][] tmp;		//임시배열


	public static void main(String[] args) {

		Scanner sc = new Scanner(input);

		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][m];

		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		//--------------------------

		dfs(0);
		System.out.println(max);


	}
	//벽 세우기
	private static void dfs(int cnt) {		//cnt : 세운 벽의 개수
		if(cnt == 3) {		//벽 3개를 전부 세웠을 경우
			//원본배열을 임시배열에 복사
			tmp = new int[n][m];
			for(int i=0; i<n; i++) {
				tmp[i] = arr[i].clone();
			}
			
			bfs();			//바이러스 채우러 감
			return;			//다녀와서 반환
		}

		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {

				if(arr[i][j] == 0) {	//빈 공간일 경우
					
					arr[i][j] = 1;		//벽을 세우고
					dfs(cnt+1);			//재귀
					arr[i][j] = 0;		//돌아오면 원상복구 해줌
				}

			}
		}

	}//dfs

	//바이러스 확산시키기
	private static void bfs() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {

				if(tmp[i][j] == 2) {	//바이러스 발견
					Virus v;
					Queue<Virus> queue = new LinkedList<>();
					queue.offer(new Virus(i, j));	//큐에 객체 넣기

					//큐가 빌 때까지 반복
					while(!queue.isEmpty()) {
						//큐에서 요소 빼내기
						v = queue.poll();

						//델타배열 길이만큼 반복
						for(int k=0; k<4; k++) {

							int vx = v.x + dx[k];
							int vy = v.y + dy[k];

							if(vx >= 0 && vx < n && vy >= 0 && vy < m) {	//배열에서 벗어나지 않을 때
								if(tmp[vx][vy] == 0) {						//벽이 아닌 빈 공간일 경우
									tmp[vx][vy] = 2;						//바이러스 확산
									queue.offer(new Virus(vx, vy));				//큐에 객체 넣기	
								}
							}
						}
					}//큐가 빌 때까지 반복 끝
				}
			}
		}
		
		updateMax();

	}//bfs

	private static void updateMax() {
		
		int cnt = 0;	//안전공간 개수를 업데이트할 변수

		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {

				if(tmp[i][j] == 0) cnt++;

			}

		}
		max = Math.max(max, cnt);
	}



	static String input = "8 8\r\n"
			+ "2 0 0 0 0 0 0 2\r\n"
			+ "2 0 0 0 0 0 0 2\r\n"
			+ "2 0 0 0 0 0 0 2\r\n"
			+ "2 0 0 0 0 0 0 2\r\n"
			+ "2 0 0 0 0 0 0 2\r\n"
			+ "0 0 0 0 0 0 0 0\r\n"
			+ "0 0 0 0 0 0 0 0\r\n"
			+ "0 0 0 0 0 0 0 0";

}
