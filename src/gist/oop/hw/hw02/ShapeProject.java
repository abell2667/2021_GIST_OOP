/**
 * Shape Project 프로그램
 * 
 * @author LeeJia
 */

package gist.oop.hw.hw02;

class Shape {
	private String name;
	// 도형 이름 변수가 있는 생성자
	Shape(String s) {
		name = s;
	}
	// 이름 필드를 리턴하는 메소드
	String getName() { return name; }
	// 도형 면적을 구하는 메소드, 서브 클래스에 의해 오버라이딩
	public double area() { return -1; }
}

class Circle extends Shape {
	protected double r; // 원의 지름
	// 원의 지름 변수가 있는 생성자
	public Circle (double r) {
		super("Circle");
		this.r = r;
	}
	// 원의 지름을 리턴하는 메소드
	public double getRadius() { return r; }
	// 원 면적을 계산하는 메소드
	@Override
	public double area() { return (3.14)*r*r; }
}

class Rectangle extends Shape {
	protected double w, h; // 사각형 넓이와 높이
	// 사각형 넓이와 높이 변수가 있는 생성자
	public Rectangle(double w, double h) {
		super("Rectangle");
		this.w = w;
		this.h = h;
	}
	// 사각형 넓이를 리턴하는 메소드 
	public double getWidth() { return w; }
	// 사각형 높이를 리턴하는 메소드
	public double getHeight() { return h; }
	// 사각형 면적을 계산하는 메소드
	@Override
	public double area() { return w*h; }
	
}

public class ShapeProject {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3]; //  Shape 객체 배열을 생성
		
		// Shape 객체를 생성
		shapes[0] = new Circle(3.0);
		shapes[1] = new Rectangle(2.0, 3.0);
		shapes[2] = new Rectangle(4.0, 1.0);
		for (int i=0; i<shapes.length; i++) {
			System.out.println("객체는 "+shapes[i].getName());
			System.out.println("면적은 "+shapes[i].area());
			System.out.println();
		}

	}

}
