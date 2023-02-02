package basics.multithreading.readerwriterproblem;

import java.io.*;

class FileThread extends Thread {
    private final File file;
    private final String operation;
    public FileThread(File file, String operation) {
        this.file = file;
        this.operation = operation;
    }

    @Override
    public void run() {
        synchronized (file) {
            if (operation.equals("write")) {
                writeToFile();
            } else if (operation.equals("read")) {
                readFromFile();
            }
        }
    }

    private void writeToFile() {
        try (FileWriter writer = new FileWriter(file, true)) {
            for (int i = 1; i <= 10; i++) {
                writer.write("Line " + i + System.lineSeparator());
                System.out.println("Thread " + Thread.currentThread().getName() + " wrote line " + i);
                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Thread " + Thread.currentThread().getName() + " read: " + line);
                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        File file = new File("file.txt");
        FileThread writerThread = new FileThread(file, "write");
        FileThread readerThread = new FileThread(file, "read");
        writerThread.start();
        readerThread.start();
    }
}