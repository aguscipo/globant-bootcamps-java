package topic02.exceptions.exercise1;

//1.-Create a text file programatically and try to save it in your local computer.

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {

	public static void main(String[] args) throws IOException {

		try {
			Path path = Paths.get("C:/exercise1/test.txt");
			Files.createDirectories(path.getParent());
			Files.createFile(path);
			System.out.println("Your file was created succesfully");
		} catch (FileAlreadyExistsException e) {
			System.err.println("Already exists: " + e.getMessage());
		} catch (InvalidPathException e) {
			System.err.println("Invalid path: " + e.getMessage());
		} catch (FileSystemException e) {
			System.err.println("Root directory not exist: " + e.getMessage());

		} finally {
			System.out.println("Good bye... =)");

		}
	}
}