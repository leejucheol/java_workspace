package day0819;

public class Car {
	private String color;
	private int price;
	
	//생성자는 반환값을 두면 안됨
	// 만일 두면 일반 메서드가 되어버림 new 연산자 뒤에 호출되지 않아요
	
	public Car() {
		color = "red";
		price = 500;
	}
	public Car(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	// 생성자도 메서드이므로 오버로딩 가능
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
