package day5;

import java.io.File;
import java.io.FileNotFoundException;

public class DemoThrows {
    public static void checkFile(String path) throws FileNotFoundException {
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
    }

    public static void main(String[] args) {
//        try{
//            File f = new File("sjdf.txt");
//            if(!f.exists())
//                throw new FileNotFoundException("file is not presnt");
//        }
//        catch (FileNotFoundException e){
//            System.out.println(e.getMessage());
//        }

        try{
            checkFile("kldsjfh.txt");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }


        System.out.println("--------------->this will run after exceptions being handled");
    }
}
