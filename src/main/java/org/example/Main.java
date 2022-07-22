package org.example;
import com.sampleProject.Product.Proto.ProductProto;
import com.google.protobuf.util.JsonFormat;
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
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JsonFormat.Printer printer = JsonFormat.printer()
                .includingDefaultValueFields()
                .preservingProtoFieldNames();
        for (List<String> record : records) {
            ProductProto.Product product = ProductProto.Product.newBuilder()
                    .setProductID(Integer.parseInt(record.get(0)))
                    .setCatalog(record.get(1))
                    .setStockcode(record.get(2))
                    .setProductDescription(record.get(3)).build();
            try {
                String jsonProduct = printer.print(product);
                System.out.println(jsonProduct);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}