/*
    Display a text file.
    To use this program specify the name of the file that you desire to se.
    For instance, to see a file called TEST.DAT, use the following command line

    java ShowFile TEST.DAT
 */

import java.io.*;

class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin;

        // First, confirm that a filename has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // Try to open the file
        try {
            fin = new FileInputStream("TEST.DAT");
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open file");
            return;
        }

        // At this point, the file is open and can be read.
        // The following reads characters until EOF is encountered.
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error Reading File.");
        }

        // Close the file
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Error closing file");
        }

    }


}
