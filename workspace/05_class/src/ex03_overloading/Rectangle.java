package ex03_overloading;

/*
 	오버로딩(overloading)
 	1. 이름이 같고 매개변수가 다른 메소드가 있음을 의미
 	2. 결과타입은 오버로딩과 상관이 없다
 */

public class Rectangle {

	// field
	int width;
	int height;
	
	// method
	void set(int w, int h) {
		if(w>0) { // 넓이가 0보다 클때만 전달, 한마디로 음수는 안 된단 얘기
			width = w;
		}
		if(h>0) {
			height = h;
		}
	}
	
		/*
			 void set(int n) {
				width = n;
				height = n;
			 }
		*/
	
	void set(int n) {
		// 다른 set() 메소드를 호출해서 처리한다
		set(n,n); // 오버로딩일때 맨 위 메소드로 돌아가서 실행함
	}
	
	int getArea() {
		return width * height;
	}
	
}
