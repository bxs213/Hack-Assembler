Hack-Assembler 

Java implementation of the assembler required to translate HACK assembly code to machine language to be processed by the HACK Computer.  

This assembler was designed per the specifications of the HACK computer specification from the NAND to Tetris course (https://nand2tetris.github.io/). The assembler will perform the following: 

1. Import a specific .asm file (assembly code) 

2. Parse it to remove comments and whitespaces 

3. Translate hardcoded and numbered symbols to binary memory locations 

4. Translate variable memory references to appropriate memory locations per the HACK specifications.  

5. Translate HACK assembly instruction instructions lines to HACK binary code per the HACK specification tables. 

6. Write the translated binary code to a .hack file. 

 
