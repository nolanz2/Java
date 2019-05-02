
public final class MachineLibrary 
{
	private MachineLibrary() {}
	
	public static TuringMachine EqualBinaryWords(String machine) {
	TuringMachine newTM = new TuringMachine();
		if (machine.contentEquals("dtm")){
		
		newTM.addState("q0");
		newTM.addState("q1");
		newTM.addState("q2");
		newTM.addState("q3");
		newTM.addState("qy");
		newTM.addState("qn");
		newTM.setStartState("q0");
		newTM.setAcceptState("qy");
		newTM.setRejectState("qn");
		newTM.addTransition("q0", '0', "q0", '0', true);
		newTM.addTransition("q0", '1', "q0", '1', true);
		newTM.addTransition("q0", 'b', "q1", 'b', false);
		newTM.addTransition("q1", '0', "q2", 'b', false);
		newTM.addTransition("q1", '1', "q3", 'b', false);
		newTM.addTransition("q1", 'b', "qn", 'b', false);
		newTM.addTransition("q2", '0', "qy", 'b', false);
		newTM.addTransition("q2", '1', "qn", 'b', false);
		newTM.addTransition("q2", 'b', "qn", 'b', false);
		newTM.addTransition("q3", '0', "qn", 'b', false);
		newTM.addTransition("q3", '1', "qn", 'b', false);
		newTM.addTransition("q3", 'b', "qn", 'b', false);
				
		}
		else if (machine.contentEquals("add")){
			newTM.addState("q0");
			newTM.addState("q1");
			newTM.addState("q2");
			newTM.addState("q3");
			newTM.addState("q4");
			newTM.addState("q5");
			newTM.addState("q6");
			newTM.addState("q7");
			newTM.addState("q8");
			newTM.addState("q9");
			newTM.addState("q10");
			newTM.addState("qy");
			newTM.addState("qn");
			newTM.setStartState("q0");
			newTM.setAcceptState("qy");
			newTM.setRejectState("qn");
			
			
			newTM.addTransition("q0", '0', "q1", '0', false);
			newTM.addTransition("q0", '1', "q1", '1', false);
			newTM.addTransition("q0", 'b', "q0", 'b', true);
			
		
			newTM.addTransition("q1", 'b', "q2", 'S', true);
			
			
			newTM.addTransition("q2", '0', "q2", '0', true);
			newTM.addTransition("q2", '1', "q2", '1', true);
			newTM.addTransition("q2", 'b', "q3", '$', true);
			newTM.addTransition("q2", '$', "q3", '$', true);
			
			
			
			newTM.addTransition("q3", '0', "q4", '0', true);
			newTM.addTransition("q3", '1', "q4", '1', true);
			newTM.addTransition("q3", 'b', "q3", '$', true);
			newTM.addTransition("q3", '$', "q3", '$', true);
			
			newTM.addTransition("q4", '0', "q4", '0', true);
			newTM.addTransition("q4", '1', "q4", '1', true);
			newTM.addTransition("q4", 'b', "q5", 'E', false);
			newTM.addTransition("q4", 'E', "q5", 'E', false);
			newTM.addTransition("q4", '$', "q4", '$', true);
			
			newTM.addTransition("q5", '0', "q5", '1', false);
			newTM.addTransition("q5", '1', "q5", '0', false);
			newTM.addTransition("q5", '$', "q6", '$', true);
			
			newTM.addTransition("q6", '0', "q6", '0', true);
			newTM.addTransition("q6", '1', "q6", '1', true);
			newTM.addTransition("q6", 'E', "q7", 'E', false);
			
			newTM.addTransition("q7", '0', "q8", '1', true);
			newTM.addTransition("q7", '1', "q7", '0', false);
			newTM.addTransition("q7", '$', "qy", 'b', true);
			newTM.addTransition("q7", 'S', "q2", 'S', true);
			
			newTM.addTransition("q8", '0', "q8", '0', true);
			newTM.addTransition("q8", '1', "q8", '1', true);
			newTM.addTransition("q8", '$', "q4", '$', true);
			newTM.addTransition("q8", 'E', "q9", 'E', false);
			
			newTM.addTransition("q9", '0', "q9", '1', false);
			newTM.addTransition("q9", '1', "q9", '0', false);
			newTM.addTransition("q9", '$', "q10", '$', false);
			
			
			
		}
		else if (machine.contentEquals("sub")){
			newTM.addState("q0");
			newTM.addState("q1");
			newTM.addState("q2");
			newTM.addState("q3");
			newTM.addState("q4");
			newTM.addState("q5");
			newTM.addState("q6");
			newTM.addState("q7");
			newTM.addState("q8");
			newTM.addState("q9");
			newTM.addState("q10");
			newTM.addState("q11");
			newTM.addState("q12");
			newTM.addState("qy");
			newTM.addState("qn");
			newTM.setStartState("q0");
			newTM.setAcceptState("qy");
			newTM.setRejectState("qn");
			
			newTM.addTransition("q0", '0', "q1", '0', false);
			newTM.addTransition("q0", '1', "q1", '1', false);
			newTM.addTransition("q0", 'b', "q0", 'b', true);
			
		
			newTM.addTransition("q1", 'b', "q2", 'S', true);
			
			
			newTM.addTransition("q2", '0', "q2", '0', true);
			newTM.addTransition("q2", '1', "q2", '1', true);
			newTM.addTransition("q2", 'b', "q3", '$', true);
			newTM.addTransition("q2", '$', "q3", '$', true);
			
			
			
			newTM.addTransition("q3", '0', "q4", '0', true);
			newTM.addTransition("q3", '1', "q4", '1', true);
			newTM.addTransition("q3", 'b', "q3", '$', true);
			newTM.addTransition("q3", '$', "q3", '$', true);
			
			newTM.addTransition("q4", '0', "q4", '0', true);
			newTM.addTransition("q4", '1', "q4", '1', true);
			newTM.addTransition("q4", 'b', "q5", 'E', false);
			newTM.addTransition("q4", 'E', "q5", 'E', false);
			newTM.addTransition("q4", '$', "q4", '$', true);
			
			newTM.addTransition("q5", '0', "q5", '1', false);
			newTM.addTransition("q5", '1', "q5", '0', false);
			newTM.addTransition("q5", '$', "q6", '$', true);
			newTM.addTransition("q5", 'S', "q2", 'S', true);
			
			
			newTM.addTransition("q6", '0', "q6", '0', true);
			newTM.addTransition("q6", '1', "q6", '1', true);
			newTM.addTransition("q6", 'E', "q7", 'E', false);
			newTM.addTransition("q6", '$', "q7", '$', false);
			
			newTM.addTransition("q7", '0', "q8", '1', true);
			newTM.addTransition("q7", '1', "q7", '0', false);
			newTM.addTransition("q7", '$', "qy", '$', true);
			newTM.addTransition("q7", 'S', "q2", 'S', true);
			
			newTM.addTransition("q8", '0', "q8", '0', true);
			newTM.addTransition("q8", '1', "q8", '1', true);
			newTM.addTransition("q8", '$', "q9", '$', false);
			newTM.addTransition("q8", 'E', "q9", 'E', false);
			
			newTM.addTransition("q9", '0', "q9", '1', false);
			newTM.addTransition("q9", '1', "q9", '0', false);
			newTM.addTransition("q9", '$', "q10", '$', false);
			newTM.addTransition("q9", 'S', "q2", 'S', true);
			
			
			newTM.addTransition("q10", '0', "q10", '1', false);
			newTM.addTransition("q10", '1', "q10", '0', false);
			newTM.addTransition("q10", '$', "q10", '$', false);
			newTM.addTransition("q10", 'S', "q11", 'S', true);
			
			newTM.addTransition("q11", '0', "q11", '0', true);
			newTM.addTransition("q11", '1', "q11", '1', true);
			newTM.addTransition("q11", '$', "q7", '$', false);
			
			
			
			
		}
		//assumes a single space between the binary numbers
		else if (machine.contentEquals("mult")){
			newTM.addState("q0");
			newTM.addState("q1");
			newTM.addState("q2");
			newTM.addState("q3");
			newTM.addState("q4");
			newTM.addState("q5");
			newTM.addState("q6");
			newTM.addState("q7");
			newTM.addState("q8");
			newTM.addState("q9");
			newTM.addState("q10");
			newTM.addState("q11");
			newTM.addState("q12");
			newTM.addState("q13");
			newTM.addState("q14");
			newTM.addState("q15");
			newTM.addState("q16");
			newTM.addState("q17");
			newTM.addState("q18");
			newTM.addState("q19");
			newTM.addState("q20");
			newTM.addState("q21");
			newTM.addState("q22");
			newTM.addState("q23");
			newTM.addState("q24");
			newTM.addState("q23");
			newTM.addState("q25");
			newTM.addState("q26");
			newTM.addState("q27");
			newTM.addState("q28");
			newTM.addState("q29");
			newTM.addState("q30");
			newTM.addState("q31");
			newTM.addState("q32");
			newTM.addState("q33");
			newTM.addState("q34");
			newTM.addState("q35");
			newTM.addState("q36");
			newTM.addState("q37");
			newTM.addState("q38");
			newTM.addState("q39");
			newTM.addState("q40");
			newTM.addState("q41");
			newTM.addState("q42");
			newTM.addState("q43");
			
			newTM.addState("q99");
			newTM.addState("q100");
			newTM.addState("q101");
			newTM.addState("q102");
			newTM.addState("qy");
			newTM.addState("qn");
			newTM.setStartState("q99");
			newTM.setAcceptState("qy");
			newTM.setRejectState("qn");
			
			
			newTM.addTransition("q99", '0', "q100", '0', true);
			newTM.addTransition("q99", '1', "q100", '1', true);
			newTM.addTransition("q99", 'b', "q99", 'b', true);
			
			newTM.addTransition("q100", '0', "q100", '0', true);
			newTM.addTransition("q100", '1', "q100", '1', true);
			newTM.addTransition("q100", 'b', "q101", 'b', true);

			newTM.addTransition("q101", '0', "q102", '0', true);
			newTM.addTransition("q101", '1', "q102", '1', true);
			newTM.addTransition("q101", 'b', "q101", 'b', true);
			
			
			newTM.addTransition("q102", '0', "q102", '0', true);
			newTM.addTransition("q102", '1', "q102", '1', true);
			newTM.addTransition("q102", 'b', "q0", 'b', false);
			
			
			newTM.addTransition("q0", 'b', "q1", 'b', false);
			newTM.addTransition("q0", '0', "q10", 'b', false);
			newTM.addTransition("q0", '1', "q20", 'b', false);
			
			newTM.addTransition("q1", 'b', "q2", 'b', false);
			newTM.addTransition("q1", '0', "q1", 'b', false);
			newTM.addTransition("q1", '1', "q1", 'b', false);
			
			newTM.addTransition("q2", 'b', "q3", 'b', true);
			newTM.addTransition("q2", '0', "q3", '0', true);
			newTM.addTransition("q2", '1', "q3", '1', true);
			newTM.addTransition("q2", '$', "q2", '1', false);
			newTM.addTransition("q2", '@', "q2", '0', false);
			
			newTM.addTransition("q3", 'b', "qy", 'b', false);
			newTM.addTransition("q3", '0', "q3", '0', true);
			newTM.addTransition("q3", '1', "q3", '1', true);
			
			newTM.addTransition("q10", 'b', "q11", 'b', false);
			newTM.addTransition("q10", '0', "q10", '0', false);
			newTM.addTransition("q10", '1', "q10", '1', false);
			newTM.addTransition("q10", 'x', "q10", 'x', false);
			newTM.addTransition("q10", 'y', "q10", 'y', false);
			newTM.addTransition("q10", '@', "q10", '@', false);
			newTM.addTransition("q10", '$', "q10", '$', false);
			
			newTM.addTransition("q11", 'b', "q12", 'b', false);
			newTM.addTransition("q11", '0', "q11", '0', false);
			newTM.addTransition("q11", '1', "q11", '1', false);
			newTM.addTransition("q11", 'x', "q11", 'x', false);
			newTM.addTransition("q11", 'y', "q11", 'y', false);
			newTM.addTransition("q11", '@', "q11", '@', false);
			newTM.addTransition("q11", '$', "q11", '$', false);
			
			newTM.addTransition("q12", 'b', "q15", '@', true);
			newTM.addTransition("q12", '0', "q15", '@', true);
			newTM.addTransition("q12", '1', "q15", '$', true);
			newTM.addTransition("q12", '$', "q12", '$', false);
			newTM.addTransition("q12", '@', "q12", '@', false);
			
			newTM.addTransition("q15", 'b', "q16", 'b', true);
			newTM.addTransition("q15", '0', "q15", '0', true);
			newTM.addTransition("q15", '1', "q15", '1', true);
			newTM.addTransition("q15", 'x', "q15", 'x', true);
			newTM.addTransition("q15", 'y', "q15", 'y', true);
			newTM.addTransition("q15", '@', "q15", '@', true);
			newTM.addTransition("q15", '$', "q15", '$', true);
			
			newTM.addTransition("q16", 'b', "q17", 'b', true);
			newTM.addTransition("q16", '0', "q16", '0', true);
			newTM.addTransition("q16", '1', "q16", '1', true);
			newTM.addTransition("q16", 'x', "q16", 'x', true);
			newTM.addTransition("q16", 'y', "q16", 'y', true);
			newTM.addTransition("q16", '@', "q16", '@', true);
			newTM.addTransition("q16", '$', "q16", '$', true);
			
			newTM.addTransition("q17", 'b', "q0", 'b', false);
			newTM.addTransition("q17", '0', "q17", '0', true);
			newTM.addTransition("q17", '1', "q17", '1', true);
			newTM.addTransition("q17", 'x', "q17", 'x', true);
			newTM.addTransition("q17", 'y', "q17", 'y', true);
			newTM.addTransition("q17", '@', "q17", '@', true);
			newTM.addTransition("q17", '$', "q17", '$', true);
			
			newTM.addTransition("q20", 'b', "q21", 'b', false);
			newTM.addTransition("q20", '0', "q20", '0', false);
			newTM.addTransition("q20", '1', "q20", '1', false);
			
			newTM.addTransition("q21", '0', "q22", 'x', false);
			newTM.addTransition("q21", '1', "q26", 'y', false);

			newTM.addTransition("q22", 'b', "q23", 'b', false);
			newTM.addTransition("q22", '0', "q22", '0', false);
			newTM.addTransition("q22", '1', "q22", '1', false);
			newTM.addTransition("q22", 'x', "q22", 'x', false);
			newTM.addTransition("q22", 'y', "q22", 'y', false);
			newTM.addTransition("q22", '@', "q22", '@', false);
			newTM.addTransition("q22", '$', "q22", '$', false);
			
			newTM.addTransition("q23", 'b', "q24", '@', true);
			newTM.addTransition("q23", '0', "q24", '@', true);
			newTM.addTransition("q23", '1', "q24", '$', true);
			newTM.addTransition("q23", 'x', "q23", 'x', false);
			newTM.addTransition("q23", 'y', "q23", 'y', false);
			newTM.addTransition("q23", '@', "q23", '@', false);
			newTM.addTransition("q23", '$', "q23", '$', false);
			
			newTM.addTransition("q24", 'b', "q25", 'b', true);
			newTM.addTransition("q24", '0', "q24", '0', true);
			newTM.addTransition("q24", '1', "q24", '1', true);
			newTM.addTransition("q24", 'x', "q24", 'x', true);
			newTM.addTransition("q24", 'y', "q24", 'y', true);
			newTM.addTransition("q24", '@', "q24", '@', true);
			newTM.addTransition("q24", '$', "q24", '$', true);
			
			newTM.addTransition("q25", 'b', "q25", 'b', true);
			newTM.addTransition("q25", '0', "q25", '0', true);
			newTM.addTransition("q25", '1', "q25", '1', true);
			newTM.addTransition("q25", 'x', "q30", 'x', false);
			newTM.addTransition("q25", 'y', "q30", 'y', false);
			newTM.addTransition("q25", '@', "q25", '@', true);
			newTM.addTransition("q25", '$', "q25", '$', true);
			
			newTM.addTransition("q26", 'b', "q27", 'b', false);
			newTM.addTransition("q26", '0', "q26", '0', false);
			newTM.addTransition("q26", '1', "q26", '1', false);
			newTM.addTransition("q26", 'x', "q26", 'x', false);
			newTM.addTransition("q26", 'y', "q26", 'y', false);
			newTM.addTransition("q26", '@', "q26", '@', false);
			newTM.addTransition("q26", '$', "q26", '$', false);
			
			newTM.addTransition("q27", 'b', "q24", '$', true);
			newTM.addTransition("q27", '0', "q24", '$', true);
			newTM.addTransition("q27", '1', "q28", '@', false);
			newTM.addTransition("q27", 'x', "q27", 'x', false);
			newTM.addTransition("q27", 'y', "q27", 'y', false);
			newTM.addTransition("q27", '@', "q27", '@', false);
			newTM.addTransition("q27", '$', "q27", '$', false);
			
			newTM.addTransition("q28", 'b', "q24", '1', true);
			newTM.addTransition("q28", '0', "q24", '1', true);
			newTM.addTransition("q28", '1', "q28", '0', false);
			
			newTM.addTransition("q30", 'b', "q40", 'b', false);
			newTM.addTransition("q30", '0', "q31", 'x', false);
			newTM.addTransition("q30", '1', "q35", 'y', false);
			
			newTM.addTransition("q31", 'b', "q32", 'b', false);
			newTM.addTransition("q31", '0', "q31", '0', false);
			newTM.addTransition("q31", '1', "q31", '1', false);
			newTM.addTransition("q31", 'x', "q31", 'x', false);
			newTM.addTransition("q31", 'y', "q31", 'y', false);
			newTM.addTransition("q31", '@', "q31", '@', false);
			newTM.addTransition("q31", '$', "q31", '$', false);
			
			newTM.addTransition("q32", 'b', "q33", 'x', true);
			newTM.addTransition("q32", '0', "q33", 'x', true);
			newTM.addTransition("q32", '1', "q33", 'y', true);
			newTM.addTransition("q32", 'x', "q32", 'x', false);
			newTM.addTransition("q32", 'y', "q32", 'y', false);
			newTM.addTransition("q32", '@', "q32", '@', false);
			newTM.addTransition("q32", '$', "q32", '$', false);
			
			newTM.addTransition("q33", 'b', "q34", 'b', true);
			newTM.addTransition("q33", '0', "q33", '0', true);
			newTM.addTransition("q33", '1', "q33", '1', true);
			newTM.addTransition("q33", 'x', "q33", 'x', true);
			newTM.addTransition("q33", 'y', "q33", 'y', true);
			newTM.addTransition("q33", '@', "q33", '@', true);
			newTM.addTransition("q33", '$', "q33", '$', true);
					
			newTM.addTransition("q34", 'b', "q34", 'b', true);
			newTM.addTransition("q34", '0', "q34", '0', true);
			newTM.addTransition("q34", '1', "q34", '1', true);
			newTM.addTransition("q34", 'x', "q30", 'x', false);
			newTM.addTransition("q34", 'y', "q30", 'y', false);
			newTM.addTransition("q34", '@', "q34", '@', true);
			newTM.addTransition("q34", '$', "q34", '$', true);
			
			newTM.addTransition("q35", 'b', "q36", 'b', false);
			newTM.addTransition("q35", '0', "q35", '0', false);
			newTM.addTransition("q35", '1', "q35", '1', false);
			newTM.addTransition("q35", 'x', "q35", 'x', false);
			newTM.addTransition("q35", 'y', "q35", 'y', false);
			newTM.addTransition("q35", '@', "q35", '@', false);
			newTM.addTransition("q35", '$', "q35", '$', false);
			
			newTM.addTransition("q36", 'b', "q33", 'y', true);
			newTM.addTransition("q36", '0', "q33", 'y', true);
			newTM.addTransition("q36", '1', "q37", 'x', false);		
			newTM.addTransition("q36", 'x', "q36", 'x', false);
			newTM.addTransition("q36", 'y', "q36", 'y', false);
			newTM.addTransition("q36", '@', "q36", '@', false);
			newTM.addTransition("q36", '$', "q36", '$', false);
			
			newTM.addTransition("q37", 'b', "q33", '1', true);
			newTM.addTransition("q37", '0', "q33", '1', true);
			newTM.addTransition("q37", '1', "q37", '0', false);
			
			newTM.addTransition("q40", 'b', "q41", 'b', true);
			newTM.addTransition("q40", '0', "q40", '0', false);
			newTM.addTransition("q40", '1', "q40", '1', false);		
			newTM.addTransition("q40", 'x', "q40", 'x', false);
			newTM.addTransition("q40", 'y', "q40", 'y', false);
			newTM.addTransition("q40", '@', "q40", '@', false);
			newTM.addTransition("q40", '$', "q40", '$', false);
			
			newTM.addTransition("q41", 'b', "q42", 'b', true);
			newTM.addTransition("q41", '0', "q41", '0', true);
			newTM.addTransition("q41", '1', "q41", '1', true);		
			newTM.addTransition("q41", 'x', "q41", '0', true);
			newTM.addTransition("q41", 'y', "q41", '1', true);
			newTM.addTransition("q41", '@', "q41", '@', true);
			newTM.addTransition("q41", '$', "q41", '$', true);
			
			newTM.addTransition("q42", 'b', "q43", 'b', true);
			newTM.addTransition("q42", '0', "q42", '0', true);
			newTM.addTransition("q42", '1', "q42", '1', true);		
			newTM.addTransition("q42", 'x', "q42", '0', true);
			newTM.addTransition("q42", 'y', "q42", '1', true);
			newTM.addTransition("q42", '@', "q42", '@', true);
			newTM.addTransition("q42", '$', "q42", '$', true);
			
			newTM.addTransition("q43", 'b', "q0", 'b', false);
			newTM.addTransition("q43", '0', "q43", '0', true);
			newTM.addTransition("q43", '1', "q43", '1', true);		
			newTM.addTransition("q43", 'x', "q43", 'x', true);
			newTM.addTransition("q43", 'y', "q43", 'y', true);
			newTM.addTransition("q43", '@', "q43", '@', true);
			newTM.addTransition("q43", '$', "q43", '$', true);
			
			
			
			
			
			
			
		}
		
		
		

		return newTM;
	}
	

}
