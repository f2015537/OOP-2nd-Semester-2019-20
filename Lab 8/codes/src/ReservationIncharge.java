import java.util.LinkedList;

public class ReservationIncharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReservationCounter counter = ReservationCounter.InitializeCounter();
		counter.standInLine("Amitabh");
		counter.standInLine("Aamir");
		counter.standInLine("Salman");
		counter.standInLine("Tom Cruise");
		for(int position = 0; position < counter.customersInLine(); position++) {
			System.out.println("Customer at " + (position+1) + " place in the line is " + counter.checkTheCustomerAt(position));
		}
		System.out.println("Ticket given to " + counter.giveTicket());
		counter.leaveTheLine();
		counter.standInLine("Emma Watson");
		System.out.println("Ticket given to " + counter.giveTicket());
		counter.leaveTheLine();
		System.out.println("customer in position 2 is " + counter.checkTheCustomerAt(1));
		System.out.println("Still there are " + counter.customersInLine() + " people in line");
	}

}

class ReservationCounter {
	LinkedList ReservationQueue;
	
	private ReservationCounter() {
		ReservationQueue = new LinkedList();
	}
	
	public void standInLine(String customer) {
		ReservationQueue.add(customer);
	}
	
	public void leaveTheLine() {
		ReservationQueue.remove();
	}
	
	public String giveTicket() {
		return (String)ReservationQueue.getFirst();
	}
	
	public String checkTheCustomerAt(int position) {
		return (String)ReservationQueue.get(position);
	}
	
	public static ReservationCounter InitializeCounter() {
		return new ReservationCounter();
	}
	public int customersInLine() {
		return ReservationQueue.size();
	}
}