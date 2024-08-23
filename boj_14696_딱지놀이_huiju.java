import java.util.Scanner;

public class boj_14696_딱지놀이_huiju {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			int aNum = sc.nextInt();	//a가 가진 그림의 총 개수
			int[] aArr = new int[aNum];	//a 그림을 저장하는 배열 생성
			
			for(int a=0; a<aArr.length; a++) {	//a 그림을 배열에 저장
				aArr[a] = sc.nextInt();
			}
			
			int bNum = sc.nextInt();	//b가 가진 그림의 총 개수
			int[] bArr = new int[bNum];	//b 그림을 저장하는 배열 생성
			
			for(int b=0; b<aArr.length; b++) {	//b 그림을 배열에 저장
				aArr[b] = sc.nextInt();
			}
			
			int len = aArr.length > bArr.length ? aArr.length : bArr.length ;
			
			for(int j=0; j<len; j++) {
				
			}
			
			
			
		}
		
	}

}
