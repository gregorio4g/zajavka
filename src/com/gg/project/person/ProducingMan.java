package com.gg.project.person;

import com.gg.project.product.Food;

public interface ProducingMan {
    Food produce(String productName, ConsumingMan consumingMan);
}
