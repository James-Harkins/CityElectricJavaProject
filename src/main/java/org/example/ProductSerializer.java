package org.example;
import com.google.protobuf.util.JsonFormat;
import com.sampleProject.Product.Proto.ProductProto;
import java.io.IOException;
import java.util.List;

public class ProductSerializer {
    public static void serialize(List<ProductProto.Product> products) {
        JsonFormat.Printer printer = JsonFormat.printer();
        for (ProductProto.Product product : products) {
            try {
                String jsonProduct = printer.print(product);
                System.out.println(jsonProduct);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
