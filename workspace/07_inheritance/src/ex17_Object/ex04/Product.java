package ex17_Object.ex04;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Getter
@Setter
@NoArgsConstructor
public class Product {

	// field
	private String model;
	private String manufacturer;
	private String date;
	
	// constructor
	public Product(String model, String manufacturer, String date) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.date = date;
	}

	// method
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj) { // p1.equals(p1) 무조건 같다는 의미
			return true;
		}
		if(obj instanceof Product) { // p1.equals(p2) 
			Product p=(Product)obj; // Product타입으로 캐스팅
			// 모델과 제조사를 비교해서 동일하면 true, 아니면 false
			
			// p1.equals(p2)인 경우,
			// p1의 모델 : model
			// p2의 모델 : p.model
			if(model.equals(p.model)&&manufacturer.equals(p.manufacturer)) { // 모델명과 제조사가 모두 같으면
				return true;
			} else {
				return false;
			}
		}
		return false; // obj가 Product 자체가 아니라는 의미
	}
	
}
