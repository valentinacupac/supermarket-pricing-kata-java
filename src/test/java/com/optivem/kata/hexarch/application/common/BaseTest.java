package com.optivem.kata.hexarch.application.common;

import com.optivem.kata.hexarch.adapters.FakeDiscountRateRepository;
import com.optivem.kata.hexarch.adapters.FakeProductRepository;
import com.optivem.kata.hexarch.application.App;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected FakeProductRepository productRepository;
    protected FakeDiscountRateRepository rateRepository;
    protected App app;

    @BeforeEach
    protected void init() {
        productRepository = new FakeProductRepository();
        rateRepository = new FakeDiscountRateRepository();
        app = new App(productRepository, rateRepository);
    }
}
