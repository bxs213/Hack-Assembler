package hackassembler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Code {

	TranslationTables ST = new TranslationTables();
	
	private ArrayList<String> UnFilteredLines;
	private ArrayList<String> UntranslatedLines = new ArrayList<String>();
	private ArrayList<String> FirstPassLines = new ArrayList<String>();
	private Map<Integer, String> TranslatedLines = new HashMap<Integer, String>();
	
	
	
	public Code(ArrayList<String> untranslatedLines) {
		this.UnFilteredLines = untranslatedLines;
	}
	
	
	public void translator(){
		
		FirstPass();
		SecondPass();
		
	}
	
	private void SecondPass() {
		String Binaryline;
		int key = 0;
		
		for(String line : FirstPassLines) {
			
			
			if(line.startsWith("@")){
				Binaryline = SymbolObject.SymbolHandler(line.substring(1));
			}
			else {
				Binaryline = ProcessObject.ProcessHandler(line);
			}
			
			TranslatedLines.put(key, Binaryline);	
			key ++;
		}
		
	}


	private void FirstPass() {		
		int key = 0;
		
		for(String line : UntranslatedLines) {
			if(line.startsWith("(")){
				line = line.replace("(", "");
				line = line.replace(")","");
				
				SymbolObject.LabelCreater(key,line);
				
			}
			else {
				FirstPassLines.add(line);
				key ++;
				continue;
			}
		}
		}
	
	
	public void Cleaner() {
		
		for(String line : UnFilteredLines) {
			line = line.replaceAll(" ", "");
			if(!line.startsWith("//") && !line.isEmpty()) {
				UntranslatedLines.add(line);
			}
			else {
				continue;
			}
		}
		} 

	public Collection<String> GetLines() {
		
		return this.TranslatedLines.values();
		
	}
}

	
	