package core;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//import java.util.Scanner;

public class HelloWorld {
	public static void main (String[] args) throws IOException {
		File file = new File ("D:\\1.txt");
		
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		writer.write("Hello, World!");
		writer.close();
		
		FileReader fileReader = new FileReader(file);
		char[] textFromFile = new char [2];
		fileReader.read (textFromFile);
		
		
		for (int i=0; i < textFromFile.length; i++)
		{
			System.out.print(textFromFile [i]);
		}
		
		fileReader.close();
	}
}