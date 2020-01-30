package ComplexNumbers;

public class Complex {
	private double realPart;
	private double imaginaryPart;
	
	public Complex() {
		realPart = 0d;
		imaginaryPart = 0d;
	}

	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public Complex(Double ...c) {
		if(c.length == 1) {
			realPart = c[0];
			imaginaryPart = 0d;
		}
		else if(c.length > 1) {
			realPart = c[0];
			imaginaryPart = c[1];
		}
	}
	
	public Complex add(Complex otherNumber) {
		return new Complex(realPart+otherNumber.realPart, imaginaryPart+otherNumber.imaginaryPart);
	}
	
	public Complex subtract(Complex otherNumber) {
		return new Complex(realPart-otherNumber.realPart, imaginaryPart-otherNumber.imaginaryPart);
	}
	
	public Complex multiply(Complex otherNumber) {
		double a = realPart;
		double j = imaginaryPart;
		double b = otherNumber.realPart;
		double k = otherNumber.imaginaryPart;
		return new Complex(a*b-j*k,a*k+j*b);
	}
	
	public Complex divide(Complex otherNumber) {
		double a = realPart;
		double j = imaginaryPart;
		double b = otherNumber.realPart;
		double k = otherNumber.imaginaryPart;
		return new Complex((a*b+j*k)/(b*b+k*k),(b*j-a*k)/(b*b+k*k));
	}

	public double getRealPart() {
		return realPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public double getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}

	@Override
	public String toString() {
		return "Complex [realPart=" + realPart + ", imaginaryPart=" + imaginaryPart + "]";
	}
	
	
}
