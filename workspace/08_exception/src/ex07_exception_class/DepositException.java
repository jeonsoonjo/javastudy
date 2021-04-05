package ex07_exception_class;

@SuppressWarnings("serial")
public class DepositException extends Exception {
	
	// 필드가 없는 경우

	// constructor
	public DepositException(String message) {
		super(message);
	}
	
}
