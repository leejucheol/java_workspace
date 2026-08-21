package day0819;

public class Bird {
//	모든 OOP에서 결국 클래스 안에 작성할 수 있는 요소는 변수와 함수밖에 없음
//	즉 클래스는 변수와 함수를 모아놓은 단위를 의미
//	클래스 안에 정의된 함수인 메서드에 대해 학습
//	
	String name = "mybatis";
	
	// 자바에서의 메서드 시그니처는 다음을 따름
//	접근제한자 반환형 메서드명
	public String getName() {
		return name;
	}
	
	// this 인스턴스가 자기 자신을 가르키는 변수
	
	
	public void setName() {
		this.name="saparrow";
	}
	
	public void setName(String name) {
		this.name=name; 
	}
	
	public static void main(String[] args) {
		Bird b = new Bird();
		b.name = "독수리";
		
	}
	
}
