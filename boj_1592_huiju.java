import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class boj_1592_huiju {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		
		names.add("luna");
		names.add("max");
		names.add("max");
		System.out.println(names);
		//빈 리스트인지 확인
		System.out.println(names.isEmpty());
		//수정
		names.set(2, "희주");
		System.out.println(names);
		
		//조회
		System.out.println(names.get(1));
		
		//순회
		for(String name : names) {
			System.out.println(name);
		}
		//인덱스를 이용한 삭제
		names.remove(0);
		//값을 이용한 삭제
		names.remove("희주");
		//전부 삭제
		names.clear();
		
		//중복된 이름을 값을 이용한 삭제로 없애면 가장 앞의 중복된 값이 지워진다. 
		//삭제할 경우 삭제된 인덱스를 기준으로 인덱스가 1씩 앞으로 당겨진다. 
		//삭제시 주의할 점
		//중복된 값이 있을 경우 
		names.add("max");
		names.add("max");
		names.add("max");
		names.add("dd");
		
		System.out.println(names);
		/*Max를 다 지우고 싶다 -> for문을 돌면서 순회를 하면서 일치하는 애들은 다 지워버린다. 
		 * */
//		for(int i=0; i<names.size(); i++) {
//			if(names.get(i).equals("max"))
//				names.remove(i);
//		}
		System.out.println(names);
		
		/*앞에서부터 지우면 인덱스가 전부 바뀌기 떄문에, 뒤에서부터 지우는 것이 좋다!*/
		
		
		//Set
		//순서없음 중복없음
		//집합을 나타내는 자료구조
		//구현체로는 해시셋 사용
		//중복을 허용하지 않으므로 동일성 판단을 한다
		// -> 해시코드값&equals메서드로 비교
		
		Set<String> named = new HashSet<>();
		named.add("Luna");
		named.add("max");
		named.add("Luna");
		named.add("hana");
		named.add("max");
		System.out.println(named);	
		// 중복이 제거됨
		//순서를 유지하지 않음 - 랜덤?인듯 자료를 추가할 떄마다 바뀜
		System.out.println("Luna".hashCode() );
		System.out.println("max".hashCode() );
		System.out.println("hana".hashCode() );
		
		//set이 같다고 판단하느 기준 : 해시코드가 같으면서 equals값도 같아야 함
		//일반적으로 String은 같은 문자열에 대해서 같은 해시코드가 나온다
		//- > named의 해시코드만 사용해서 구별하자
		//해시코드를 오버라이딩
//		public int hashCode() {
//			return named.hashCode();
//		}
		//매개변수와 같으면 true, 아니면 false
//		public boolean equals(Object obj) {
//		if(obj instanceof Person) {
//			Person p = (Person)obj ;
//			return this.age == p.age ;
//		}	//person이 아니라면
//			return super.equals(obj); //다르다!
//		}
		
		//사용자 정의 클래스를 사용하는 경우 
		//set을 사용하기 위해서는 hashCode(), equals()를 오버라이딩해줘야 한다!!
		
		
		//Map
		/*사전과 같은 자료구ㅠ조
		 * 키와 밸류의 쌍으로 구성됨
		 * 키는 구별되어야 함(중복불가)(순서 없음)
		 * 값은 중복될 수 있다
		 * 
		 * Map<키자료형, 값자료형> map = new HashMap<>();
		 * */
		Map<String, String> map = new HashMap<>();
		map.put("Luna", "cat");		
		map.put("max", "dog");		
		map.put("hana", "cow");		
		map.put("toby", "bird");		
		System.out.println(map);
		//키는 중복이 되지 않고, 만약에 똑같은 키에 새로운 값을 넣으면 새로운 값으로 수정된다. 
		
		System.out.println(map.get("daisy"));
		//키가 있는지 확인
		System.out.println(map.containsKey("max"));
		
		//값이 있는지 확인
		System.out.println(map.containsValue("horse"));
		
		//맵의 순회
		//1. keySet(); 
		for(String key : map.keySet()) {
			System.out.printf("%s : $s \n", key, map.get(key));
		}
		
		//2. entrySet() -> 키 -값의 쌍
//		for(Map.Entry<String, String> entry : map.entrySet()) {
//			System.out.printf("%s : %s \n", key, map.get(key));
			
			//map의 키자료형으로 사용자 정의 클래스가 온다면? 
			//set의 경우와 동일하게 hashCode(), equals()메서드를 오버라이딩해줘야 함
			
			
			//queue
			/**/
			Queue<Integer> queue = new LinkedList<>();
			//값추가
			//queue.offer(), queue.add() : 둘다 추가, 기능상 차이없음, 예외처리 관련해서 차이가 있을 수 있음
			queue.offer(1);
			queue.offer(2);
			queue.offer(3);
			//값을 하나씩 꺼내기
			System.out.println(queue.poll());
			System.out.println(queue.poll());
			System.out.println(queue.poll());
			
			//값을 전부꺼내기
			while(!queue.isEmpty()) {
				System.out.println(queue.poll());
			}
			
			//stack
			/*단일클래스
			 * 인터페이스 따로 없음
			 * 리포
			 * */
			Stack<Integer> stack = new Stack<>();
			stack.push(13); 
			stack.push(23); 
			stack.push(33);
			stack.add(99);
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
			while(!stack.isEmpty()) {
				System.out.println(stack.pop());//조회 +삭제
			}
//			stack.peek();//값을 삭제하지 않고 조회
			
			
			
			// Deque
			/*인터페이스
			 * 구현체 : 어레이데크, 링크드리스트
			 * 양쪽 끝에서 자유롭게 추가삭제 가능
			 * 중간에서 삭제 추가가 빈번하게 일어나는상황에서 어레이는 불편함 그러나 조회는 빠름
			 * 링크드리스트 : 조회는 느림, 삭제와 추가는 빠르다(그냥 배열과 반대)
			 * */
			Deque<String> deque = new ArrayDeque<>();
			
			deque.addFirst("Alice");
			deque.addFirst("luna");
			deque.addLast("max");
			deque.addFirst("daisy");
			
			System.out.println(deque);
			
			System.out.println(deque.removeLast());
			System.out.println(deque.removeLast());
			System.out.println(deque.removeFirst());
			System.out.println(deque.removeFirst());
			
			
			
			//sort()
			/*그냥 클래스를 정렬? 
			 * 순서가 있는 자료구조 리스트
			 * 리스트를 정렬!
			 * 
			 * */
			List<String> persons = new ArrayList<>();
			persons.add("fnsk");
			persons.add("w3ww");
			persons.add("hgh");
			
			System.out.println(names);
			
			//정렬 - 컬렉션즈 유틸리티클래스의 sort()사용
			Collections.sort(persons);
			System.out.println(persons);
			//만약 숫자의 리스트였다면 수의 크기로 오름차순 정렬
			
			//문자 -> 정수로 표현 가능, 정수의 오름차순으로 정렬
			//사용자 정의 클래스의 경우 - comparanble인터페이스를 구현하거나 comparator클래스를 정의해야 함
			//비교 기준이 없으므로 사용자 정의 클래스에 비교 기준을 만들어준다
			//public class Person implements Comparable<Person>{} ->  제네릭 - 타입매개변수에 비교하고자 하는 클래스 타입을 집어넣어준다
//			
//			public int compareTo(Person o) {
//				//1. 나이
//				// return o.age - this.age;
//				//2. 이름
//				return this.persons.compareTo(o.name)
//			}
//			
			
			
			
			
			
			
			
			
			
			
		}
	}
	
	
	


