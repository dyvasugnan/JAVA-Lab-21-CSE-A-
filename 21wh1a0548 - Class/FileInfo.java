public class FileInfo {

	public static void main(String args[]) {

		File f = new File("C:\\JAVA");

		File name[] = f.listFiles();

		for(File n:name) {

			System.out.println(n.getName());

			System.out.println(n.getPath());

			System.out.println(n.getTotalSpace());

		}

	}

}