package by.tms.services;

import by.tms.model.Customer;
import by.tms.model.LeastQueueCashBoxStrategy;
import by.tms.model.RandomCashBoxStrategy;
import by.tms.model.Shop;

import java.util.Random;

/**
 * Напишите программу, моделирующую кассы в магазине.
 * Существует несколько касс, работающих одновременно.
 * Каждый покупатель — отдельный поток.
 * Общее количество покупателей может быть больше, чем количество касс,
 * но одновременно не может обрабатываться больше покупателей, чем имеется рабочих касс.
 * У каждого покупателя есть набор товаров, которые должны быть выведены на консоль в процессе обслуживания.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shop shop = new Shop(3);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Customer b = new Customer(shop, "Customer" + i, new String[]{"Вода", "Колбаса"},
                    random.nextInt(2) == 0 ? new LeastQueueCashBoxStrategy() : new RandomCashBoxStrategy());
            b.start();
            Thread.sleep(100);
        }
    }
}
