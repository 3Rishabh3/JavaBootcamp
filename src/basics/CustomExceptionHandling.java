package basics;
//CustomExceptionHandling

import java.io.*;
import java.sql.*;

class CustomException extends Exception {

    private String message;
    private int errorCode;
    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    public CustomException(String message, int errorCode) {
        super(message);
        this.message = message;
        this.errorCode = errorCode;
    }
}

public class CustomExceptionHandling {
    public static void main(String[] args) throws CustomException {
        try {
            // Example of handling IOException
            FileInputStream file = new FileInputStream("src/basics/filehandling/files/2_ExperimentFile.txt");

            // Example of handling ArithmeticException
            int a = 10, b = 1;
            int c = a / b;

            // Example of handling SQL Exception
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "username", "password");

            // Example of handling IndexOutOfBoundsException
            int[] arr = new int[5];
            int index = 10;
            int value = arr[index];

        } catch (IOException | ArithmeticException | SQLException | IndexOutOfBoundsException e) {
            throw new CustomException("An exception occurred: " + e.getMessage(), 500);
        }
    }
}
