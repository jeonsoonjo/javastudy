package ex09_hash;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {
	
	/*
		HashSet에 Board를 저장하고자 한다
		동일한 Board의 경우 저장이 안 되도록 설정해야 한다
		1. 자바의 기본 동작
			1) 저장할 Board의 해시코드를 확인한다
			2) 같은 해시코드를 가지고 있는 Board가 있나?? 없다. 중복 불가
			3) 따라서 같은 Board는 없다고 판단한다
			4) 무조건 저장된다
		2. 추가해야 할 작업
			1) 같은 Board는 같은 해시코드를 가질 수 있도록 hashCode() 메소드를 오버라이드한다
			2) 같은 Board인지 비교할 수 있는 equals() 메소드를 오버라이드한다
			3) 같은 해시코드를 가지고, equals() 결과가 true이면 동일한 Board가 있다고 판단되어 저장되지 않는다
		3. 최종결론
			Hash 기반의 컬렉션프레임워크(HashSet, HashMap 등)에 저장할 객체들은
			모두 Generate hashCode() and equals()를 추가해 준다 
	*/
	
	// field
	private int bNo;
	private String title;
	private String writer;
	
	// method
	@Override
	public String toString() {
		return "[bNo=" + bNo + ", title=" + title + ", writer=" + writer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bNo;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if (bNo != other.bNo)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}
	
	/* 직접 작성한 hashCode와 equals(이렇게 된다~는 개념만 알아두기)
		@Override
		public int hashCode() { // 해시코드를 정하는 건 무수히 많다. 예를 들어, 
			// return title.length(); // title의 글자수가 같으면 같은 게시글일 가능성이 있다
			// return title.length()+writer.length(); // 글자수를 합쳐서.. 등등 무수히 많음
			// 이클립스가 알아서 해시코드를 정해준다
			return title.length()+writer.length();
		}
		@Override
		public boolean equals(Object obj) {
			if(this==obj) {
				return true;
			}
			if(obj instanceof Board) {
				Board board=(Board)obj;
				return this.bNo==board.bNo; // 게시글번호(bNo)가 같으면 같은 Board이다
			}
			return false;
		}
	*/
	
}

