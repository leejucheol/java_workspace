class Student {
	static int point = 50; 
	// 위 해당 클래스를 이용하여 인스턴스화 한 모든 인스턴스가 공유하는 변수
	// - Method Area에 별도로 생성됨
	// - 인스턴스화 하지 않아도 사용이 가능
	// - 접근방법
		// - 참조변수명.클래스변수명
		// - 클래스명.클래스변수명

	String name;
	int score;
}

class StudentTest {
	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2 = new Student();

		s1.point = 12;
		s2.point = 25;

		s1.name = "lee";
		s2.name = "kang";

		System.out.println("point : " + s1.point);
		System.out.println("point : " + s2.point);
		System.out.println("name : " + s1.name);
		System.out.println("name : " + s2.name);
	}
}