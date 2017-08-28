package ClassWork.Read;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by java6 on 17.08.17.
 */
public class Main {

    public static void main(String[] args) throws IOException {
//        ConsoleReader read1 = new ConsoleReader();
//        System.out.println(read1.readFile());

//        MyFileReader read2 = new MyFileReader();
//        System.out.println(read2.readFile());
     File file1 = new File("C:/Users/kravchuk/IdeaProjects/java_elementary/src/ClassWork/Read/Directory");
     MyFileScanner read3 = new MyFileScanner();
     System.out.println(read3.recursiveScanner(file1,"World"));
    }
}
