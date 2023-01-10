import model.Product;
import model.Shop;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<Product> comparatorById = Comparator.comparing(Product::getId);
        Comparator<Product> comparatorByReversedId = Comparator.comparing(Product::getId).reversed();
        Comparator<Product> comparatorByPrice = Comparator.comparing(Product::getPrice);
        Comparator<Product> comparatorByReversedPrice = Comparator.comparing(Product::getPrice).reversed();

        Shop shop = new Shop();

        Product milk = new Product(1l, "Milk", 200);
        Product bread = new Product(2L, "Bread", 100);
        Product cheese = new Product(3L, "Cheese", 350);
        Product apple = new Product(4L, "Cheese", 50);

        shop.addProduct(milk);
        shop.addProduct(bread);
        shop.addProduct(cheese);
        shop.addProduct(apple);

        System.out.println(shop.getAllProducts());
        //до сортировки
        System.out.println(shop.getAllProducts()
                .stream()
                .sorted(comparatorByPrice)
                .toList());
        //после сортировки по цене

        shop.delete(3L);
        System.out.println(shop.getAllProducts());
        //после удаления
        System.out.println(shop.getAllProducts()
                .stream()
                .sorted(comparatorByReversedId)
                .toList());
        //сортировка с последнего добавленного

        shop.edit(new Product(4L, "Cheese", 50));
        System.out.println(shop.getAllProducts());
        //после изменения товара


    }
}
