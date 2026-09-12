package com.example.Tasks16;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Builder(toBuilder = true)
@ToString
public class Order {
    int orderId;
    @Singular
    List<String> products;
}
