package HomeWork.HomeWork12;

import java.io.*;
import java.sql.BatchUpdateException;
import java.util.Scanner;

public class InputOutputFromKeyboadr {
    private static final String FILENAME_TARGET = "C:/Users/kravchuk/IdeaProjects/java_elementary/src/HomeWork/HomeWork12/test.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(FILENAME_TARGET);
        System.out.println(file.exists());

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter out = new BufferedWriter(new FileWriter(FILENAME_TARGET))) {

            String line;
            while (!(line = reader.readLine()).equals(" ")){
                out.write(line);
            }

        }


    }
}
