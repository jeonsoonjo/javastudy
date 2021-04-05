package quiz01;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {

	// field
	private int mNo; // 회원번호
	private String mId; // 회원아이디
	private Date mDate; // 회원가입일
	
	// constructor
	public Member(int mNo, String mId, Date mDate) {
		super();
		this.mNo = mNo;
		this.mId = mId;
		this.mDate = mDate;
	}

	// method
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	// Object클래스의 toString() 오버라이드
	@Override
	public String toString() {
		return "Member [mNo=" + mNo + ", mId=" + mId + ", mDate=" + mDate + "]";
	}
	
}
