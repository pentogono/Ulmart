package ru.itpark.domain;

public class TShirt extends Product {
    private int size;
    private String gender;

    public TShirt(int id, String name, int price) {
        super(id, name, price);
    }
}
