import java.util.LinkedList;
import java.util.Queue;

public class test {
	public static void main(String[] args) {

		int[] arr = {7, 4, 5, 6};
		
		System.out.println(solution(	2, 10, arr));
		
		
		
	}
public static int solution(int bridge_length, int weight, int[] truck_weights) {
        
        int timeCnt = 0;  //최소 시간을 업데이트할 변수
        int cnt = 0;    //다리를 건너고 있는 트럭의 무게를 전부 합한 값을 저장할 변수
        int idx = 0;       //대기트럭의 인덱스
        
        Queue<Integer> bridge = new LinkedList<>();
        Queue<Integer> outBridge = new LinkedList<>();
        
        //다리를 지난 트럭.size()가 기존 대기트럭.length가 될 때까지 반복한다.
        while(!(outBridge.size() == truck_weights.length)){  
            
            /*1. bridge에 트럭을 추가할 경우
             * 	- idx < 대기트럭.length일 때 
             * 	- (weight - cnt) > 대기트럭[idx]일 때
             * 	
             *2. outBridge에 트럭을 추가하는 동시에 bridge.poll()할 경우 -> 매 회 진행한다
             *	- 
             * */
        		
        	//bridge에 트럭 추가
        	//트
            if(idx < truck_weights.length && (weight - cnt) > truck_weights[idx]){
            	System.out.println("트럭 추가 : " + truck_weights[idx]);
            	cnt += truck_weights[idx];
                bridge.offer(truck_weights[idx++]);
                System.out.println("cnt : "+cnt);
            }
            //outBridge에 트럭을 추가하는 동시에 다리에서 빼내기
            cnt -= bridge.peek(); 
            outBridge.offer(bridge.poll());
            timeCnt++;
            System.out.println("timeCnt : "+timeCnt);
        }
        
        
        
        return timeCnt;
    }
}
