package ex09_hash;

/*
	몇몇 아이디가 있다
	각각의 해시코드를 몇몇 규칙으로 생성해보자
	1) 첫 글자에 따라서 해시코드를 정한다
				 	해시코드
		'apple' 	1
		'africa'	1
		'avatar'	1
		'banana'	2
		'bonus'		2
		'bravo'		2
	
	2) 글자수에 따라 해시코드를 정한다
			 		해시코드
		'apple' 	5
		'africa'	6
		'avatar'	6
		'banana'	6
		'bonus'		5
		'bravo'		5
	
	입력된 아이디를 검색하려고 한다
	검색의 속도를 높이기 위해서 'hash' 개념이 사용된다
	
	검색 예시)
		검색 아이디: 'april'
		사용 해시코드: 글자수
		동작
			1) 'april'의 해시코드를 구한다. => 5
			2) 해시코드가 5인 'apple', 'bonus', 'bravo' 중에서 'april'을 찾는다
*/

public class HashCodeMainClass {

	public static void main(String[] args) {
		
		Integer a=10;
		System.out.println("a의 해시코드: "+a.hashCode());
		
		Double b=1.5;
		System.out.println("b의 해시코드: "+b.hashCode());
		
		String str="hello";
		System.out.println("str의 해시코드: "+str.hashCode());
		
		// 지금까지 살펴 본 바
		// 내장된 클래스타입의 객체들은 나름의 해시코드가 있다

		Dog dog=new Dog();
		Cat cat=new Cat();
		System.out.println(dog);
		System.out.printf("%x\n",dog.hashCode()); // Object의 해시코드이다
		System.out.println(cat);
		System.out.printf("%x\n",cat.hashCode()); // Object의 해시코드이다
		// Object의 해시코드는 메모리 주소지이다
		// Object의 해시코드는 쓰레기다.. 해시코드의 역할을 수행하지 못 한다
		
		// HashSet과 HashMap의 공통점은
		// "중복이 불가능한 데이터가"가 있다는 점이다
		// 중복 확인 유무
		// 1.해시코드 확인한다. 해시코드가 같아야 다음 단계로 진행한다
		// 2.실제로 같은지 equals() 메소드로 비교한다 
		// 3.그 결과가 같으면 "중복 데이터"가 있는 것으로 판단한다 
		
	}

}

class Dog{}
class Cat{}



