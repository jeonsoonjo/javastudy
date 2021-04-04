package ex07_exception_class;

@SuppressWarnings("serial")
public class WithdrawException extends Exception {
	
	// 필드가 있는 경우
	
	// field
	private int errorCode;
	
	// constructor
	public WithdrawException(String message, int errorCode) {
		super();
		this.errorCode=errorCode;
	}

	// method
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
}
