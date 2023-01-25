package LR8.example7;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;

        try {

            br = new BufferedReader(new FileReader("/tmp/MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("/tmp/MyFile2.txt"));

            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();

            }

        } catch (IOException e) {

        } finally {
            if (br != null) {
                br.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }
}
