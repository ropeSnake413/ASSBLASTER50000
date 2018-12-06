package aSSBLASTER50000;

public class ComboObject {
	String name;
	String phone;
	
	//lovely constructor
	public ComboObject(String n, String p) {
		name=p;
		phone=p;
	}
	
	
	public String rtnP() {
		return phone;
	}
	
	public String rtnN() {
		return name;
	}
	
	public String rtnAll() {
		return name+", phone number: "+phone;
	}
}
