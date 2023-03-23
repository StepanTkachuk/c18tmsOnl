package by.tms.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    private Long id;
    private ProductType productType;
    private String brand;
    private String model;
    private BigDecimal price;

    public Product(ProductType productType, String brand, String model) {
        this.productType = productType;
        this.brand = brand;
        this.model = model;
    }
}
