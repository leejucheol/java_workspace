package day0819;

// 자바 클래스안에 선언된 멤버변수는 보호되야함
// 따라서 선언시 외부에서 접근하지 못하도록 막아야함.
public class Account {
	// 		private 			> protected 		> default 	   > public
	//   모든 외부노출 금지   	  같은 패키지 및 상속 관계		같은 패키지만  		공개(노출)
	private int balance = 5000000;
	private String bankName;
	private String owner;
	
	// 위의 변수를 private 으로 선언하는 순간, 나(나의 인스턴스 영역) 이외에는 
	// 아무도 접근할 수 없다.
	
	// 해결책 - private 으로 선언된 변수를 제어할 수 있는 방법을 제공해야함
	// 변수를 제어한다는 것은 2가지 경우를 의미
	// 1) 값을 반환
	public int getBalance() {
		return balance;
	}
	// 2) 값을 변경 Setter 계열의 메서드로 변경이 가능하도록 메서드 정의
	public void setBalance(int balance) {
		// 멤버 메서드 이므로 this로 스스로의 인스턴스를 가리킬 수 있다
		// 즉 같은 인스턴스내에 존재하는 변수들을 접근할 수 있다.
		this.balance=balance;
	}
	
	// 이와 같이 멤버변수를 private으로 묶어서 보호하고, 이 변수에 대한 접근은 getter/setter 메서드로 
	// 데이터를 제어할 수 있도록 클래스를 정의하는 기법을 객체지향의 여러 특징 중 캡슐화라 한다. Encapsulation
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName=bankName;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
