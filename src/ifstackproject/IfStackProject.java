package ifstackproject;

import stackpkg.*;

public class IfStackProject {

	public static void main(String[] args) {
		// 10 문자 크기의 빈 FixedStack 생성
		FixedStack s1 = new FixedStack(10);
		// 5 문자 크기의 빈 FixedStack 생성 
		FlexStack s2 = new FlexStack(5);
		// FixedStack과 FlexStack을 가리키는 Reference 변수 선언
		IfCharStack iStack;
		
		char ch;
		int i;
		iStack = s1;
		// 문자 몇 개를 fixed stack에 삽입
		for (i=0; i<11; i++) 
			iStack.push((char) ('가'+i));
		
		// 스택 내용을 출력
		System.out.print("Fixed Stack의 내용: ");
		for(i=0; i<11; i++) {
			ch = iStack.pop();
			System.out.print(ch);
		}
		System.out.println("");
		
		iStack = s2;
		// 문자 몇 개를 flexible stack에 삽입
		for (i=0; i<11; i++) 
			iStack.push((char) ('A'+i));
			
			// 스택 내용을 출력 
			System.out.print("Flexible Stack의 내용: ");
			for(i=0; i<12; i++) {
				ch = iStack.pop();
				System.out.print(ch);
			}
			System.out.println("");
		}	
	}

