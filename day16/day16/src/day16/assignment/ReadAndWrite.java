package day16.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadAndWrite {
	public static void main(String[] args) throws IOException {
		String fileName = "D:/abc.txt";
		String text = "";
		String destinationFile = "D:/xyz.txt";
		
		try(
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		PrintWriter pw = new PrintWriter(new FileWriter(destinationFile));
		){
			while((text = br.readLine()) != null) {
				//System.out.println(text);
				pw.println(text);
			}
		} catch (IOException io) {
			System.out.println("Exception Occurred!" + io.getMessage());
		}
	}
}
/*
Read from one text file and write in other files. Use
PrintWriter, Bufferedwriter, FileWriter for writing. User

BufferedReader, FileReader for reading. Use try catch with
resource
*/