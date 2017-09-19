package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Reader {

    private String source = "src\\data\\studentList2.csv";
    private String line = "";
    private String cvsSplit = ",";
    private List<String> list;


    public void readFile() throws Exception {

        if (fileIsEmpty()) {

            Scanner scanner = new Scanner(new File(source));

            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }
    }

    public boolean fileIsEmpty() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(source));
            if (bufferedReader.readLine() == null || bufferedReader.readLine().isEmpty()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

}
