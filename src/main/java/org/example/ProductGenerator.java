package org.example;

import com.sampleProject.Product.Proto.ProductProto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductGenerator {
    public static List<ProductProto.Product> products(String filename) {
        List<ProductProto.Product> products = new ArrayList<>();
        for (List<String> row : rows(filename)) {
            ProductProto.Product product = ProductProto.Product.newBuilder()
                    .setProductID(Integer.parseInt(row.get(0)))
                    .setCatalog(row.get(1))
                    .setStockcode(row.get(2))
                    .setProductDescription(row.get(3)).build();
            products.add(product);
        }
        return products;
    }

    public static List<List<String>> rows(String filename) {
        List<List<String>> records = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }
}
