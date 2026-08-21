package animal.bird;

/*
class 존재 이유
- 일반적인 새들이 갖는 공통 기능 및 특징을 보유할 수 있는 새들의 최상위 객체를 의미
- 공통코드를 여기 정의하면 추후 자식 클래스 작성할 때
동일한 코드 작성할 필요가 없음 --> 유지보수성이 올라감 (비용이 커지기에 중복성은 최소화 해야함)
*/

// 자바에는 기본적으로 최상위 객체인 object 클래스가 이미 상속관게의 부모로 지정됨
// bird의 생성자에는 눈에 보이지는 않지만, super()가 생략되어 있어, 
// super()에 의해 object의 초기화가 진행
public class Bird{
	boolean hasNib = true;
	
	public void fly(){
		System.out.print("fly");
	}
	
	// 개발자가 생성자를 정의했으므로, 컴파일러가 관여하지 않음
	public Bird(boolean hasNib){
		this.hasNib = hasNib;
		System.out.println("생성자 호출");
	}
	
	// 개발자가 생성자를 정의하지 않으면 디폴트 생성자가 컴파일러에 의해 정의됨
	/*
	public Bird(){}
	*/
}