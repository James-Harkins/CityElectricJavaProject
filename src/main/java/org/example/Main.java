package org.example;
import com.sampleProject.Product.Proto.ProductProto;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProductProto.Product> products = ProductFacade.generate_products_from_file("ProductFile.csv");
        ProductSerializer.serialize(products);
    }
}