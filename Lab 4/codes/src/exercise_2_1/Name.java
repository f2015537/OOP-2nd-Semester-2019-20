package exercise_2_1;

import java.util.StringTokenizer;

class Name {
	private String fname;
	private String mname;
	private String lname;
	
	public String getFname() {
		return fname;
	}
	public String getMname() {
		return mname;
	}
	public String getLname() {
		return lname;
	}
	
	public String getName() {
		return fname+" "+mname+" "+lname;
	}
	
	@Override
	public String toString() {
		return fname+mname+lname;
	}
	
	Name(String name) {
		StringTokenizer st = new StringTokenizer(name,";,");
		fname = st.nextToken();
		mname = st.nextToken();
		lname = st.nextToken();
		
		if(name.contains(";")) {
			String temp = lname;
			lname = fname;
			fname = temp;
		}
	}
	
}
