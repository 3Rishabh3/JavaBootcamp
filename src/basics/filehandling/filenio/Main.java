package basics.filehandling.filenio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter 1 to create a directory");
            System.out.println("Enter 2 to delete a directory");
            System.out.println("Enter 3 to copy a file");
            System.out.println("Enter 4 to move a file");
            System.out.println("Enter 5 to read a file");
            System.out.println("Enter 6 to write to a file");
            System.out.println("Enter 7 to create a file");
            System.out.println("Enter 8 to Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if(choice == 8)
                break;

            switch (choice) {
                case 1 -> DirectoryOperations.createDirectory();
                case 2 -> DirectoryOperations.deleteDirectory();
                case 3 -> FileOperations.copyFile();
                case 4 -> FileOperations.moveFile();
                case 5 -> FileOperations.readFile();
                case 6 -> FileOperations.writeToFile();
                case 7 -> FileOperations.createFile();
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class DirectoryOperations {
    static void createDirectory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter directory name: ");
        String dirName = scanner.nextLine();
        Path path = Paths.get(dirName);
        if (Files.exists(path)) {
            System.out.println("Directory already exists");
            return;
        }
        try {
            Files.createDirectory(path);
            System.out.println("Directory created successfully");
        } catch (IOException e) {
            System.out.println("Error creating directory");
            e.printStackTrace();
        }
    }

    static void deleteDirectory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter directory name: ");
        String dirName = scanner.nextLine();
        Path path = Paths.get(dirName);
        if (!Files.exists(path)) {
            System.out.println("Directory does not exist");
            return;
        }
        try {
            Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    Files.delete(file);
                    return FileVisitResult.CONTINUE;
                }
                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    Files.delete(dir);

                    return FileVisitResult.CONTINUE;
                }
            });
            System.out.println("Directory deleted successfully");
        } catch (IOException e) {
            System.out.println("Error deleting directory");
            e.printStackTrace();
        }
    }
}

class FileOperations {
    static void copyFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source file name: ");
        String sourceFile = scanner.nextLine();
        System.out.print("Enter destination file name: ");
        String destinationFile = scanner.nextLine();
        Path sourcePath = Paths.get(sourceFile);
        Path destinationPath = Paths.get(destinationFile);
        if (!Files.exists(sourcePath)) {
            System.out.println("Source file does not exist");
            return;
        }
        if (Files.exists(destinationPath)) {
            System.out.println("Destination file already exists. Do you want to overwrite it? (y/n)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                return;
            }
        }
        try {
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Error copying file");
            e.printStackTrace();
        }
    }

    static void moveFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source file name: ");
        String sourceFile = scanner.nextLine();
        System.out.print("Enter destination file name: ");
        String destinationFile = scanner.nextLine();
        Path sourcePath = Paths.get(sourceFile);
        Path destinationPath = Paths.get(destinationFile);
        if (!Files.exists(sourcePath)) {
            System.out.println("Source file does not exist");
            return;
        }
        if (Files.exists(destinationPath)) {
            System.out.println("Destination file already exists. Do you want to overwrite it? (y/n)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                return;
            }
        }
        try {
            Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully");
        } catch (IOException e) {
            System.out.println("Error moving file");
            e.printStackTrace();
        }
    }

    static void readFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        Path path = Paths.get(fileName);
        if (!Files.exists(path)) {
            System.out.println("File does not exist");
            return;
        }
        try {
            String content = new String(Files.readAllBytes(path));

            System.out.println("Content of file: " + content);
        } catch (IOException e) {
            System.out.println("Error reading file");
            e.printStackTrace();
        }
    }

    static void writeToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        Path path = Paths.get(fileName);
        if(!Files.exists(path)){
            System.out.println("File does not exist, please create one.");
            return;
        }
        System.out.print("Enter content to write: ");
        String content = scanner.nextLine();
        if (Files.exists(path)) {
            System.out.println("File already exists. Do you want to overwrite it? (y/n)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                return;
            }
        }
        try {
            Files.write(path, content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("Error writing file");
            e.printStackTrace();
        }
    }

    static void createFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        Path path = Paths.get(fileName);
        if (Files.exists(path)) {
            System.out.println("File already exists");
            return;
        }
        try {
            Files.createFile(path);
            System.out.println("File created successfully");
        } catch (IOException e) {
            System.out.println("Error creating file");
            e.printStackTrace();
        }
    }

}




