package aSSBLASTER50000;

import java.util.ArrayList;

public class ASSBlaster50000 {

	public static void main(String[] args) {
		String tstu="class";
		String tstp="767645";
		ASSGui blaster = new ASSGui();
		ASSwordCheck ass=new ASSwordCheck();
		ASSpatientStuff pat=new ASSpatientStuff();
		System.out.println("|||||||||||||||||||||||");
		int d=ass.idCheck(tstu, tstp);
		
		//##########################
		final int doc=d;
		//##########################
	
		System.out.println("[][][][]"+doc);
		//ArrayList<ComboObject> obj=new ArrayList<ComboObject>();
		//obj=pat.toCombo(doc);
		
		/**
		 * FINISHED DONT TOUCH ON DEATH PENALTY
		 * pat.addPaitent("hella jeff", "420-6969", doc);
		 */


		//help
	}

}
