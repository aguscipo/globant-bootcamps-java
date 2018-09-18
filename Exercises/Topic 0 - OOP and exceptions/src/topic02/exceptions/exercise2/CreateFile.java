package topic02.exceptions.exercise2;

//2-Find a use case where multiple exception types could be thrown and catch'em all. Is the order relevant in here?


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {

	public static void main(String[] args) throws IOException {

		try {
			Path path = Paths.get("C:/exercise1/test.txt");
			Files.createDirectories(path.getParent());
			Files.createFile(path);
			System.out.println("Your file was created succesfully");
		} catch (Exception e) {     //Catches all exceptions extended from Exception (which is everything)
            System.out.println(e.toString()); 
		} finally {
			System.out.println("Good bye... =)");

		}
	}
}