package model_paper;

import java.io.File;
import java.io.IOException;

public class Q23 {
    public static void main(String[] args) throws IOException {
        File f = new File("abc.txt");
        boolean b = f.createNewFile();
        System.out.println(b);
    }
}
