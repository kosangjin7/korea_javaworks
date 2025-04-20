package reference.circle;

public class Circle {

	Point center;
	int radius;
	final double PI=3.1415;
	
	public Circle(int x,int y,int radius) {
		
		center=new Point(x,y);
		this.radius=radius;
	}
	
	public double getArea() {
		double area=return PI*radius*radius
		return area;		
	}
	
	
	public void showCircleInfo() {
		System.out.println("원의 중심은("+center.getX());+","+center.getY+")이고,반지름은"+radius
	}
	
}
