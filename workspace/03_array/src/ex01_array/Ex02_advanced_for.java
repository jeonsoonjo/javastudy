package ex01_array;

public class Ex02_advanced_for {

	public static void main(String[] args) {
		
		// advanced-for : 향상된 for문
		// 배열의 순회를 인덱스 없이 처리하는 for문
		
		int[] arr= {10,20,30};
		
		for(int n:arr) { // arr배열의 모든 요소를 변수 n으로 하나씩 전달함
			System.out.println(n);
		}
		
		// 모든 배열의 요소를 1 증가시키고 싶다
		// arr[0]++, arr[1]++, arr[2]++
		for(int n:arr) {
			n++;
			System.out.println(n); // 11,21,31 값이 증가한 것이지 배열의 요소가 증가한 것이 아님
		}
		
		// advanced for문은 배열의 요소를 수정할 수는 없음
		// 인덱스를 활용하는 일반 for문이 배열의 요소를 수정시킬 수 있기에 숙지해야한다(인덱스 for문)
		for(int i=0; i<arr.length; i++) {
			arr[i]++;
			System.out.println(arr[i]);
		}
	}

}
