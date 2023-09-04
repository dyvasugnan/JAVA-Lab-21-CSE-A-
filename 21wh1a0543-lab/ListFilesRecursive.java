package javaprograms;

import java.io.File;

public class ListFilesRecursive {
    public static void main(String[] args) {
        String directoryPath = "\"C:\\Users\\user\\eclipse-workspace\\Java_21wh1a0543\\src\\awtprograms\"" ;
              listFiles(directoryPath);
    }

    public static void listFiles(String directoryPath) {
        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        listFiles(file.getAbsolutePath());
                    } else {
                       
                        System.out.println("File: " + file.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}
