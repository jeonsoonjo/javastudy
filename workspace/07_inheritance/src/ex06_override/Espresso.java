package ex06_override;

import lombok.Getter;
import lombok.Setter;

// 에스프레소는 커피이다
// 커피=슈퍼, 에스프레소=서브
@Getter
@Setter
public class Espresso extends Coffee {

	// field
	private int water;
	
	// constructor
	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	} // getter, setter 자동 생성 -> 소스 -> 필드가 있을 때, 없을 때 구분해서 생성

	// method
	// Espresso 클래스는 이미 Coffee 클래스의 메소드를 사용할 수 있다
	// Espresso 클래스가 Coffee 클래스의 taste() 메소드를 사용하는 것이 적절한가??
	// No! Espresso 클래스는 자신의 맛을 표현하기 위해서 새롭게 taste() 메소드를 생성한다
	
	// 즉,
	// 메소드 오버라이드(method override)
	// 슈퍼클래스의 메소드를 사용하지 않기 위해 
	// 서브클래스가 메소드를 다시 만드는 것을 의미한다
	// 유사단어인 오버로딩과는 전혀 다른 의미이므로 주의!
	
	// 오버라이드 주의점
	// 1. 똑같은 형태로 만들어야 한다. 그렇지 않으면 오버라이드가 아님
	// 2. @Override annotation을 작성한다
	// 	  1) 개발자가 java에게 "이 메소드는 오버라이드 하는 것"이라고 알리는 것이다
	//	  2) 그러면 java는 오버라이드 규칙을 어겼을 경우, 오류를 발생시킨다(똑같이 만들었는 지 점검해준다)
	@Override
	public void taste() {
		System.out.println("에스프레소는 향이 좋지만 맛은 약간 쓰다");
	}
	
}
