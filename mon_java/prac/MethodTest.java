class Student{
	String name;
	int age;	
}

class MethodTest {
	public static void main(String [] args) {
		Student s = new Student();
		System.out.println("main() 영역 - 메서드 호출 전");
		printData(s);
		System.out.println("main() 영역 - 메서드 호출 후");
		System.out.println("s.name" + s.name);
		System.out.println("s.age: " + s.age );
}

	// 메서드 선언
	static void printData(Student d) {
		d.name = "Lee";
		d.age = 30;
		System.out.println("printDate() 영역");
		System.out.println("d.name" + d.name);
		System.out.println("d.age: " + d.age );

		// return 3;  경우에는 void가 아니라 int로 변경
		// return 2.3; 경우에 double이라 함
	}
}