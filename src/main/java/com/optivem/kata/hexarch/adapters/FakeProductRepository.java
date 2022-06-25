package com.optivem.kata.hexarch.adapters;

import com.optivem.kata.hexarch.application.Product;
import com.optivem.kata.hexarch.application.ProductRepository;

import java.util.HashMap;
import java.util.Optional;

public class FakeProductRepository implements ProductRepository {

    private HashMap<String, Product> products;

    public FakeProductRepository() {
        this.products = new HashMap<>();
    }

    @Override
    public Optional<Product> getProduct(String sku) {
        var product = products.get(sku);
        return Optional.of(product);
    }

    @Override
    public void addProduct(Product product) {
        var sku = product.getSku();
        products.put(sku, product);
    }
}