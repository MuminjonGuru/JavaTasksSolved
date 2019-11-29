package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderFileExample {

    public static void main(String[] args) {
        BufferedReader objBr = null;
        try {
            String strCurrentLine;

            objBr = new BufferedReader(new FileReader("C:\\flashjava.txt"));
            while((strCurrentLine = objBr.readLine()) != null) {
                System.out.println(strCurrentLine);
            }

        } catch(IOException eIO) {
            eIO.printStackTrace();
        } finally {
            try {
                if (objBr != null)
                    objBr.close();
            } catch (IOException eObj) {
                eObj.printStackTrace();
            }
        }
    }

}
