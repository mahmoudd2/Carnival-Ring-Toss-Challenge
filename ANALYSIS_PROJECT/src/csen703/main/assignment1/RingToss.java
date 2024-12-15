package csen703.main.assignment1;

import java.util.Stack;

public class RingToss {
	
	public static int RingTossGreedy(int [] peg) {
		
		//el value hy get returned!!!
		int totalTossess = peg[0];
		int length = peg.length;
		
		Stack<Integer> ringTemps = new Stack(); //stack to help in comparing between current w el next height 
		ringTemps.push(totalTossess);
		
		for(int i = 1; i < length; i++) {
			int temp = ringTemps.peek();  //el current height 
			
			if(temp < peg[i]) { //mokarna between el current w el next height
				totalTossess += peg[i] - temp; //added el - temp !!
			}
			ringTemps.push(peg[i]);
		}
		return totalTossess;
	}
	
}
