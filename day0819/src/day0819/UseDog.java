package day0819;

public class UseDog {
	public static void main(String[] args) {
		new Dog(5);
		Dog d = new Dog(7);
		System.out.println(d.name);
		
		System.out.println(d.getAge());
		
		// 정의되지 않은 메서드를 사용하려고 했으므로, 
		// 아래 코드는 당연히 에러남
		// String s = d.getName();
		
		// 아래의 코드의 경우 에러가 나지 않는 이유
		// 아래의 Dog() 는 분명히 메서드임
		// 하지만 new 연산자뒤에서 언제나 호출되는 메서드를
		// 생성자 메서드라 하는데, 만일 개발자가 생성자를 정의 하지 않으면
		// 최소한 에러는 나지 않도록 컴파일러에 의해
		// 디폴트로 정의가 되기 때문에 에러가 나지 않았던 거임
		 new Dog(9);		
	}
}
