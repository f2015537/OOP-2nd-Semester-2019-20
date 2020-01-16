
public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l2r = 0d;
		double r2l = 0d;
		for(double i = 1; i <= 5000d; i+=1d) {
			l2r += 1d/i;
			r2l += 1d/(5001d-i);
		}
		System.out.println(l2r-r2l);
	}

}
