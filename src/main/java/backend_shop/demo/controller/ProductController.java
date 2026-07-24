package backend_shop.demo.controller;

import backend_shop.demo.model.Product;
import backend_shop.demo.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController (ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts() throws SQLException {
        return productService.getAllProducts();
    }

//    @GetMapping("/products/{id}")
//    public Product getProductById(@PathVariable int id) {
//        return productService.getProductById(id);
//    }
}
