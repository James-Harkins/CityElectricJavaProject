package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<List<String>> records = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ProductFile.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
            System.out.println(records);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        };
    }
}