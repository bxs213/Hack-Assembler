package hackassembler;
import static java.util.Map.entry;
import java.util.HashMap;
import java.util.Map;

public class TranslationTables {

	static Map<String, String> SymbolTable =  new HashMap<String, String>();
	
	static Map<String, String> DestTable = Map.ofEntries(
			entry("null","000"),
			entry("M","001"),
			entry("D","010"),
			entry("MD","011"),
			entry("A","100"),
			entry("AM","101"),
			entry("AD","110"),
			entry("AMD","111")
			);
			
	static Map<String, String> CompTable = Map.ofEntries(
			entry("0",  "0101010"),
			entry("1",  "0111111"),
			entry("-1", "0111010"),
			entry("D",  "0001100"),
			entry("A",  "0110000"),
			entry("M",  "1110000"),
			entry("!D", "0001101"),
			entry("!A", "0110001"),
			entry("!M", "1110001"),
			entry("D+1","0011111"),
			entry("A+1","0110111"),
			entry("M+1","1110111"),
			entry("D-1","0001110"),
			entry("A-1","0110010"),
			entry("M-1","1110010"),
			entry("D+A","0000010"),
			entry("D+M","1000010"),
			entry("D-A","0010011"),
			entry("D-M","1010011"),
			entry("A-D","0000111"),
			entry("M-D","1000111"),
			entry("D&A","0000000"),
			entry("D&M","1000000"),
			entry("D|A","0010101"),
			entry("D|M","1010101")
			);
	
	static Map<String, String> JumpTable = Map.ofEntries(
			entry("null","000"),
			entry("JGT","001"),
			entry("JEQ","010"),
			entry("JGE","011"),
			entry("JLT","100"),
			entry("JNE","101"),
			entry("JLE","110"),
			entry("JMP","111")
			);
			
	public TranslationTables() {
		SymbolTable.put("R0","0");
		SymbolTable.put("R1","1");
		SymbolTable.put("R2","2");
		SymbolTable.put("R3","3");
		SymbolTable.put("R4","4");
		SymbolTable.put("R5","5");
		SymbolTable.put("R6","6");
		SymbolTable.put("R7","7");
		SymbolTable.put("R8","8");
		SymbolTable.put("R9","9");
		SymbolTable.put("R10","10");
		SymbolTable.put("R11","11");
		SymbolTable.put("R12","12");
		SymbolTable.put("R13","13");
		SymbolTable.put("R14","14");
		SymbolTable.put("R15","15");
		SymbolTable.put("SCREEN","16384");
		SymbolTable.put("KBD","24576");
		SymbolTable.put("SP","0");
		SymbolTable.put("LCL","1");
		SymbolTable.put("ARG","2");
		SymbolTable.put("THIS","3");
		SymbolTable.put("THAT","4");
	}
}
