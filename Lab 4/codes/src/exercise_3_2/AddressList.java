package exercise_3_2;

class AddressList {
	public static int countAddressWithCity(Address[] addressList, String city) {
		if(addressList.length == 0 || city.length() == 0)
			return -1;
		if(addressList == null || city == null)
			return -1;
		int count = 0;
		for(int i = 0; i < addressList.length; i++)
			if(addressList[i].getCity().equals(city))
				count++;
		return count;
	}
	
	public static int countAddressWithPin(Address[] addressList, String strP) {
		if(addressList.length == 0 || strP.length() == 0)
			return -1;
		if(addressList == null || strP == null)
			return -1;
		int count = 0;
		for(int i = 0; i < addressList.length; i++)
			if(addressList[i].getPin().startsWith(strP))
				count++;
		return count;
	}
	
	public static Address[] getAddressWithCity(Address[] addressList, String city) {
		if(addressList.length == 0 || city.length() == 0)
			return null;
		if(addressList == null || city == null)
			return null;
		int count = 0;
		for(int i = 0; i < addressList.length; i++)
			if(addressList[i].getCity().equals(city))
				count++;
		if(count == 0)
			return null;
		Address[] arr = new Address[count];
		for(int i = 0,j=0; i < addressList.length; i++)
			if(addressList[i].getCity().equals(city))
				arr[j++] = addressList[i];
		return arr;
	}
	
	public static Address[] getAddressWithPin(Address[] addressList, String strP) {
		if(addressList.length == 0 || strP.length() == 0)
			return null;
		if(addressList == null || strP == null)
			return null;
		int count = 0;
		for(int i = 0; i < addressList.length; i++)
			if(addressList[i].getPin().startsWith(strP))
				count++;
		if(count == 0)
			return null;
		Address[] arr = new Address[count];
		for(int i = 0,j=0; i < addressList.length; i++)
			if(addressList[i].getPin().startsWith(strP))
				arr[j++] = addressList[i];
		return arr;
	}
}


