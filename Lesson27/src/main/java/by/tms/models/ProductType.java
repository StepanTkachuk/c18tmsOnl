package by.tms.models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ProductType {
    MOBILE("mobile"),
    LAPTOP("laptop"),
    WATCH("watch");

    private final String name;

    public static ProductType getProductType(String type) {
        for (ProductType productType : ProductType.values()) {
            if (productType.name.equals(type)) {
                return productType;
            }
        }
        throw new IllegalArgumentException("Unexpected name: " + type);
    }
}
