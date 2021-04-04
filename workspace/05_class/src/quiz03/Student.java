package quiz03;

public class Student {
	
	// field
	String name;
	int kor, eng, mat;
	
	// method
	double getAverage() {
		return (kor+eng+mat) / 3.0;
	}
	String getPass() {
		return getAverage()>=60?"합격":"불합격";
	}
	
	void set(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		mat = m;
	}

}
