package ClassWork.Read;

import java.io.*;
import java.util.Scanner;

/**
 * Created by java6 on 17.08.17.
 */
public class MyFileReader implements Reader {

@Override
    public String readMyFile() throws IOException {
        try (Scanner s = new Scanner(new FileInputStream("/home/java6/IdeaProjects/java_elementary1/src/ClassWork/Read/read.txt"))) {

                String word = s.next();

                return word;

        }

    }

}