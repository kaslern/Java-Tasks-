package com.example.Tasks07;

public enum OrderStatus {
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELED;

    boolean isActive() {
        return (this != CANCELED && this != DELIVERED);
    }
}