package stackpkg;

public class FixedStack implements IfCharStack{
	private char s[]; // 문자 스택을 담고있는 배열
	private int toploc; // 삽입과 삭제가 발생하는 스택 top을 가리킴.
						// 즉, 저장된 문자 데이터의 개 수 정보를 갖는 변수
	// 주어진 크기의 빈 스택을 만드는 생성자
	public FixedStack(int size) {
		s = new char[size]; // 스택 저장공간을 할당
		toploc = 0; 		// 스택 top을 초기
	}
	
	// 주어진 문자를 스택에 삽입하는 메소드
	@Override
	public void push(char ch) {
		if (toploc == s.length) { // 스택이 가득차 있는지 check
			System.out.println("\n- 스택이 가득차 있음 -");
			return;
		}
		s[toploc++] = ch; // 스택 top에 문자를 복사하고 top을 증가시킴 
	}
	
	// 스택의 top으로부터 문자를 읽어오는 메소드
	@Override
	public char pop() {
		if (toploc == 0) { // 스택이 비어 있는지 check
			System.out.println("\n- 스택이 비어 있음 -");
			return (char) 0;
			
		}
		return s[--toploc]; // 스택 top에서 문자를 읽어들이고 top을 감소시킴 
	}
}
