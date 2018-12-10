package aSSBLASTER50000;

public class ComboObjectASS {
	
	String date, ail, pscp;
	
	public ComboObjectASS(String d, String a, String p) {
		date=d;
		ail=a;
		pscp=p;
	}
	
	public String rtnDate() {
		return date;
	}
	
	public String rtnAil() {
		return ail;
	}
	
	public String rtnPscp() {
		return pscp;
	}
	
	public String rtnAll() {
		String rrrr=date+": "+ail+", "+pscp;
		return rrrr;
	}
}
