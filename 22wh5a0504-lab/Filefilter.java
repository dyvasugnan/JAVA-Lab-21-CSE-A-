import java.io.*;
import java.io.FileFilter;

public class Filefilter implements FileFilter{

    public boolean accept(File file) {
        return file.isFile() && file.getName().endsWith(".class");
    }
    
	public static void main(String[] args) throws IOException{
		File f = new File("C:\\Users\\HP\\java_programs");
        Filefilter txtFileFilter = new Filefilter();
        File[] txtFiles = f.listFiles(txtFileFilter);
        if (txtFiles != null) {
            for (File file : txtFiles) {
                System.out.println("Found file: " + file.getName());
            }
        }
	}

}