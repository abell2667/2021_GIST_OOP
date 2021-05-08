package gist.oop.hw.hw01;

/**
 * 문자 Stack 프로그램 *
 * @author 이지아 20205143
 */

class Stack {

	private char data[] ; // 스택 문자 데이터를 담고있는 배열

	private int top; // 삽입과 삭제가 발생하는 스택 top을 가르킴. 즉, 저장된 문자
						 // 데이터의 개 수 정보를 갖는 변수
	
	// 1. 주어진 크기의 빈 스택을 만드는 생성자
	Stack(int size) {
		data = new char[size];	// 스택 저장공간을 할당
		top = 0;			// 스택 top을 초기화
	}

	// 2. 주어진 스택과 동일한 스택을 만드는 생성자
	Stack(Stack ob) {
		top = ob.top; // 스택 top을 일치시킴
		data = new char[ob.data.length]; // 스택 저장공간 할당 
		// 스택 배열 element들을 복사
		for(int i = 0; i < ob.data.length; i++)
			data[i] = ob.data[i];	
	}

	// 3. 주어진 문자 배열로 스택을 만드는 생성자
	Stack(char a[]) {
		top = 0 ;			// 스택 top을 초기화
		data = new char[a.length];	// 스택 저장공간 할당
		// 스택 배열 element들을 복사
		for(int i = 0; i < a.length; i++)
			push(a[i]);
	}
	
	// 주어진 문자를 스택에 삽입하는 메소드
	void push(char ch) {
		if (top == data.length) { // 스택이 가득차 있는지 check
			System.out.println("\n- 스택이 가득차 있음 -");
			return;
		}

		data[top++] = ch ; // 스택 top에 문자를 복사하고 top을 증가시킴
	}

	// 스택의 top으로부터 문자를 읽어오는 메소드
	char pop() {
		if (top == 0) { //스택이 비어 있는지check
			System.out.println("\n- 스택이 비어 있음 -");
			return (char)0;
		}

		return data[--top] ; // 스택 top에서 문자를 return시키고 top을 감소시킴 }
	}

}