package org.example;
import com.sampleProject.Product.Proto.ProductProto;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filename = "ProductFile.csv";
        List<ProductProto.Product> products = ProductFacade.generate_products_from_file(filename);
        ProductSerializer.serialize(products);
    }
}