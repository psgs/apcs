import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WhatIs {

    public static void main(String[] args) {
        List<String> tokens = new ArrayList<String>();
        int totalSum = 0;

        File file;
        BufferedReader reader = null;

        file = new File("./WhatIs.dat");

        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            System.err.println("The requested file does not exist, please create it and try again!");
            System.exit(-1);
        }

        while (true) {
            try {
                if (!reader.ready())
                    break;

                String[] line = reader.readLine().split(",");

                for(String string : line) {
                    try {
                        totalSum += Integer.parseInt(string);
                    } catch (NumberFormatException ex) {
                         tokens.add(string);
                    }
                }
            } catch (IOException ex) {
                System.err.println("There was an error parsing the file, aborting!");
                System.exit(-1);
            }
        }

        for(String string : tokens) {
            System.out.println(string);
        }

        System.out.println(totalSum);
    }

}
