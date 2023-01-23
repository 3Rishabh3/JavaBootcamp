//package basics;
//
//import java.io.*;
//import java.sql.*;
//
//import java.io.*;
//import java.sql.*;
////CustomExceptionHandling
//class CustomException extends Exception {
//    public CustomException(String message) {
//        super(message);
//    }
//}
//
//public class CustomExceptionHandling {
//    public static void main(String[] args) {
//        try {
//            // Example of handling IOException
//            FileInputStream file = new FileInputStream("file.txt");
//
//            // Example of handling ArithmeticException
//            int a = 10, b = 0;
//            int c = a / b;
//
//            // Example of handling SQL Exception
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "username", "password");
//
//            // Example of handling IndexOutOfBoundsException
//            int[] arr = new int[5];
//            int index = 10;
//            int value = arr[index];
//
//        } catch (IOException | ArithmeticException | SQLException | IndexOutOfBoundsException e) {
//            throw new CustomException("An exception occurred: " + e.getMessage());
//        } catch (CustomException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
