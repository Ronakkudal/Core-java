package library;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public interface BinFileIOUtils {
	//Static method for saveBook one at a time
		public static void saveBook(Book book, String fileName) throws IOException {
			// Java Appln -> DOS : Use java Datatypes Primitive/Wrapper : Bin  -> Buffer OS->  Bin File
			try (DataOutputStream dos = new DataOutputStream(
					new BufferedOutputStream(new FileOutputStream(fileName)))) {
				// UTF for writing string
				dos.writeUTF(book.getIsbn());
				// Title
				dos.writeUTF(book.getTitle());
				// Author
				dos.writeUTF(book.getAuthor());
				// Book Type  in string format
				dos.writeUTF(book.getBookType().toString());
				// publish date
				dos.writeUTF(book.getPublishDate().toString());
				// price
				dos.writeDouble(book.getPrice());
				dos.flush();
			} //close dos
		}
}
