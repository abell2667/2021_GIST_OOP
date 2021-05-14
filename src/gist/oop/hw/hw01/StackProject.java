package gist.oop.hw.hw01;

public class StackProject {
	   public static void main(String[] args) {
	       // 1. construct 10-element empty stack
	       Stack s1 = new Stack(10);
	       
	       // 2. construct stack from array
	       char name[] = {'김', '하', '늘'}; 
	       Stack s2 = new Stack(name);
	       
	       char ch;
	       int i;
	       // push some characters into s1
	       for(i=0; i < 11; i++)
	    	   s1.push((char) ('가' + i));
	       
	       // 3. construct stack from another stack
	       Stack s3 = new Stack(s1);
	       
	       ch = s1.pop();
	       
	       // Show the stacks.
	       System.out.print("Stack s1의 내용: "); 
	       for(i=0; i < 10; i++) {
	          ch = s1.pop();
	          System.out.print(ch);
	       }
	       System.out.println();
	       
	       System.out.print("Stack s2의 내용: "); 
	       for(i=0; i < 3; i++) {
	          ch = s2.pop();
	          System.out.print(ch);
	       }
	       System.out.println();
	       
	       System.out.print("Satck s3의 내용: "); 
	       for(i=0; i < 10; i++) {
	          ch = s3.pop();
	          System.out.print(ch);
	       }
	       System.out.println();
	   }
}