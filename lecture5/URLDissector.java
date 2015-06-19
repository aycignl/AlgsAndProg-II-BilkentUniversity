package lecture5;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class URLDissector {

    // Reads URL from a file and prints their path components.
    public static void main(String[] args) throws IOException {
        
        String url;
        Scanner fileScan, urlScan;

        fileScan = new Scanner(new File("C:\\Users\\OZUNSTUDENT\\Documents\\NetBeansProjects\\studies\\src\\week5\\urls.inp.txt"));

        // Read and process each line of the file.
        while (fileScan.hasNext()) {

            url = fileScan.nextLine();
            System.out.println("URL : " + url);

            urlScan = new Scanner(url);
            urlScan.useDelimiter("/");

            // Print each part of the url
            while (urlScan.hasNext()) {
                System.out.println("  " + urlScan.next());
            }
            System.out.println();


        }

    }
}
