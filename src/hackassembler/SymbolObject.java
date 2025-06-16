package hackassembler;

import java.util.Map;

public class SymbolObject {

	static int counter = 15; 
	
	public static String SymbolHandler(String line) {
		
		int IntegerValue = 0;
		String BinaryString; 
		
		try {
			IntegerValue = Integer.parseInt(line);
		}
		
		catch (NumberFormatException e) {
			String SymbolicLocation = TranslationTables.SymbolTable.get(line);
			
			if(SymbolicLocation == null) {
				IntegerValue = Integer.parseInt(SymbolCreater(line));
			}
			
			else {
			IntegerValue = Integer.parseInt(SymbolicLocation);
			}
			}
		
		finally {
			BinaryString = Integer.toBinaryString(IntegerValue);
			}
		
		// Padding
		BinaryString = String.format("%16s", BinaryString).replace(" ", "0");
		
		return BinaryString;

	}
	
	public static void LabelCreater(int location, String label)
	{
		TranslationTables.SymbolTable.put(label, Integer.toString(location));
	}
	
	private static String SymbolCreater(String label) {
		counter ++; 
		
		TranslationTables.SymbolTable.put(label, Integer.toString(counter));
		return Integer.toString(counter); 
		
		
			
		}
	}