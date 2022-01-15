package myJava14;
import java.io.*;
public class Class07{
   public static void main(String args[]) throws IOException{
      int c=0;
      String str;
      FileReader fr=new FileReader("C:\\Users\\user\\Desktop\\Java14\\donkey.txt");
      BufferedReader bfr=new BufferedReader(fr);
      while((str=bfr.readLine())!=null)
      {
         if(c==1) {
            bfr.skip(14);
         }
         System.out.println(str);
         c++;
      }
      fr.close();
   }
}