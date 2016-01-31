import java.util.*;
import java.io.*;


public class FileWriter {

	public int writeToFile(String timeline) throws FileNotFoundException, UnsupportedEncodingException {
	
	PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
	writer.println(timeline);
	writer.close();
	
	return 1;
	}
}
