package basics.filehandling;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("src/basics/filehandling/files/2_ExperimentFile.txt", true);
        String st = "Just adding some random text";
        char ch[] = st.toCharArray();
        for(int c : ch)
            fout.write(c);
        fout.close();
    }
}
