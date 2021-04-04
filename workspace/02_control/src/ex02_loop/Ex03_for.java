package ex02_loop;

public class Ex03_for {

	public static void main(String[] args) {
		
		// for문
		// 1. 반복의 횟수나 범위가 명활학 때 사용함(while문과 반대)
		// 2. 배열이나 리스트와 같은 반복가능객체(iterable)에서 사용함
		// 3. 동작 순서
		// for(① 초기값; ② 종료값 ; ④ 조건){③ 실행문}
		// ①은 최초 1회만 동작함
		// ②,③,④는 반복실행함

		// 1~10 출력하기
			/* 	for (int n = 1; n <= 10; n++) {
				System.out.println(n);
				}
			*/
		
		// 10~1 출력하기
		for(int n=10; n>=1; n--) {
			System.out.println(n);
		}
		
		// "Hello Java"를 3번만 출력하는 for문 작성
		for(int n=0; n<3; n++) {
			// 사용되는 n : 0,1,2
			System.out.println("Hello Java");
		}

	}

}
