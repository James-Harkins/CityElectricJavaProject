package org.example;
import com.sampleProject.Product.Proto.ProductProto;
import com.google.protobuf.util.JsonFormat;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        JsonFormat.Printer printer = JsonFormat.printer();
        for (ProductProto.Product product : ProductGenerator.products("ProductFile.csv")) {
            try {
                String jsonProduct = printer.print(product);
                System.out.println(jsonProduct);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}