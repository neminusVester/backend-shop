package backend_shop.demo.service;

import backend_shop.demo.model.Product;
import backend_shop.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

     public List<Product> getAllProducts() {
         return productRepository.getAllProducts();
    }
}
