import java.util.Scanner;
public class Complex {
    	double real, imag;

    	Complex(double r, double i) {
        	real = r;
        	imag = i;
    	}

    	Complex add(Complex complex) {
        	return new Complex(this.real + complex.real, this.imag + complex.imag);
    	}

    	Complex subtract(Complex complex) {
        	return new Complex(this.real - complex.real, this.imag - complex.imag);
    	}

    	Complex multiply(Complex complex) {
        	double realPart = this.real * complex.real - this.imag * complex.imag;
        	double imagPart = this.real * complex.imag + this.imag * complex.real;
        	return new Complex(realPart, imagPart);
    	}

    	void display() {
        	if (imag >= 0)
            		System.out.println(real + " + " + imag + "i");
        	else
            		System.out.println(real + " - " + Math.abs(imag) + "i");
    	}

    	public static void main(String[] args) {
        	Scanner scan = new Scanner(System.in);
        	System.out.println("Pragya Kochhar, 24csu155");
        	System.out.print("Enter real part of first number: ");
        	double r1 = scan.nextDouble();
        	System.out.print("Enter imaginary part of first number: ");
        	double i1 = scan.nextDouble();
        	System.out.print("Enter real part of second number: ");
        	double r2 = scan.nextDouble();
        	System.out.print("Enter imaginary part of second number: ");
        	double i2 = scan.nextDouble();
        	Complex c1 = new Complex(r1, i1);
        	Complex c2 = new Complex(r2, i2);
        	Complex sum = c1.add(c2);
        	Complex diff = c1.subtract(c2);
        	Complex prod = c1.multiply(c2);
        	System.out.print("Sum: ");
        	sum.display();
        	System.out.print("Difference: ");
        	diff.display();
        	System.out.print("Product: ");
        	prod.display();
    	}
}
