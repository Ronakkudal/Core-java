package day16.assignment;

import java.io.File;

public class FileDirectory {
	public static void main(String[] args) {
		String path = "D:/choo mat dio is file ko.txt";
		
		File file = new File(path);
		
		if(file.exists()) {
			if(file.isDirectory()) {
					String[] content = file.list();
					for(String con : content) {
						System.out.println(" Directory: " +con);
					}
			}
			else if(file.isFile()) {
				System.out.println("It is a file: " + file.getName());
			}
		}
		else {
			System.out.println("File not exists!");
		}
	}
}	
/*
1) Check if the file object is directory or file. If its directory then
print all the files or directories in it.
*/