package com.optivem.kata.supermarket.pricing.application;

import com.optivem.kata.supermarket.pricing.application.common.BaseTest;
import com.optivem.kata.supermarket.pricing.application.ports.Product;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddProductTest extends BaseTest {

    @Test
    void should_add_product_given_valid_data() {
        var sku = "ABC";
        var price = 20.0;
        var expectedProduct = new Product(sku, price);

        supermarketApp.getProductManagement().addProduct(sku, price);

        var retrievedProduct = productRepository.getProduct(sku);
        assertThat(retrievedProduct).isNotEmpty();
        assertThat(retrievedProduct.get()).isEqualTo(expectedProduct);
    }
}
