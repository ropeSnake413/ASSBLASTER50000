package aSSBLASTER50000;

import java.util.ArrayList;

public class ASSBlaster50000 {

	public static void main(String[] args) {
		String tstu="ropeSnake413";
		String tstp="pass";
		ASSGui blaster = new ASSGui();
		ASSwordCheck ass=new ASSwordCheck();
		ASSpatientStuff pat=new ASSpatientStuff();
		ASSvisits vis=new ASSvisits();
		System.out.println("|||||||||||||||||||||||");
		int d=ass.idCheck(tstu, tstp);
		pat.toCombo(4);
		vis.findPatId("aspeed");

	

		//ArrayList<ComboObject> obj=new ArrayList<ComboObject>();
		//obj=pat.toCombo(doc);
		
		/**
		 * FINISHED DONT TOUCH ON DEATH PENALTY
		 * pat.addPaitent("hella jeff", "420-6969", doc);
		 */


		//help
	}

}
