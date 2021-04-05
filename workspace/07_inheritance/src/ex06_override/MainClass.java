package ex06_override;

import lombok.Data;

@Data
public class MainClass {

	public static void main(String[] args) {
		
		Coffee coffee=new Coffee("콜롬비아");
		coffee.taste();
		
		Espresso espresso=new Espresso("인도네시아", 30);
		espresso.taste();

	}

}
