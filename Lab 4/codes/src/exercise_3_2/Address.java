package exercise_3_2;

import java.util.Arrays;

class Address {
	private String line1;
	private String line2;
	private String line3;
	private char[] city;
	private char[] state;
	private String pin;
	
	public Address(String input) {
		String[] arr = input.split("\\$");
		line1 = arr[0];
		line2 = arr[1];
		line3 = arr[2];
		city = arr[3].toCharArray();
		state = arr[4].toCharArray();
		pin = arr[5];
	}

	public String getLine1() {
		return line1;
	}

	public String getLine2() {
		return line2;
	}

	public String getLine3() {
		return line3;
	}

	public String getCity() {
		return new String(city);
	}

	public String getState() {
		return new String(state);
	}

	public String getPin() {
		return pin;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", line3=" + line3 + ", city=" + Arrays.toString(city)
				+ ", state=" + Arrays.toString(state) + ", pin=" + pin + "]";
	}
	
	
	
}
