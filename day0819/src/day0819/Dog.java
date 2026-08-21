package day0819;

public class Dog {
	String name = "puppy";
	int age = 3;
	
	public int getAge() {
		return age;
	}
	
	/*
	 * 이 클래스를 정의한 개발자가 생성자를 정의하지 않았으므로, 만일 외부에서
	 * 이 클래스를 대상으로 new할 경우 에러가 날 수 있다
	 * 따라서 java에서는 적어도 최소한 에러는 나지 않도록
	 * 눈에 보이지는 않지만, 기본적인 기능만 하는 디폴트 생성자를 지원해줌
	 * public Dog(){} 가 컴파일러에 의해 자동 정의되어 있음
	 * 중요! 만일 개발자가 단 하나라도 생성자를 정의하면 더이상 컴파일러는 관여하지 않음.
	 * */
	
	public Dog(int age) {
		this.age = age;
	}
	// 생성자도 메서드이다. 따라서 메서드 오버로딩이 생성자에서도 당연히 가능
	public Dog() {
		
	}
}
