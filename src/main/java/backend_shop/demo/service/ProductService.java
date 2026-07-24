package backend_shop.demo.service;

import backend_shop.demo.model.Product;
import backend_shop.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

     public List<Product> getAllProducts() throws SQLException {
         return productRepository.getAllProducts();
    }

//    public Product getProductById(int id) {
//        Product product = null;
//        if (id >= 0) {
//            product = productRepository.getProductById(id);
//        }
//        if (product == null) throw new RuntimeException("Id can`t be lower than 0");
//        else return product;
//    }
}
