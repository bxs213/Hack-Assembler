package hackassembler;


public class Main {

	public static void main(String[] args) {
		// Load file via IO class and read it
		IO file = new IO("Max.asm");
		file.readFile();
		
		// Load cleaned lines to the code class and perform translation
		Code code = new Code (file.GetLines());
		code.Cleaner();
		code.translator();
		
		file.writefile(code.GetLines());   
		
	}

}
