import java.util.Scanner;
class PointC{
	private double x;
   	private double y;
    	PointC() {
        	this.x = 0;
        	this.y = 0;
    	}
    	PointC(double x, double y) {
        	this.x = x;
        	this.y = y;
    	}
    	public double getX(){ 
		return x;
	}
    	public double getY() { 
		return y; 
	}
    	public void setX(double x) { 
		this.x = x; 
	}
    	public void setY(double y) { 
		this.y = y; 
	}

    	public static double distance(PointC p1, PointC p2) {
       		return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    	}

    	public void display() {
        	System.out.printf("%7.2f %7.2f\n", x, y);
    	}
}   


