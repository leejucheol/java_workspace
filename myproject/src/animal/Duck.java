// 이 클래스는 animal 패키지에 들어있음을 선언
package animal;

// 패키지에 넣은 클래스는 다른 외부 패키지에서 접근할 경우 안보이기 때문에
// public으로 공개해야함
// 아래의 클래스를 javac 명령어로 컴파일 할때, 아무런 옵션을 주지 않으면
// .class파일이 같은 디렉토리에 생성되어짐
// 실무에서는 .java랑 .class는 같은 디렉토리에 두지 않고 분리함
// 해결책은 javac 명령어의 옵션 중 컴파일 결과 파일의 위치를 지정할 수 있는 
// 옵션이 존재 ) javac -d 원하는 경로 

public class Duck
// 개발자가 멤버변수에 아무런 접근 
// 제한자를 명시하지 않으면 기본
// 접근제한자인 default 접근제한자가 적용됨
// 같은 패키지에 있는 클래스만 접근가능
//
//
{
	private String name = "집오리";
	int age = 3;
	String color= "white";
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
}


