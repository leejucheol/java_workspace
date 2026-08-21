// 지금까지는 모든 클래스를 하나의 디렉토리에 몰아서 위치 시킴
// 클래스들간의 패키지 관계를 생각할 필요 없음
// 하지만 지금부터는 현재 클래스와는 전혀 다른 패키지에 위치한 다른 클래스를 접근하고 사용

package use;
// duck의 경ㅇ우 스임을 당하므로 public 으로 클래스를 공개해야함
// 하지만, 아래의 클래스를 duck으로 쓰는 입장이므로 공개할 필요 없음
// 자바에서는 디렉토리 -> 패키지 디렉토리간 구분은 .으로
// 패키지로 선언된 클래스를 실행하려면 아래의 옵션을 붙여야함
// java use.UseDuck으로 실행해야함 패키지명을 . 찍고 명시해야함.

import animal.Duck;

class  UseDuck
{
	public static void main(String[] args){
		Duck d = new Duck();
		System.out.println("오리 이름은 " + d.getName());
	}
}
