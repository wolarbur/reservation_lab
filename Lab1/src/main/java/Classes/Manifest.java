package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Manifest {
    public void readFile() throws FileNotFoundException {
        File inputFile = new File ("Manifest.txt");
        Scanner inFile = new Scanner(inputFile);

        for(int i = 1; inFile.hasNext();i++)
        {
            String name, phone, date;
            name = inFile.next();
            phone = inFile.next();
            date = inFile.next();
        }
    }

}
