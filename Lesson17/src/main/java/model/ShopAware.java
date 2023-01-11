package model;

import java.util.List;

public interface ShopAware {
    boolean addProduct(Product product);

    boolean edit(Product product);

    boolean delete(Long productId);

    List<Product> getAllProducts();
}
