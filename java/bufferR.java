import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bufferR {
    public static void main(String[] arg)throws IOException
    {
        //enter data using bufferreader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name =reader.readLine();
        System.out.println("my college name is "+name);
    }
    
}
