import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("output.txt");
        File file = new File("files");
        String[] s = file.list();
        
        for(String s1 : s ){
            BufferedReader br = new BufferedReader(new FileReader("files/" + s1));
            String line = br.readLine();
            while (line != null){
                printWriter.println(line);
                line = br.readLine();
            }
        }
        printWriter.flush();
    }
}