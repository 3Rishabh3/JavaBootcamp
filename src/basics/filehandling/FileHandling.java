package basics.filehandling;

import java.io.*;
import java.util.Scanner;

public class FileHandling {
    private final File file;

    public FileHandling(String fileName) {
        this.file = new File(fileName);
    }

    public void readFile() throws IOException {
        System.out.println("Reading file...");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        System.out.println("Reading complete!");
    }

    public void writeFile(String content) throws IOException {
        System.out.println("Writing to file...");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));
        bw.write(content);
        bw.close();
        System.out.println("Writing complete!");
    }

    public void appendFile(String content) throws IOException {
        System.out.println("Appending to file...");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        bw.newLine();
        bw.write(content);
        bw.close();
        System.out.println("Appending complete!");
    }

    public void deleteFile() {
        System.out.println("Deleting file...");
        if (file.delete()) {
            System.out.println("File deleted successfully!");
        } else {
            System.out.println("Failed to delete file.");
        }
    }

    public void createFile() {
        System.out.println("Creating file...");
        if (file.exists()) {
            System.out.println("File already exists.");
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created successfully!");
                } else {
                    System.out.println("Failed to create file.");
                }
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        fileName = "src/basics/filehandling/files/" + fileName;
        FileHandling handler = new FileHandling(fileName);

        while (true) {
            System.out.println("Choose operation: ");
            System.out.println("1. Read");
            System.out.println("2. Write");
            System.out.println("3. Append");
            System.out.println("4. Delete");
            System.out.println("5. Create");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 6) {
                break;
            }

            if (!handler.file.exists() && choice != 5) {
                System.out.println("File does not exist. Please create the file first.");
                continue;
            }

            switch (choice) {
                case 1:
                    try {
                        handler.readFile();
                    } catch (IOException e) {
                        System.out.println("Error reading file: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter content to write: ");
                    String content = sc.nextLine();
                    try {
                        handler.writeFile(content);
                    } catch (IOException e) {
                        System.out.println("Error writing to file: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter content to append: ");
                    content = sc.nextLine();
                    try {
                        handler.appendFile(content);
                    } catch (IOException e) {
                        System.out.println("Error appending to file: " + e.getMessage());
                    }
                    break;
                case 4:
                    handler.deleteFile();
                    break;
                case 5:
                    handler.createFile();
                    break;
            }
        }
    }
}