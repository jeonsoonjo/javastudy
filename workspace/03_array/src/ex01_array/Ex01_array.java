	/*
		 
		  배열(array)
		 1.변수가 여러 개 필요할 때 사용
		 2.같은 이름 + 식별 번호를 통해서 표현한다
		 3.선언
			 1) int[] a = new int[3]; // int 타입 변수 3개를 사용할 수 있는 배열 a 생성
			 2) int[] a;
				a = new int[3];
			 3) int a[] = new int[3]; // 추천x
		 4.초기화
			 1) int[] a = {10,20,30};
			 2) 주의사항 : 아래는 안 됩니다. 초기화는 반드시 선언할 때 같이 진행함
				int[] a;
				a={10,20,30};
		 5.생성되는 변수
		 	 int[] a = new int[3];
		 	 a[0] : 0으로 초기화가 되어 있는 상태(자동)
		 	 a[1] : 0으로 초기화가 되어 있는 상태(자동)
		 	 a[2] : 0으로 초기화가 되어 있는 상태(자동)
		 6.용어
		 	 int[] a = new int[3];
		 	 1) 배열이름 : a
		 	 2) 배열길이 : 3(a.length)
		 	 3) 인덱스 : 0,1,2
		 	 	사용이 불가능한 인덱스를 사용하면 ArrayIndexOutOfBoundsException예외가 발생
		 	 
		*/
package ex01_array;

public class Ex01_array {

	public static void main(String[] args) {
		
		// 1.배열의 선언 및 생성
		int[] a = new int[3];
		
		// 2.확인
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		// 3.배열의 순회
		//	 인덱스가 기준
		//	 인덱스 : 0(시작) ~ 길이-1 -> 0 <= 인덱스 < 길이
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		// 4.가용 범위를 벗어난 인덱스 사용
		// System.out.println(a[3]);

	}

}
