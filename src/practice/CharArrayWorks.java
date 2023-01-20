package practice;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayWorks {
    public static void main(String[] args)throws IOException {
        char[] geek = {'R','A','G','J','N'};
        CharArrayReader ca1 = new CharArrayReader(geek);
        CharArrayReader ca2 = new CharArrayReader(geek);
        boolean check1 = ca1.ready();
        if(check1 == true){
            System.out.println("Char array 1 is ready ");
        }else{
            System.out.println("Char array 1 is not ready");
        }


        int a = 0;

        while((a= ca1.read())!=-1){
            char c1 = (char)a;
            System.out.println(c1);

            long char_no = ca1.skip(1);
            System.out.println("Character skipped :"+(c1+1));
        }


    }
}
