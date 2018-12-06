package aSSBLASTER50000;

public class ASSBlaster50000 {

	public static void main(String[] args) {
		ASSGui blaster = new ASSGui();
		ASSwordCheck ass=new ASSwordCheck("user", "password");
		System.out.println("|||||||||||||||||||||||");
		System.out.println(ass.idCheck("xflyyer", "pass"));
		//help
	}

}
