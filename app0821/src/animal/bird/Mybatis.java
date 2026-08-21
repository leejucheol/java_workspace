package animal.bird;

public class Mybatis extends Bird{
	
	// 상속관계에서 부모 클래스에 매개변수가 있는
	/* 생성자만 정의되어 있을 경우, 자식객체에 앞서 부모가 먼저 초기화 되어야함 
		이 규칙으로 자식 클래스의 생성자 내부에는 무조건 부모의 생성자 호출이
		무조건 실행되므로 개발자가 부모생성자 메서드의 올바른 호출 
		즉 매개변수값을 넘겨야함. */
	
	public Mybatis(){
		// 상속관계에서 부모의 초기화보다 시급한 것은 없기 때문에 super()이전 라인에는 어떤 코드도 올 수없음.
		super(true); //부모 초기화
	//개발자가 작성하지 않아도 무조건 들어있음
	}
	
	public void jack(){
		System.out.println("jack");
	}
	
	public static void main(String[] args) {
		
	}
}