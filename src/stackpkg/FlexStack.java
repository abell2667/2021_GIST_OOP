package stackpkg;

public class FlexStack implements IfCharStack{
	private char s[]; // 스택 문자 데이터를 담고있는 배열
	private int toploc; // 삽입과 삭제가 발생하는 스택 top을 가리킴.
						// 즉, 저장된 문자 데이터의 개 수 정보를 갖는 변수
	// 주어진 크기의 빈 스택을 만드는 생성자
	public FlexStack(int size) {
		s = new char[size]; // 스택 저장공간을 할당
		toploc = 0; 		// 스택 top을 초기화
	}
	
	// 주어진 문자를 스택에 삽입하는 메소드
	@Override
	public void push(char ch) {
		if (toploc == s.length) { // 스택이 가득차 있는지 check
			// 크기가 2배인 새로운 스택을 생성
			char t[] = new char[s.length * 2];
			// 저장된 문자들을 새로운 스택에 저장
			for (int i = 0; i < toploc; i++)
			    t[i] = s[i];
			s = t;
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
