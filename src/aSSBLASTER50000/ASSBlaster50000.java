package aSSBLASTER50000;

import java.util.ArrayList;

public class ASSBlaster50000 {

	public static void main(String[] args) {
		
		ASSGui blaster = new ASSGui();
		ASSwordCheck ass=new ASSwordCheck();
		ASSpaitentStuff pat=new ASSpaitentStuff();
		System.out.println("|||||||||||||||||||||||");
		System.out.println(ass.idCheck("class", "767645"));
		
		ArrayList<ComboObject> obj=new ArrayList<ComboObject>();
		obj=pat.toCombo(1);
		System.out.println(obj.get(1).rtnAll());
		System.out.println(obj.get(0).rtnAll());

		//help
	}

}
