import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.String;
import java.io.IOException;
public class ReadTextFile {
 
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("filename.txt")); //give double back slas use this format when your file is outside java project "C:\\Path\\to\\file\\fileName.txt"
			String line;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
 
}