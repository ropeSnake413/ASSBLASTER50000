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
		
		ArrayList<ComboObjectASS> obj=new ArrayList<ComboObjectASS>();
		obj=vis.toList("aspeed");
		System.out.println(obj.get(1).rtnAll());
		pat.addPaitent("ass", "1324243", 1);
		pat.addPaitent("gerrd", "51255", 1);
		pat.addPaitent("freed", "1531235", 1);
		pat.addPaitent("grededr", "12354443", 1);
		pat.addPaitent("sans undertale", "434343556", 1);
		pat.addPaitent("weeder", "2824575", 1);
		pat.addPaitent("wassre", "82586385", 1);
		pat.addPaitent("awderd", "2742346", 1);



		/*
		*vis.addVisit("aspeed", "oct 3", "YOUR UBER IS HERE", "REEEEe10");
		*obj=vis.toList("aspeed");
		*for(int i=0; i<obj.size(); i++) {
		*	System.out.println(obj.get(i).rtnAll());
		*}
		*/
		
		
		//ArrayList<ComboObject> obj2=new ArrayList<ComboObject>();
		//obj2=pat.toCombo(doc);
		
		/**
		 * FINISHED DONT TOUCH ON DEATH PENALTY
		 * pat.addPaitent("hella jeff", "420-6969", doc);
		 */


		//help
	}

}
