package by.tms.repositories;

import by.tms.models.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getProducts();

    List<Product> getProductsByType(String type);
}