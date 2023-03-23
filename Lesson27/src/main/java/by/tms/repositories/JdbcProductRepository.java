package by.tms.repositories;

import by.tms.models.Product;
import by.tms.models.ProductType;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static by.tms.models.ProductType.getProductType;

public class JdbcProductRepository implements ProductRepository {
    private final Connection connection;

    public JdbcProductRepository(Connection connection) {
        this.connection = connection;
    }

    private static final String GET_ALL_PRODUCTS = "select * from products_db.products";
    private static final String GET_PRODUCTS_BY_TYPE = "select * from products where type=?";

    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(GET_ALL_PRODUCTS);
            fillValue(products, statement);
        } catch (SQLException e) {
            System.out.println("SQLException (getProducts()): " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception (getProducts()): " + e.getMessage());
        }
        return products;
    }

    @Override
    public List<Product> getProductsByType(String type) {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(GET_PRODUCTS_BY_TYPE);
            statement.setString(1, type);
            fillValue(products, statement);
        } catch (SQLException e) {
            System.out.println("SQLException (getProducts()): " + e.getMessage());
        } catch (Exception e) {
            System.out.println("IllegalStateException (getProductsByType()): " + e.getMessage());
        }
        return products;
    }

    private static void fillValue(List<Product> products, PreparedStatement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Long id = resultSet.getLong("id");
            String type = resultSet.getString("type");
            ProductType productType = getProductType(type);
            String brand = resultSet.getString("brand");
            String model = resultSet.getString("model");
            BigDecimal price = resultSet.getBigDecimal("price");
            products.add(new Product(id, productType, brand, model, price));
        }
    }
}
