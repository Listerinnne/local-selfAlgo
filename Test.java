import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
		String order = "ddddd";
		String[] orderArr = order.split(" ");	//공백문자를 기준으로 나눠 배열에 저장
		System.out.println(orderArr);
		List<Integer>[] list = new ArrayList[4];
		Arrays.fill(list, new ArrayList<>());
		
		

	}

}
