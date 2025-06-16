package hackassembler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class IO {
	
	private ArrayList<String> lines = new ArrayList<String>();
	
	private String filename;
	private String writtenfile;
	
	public IO(String filename) {
		
		this.filename = filename;
		this.writtenfile = filename.replace(".asm", ".hack");		
		
	}

	public void readFile() {
		
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filename));
				
				String line;
				while ((line = reader.readLine()) != null) {
				lines.add(line);				
				}
				
				reader.close();
				
			}
				catch (IOException e) {
				e.printStackTrace();
			}
			
	}
	


	public void writefile(Collection<String> values) {
	
		try {
			FileWriter writer = new FileWriter(writtenfile);
			for(String line : values) {
				writer.write(line + "\n");
		
			}
			writer.close();
			System.out.print("Lines written to file successfully" );
		
		} catch (IOException e) {
			System.out.println("Writing error occured");
			e.printStackTrace();
	}
	
		
	}
		
	public ArrayList<String> GetLines() {
		return this.lines;
	}

}
		
	
