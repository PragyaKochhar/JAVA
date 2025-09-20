class Triangle{
	int a,b,c;

	public void printArea(){
		double s = (a+b+c)/2.0;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area of triangle is: "+area);
	}
	public void printPerimeter(){
		double perimeter;
		perimeter = a+b+c;
		System.out.println("The perimeter of triangle is: "+perimeter);
	}
	public static void main(String[] args){
		Triangle t1 = new Triangle();
		t1.a=3;
		t1.b=4;
		t1.c=5;
		t1.printArea();
		t1.printPerimeter();
	}
}