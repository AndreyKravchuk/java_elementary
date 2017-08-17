package ClassWork.Read;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by java6 on 17.08.17.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ConsoleReader consoleReader = new ConsoleReader();
        MyFileReader myFileReader = new MyFileReader();
        String word = "World";
        File folder = new File("/home/java6/IdeaProjects/java_elementary1/src/ClassWork/Read");
        FileScanner fileScanner = new FileScanner(folder);
//        System.out.println(consoleReader.readMyFile());
//        System.out.println(myFileReader.readMyFile());
        System.out.println(fileScanner.scan(word));

    }

}
