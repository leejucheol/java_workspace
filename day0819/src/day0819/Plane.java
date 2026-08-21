package day0819;

public class Plane {
	
	/*
	 * 프로그래밍 언어 개발 시 메서드명 변수명을 지어낼때 신중하고 직관성을 부여해야함
	 * 타인과 협업할 때 업무의 효율성 때문 유지보수성 높이기 위함
	 * 하지만 단어는 한정되어 있기 때문에, 만일 로직이 비슷할 경우 java에서는 
	 * 굳이 메서드명을 새롭게 정의하려고 할 필요없음
	 * 또한 로직이 비슷할 경우 전혀 다른 단어를 사용한다면, 유지보수성이 떨어짐
	 * 해결책은 메서드명을 그대로 중복해서 사용해도됨
	 * 단 원칙은 메서드명은 동일하게 정의하되 매개변수의 지료형과 갯수를 다르게 해야함
	 * 동일할 경우는 중복정의 에러가 발생함
	 * 
	 * 결론: 하나의 클래스 내에서 메서드명을 중복정의 할 수 있는 기법을 메서드 오버로딩이라고 함 (메서드 중첩) overLoading
	 * */
	public void fly() {
		System.out.println("flying");
	}
	public void fly(String speed) {
		System.out.println("flying");
	}
	public void fly(int velocity) {
		System.out.println("flying");
	}
}
