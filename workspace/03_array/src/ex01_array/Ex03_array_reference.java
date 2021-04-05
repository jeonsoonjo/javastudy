package ex01_array;

public class Ex03_array_reference {

	public static void main(String[] args) {
		
		// 배열은 reference 타입이다
		int[] arr=new int[3];
		System.out.println(arr); // new int[3]을 통해 생성된 배열 요소들의 주소가 저장되어 있음
		
		// 배열의 길이를 조정하는(늘이는) 일반적인 코드
		int[] a={1,2,3};
		int[] b=new int[10];
		
		// b[0]=a[0], b[1]=a[1], b[2]=a[2]
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
		}
		// a에는 {1,2,3}이 저장된 주소가 있다
		// b에는 {1,2,3,0,0,0,0,0,0,0}이 저장된 주소가 있다
		a=b; // a에는 {1,2,3,0,0,0,0,0,0,0}이 저장된 주소가 있다
		
		// 배열 a의 길이가 증가했다
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		// 배열이 이동이 되면 기존 a배열에는 주소가 남아있다 없다? 남아있음
		// 메모리 누수라고 함. JVM 자바실행엔진이 알아서 제거함 -> garbage collection(GC)
		// code : System.gc(); 실행 시켜도 되는데 바로 실행되는 것이 아님. 그냥 JVM이 알아서 하길 기다림..
	
	}

}
