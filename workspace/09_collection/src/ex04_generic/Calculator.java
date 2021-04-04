package ex04_generic;

public class Calculator {

	// method
	// int, double 두 가지를 사용하려고 한다
	// overload 하면 되는데, generic으로.. 표현해보자
	
	// 방법1
	public <T> double getTotal(T[] a) { 
		double total=0.0; // 0;도 같은 의미 // int, double 둘 중, 둘 다 커버가 가능한 것은 double이다
		for(int i=0; i<a.length; i++) {
			total+=((Number)a[i]).doubleValue(); // ctrl+클릭해서 확인하면 Num에서 상속받는 다는 걸 알 수 있다
		}
		return total;
	}
	
	// 방법2(추천)
	public <T extends Number> double getTotal2(T[] a) { // T는 Num을 상속받는 클래스만 가능하다(예: int, double..)
		double total=0.0;
		for(int i=0; i<a.length; i++) {
			total+=a[i].doubleValue();
		}
		return total;
	}
	
}
