import java.util.Scanner;

class OperatorEx25 {
	public static void main (String args[]){
		Scanner scanner = new Scanner (System.in);
		char ch = ' ';

		System.out.print("문자를 입력: " + ch);

		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if('0' <= ch && ch <= '9') {
			System.out.println("입력한 문자는: 숫자입니다.");
		}

		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("입력한 문자는: 문자입니다.");
		}
	}
}
		