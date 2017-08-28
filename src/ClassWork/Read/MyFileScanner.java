package ClassWork.Read;

import java.io.*;
import java.util.Scanner;

/**
 * Created by java6 on 17.08.17.
 */
public class MyFileScanner {
    private int myIdx = 0;

    public int recursiveScanner(File dir, String myWord) throws IOException {
        File[] paths = dir.listFiles();
        for (File path : paths) {
            if (!path.isDirectory()) {
                try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                    String word = br.readLine();
                    if (word.contains(myWord)) {
                        myIdx++;
                    }
                }
            } else {
                recursiveScanner(path, myWord);
            }
        }
        return myIdx;
    }
}