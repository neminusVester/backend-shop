package backend_shop.demo.repository;

import backend_shop.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    public List<Product> getAllProducts() {
        Product Milk = new Product(0, "galichina", "drink", 2.55, 13 );
        Product Beer = new Product(1, "Corona", "drink", 5.01, 24);
        List<Product> productList = new ArrayList<>();
        productList.add(Milk);
        productList.add(Beer);
        return productList;
    }

}
