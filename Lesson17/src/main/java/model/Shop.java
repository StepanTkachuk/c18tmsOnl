package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop implements ShopAware {
    private ArrayList<Product> products = new ArrayList<>();

    @Override
    public boolean addProduct(Product product) {
        if (!isInValidProduct(product)) {
            return products.add(product);
        }
        return false;
    }

    private boolean isInValidProduct(Product product) {
        return product.getId() == null || "".equals(product.getName()) || product.getPrice() <= 0;
    }

    @Override
    public boolean edit(Product updateProduct) {
        if (products.isEmpty()) {
            return false;
        }
        for (Product currentProduct : products) {
            if (currentProduct.getId().equals(updateProduct.getId())) {
                currentProduct.setName(updateProduct.getName());
                currentProduct.setPrice(updateProduct.getPrice());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Long productId) {
        return products.removeIf(product -> product.getId().equals(productId));
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }
}
