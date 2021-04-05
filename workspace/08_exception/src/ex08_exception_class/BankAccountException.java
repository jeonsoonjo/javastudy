package ex08_exception_class;

@SuppressWarnings("serial")
public class BankAccountException extends Exception {
	
	// field
	private int errorCode;
	
	// constructor
	public BankAccountException(String message, int errorCode) {
		super(message); // Exception 클래스로 message를 전달하면 예외메시지로 생성된다
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
