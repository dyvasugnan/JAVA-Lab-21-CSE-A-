import java.io.*;
public class FileArray {
	public static void main(String args[]) {
		String folderPath = ("C:\\Users\\admin\\eclipse-workspace\\21wh1a0533\\src\\main\\java");
		File folder = new File(folderPath);
		if(folder.isDirectory()) {
			File[] fileList = folder.listFiles();
			if(fileList != 	null) {
				for(File file:fileList) {
					if(file.isFile()) {
						System.out.println(file.getName());
						System.out.println(file.getAbsolutePath());
						System.out.println(file.getName().endsWith(".java"));
						System.out.println(file.getName().startsWith("D"));
						System.out.println();
						
					}
				}
			}
				
			}
		}
}
