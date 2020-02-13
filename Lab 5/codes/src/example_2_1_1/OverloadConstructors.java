package example_2_1_1;

class Room {
	double length, breadth, height;
	
	Room() {
		super();
		length = -1d;
		breadth = -1d;
		height = -1d;
	}

	Room(double length, double breadth, double height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	Room(double length) {
		super();
		this.length = this.breadth = this.height = length;
	}
	
	double volume() {
		return length*breadth*height;
	}
	
}

class OverloadConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room a = new Room(20,30,40);
		Room b = new Room();
		Room c = new Room(10);
		double vol;
		vol = a.volume();
		System.out.println("Volume of room a is " +vol);
		
		vol = b.volume();
		System.out.println("Volume of room b is " +vol);
		
		vol = c.volume();
		System.out.println("Volume of room c is " +vol);
	}

}
