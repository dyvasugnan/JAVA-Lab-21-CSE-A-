import java.io.*;

public class ListFiles {
    public static void main(String[] args) {
        String path = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the root directory name: ");
            path = reader.readLine();

            File rootDir = new File(path);

            if (!rootDir.exists() || !rootDir.isDirectory()) {
                System.out.println("Root directory does not exist or is not a directory!");
            } else {
                listFilesAndDirectories(rootDir);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("***** Program Closed *****");
    }

    public static void listFilesAndDirectories(File directory) {
        System.out.println("Current Location: " + directory.getAbsolutePath());
        File[] filesList = directory.listFiles();

        if (filesList != null) {
            for (File file : filesList) {
                if (file.isFile()) {
                    System.out.println("- " + file.getName());
                } else if (file.isDirectory()) {
                    System.out.println("> " + file.getName());
                }
            }
        }
    }
}
