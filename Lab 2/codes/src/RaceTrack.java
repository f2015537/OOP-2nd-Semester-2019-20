
public class RaceTrack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(2019, "Toyota", 50d);
		System.out.println(c1.getYear());
		System.out.println(c1.getMake());
		System.out.println(c1.getSpeed());
		c1.Accelerate();
		System.out.println(c1.getSpeed());
		c1.Accelerate(10);
		System.out.println(c1.getSpeed());
		c1.Break(9);
		System.out.println(c1.getSpeed());
//		Car c2 = new Car(); Compilation Error
	}

}
