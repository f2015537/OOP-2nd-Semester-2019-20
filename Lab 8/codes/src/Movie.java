
public class Movie {
	interface Bookable {
		public void printTicket();
		public void giveTicket(String movie);
	}
	
	public void BookTheTicket() {
		class EnglishMovie implements Bookable {
			String name;
			@Override
			public void printTicket() {
				// TODO Auto-generated method stub
				giveTicket("BlindDate");
			}

			@Override
			public void giveTicket(String movie) {
				// TODO Auto-generated method stub
				name = movie;
				System.out.println("You have booked for the movie " + name);
			}
			
		}
		
		Bookable hollywood = new EnglishMovie();
		Bookable hindiMovie = new Bookable() {

			@Override
			public void printTicket() {
				// TODO Auto-generated method stub
				giveTicket("Bachna Ae Haseeno");
			}

			@Override
			public void giveTicket(String movie) {
				// TODO Auto-generated method stub
				String name = movie;
				System.out.println("You have booked for the movie " + name);
			}
			
		};
		
		hollywood.printTicket();
		hindiMovie.printTicket();
	}
	
	public static void main(String[] args) {
		Movie easyMovie = new Movie();
		easyMovie.BookTheTicket();
	}
}
