class Bicycle {
	int speed = 100;
	int noOfGears  =5;
	int cadence = 40;
	
	public void printState() {
		System.out.println("Bicycle [speed=" + speed + ", noOfGears=" + noOfGears + ", cadence=" + cadence + "]");
	}
	
	public static void main(String[] args){
		Bicycle b1 = new Bicycle();
		b1.printState();
	}
	
	
}