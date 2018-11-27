package ru.itpark.domain;

public class Computer extends Product {
    public String cpu;
    public int ram;
    public String operatingSystem;

    public Computer(int id, String name, int price) {
        super(id, name, price);
    }
}
