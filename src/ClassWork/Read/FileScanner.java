package ClassWork.Read;
import java.io.*;
import java.util.Scanner;

/**
 * Created by java6 on 17.08.17.
 */
public class FileScanner {

    File directory ;
    File[] paths ;



    public FileScanner(File directory) {
        this.directory = directory;
        this.paths = directory.listFiles();


    }

    public int scan(String world) throws IOException {
        int myIndex = 0;
        for (int i = 0; i < paths.length; i++) {


            try (BufferedReader scan = new BufferedReader(new FileReader(paths[i]));) {
                String word = scan.readLine();
                File scanDir = new File(paths[i]);
                if (!paths[i].isDirectory()){
                    if(word.contains(world)){
                        myIndex++;
                    }
                } else {
                    directory = paths[i];
                    scan(world);
                }

            }

        }
        return myIndex;
    }

}
