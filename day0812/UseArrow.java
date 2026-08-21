/*
이 클래스는 현실의 사물을 표현하기 위함이 아니라, 단지 실행을 위해 
main()을 두기 위한 단순 클래스일 뿐이다.
*/

class  UseArrow
{
	public static void main(String[] args) 
	{
		// 화살 틀로부터 화살 1개 메모리에 생성
		// 객체지향 언어에서는 클래스를 하나의 자료형으로 봄
		// 즉 클래스를 사용자(=개발자) 정의 자료형이라 한다.
		Arrow arr = new Arrow();
		arr.move();
	}
}
