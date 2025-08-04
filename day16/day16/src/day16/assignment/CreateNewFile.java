package day16.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateNewFile {
	public static void main(String[] args) throws IOException{
		String path = "D:/abc.txt";
		String text = "";
		File file = new File(path);
		
		if(!file.exists()) {
			System.out.println("Creating file!");
			file.createNewFile();
		} else {
			BufferedReader br = new BufferedReader(new FileReader(path));
			PrintWriter pw = new PrintWriter(System.out);
			while((text = br.readLine()) != null) {
				pw.println(text);
				System.out.println(text);
			}
			System.out.println("*******Data writtern to Console*****");
			
			}
		}
	}
/*
2) Create a new file if the file is not present at specified path
3) Read text file using FileReader-&gt;Bufferered reader and print
on console.
*/