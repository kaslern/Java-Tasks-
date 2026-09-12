package com.example.Tasks16;

import lombok.Builder;
import lombok.ToString;

@Builder(builderMethodName = "newBuilder", buildMethodName = "create")
@ToString
public class CustomDevice {
    private String model;
    private double price;
}