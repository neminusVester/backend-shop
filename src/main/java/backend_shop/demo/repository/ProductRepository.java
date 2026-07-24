package backend_shop.demo.repository;

import backend_shop.demo.model.Product;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private final DataSource dataSource;
    private Product p1;
    private Product p2;
    private Product p3;

    public ProductRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Product> getAllProducts() throws SQLException {
        String sql = "select * from products";
        try (
            Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
        ) {
            List<Product> productList = new ArrayList<>();

            while (resultSet.next()) {
                Product product = new Product(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("category"),
                        resultSet.getDouble("price"),
                        resultSet.getInt("quantity"));
                productList.add(product);
            }
            return productList;
        }
    }

//    public Product getProductById(int id) {
//        createProducts();
//        Product product = null;
//        for (int i = 0; i < productList.size(); i++) {
//            int productId = productList.get(i).getId();
//            if (productId == id) {
//                product = productList.get(i);
//            }
//        }
//        if (product == null) throw new RuntimeException("There are no product with" + id + "id");
//        else return product;
//    }

//    private List<Product> createProducts() {
//        p1 = new Product(0, "galichina", "drink", 2.55, 13 );
//        p2 = new Product(1, "Corona", "drink", 5.01, 24);
//        p3 = new Product(2, "pasta", "krupa", 1.24, 135);
//        productList.add(p1);
//        productList.add(p2);
//        productList.add(p3);
//        return productList;
//    }

}
