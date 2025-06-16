package hackassembler;

public class ProcessObject {

	
	public static String ProcessHandler(String line) {
		String BinaryString; 
		// Array with the substring values in order (dest, comp, jump)
		String[] substrings;
		
		substrings = SubStringProcessor(line.contains("="), line.contains(";"), line);
				
		substrings[2] = TranslationTables.JumpTable.get(substrings[2]);
		substrings[1] = TranslationTables.CompTable.get(substrings[1]);
		substrings[0] = TranslationTables.DestTable.get(substrings[0]);
		
		BinaryString = "111" + substrings[1] + substrings[0] + substrings[2];
		
		return BinaryString;
		
		
	}
	
	private static String[] SubStringProcessor(boolean hasDest, boolean hasJump, String line) {
		String[] substrings = {"null", "null", "null"};

		if(hasDest && hasJump) {
			substrings[0] = line.substring(0, line.indexOf("="));
			substrings[1] = line.substring(line.indexOf("=") + 1, line.indexOf(";"));
			substrings[2] = line.substring(line.indexOf(";") + 1);
			
		}
		else if(hasDest) {
			substrings[0] = line.substring(0, line.indexOf("="));;
			substrings[1] = line.substring(line.indexOf("=") + 1);
		}
		
		else if(hasJump) {
			substrings[1] = line.substring(0, line.indexOf(";"));
			substrings[2] = line.substring(line.indexOf(";") + 1);	
			}
		
		else {
			substrings[1] = line;
		}
		
		return substrings;

	}
	
}
