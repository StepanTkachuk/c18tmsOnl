package by.tms.services;

import by.tms.models.Product;

import java.util.List;

public interface ProductAware {
    List<Product> getProductByType(String type);
}
