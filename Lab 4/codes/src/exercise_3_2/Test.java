package exercise_3_2;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address[] addressList = new Address[3];
		addressList[0] = new Address("CVR$Bhavan$BITS$Pilani$Rajasthan$333031");
		addressList[1] = new Address("Ram$Bhavan$BITS$Pilani$Rajasthan$333032");
		addressList[2] = new Address("Krishna$Bhavan$BITS$Pilani$Rajasthan$333033");
		
		System.out.println(AddressList.countAddressWithCity(addressList, "Pilani"));
		System.out.println(AddressList.countAddressWithPin(addressList, "33303"));
		System.out.println(Arrays.toString(AddressList.getAddressWithCity(addressList, "Pilani")));
		System.out.println(Arrays.toString(AddressList.getAddressWithPin(addressList, "33303")));
		
		
	}

}
