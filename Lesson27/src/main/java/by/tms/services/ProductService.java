package by.tms.services;

import by.tms.models.Product;
import by.tms.repositories.JdbcProductRepository;

import java.util.List;

public class ProductService implements ProductAware {
    private JdbcProductRepository jdbcProductRepository;

    @Override
    public List<Product> getProductByType(String type) {
        return jdbcProductRepository.getProductsByType(type);
    }
}
