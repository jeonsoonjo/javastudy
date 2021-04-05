package ex03_generic;

// 제네릭을 배열로

public class Box<T> {

	// field
	// private T[] items=new T[10] 실행 안 됨
	// 컴파일 시점이기에 새롭게 생성된 객체를 자바는 알 수가 없다
	// 그래서, new Object[]; 로 생성하면, 자바는 "어떠한 객체가 생성이 되는구나~" 하고 알 수 있다
	private T[] items; 
	private int idx;
	
	// constructor
	public Box(int itemCount) { // item의 갯수
		// items=new T[itemCount]; 코드 작성 시점에는 T의 구체적인 종류를 알 수 없어 메모리 할당이 불가능하다
		items=(T[])(new Object[itemCount]); // Object 배열 생성 후에는 캐스팅을 해야한다(경고문 신경X)
	}
	
	// method
	public void addItem(T item) {
		if(idx==items.length) {
			System.out.println("Full");
			return;
		}
		items[idx++]=item;
	}
	@Override
	public String toString() {
		String result="";
		for(T item:items) {
			if(item!=null) {
				result+=item.toString(); // item.toString() -> Fruit의 toString()
			}
		}
		return result;
	}
	
}
